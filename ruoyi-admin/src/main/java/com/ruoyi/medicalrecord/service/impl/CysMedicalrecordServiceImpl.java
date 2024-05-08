package com.ruoyi.medicalrecord.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.medicalrecord.mapper.CysMedicalrecordMapper;
import com.ruoyi.medicalrecord.domain.CysMedicalrecord;
import com.ruoyi.medicalrecord.service.ICysMedicalrecordService;

/**
 * 病历Service业务层处理
 * 
 * @author 崔元帅
 * @date 2024-05-07
 */
@Service
public class CysMedicalrecordServiceImpl implements ICysMedicalrecordService 
{
    @Autowired
    private CysMedicalrecordMapper cysMedicalrecordMapper;

    /**
     * 查询病历
     * 
     * @param medicalRecordId 病历主键
     * @return 病历
     */
    @Override
    public CysMedicalrecord selectCysMedicalrecordByMedicalRecordId(Long medicalRecordId)
    {
        return cysMedicalrecordMapper.selectCysMedicalrecordByMedicalRecordId(medicalRecordId);
    }

    /**
     * 查询病历列表
     * 
     * @param cysMedicalrecord 病历
     * @return 病历
     */
    @Override
    public List<CysMedicalrecord> selectCysMedicalrecordList(CysMedicalrecord cysMedicalrecord)
    {
        return cysMedicalrecordMapper.selectCysMedicalrecordList(cysMedicalrecord);
    }

    /**
     * 新增病历
     * 
     * @param cysMedicalrecord 病历
     * @return 结果
     */
    @Override
    public int insertCysMedicalrecord(CysMedicalrecord cysMedicalrecord)
    {
        cysMedicalrecord.setCreateTime(DateUtils.getNowDate());
        return cysMedicalrecordMapper.insertCysMedicalrecord(cysMedicalrecord);
    }

    /**
     * 修改病历
     * 
     * @param cysMedicalrecord 病历
     * @return 结果
     */
    @Override
    public int updateCysMedicalrecord(CysMedicalrecord cysMedicalrecord)
    {
        return cysMedicalrecordMapper.updateCysMedicalrecord(cysMedicalrecord);
    }

    /**
     * 批量删除病历
     * 
     * @param medicalRecordIds 需要删除的病历主键
     * @return 结果
     */
    @Override
    public int deleteCysMedicalrecordByMedicalRecordIds(Long[] medicalRecordIds)
    {
        return cysMedicalrecordMapper.deleteCysMedicalrecordByMedicalRecordIds(medicalRecordIds);
    }

    /**
     * 删除病历信息
     * 
     * @param medicalRecordId 病历主键
     * @return 结果
     */
    @Override
    public int deleteCysMedicalrecordByMedicalRecordId(Long medicalRecordId)
    {
        return cysMedicalrecordMapper.deleteCysMedicalrecordByMedicalRecordId(medicalRecordId);
    }
}
