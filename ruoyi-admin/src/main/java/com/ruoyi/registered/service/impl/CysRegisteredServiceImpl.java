package com.ruoyi.registered.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.registered.mapper.CysRegisteredMapper;
import com.ruoyi.registered.domain.CysRegistered;
import com.ruoyi.registered.service.ICysRegisteredService;

/**
 * 挂号Service业务层处理
 * 
 * @author 崔元帅
 * @date 2024-05-07
 */
@Service
public class CysRegisteredServiceImpl implements ICysRegisteredService 
{
    @Autowired
    private CysRegisteredMapper cysRegisteredMapper;

    /**
     * 查询挂号
     * 
     * @param registeredId 挂号主键
     * @return 挂号
     */
    @Override
    public CysRegistered selectCysRegisteredByRegisteredId(Long registeredId)
    {
        return cysRegisteredMapper.selectCysRegisteredByRegisteredId(registeredId);
    }

    /**
     * 查询挂号列表
     * 
     * @param cysRegistered 挂号
     * @return 挂号
     */
    @Override
    public List<CysRegistered> selectCysRegisteredList(CysRegistered cysRegistered)
    {
        return cysRegisteredMapper.selectCysRegisteredList(cysRegistered);
    }

    /**
     * 新增挂号
     * 
     * @param cysRegistered 挂号
     * @return 结果
     */
    @Override
    public int insertCysRegistered(CysRegistered cysRegistered)
    {
        cysRegistered.setCreateTime(DateUtils.getNowDate());
        return cysRegisteredMapper.insertCysRegistered(cysRegistered);
    }

    /**
     * 修改挂号
     * 
     * @param cysRegistered 挂号
     * @return 结果
     */
    @Override
    public int updateCysRegistered(CysRegistered cysRegistered)
    {
        return cysRegisteredMapper.updateCysRegistered(cysRegistered);
    }

    /**
     * 批量删除挂号
     * 
     * @param registeredIds 需要删除的挂号主键
     * @return 结果
     */
    @Override
    public int deleteCysRegisteredByRegisteredIds(Long[] registeredIds)
    {
        return cysRegisteredMapper.deleteCysRegisteredByRegisteredIds(registeredIds);
    }

    /**
     * 删除挂号信息
     * 
     * @param registeredId 挂号主键
     * @return 结果
     */
    @Override
    public int deleteCysRegisteredByRegisteredId(Long registeredId)
    {
        return cysRegisteredMapper.deleteCysRegisteredByRegisteredId(registeredId);
    }
}
