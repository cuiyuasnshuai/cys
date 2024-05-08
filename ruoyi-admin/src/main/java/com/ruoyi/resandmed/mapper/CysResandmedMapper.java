package com.ruoyi.resandmed.mapper;

import java.util.List;
import com.ruoyi.resandmed.domain.CysResandmed;

/**
 * 药单药品Mapper接口
 * 
 * @author 崔元帅
 * @date 2024-05-07
 */
public interface CysResandmedMapper 
{
    /**
     * 查询药单药品
     * 
     * @param prescriptionId 药单药品主键
     * @return 药单药品
     */
    public CysResandmed selectCysResandmedByPrescriptionId(Long prescriptionId);

    /**
     * 查询药单药品列表
     * 
     * @param cysResandmed 药单药品
     * @return 药单药品集合
     */
    public List<CysResandmed> selectCysResandmedList(CysResandmed cysResandmed);

    /**
     * 新增药单药品
     * 
     * @param cysResandmed 药单药品
     * @return 结果
     */
    public int insertCysResandmed(CysResandmed cysResandmed);

    /**
     * 修改药单药品
     * 
     * @param cysResandmed 药单药品
     * @return 结果
     */
    public int updateCysResandmed(CysResandmed cysResandmed);

    /**
     * 删除药单药品
     * 
     * @param prescriptionId 药单药品主键
     * @return 结果
     */
    public int deleteCysResandmedByPrescriptionId(Long prescriptionId);

    /**
     * 批量删除药单药品
     * 
     * @param prescriptionIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCysResandmedByPrescriptionIds(Long[] prescriptionIds);
}
