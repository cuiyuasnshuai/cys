package com.ruoyi.drugs.service.impl;

import java.util.List;

import com.ruoyi.drugs.mapper.CysDrugsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.drugs.domain.CysDrugs;
import com.ruoyi.drugs.service.ICysDrugsService;

/**
 * 药品Service业务层处理
 * 
 * @author 崔元帅
 * @date 2024-05-07
 */
@Service
public class CysDrugsServiceImpl implements ICysDrugsService 
{
    @Autowired
    private CysDrugsMapper cysDrugsMapper;

    /**
     * 查询药品
     * 
     * @param drugsId 药品主键
     * @return 药品
     */
    @Override
    public CysDrugs selectCysDrugsByDrugsId(Long drugsId)
    {
        return cysDrugsMapper.selectCysDrugsByDrugsId(drugsId);
    }

    /**
     * 查询药品列表
     * 
     * @param cysDrugs 药品
     * @return 药品
     */
    @Override
    public List<CysDrugs> selectCysDrugsList(CysDrugs cysDrugs)
    {
        return cysDrugsMapper.selectCysDrugsList(cysDrugs);
    }

    /**
     * 新增药品
     * 
     * @param cysDrugs 药品
     * @return 结果
     */
    @Override
    public int insertCysDrugs(CysDrugs cysDrugs)
    {
        return cysDrugsMapper.insertCysDrugs(cysDrugs);
    }

    /**
     * 修改药品
     * 
     * @param cysDrugs 药品
     * @return 结果
     */
    @Override
    public int updateCysDrugs(CysDrugs cysDrugs)
    {
        return cysDrugsMapper.updateCysDrugs(cysDrugs);
    }

    /**
     * 批量删除药品
     * 
     * @param drugsIds 需要删除的药品主键
     * @return 结果
     */
    @Override
    public int deleteCysDrugsByDrugsIds(Long[] drugsIds)
    {
        return cysDrugsMapper.deleteCysDrugsByDrugsIds(drugsIds);
    }

    /**
     * 删除药品信息
     * 
     * @param drugsId 药品主键
     * @return 结果
     */
    @Override
    public int deleteCysDrugsByDrugsId(Long drugsId)
    {
        return cysDrugsMapper.deleteCysDrugsByDrugsId(drugsId);
    }
}
