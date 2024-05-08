package com.ruoyi.registered.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 挂号对象 cys_registered
 * 
 * @author 崔元帅
 * @date 2024-05-07
 */
public class CysRegistered extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 挂号编号 */
    private Long registeredId;

    /** 医生编号 */
    @Excel(name = "医生编号")
    private Long userId;

    /** 科室编号 */
    @Excel(name = "科室编号")
    private Long deptId;

    /** 患者编号 */
    @Excel(name = "患者编号")
    private Long createId;

    /** 挂号状态（0未完成，1已完成） */
    @Excel(name = "挂号状态", readConverterExp = "0=未完成，1已完成")
    private String status;

    public void setRegisteredId(Long registeredId) 
    {
        this.registeredId = registeredId;
    }

    public Long getRegisteredId() 
    {
        return registeredId;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setDeptId(Long deptId) 
    {
        this.deptId = deptId;
    }

    public Long getDeptId() 
    {
        return deptId;
    }
    public void setCreateId(Long createId) 
    {
        this.createId = createId;
    }

    public Long getCreateId() 
    {
        return createId;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("registeredId", getRegisteredId())
            .append("userId", getUserId())
            .append("deptId", getDeptId())
            .append("createId", getCreateId())
            .append("createTime", getCreateTime())
            .append("status", getStatus())
            .toString();
    }
}
