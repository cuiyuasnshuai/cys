package com.ruoyi.userinfo.service;

import java.util.List;
import com.ruoyi.userinfo.domain.CysUserinfo;

/**
 * 用户Service接口
 * 
 * @author ruoyi
 * @date 2024-05-07
 */
public interface ICysUserinfoService 
{
    /**
     * 查询用户
     * 
     * @param userId 用户主键
     * @return 用户
     */
    public CysUserinfo selectCysUserinfoByUserId(Long userId);

    /**
     * 查询用户列表
     * 
     * @param cysUserinfo 用户
     * @return 用户集合
     */
    public List<CysUserinfo> selectCysUserinfoList(CysUserinfo cysUserinfo);

    /**
     * 新增用户
     * 
     * @param cysUserinfo 用户
     * @return 结果
     */
    public int insertCysUserinfo(CysUserinfo cysUserinfo);

    /**
     * 修改用户
     * 
     * @param cysUserinfo 用户
     * @return 结果
     */
    public int updateCysUserinfo(CysUserinfo cysUserinfo);

    /**
     * 批量删除用户
     * 
     * @param userIds 需要删除的用户主键集合
     * @return 结果
     */
    public int deleteCysUserinfoByUserIds(Long[] userIds);

    /**
     * 删除用户信息
     * 
     * @param userId 用户主键
     * @return 结果
     */
    public int deleteCysUserinfoByUserId(Long userId);
}
