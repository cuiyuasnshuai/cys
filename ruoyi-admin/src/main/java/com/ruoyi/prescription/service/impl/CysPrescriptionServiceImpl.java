package com.ruoyi.prescription.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.prescription.mapper.CysPrescriptionMapper;
import com.ruoyi.prescription.domain.CysPrescription;
import com.ruoyi.prescription.service.ICysPrescriptionService;

/**
 * 药单Service业务层处理
 * 
 * @author 崔元帅
 * @date 2024-05-07
 */
@Service
public class CysPrescriptionServiceImpl implements ICysPrescriptionService 
{
    @Autowired
    private CysPrescriptionMapper cysPrescriptionMapper;

    /**
     * 查询药单
     * 
     * @param prescriptionId 药单主键
     * @return 药单
     */
    @Override
    public CysPrescription selectCysPrescriptionByPrescriptionId(Long prescriptionId)
    {
        return cysPrescriptionMapper.selectCysPrescriptionByPrescriptionId(prescriptionId);
    }

    /**
     * 查询药单列表
     * 
     * @param cysPrescription 药单
     * @return 药单
     */
    @Override
    public List<CysPrescription> selectCysPrescriptionList(CysPrescription cysPrescription)
    {
        return cysPrescriptionMapper.selectCysPrescriptionList(cysPrescription);
    }

    /**
     * 新增药单
     * 
     * @param cysPrescription 药单
     * @return 结果
     */
    @Override
    public int insertCysPrescription(CysPrescription cysPrescription)
    {
        return cysPrescriptionMapper.insertCysPrescription(cysPrescription);
    }

    /**
     * 修改药单
     * 
     * @param cysPrescription 药单
     * @return 结果
     */
    @Override
    public int updateCysPrescription(CysPrescription cysPrescription)
    {
        return cysPrescriptionMapper.updateCysPrescription(cysPrescription);
    }

    /**
     * 批量删除药单
     * 
     * @param prescriptionIds 需要删除的药单主键
     * @return 结果
     */
    @Override
    public int deleteCysPrescriptionByPrescriptionIds(Long[] prescriptionIds)
    {
        return cysPrescriptionMapper.deleteCysPrescriptionByPrescriptionIds(prescriptionIds);
    }

    /**
     * 删除药单信息
     * 
     * @param prescriptionId 药单主键
     * @return 结果
     */
    @Override
    public int deleteCysPrescriptionByPrescriptionId(Long prescriptionId)
    {
        return cysPrescriptionMapper.deleteCysPrescriptionByPrescriptionId(prescriptionId);
    }
}
