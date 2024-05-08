package com.ruoyi.medicalrecord.service;

import java.util.List;
import com.ruoyi.medicalrecord.domain.CysMedicalrecord;

/**
 * 病历Service接口
 * 
 * @author 崔元帅
 * @date 2024-05-07
 */
public interface ICysMedicalrecordService 
{
    /**
     * 查询病历
     * 
     * @param medicalRecordId 病历主键
     * @return 病历
     */
    public CysMedicalrecord selectCysMedicalrecordByMedicalRecordId(Long medicalRecordId);

    /**
     * 查询病历列表
     * 
     * @param cysMedicalrecord 病历
     * @return 病历集合
     */
    public List<CysMedicalrecord> selectCysMedicalrecordList(CysMedicalrecord cysMedicalrecord);

    /**
     * 新增病历
     * 
     * @param cysMedicalrecord 病历
     * @return 结果
     */
    public int insertCysMedicalrecord(CysMedicalrecord cysMedicalrecord);

    /**
     * 修改病历
     * 
     * @param cysMedicalrecord 病历
     * @return 结果
     */
    public int updateCysMedicalrecord(CysMedicalrecord cysMedicalrecord);

    /**
     * 批量删除病历
     * 
     * @param medicalRecordIds 需要删除的病历主键集合
     * @return 结果
     */
    public int deleteCysMedicalrecordByMedicalRecordIds(Long[] medicalRecordIds);

    /**
     * 删除病历信息
     * 
     * @param medicalRecordId 病历主键
     * @return 结果
     */
    public int deleteCysMedicalrecordByMedicalRecordId(Long medicalRecordId);
}
