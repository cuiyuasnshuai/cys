package com.ruoyi.registered.controller;

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
import com.ruoyi.registered.domain.CysRegistered;
import com.ruoyi.registered.service.ICysRegisteredService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 挂号Controller
 * 
 * @author 崔元帅
 * @date 2024-05-07
 */
@RestController
@RequestMapping("/registered/registered")
public class CysRegisteredController extends BaseController
{
    @Autowired
    private ICysRegisteredService cysRegisteredService;

    /**
     * 查询挂号列表
     */
    @PreAuthorize("@ss.hasPermi('registered:registered:list')")
    @GetMapping("/list")
    public TableDataInfo list(CysRegistered cysRegistered)
    {
        startPage();
        List<CysRegistered> list = cysRegisteredService.selectCysRegisteredList(cysRegistered);
        return getDataTable(list);
    }

    /**
     * 导出挂号列表
     */
    @PreAuthorize("@ss.hasPermi('registered:registered:export')")
    @Log(title = "挂号", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CysRegistered cysRegistered)
    {
        List<CysRegistered> list = cysRegisteredService.selectCysRegisteredList(cysRegistered);
        ExcelUtil<CysRegistered> util = new ExcelUtil<CysRegistered>(CysRegistered.class);
        util.exportExcel(response, list, "挂号数据");
    }

    /**
     * 获取挂号详细信息
     */
    @PreAuthorize("@ss.hasPermi('registered:registered:query')")
    @GetMapping(value = "/{registeredId}")
    public AjaxResult getInfo(@PathVariable("registeredId") Long registeredId)
    {
        return success(cysRegisteredService.selectCysRegisteredByRegisteredId(registeredId));
    }

    /**
     * 新增挂号
     */
    @PreAuthorize("@ss.hasPermi('registered:registered:add')")
    @Log(title = "挂号", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CysRegistered cysRegistered)
    {
        return toAjax(cysRegisteredService.insertCysRegistered(cysRegistered));
    }

    /**
     * 修改挂号
     */
    @PreAuthorize("@ss.hasPermi('registered:registered:edit')")
    @Log(title = "挂号", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CysRegistered cysRegistered)
    {
        return toAjax(cysRegisteredService.updateCysRegistered(cysRegistered));
    }

    /**
     * 删除挂号
     */
    @PreAuthorize("@ss.hasPermi('registered:registered:remove')")
    @Log(title = "挂号", businessType = BusinessType.DELETE)
	@DeleteMapping("/{registeredIds}")
    public AjaxResult remove(@PathVariable Long[] registeredIds)
    {
        return toAjax(cysRegisteredService.deleteCysRegisteredByRegisteredIds(registeredIds));
    }
}
