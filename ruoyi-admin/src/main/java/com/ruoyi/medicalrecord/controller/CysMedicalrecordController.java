package com.ruoyi.medicalrecord.controller;

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
import com.ruoyi.medicalrecord.domain.CysMedicalrecord;
import com.ruoyi.medicalrecord.service.ICysMedicalrecordService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 病历Controller
 * 
 * @author 崔元帅
 * @date 2024-05-07
 */
@RestController
@RequestMapping("/medicalrecord/medicalrecord")
public class CysMedicalrecordController extends BaseController
{
    @Autowired
    private ICysMedicalrecordService cysMedicalrecordService;

    /**
     * 查询病历列表
     */
    @PreAuthorize("@ss.hasPermi('medicalrecord:medicalrecord:list')")
    @GetMapping("/list")
    public TableDataInfo list(CysMedicalrecord cysMedicalrecord)
    {
        startPage();
        List<CysMedicalrecord> list = cysMedicalrecordService.selectCysMedicalrecordList(cysMedicalrecord);
        return getDataTable(list);
    }

    /**
     * 导出病历列表
     */
    @PreAuthorize("@ss.hasPermi('medicalrecord:medicalrecord:export')")
    @Log(title = "病历", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CysMedicalrecord cysMedicalrecord)
    {
        List<CysMedicalrecord> list = cysMedicalrecordService.selectCysMedicalrecordList(cysMedicalrecord);
        ExcelUtil<CysMedicalrecord> util = new ExcelUtil<CysMedicalrecord>(CysMedicalrecord.class);
        util.exportExcel(response, list, "病历数据");
    }

    /**
     * 获取病历详细信息
     */
    @PreAuthorize("@ss.hasPermi('medicalrecord:medicalrecord:query')")
    @GetMapping(value = "/{medicalRecordId}")
    public AjaxResult getInfo(@PathVariable("medicalRecordId") Long medicalRecordId)
    {
        return success(cysMedicalrecordService.selectCysMedicalrecordByMedicalRecordId(medicalRecordId));
    }

    /**
     * 新增病历
     */
    @PreAuthorize("@ss.hasPermi('medicalrecord:medicalrecord:add')")
    @Log(title = "病历", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CysMedicalrecord cysMedicalrecord)
    {
        return toAjax(cysMedicalrecordService.insertCysMedicalrecord(cysMedicalrecord));
    }

    /**
     * 修改病历
     */
    @PreAuthorize("@ss.hasPermi('medicalrecord:medicalrecord:edit')")
    @Log(title = "病历", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CysMedicalrecord cysMedicalrecord)
    {
        return toAjax(cysMedicalrecordService.updateCysMedicalrecord(cysMedicalrecord));
    }

    /**
     * 删除病历
     */
    @PreAuthorize("@ss.hasPermi('medicalrecord:medicalrecord:remove')")
    @Log(title = "病历", businessType = BusinessType.DELETE)
	@DeleteMapping("/{medicalRecordIds}")
    public AjaxResult remove(@PathVariable Long[] medicalRecordIds)
    {
        return toAjax(cysMedicalrecordService.deleteCysMedicalrecordByMedicalRecordIds(medicalRecordIds));
    }
}
