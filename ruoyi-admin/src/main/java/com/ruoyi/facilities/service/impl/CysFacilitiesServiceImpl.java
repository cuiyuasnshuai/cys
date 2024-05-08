package com.ruoyi.facilities.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.facilities.mapper.CysFacilitiesMapper;
import com.ruoyi.facilities.domain.CysFacilities;
import com.ruoyi.facilities.service.ICysFacilitiesService;

/**
 * 设施Service业务层处理
 * 
 * @author 崔元帅
 * @date 2024-05-07
 */
@Service
public class CysFacilitiesServiceImpl implements ICysFacilitiesService 
{
    @Autowired
    private CysFacilitiesMapper cysFacilitiesMapper;

    /**
     * 查询设施
     * 
     * @param facilitiesId 设施主键
     * @return 设施
     */
    @Override
    public CysFacilities selectCysFacilitiesByFacilitiesId(Long facilitiesId)
    {
        return cysFacilitiesMapper.selectCysFacilitiesByFacilitiesId(facilitiesId);
    }

    /**
     * 查询设施列表
     * 
     * @param cysFacilities 设施
     * @return 设施
     */
    @Override
    public List<CysFacilities> selectCysFacilitiesList(CysFacilities cysFacilities)
    {
        return cysFacilitiesMapper.selectCysFacilitiesList(cysFacilities);
    }

    /**
     * 新增设施
     * 
     * @param cysFacilities 设施
     * @return 结果
     */
    @Override
    public int insertCysFacilities(CysFacilities cysFacilities)
    {
        return cysFacilitiesMapper.insertCysFacilities(cysFacilities);
    }

    /**
     * 修改设施
     * 
     * @param cysFacilities 设施
     * @return 结果
     */
    @Override
    public int updateCysFacilities(CysFacilities cysFacilities)
    {
        return cysFacilitiesMapper.updateCysFacilities(cysFacilities);
    }

    /**
     * 批量删除设施
     * 
     * @param facilitiesIds 需要删除的设施主键
     * @return 结果
     */
    @Override
    public int deleteCysFacilitiesByFacilitiesIds(Long[] facilitiesIds)
    {
        return cysFacilitiesMapper.deleteCysFacilitiesByFacilitiesIds(facilitiesIds);
    }

    /**
     * 删除设施信息
     * 
     * @param facilitiesId 设施主键
     * @return 结果
     */
    @Override
    public int deleteCysFacilitiesByFacilitiesId(Long facilitiesId)
    {
        return cysFacilitiesMapper.deleteCysFacilitiesByFacilitiesId(facilitiesId);
    }
}
