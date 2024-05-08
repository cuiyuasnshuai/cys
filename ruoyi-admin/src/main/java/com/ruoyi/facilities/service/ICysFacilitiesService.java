package com.ruoyi.facilities.service;

import java.util.List;
import com.ruoyi.facilities.domain.CysFacilities;

/**
 * 设施Service接口
 * 
 * @author 崔元帅
 * @date 2024-05-07
 */
public interface ICysFacilitiesService 
{
    /**
     * 查询设施
     * 
     * @param facilitiesId 设施主键
     * @return 设施
     */
    public CysFacilities selectCysFacilitiesByFacilitiesId(Long facilitiesId);

    /**
     * 查询设施列表
     * 
     * @param cysFacilities 设施
     * @return 设施集合
     */
    public List<CysFacilities> selectCysFacilitiesList(CysFacilities cysFacilities);

    /**
     * 新增设施
     * 
     * @param cysFacilities 设施
     * @return 结果
     */
    public int insertCysFacilities(CysFacilities cysFacilities);

    /**
     * 修改设施
     * 
     * @param cysFacilities 设施
     * @return 结果
     */
    public int updateCysFacilities(CysFacilities cysFacilities);

    /**
     * 批量删除设施
     * 
     * @param facilitiesIds 需要删除的设施主键集合
     * @return 结果
     */
    public int deleteCysFacilitiesByFacilitiesIds(Long[] facilitiesIds);

    /**
     * 删除设施信息
     * 
     * @param facilitiesId 设施主键
     * @return 结果
     */
    public int deleteCysFacilitiesByFacilitiesId(Long facilitiesId);
}
