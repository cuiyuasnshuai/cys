package com.ruoyi.resandmed.controller;

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
import com.ruoyi.resandmed.domain.CysResandmed;
import com.ruoyi.resandmed.service.ICysResandmedService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 药单药品Controller
 * 
 * @author 崔元帅
 * @date 2024-05-07
 */
@RestController
@RequestMapping("/resandmed/resandmed")
public class CysResandmedController extends BaseController
{
    @Autowired
    private ICysResandmedService cysResandmedService;

    /**
     * 查询药单药品列表
     */
    @PreAuthorize("@ss.hasPermi('resandmed:resandmed:list')")
    @GetMapping("/list")
    public TableDataInfo list(CysResandmed cysResandmed)
    {
        startPage();
        List<CysResandmed> list = cysResandmedService.selectCysResandmedList(cysResandmed);
        return getDataTable(list);
    }

    /**
     * 导出药单药品列表
     */
    @PreAuthorize("@ss.hasPermi('resandmed:resandmed:export')")
    @Log(title = "药单药品", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CysResandmed cysResandmed)
    {
        List<CysResandmed> list = cysResandmedService.selectCysResandmedList(cysResandmed);
        ExcelUtil<CysResandmed> util = new ExcelUtil<CysResandmed>(CysResandmed.class);
        util.exportExcel(response, list, "药单药品数据");
    }

    /**
     * 获取药单药品详细信息
     */
    @PreAuthorize("@ss.hasPermi('resandmed:resandmed:query')")
    @GetMapping(value = "/{prescriptionId}")
    public AjaxResult getInfo(@PathVariable("prescriptionId") Long prescriptionId)
    {
        return success(cysResandmedService.selectCysResandmedByPrescriptionId(prescriptionId));
    }

    /**
     * 新增药单药品
     */
    @PreAuthorize("@ss.hasPermi('resandmed:resandmed:add')")
    @Log(title = "药单药品", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CysResandmed cysResandmed)
    {
        return toAjax(cysResandmedService.insertCysResandmed(cysResandmed));
    }

    /**
     * 修改药单药品
     */
    @PreAuthorize("@ss.hasPermi('resandmed:resandmed:edit')")
    @Log(title = "药单药品", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CysResandmed cysResandmed)
    {
        return toAjax(cysResandmedService.updateCysResandmed(cysResandmed));
    }

    /**
     * 删除药单药品
     */
    @PreAuthorize("@ss.hasPermi('resandmed:resandmed:remove')")
    @Log(title = "药单药品", businessType = BusinessType.DELETE)
	@DeleteMapping("/{prescriptionIds}")
    public AjaxResult remove(@PathVariable Long[] prescriptionIds)
    {
        return toAjax(cysResandmedService.deleteCysResandmedByPrescriptionIds(prescriptionIds));
    }
}
