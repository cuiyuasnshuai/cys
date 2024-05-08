package com.ruoyi.facilities.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 设施对象 cys_facilities
 * 
 * @author 崔元帅
 * @date 2024-05-07
 */
public class CysFacilities extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long facilitiesId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long deptId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String facilitiesName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long facilitiesPrice;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long status;

    public void setFacilitiesId(Long facilitiesId) 
    {
        this.facilitiesId = facilitiesId;
    }

    public Long getFacilitiesId() 
    {
        return facilitiesId;
    }
    public void setDeptId(Long deptId) 
    {
        this.deptId = deptId;
    }

    public Long getDeptId() 
    {
        return deptId;
    }
    public void setFacilitiesName(String facilitiesName) 
    {
        this.facilitiesName = facilitiesName;
    }

    public String getFacilitiesName() 
    {
        return facilitiesName;
    }
    public void setFacilitiesPrice(Long facilitiesPrice) 
    {
        this.facilitiesPrice = facilitiesPrice;
    }

    public Long getFacilitiesPrice() 
    {
        return facilitiesPrice;
    }
    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("facilitiesId", getFacilitiesId())
            .append("deptId", getDeptId())
            .append("facilitiesName", getFacilitiesName())
            .append("facilitiesPrice", getFacilitiesPrice())
            .append("status", getStatus())
            .toString();
    }
}
