package com.ruoyi.userinfo.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 用户对象 cys_userinfo
 * 
 * @author ruoyi
 * @date 2024-05-07
 */
public class CysUserinfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 用户ID */
    private Long userId;

    /** 用户姓名 */
    @Excel(name = "用户姓名")
    private String userName;

    /** 用户身份证号 */
    @Excel(name = "用户身份证号")
    private String userIdNumber;

    /** 用户地区 */
    @Excel(name = "用户地区")
    private String userArea;

    /** 用户手机号 */
    @Excel(name = "用户手机号")
    private String userPhone;

    /** 用户性别（0男 1女 2未知） */
    @Excel(name = "用户性别", readConverterExp = "0=男,1=女,2=未知")
    private String userSex;

    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public String getUserName() 
    {
        return userName;
    }
    public void setUserIdNumber(String userIdNumber) 
    {
        this.userIdNumber = userIdNumber;
    }

    public String getUserIdNumber() 
    {
        return userIdNumber;
    }
    public void setUserArea(String userArea) 
    {
        this.userArea = userArea;
    }

    public String getUserArea() 
    {
        return userArea;
    }
    public void setUserPhone(String userPhone) 
    {
        this.userPhone = userPhone;
    }

    public String getUserPhone() 
    {
        return userPhone;
    }
    public void setUserSex(String userSex) 
    {
        this.userSex = userSex;
    }

    public String getUserSex() 
    {
        return userSex;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("userId", getUserId())
            .append("userName", getUserName())
            .append("userIdNumber", getUserIdNumber())
            .append("userArea", getUserArea())
            .append("userPhone", getUserPhone())
            .append("userSex", getUserSex())
            .toString();
    }
}
