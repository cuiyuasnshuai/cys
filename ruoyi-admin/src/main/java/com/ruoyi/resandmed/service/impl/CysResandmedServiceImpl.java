package com.ruoyi.resandmed.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.resandmed.mapper.CysResandmedMapper;
import com.ruoyi.resandmed.domain.CysResandmed;
import com.ruoyi.resandmed.service.ICysResandmedService;

/**
 * 药单药品Service业务层处理
 * 
 * @author 崔元帅
 * @date 2024-05-07
 */
@Service
public class CysResandmedServiceImpl implements ICysResandmedService 
{
    @Autowired
    private CysResandmedMapper cysResandmedMapper;

    /**
     * 查询药单药品
     * 
     * @param prescriptionId 药单药品主键
     * @return 药单药品
     */
    @Override
    public CysResandmed selectCysResandmedByPrescriptionId(Long prescriptionId)
    {
        return cysResandmedMapper.selectCysResandmedByPrescriptionId(prescriptionId);
    }

    /**
     * 查询药单药品列表
     * 
     * @param cysResandmed 药单药品
     * @return 药单药品
     */
    @Override
    public List<CysResandmed> selectCysResandmedList(CysResandmed cysResandmed)
    {
        return cysResandmedMapper.selectCysResandmedList(cysResandmed);
    }

    /**
     * 新增药单药品
     * 
     * @param cysResandmed 药单药品
     * @return 结果
     */
    @Override
    public int insertCysResandmed(CysResandmed cysResandmed)
    {
        return cysResandmedMapper.insertCysResandmed(cysResandmed);
    }

    /**
     * 修改药单药品
     * 
     * @param cysResandmed 药单药品
     * @return 结果
     */
    @Override
    public int updateCysResandmed(CysResandmed cysResandmed)
    {
        return cysResandmedMapper.updateCysResandmed(cysResandmed);
    }

    /**
     * 批量删除药单药品
     * 
     * @param prescriptionIds 需要删除的药单药品主键
     * @return 结果
     */
    @Override
    public int deleteCysResandmedByPrescriptionIds(Long[] prescriptionIds)
    {
        return cysResandmedMapper.deleteCysResandmedByPrescriptionIds(prescriptionIds);
    }

    /**
     * 删除药单药品信息
     * 
     * @param prescriptionId 药单药品主键
     * @return 结果
     */
    @Override
    public int deleteCysResandmedByPrescriptionId(Long prescriptionId)
    {
        return cysResandmedMapper.deleteCysResandmedByPrescriptionId(prescriptionId);
    }
}
