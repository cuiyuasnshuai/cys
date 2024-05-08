package com.ruoyi.prescription.service;

import java.util.List;
import com.ruoyi.prescription.domain.CysPrescription;

/**
 * 药单Service接口
 * 
 * @author 崔元帅
 * @date 2024-05-07
 */
public interface ICysPrescriptionService 
{
    /**
     * 查询药单
     * 
     * @param prescriptionId 药单主键
     * @return 药单
     */
    public CysPrescription selectCysPrescriptionByPrescriptionId(Long prescriptionId);

    /**
     * 查询药单列表
     * 
     * @param cysPrescription 药单
     * @return 药单集合
     */
    public List<CysPrescription> selectCysPrescriptionList(CysPrescription cysPrescription);

    /**
     * 新增药单
     * 
     * @param cysPrescription 药单
     * @return 结果
     */
    public int insertCysPrescription(CysPrescription cysPrescription);

    /**
     * 修改药单
     * 
     * @param cysPrescription 药单
     * @return 结果
     */
    public int updateCysPrescription(CysPrescription cysPrescription);

    /**
     * 批量删除药单
     * 
     * @param prescriptionIds 需要删除的药单主键集合
     * @return 结果
     */
    public int deleteCysPrescriptionByPrescriptionIds(Long[] prescriptionIds);

    /**
     * 删除药单信息
     * 
     * @param prescriptionId 药单主键
     * @return 结果
     */
    public int deleteCysPrescriptionByPrescriptionId(Long prescriptionId);
}
