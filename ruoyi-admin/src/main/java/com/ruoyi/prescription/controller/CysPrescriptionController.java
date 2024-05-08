package com.ruoyi.prescription.controller;

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
import com.ruoyi.prescription.domain.CysPrescription;
import com.ruoyi.prescription.service.ICysPrescriptionService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 药单Controller
 * 
 * @author 崔元帅
 * @date 2024-05-07
 */
@RestController
@RequestMapping("/prescription/prescription")
public class CysPrescriptionController extends BaseController
{
    @Autowired
    private ICysPrescriptionService cysPrescriptionService;

    /**
     * 查询药单列表
     */
    @PreAuthorize("@ss.hasPermi('prescription:prescription:list')")
    @GetMapping("/list")
    public TableDataInfo list(CysPrescription cysPrescription)
    {
        startPage();
        List<CysPrescription> list = cysPrescriptionService.selectCysPrescriptionList(cysPrescription);
        return getDataTable(list);
    }

    /**
     * 导出药单列表
     */
    @PreAuthorize("@ss.hasPermi('prescription:prescription:export')")
    @Log(title = "药单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CysPrescription cysPrescription)
    {
        List<CysPrescription> list = cysPrescriptionService.selectCysPrescriptionList(cysPrescription);
        ExcelUtil<CysPrescription> util = new ExcelUtil<CysPrescription>(CysPrescription.class);
        util.exportExcel(response, list, "药单数据");
    }

    /**
     * 获取药单详细信息
     */
    @PreAuthorize("@ss.hasPermi('prescription:prescription:query')")
    @GetMapping(value = "/{prescriptionId}")
    public AjaxResult getInfo(@PathVariable("prescriptionId") Long prescriptionId)
    {
        return success(cysPrescriptionService.selectCysPrescriptionByPrescriptionId(prescriptionId));
    }

    /**
     * 新增药单
     */
    @PreAuthorize("@ss.hasPermi('prescription:prescription:add')")
    @Log(title = "药单", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CysPrescription cysPrescription)
    {
        return toAjax(cysPrescriptionService.insertCysPrescription(cysPrescription));
    }

    /**
     * 修改药单
     */
    @PreAuthorize("@ss.hasPermi('prescription:prescription:edit')")
    @Log(title = "药单", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CysPrescription cysPrescription)
    {
        return toAjax(cysPrescriptionService.updateCysPrescription(cysPrescription));
    }

    /**
     * 删除药单
     */
    @PreAuthorize("@ss.hasPermi('prescription:prescription:remove')")
    @Log(title = "药单", businessType = BusinessType.DELETE)
	@DeleteMapping("/{prescriptionIds}")
    public AjaxResult remove(@PathVariable Long[] prescriptionIds)
    {
        return toAjax(cysPrescriptionService.deleteCysPrescriptionByPrescriptionIds(prescriptionIds));
    }
}
