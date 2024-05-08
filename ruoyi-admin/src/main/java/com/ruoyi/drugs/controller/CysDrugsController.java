package com.ruoyi.drugs.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.drugs.domain.CysDrugs;
import com.ruoyi.drugs.service.ICysDrugsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 药品Controller
 * 
 * @author 崔元帅
 * @date 2024-05-07
 */
@RestController
@RequestMapping("/drugs/drugs")
public class CysDrugsController extends BaseController
{
    @Autowired
    private ICysDrugsService cysDrugsService;

    /**
     * 查询药品列表
     */
    @PreAuthorize("@ss.hasPermi('drugs:drugs:list')")
    @GetMapping("/list")
    public TableDataInfo list(CysDrugs cysDrugs)
    {
        startPage();
        List<CysDrugs> list = cysDrugsService.selectCysDrugsList(cysDrugs);
        return getDataTable(list);
    }

    /**
     * 导出药品列表
     */
    @PreAuthorize("@ss.hasPermi('drugs:drugs:export')")
    @Log(title = "药品", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CysDrugs cysDrugs)
    {
        List<CysDrugs> list = cysDrugsService.selectCysDrugsList(cysDrugs);
        ExcelUtil<CysDrugs> util = new ExcelUtil<CysDrugs>(CysDrugs.class);
        util.exportExcel(response, list, "药品数据");
    }

    /**
     * 获取药品详细信息
     */
    @PreAuthorize("@ss.hasPermi('drugs:drugs:query')")
    @GetMapping(value = "/{drugsId}")
    public AjaxResult getInfo(@PathVariable("drugsId") Long drugsId)
    {
        return success(cysDrugsService.selectCysDrugsByDrugsId(drugsId));
    }

    /**
     * 新增药品
     */
    @PreAuthorize("@ss.hasPermi('drugs:drugs:add')")
    @Log(title = "药品", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CysDrugs cysDrugs)
    {
        return toAjax(cysDrugsService.insertCysDrugs(cysDrugs));
    }

    /**
     * 修改药品
     */
    @PreAuthorize("@ss.hasPermi('drugs:drugs:edit')")
    @Log(title = "药品", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CysDrugs cysDrugs)
    {
        return toAjax(cysDrugsService.updateCysDrugs(cysDrugs));
    }

    /**
     * 删除药品
     */
    @PreAuthorize("@ss.hasPermi('drugs:drugs:remove')")
    @Log(title = "药品", businessType = BusinessType.DELETE)
	@DeleteMapping("/{drugsIds}")
    public AjaxResult remove(@PathVariable Long[] drugsIds)
    {
        return toAjax(cysDrugsService.deleteCysDrugsByDrugsIds(drugsIds));
    }
}
