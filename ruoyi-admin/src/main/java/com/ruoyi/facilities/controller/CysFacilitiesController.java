package com.ruoyi.facilities.controller;

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
import com.ruoyi.facilities.domain.CysFacilities;
import com.ruoyi.facilities.service.ICysFacilitiesService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 设施Controller
 * 
 * @author 崔元帅
 * @date 2024-05-07
 */
@RestController
@RequestMapping("/facilities/facilities")
public class CysFacilitiesController extends BaseController
{
    @Autowired
    private ICysFacilitiesService cysFacilitiesService;

    /**
     * 查询设施列表
     */
    @PreAuthorize("@ss.hasPermi('facilities:facilities:list')")
    @GetMapping("/list")
    public TableDataInfo list(CysFacilities cysFacilities)
    {
        startPage();
        List<CysFacilities> list = cysFacilitiesService.selectCysFacilitiesList(cysFacilities);
        return getDataTable(list);
    }

    /**
     * 导出设施列表
     */
    @PreAuthorize("@ss.hasPermi('facilities:facilities:export')")
    @Log(title = "设施", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CysFacilities cysFacilities)
    {
        List<CysFacilities> list = cysFacilitiesService.selectCysFacilitiesList(cysFacilities);
        ExcelUtil<CysFacilities> util = new ExcelUtil<CysFacilities>(CysFacilities.class);
        util.exportExcel(response, list, "设施数据");
    }

    /**
     * 获取设施详细信息
     */
    @PreAuthorize("@ss.hasPermi('facilities:facilities:query')")
    @GetMapping(value = "/{facilitiesId}")
    public AjaxResult getInfo(@PathVariable("facilitiesId") Long facilitiesId)
    {
        return success(cysFacilitiesService.selectCysFacilitiesByFacilitiesId(facilitiesId));
    }

    /**
     * 新增设施
     */
    @PreAuthorize("@ss.hasPermi('facilities:facilities:add')")
    @Log(title = "设施", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CysFacilities cysFacilities)
    {
        return toAjax(cysFacilitiesService.insertCysFacilities(cysFacilities));
    }

    /**
     * 修改设施
     */
    @PreAuthorize("@ss.hasPermi('facilities:facilities:edit')")
    @Log(title = "设施", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CysFacilities cysFacilities)
    {
        return toAjax(cysFacilitiesService.updateCysFacilities(cysFacilities));
    }

    /**
     * 删除设施
     */
    @PreAuthorize("@ss.hasPermi('facilities:facilities:remove')")
    @Log(title = "设施", businessType = BusinessType.DELETE)
	@DeleteMapping("/{facilitiesIds}")
    public AjaxResult remove(@PathVariable Long[] facilitiesIds)
    {
        return toAjax(cysFacilitiesService.deleteCysFacilitiesByFacilitiesIds(facilitiesIds));
    }
}
