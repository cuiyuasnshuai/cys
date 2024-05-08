package com.ruoyi.userinfo.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.userinfo.mapper.CysUserinfoMapper;
import com.ruoyi.userinfo.domain.CysUserinfo;
import com.ruoyi.userinfo.service.ICysUserinfoService;

/**
 * 用户Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-05-07
 */
@Service
public class CysUserinfoServiceImpl implements ICysUserinfoService 
{
    @Autowired
    private CysUserinfoMapper cysUserinfoMapper;

    /**
     * 查询用户
     * 
     * @param userId 用户主键
     * @return 用户
     */
    @Override
    public CysUserinfo selectCysUserinfoByUserId(Long userId)
    {
        return cysUserinfoMapper.selectCysUserinfoByUserId(userId);
    }

    /**
     * 查询用户列表
     * 
     * @param cysUserinfo 用户
     * @return 用户
     */
    @Override
    public List<CysUserinfo> selectCysUserinfoList(CysUserinfo cysUserinfo)
    {
        return cysUserinfoMapper.selectCysUserinfoList(cysUserinfo);
    }

    /**
     * 新增用户
     * 
     * @param cysUserinfo 用户
     * @return 结果
     */
    @Override
    public int insertCysUserinfo(CysUserinfo cysUserinfo)
    {
        return cysUserinfoMapper.insertCysUserinfo(cysUserinfo);
    }

    /**
     * 修改用户
     * 
     * @param cysUserinfo 用户
     * @return 结果
     */
    @Override
    public int updateCysUserinfo(CysUserinfo cysUserinfo)
    {
        return cysUserinfoMapper.updateCysUserinfo(cysUserinfo);
    }

    /**
     * 批量删除用户
     * 
     * @param userIds 需要删除的用户主键
     * @return 结果
     */
    @Override
    public int deleteCysUserinfoByUserIds(Long[] userIds)
    {
        return cysUserinfoMapper.deleteCysUserinfoByUserIds(userIds);
    }

    /**
     * 删除用户信息
     * 
     * @param userId 用户主键
     * @return 结果
     */
    @Override
    public int deleteCysUserinfoByUserId(Long userId)
    {
        return cysUserinfoMapper.deleteCysUserinfoByUserId(userId);
    }
}
