package com.ruoyi.facilities.mapper;

import java.util.List;
import com.ruoyi.facilities.domain.CysFacilities;

/**
 * 设施Mapper接口
 * 
 * @author 崔元帅
 * @date 2024-05-07
 */
public interface CysFacilitiesMapper 
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
     * 删除设施
     * 
     * @param facilitiesId 设施主键
     * @return 结果
     */
    public int deleteCysFacilitiesByFacilitiesId(Long facilitiesId);

    /**
     * 批量删除设施
     * 
     * @param facilitiesIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCysFacilitiesByFacilitiesIds(Long[] facilitiesIds);
}
