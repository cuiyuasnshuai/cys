package com.ruoyi.registered.mapper;

import java.util.List;
import com.ruoyi.registered.domain.CysRegistered;

/**
 * 挂号Mapper接口
 * 
 * @author 崔元帅
 * @date 2024-05-07
 */
public interface CysRegisteredMapper 
{
    /**
     * 查询挂号
     * 
     * @param registeredId 挂号主键
     * @return 挂号
     */
    public CysRegistered selectCysRegisteredByRegisteredId(Long registeredId);

    /**
     * 查询挂号列表
     * 
     * @param cysRegistered 挂号
     * @return 挂号集合
     */
    public List<CysRegistered> selectCysRegisteredList(CysRegistered cysRegistered);

    /**
     * 新增挂号
     * 
     * @param cysRegistered 挂号
     * @return 结果
     */
    public int insertCysRegistered(CysRegistered cysRegistered);

    /**
     * 修改挂号
     * 
     * @param cysRegistered 挂号
     * @return 结果
     */
    public int updateCysRegistered(CysRegistered cysRegistered);

    /**
     * 删除挂号
     * 
     * @param registeredId 挂号主键
     * @return 结果
     */
    public int deleteCysRegisteredByRegisteredId(Long registeredId);

    /**
     * 批量删除挂号
     * 
     * @param registeredIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCysRegisteredByRegisteredIds(Long[] registeredIds);
}
