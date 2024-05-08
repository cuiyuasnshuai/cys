package com.ruoyi.drugs.mapper;

import java.util.List;
import com.ruoyi.drugs.domain.CysDrugs;

/**
 * 药品Mapper接口
 * 
 * @author 崔元帅
 * @date 2024-05-07
 */
public interface CysDrugsMapper 
{
    /**
     * 查询药品
     * 
     * @param drugsId 药品主键
     * @return 药品
     */
    public CysDrugs selectCysDrugsByDrugsId(Long drugsId);

    /**
     * 查询药品列表
     * 
     * @param cysDrugs 药品
     * @return 药品集合
     */
    public List<CysDrugs> selectCysDrugsList(CysDrugs cysDrugs);

    /**
     * 新增药品
     * 
     * @param cysDrugs 药品
     * @return 结果
     */
    public int insertCysDrugs(CysDrugs cysDrugs);

    /**
     * 修改药品
     * 
     * @param cysDrugs 药品
     * @return 结果
     */
    public int updateCysDrugs(CysDrugs cysDrugs);

    /**
     * 删除药品
     * 
     * @param drugsId 药品主键
     * @return 结果
     */
    public int deleteCysDrugsByDrugsId(Long drugsId);

    /**
     * 批量删除药品
     * 
     * @param drugsIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCysDrugsByDrugsIds(Long[] drugsIds);
}
