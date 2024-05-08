package com.ruoyi.drugs.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 药品对象 cys_drugs
 * 
 * @author 崔元帅
 * @date 2024-05-07
 */
public class CysDrugs extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 药品编号
 */
    private Long drugsId;

    /** 药品名称
 */
    @Excel(name = "药品名称 ")
    private String drugsName;

    /** 药品价格 */
    @Excel(name = "药品价格")
    private Long drugsPrice;

    /** 药品种类 */
    @Excel(name = "药品种类")
    private String drugsKind;

    /** 药品数量 */
    @Excel(name = "药品数量")
    private Long drugsCount;

    /** 进货人 */
    @Excel(name = "进货人")
    private String purchaserName;

    /** 进货人手机号 */
    @Excel(name = "进货人手机号")
    private String purchaserPhone;

    public void setDrugsId(Long drugsId) 
    {
        this.drugsId = drugsId;
    }

    public Long getDrugsId() 
    {
        return drugsId;
    }
    public void setDrugsName(String drugsName) 
    {
        this.drugsName = drugsName;
    }

    public String getDrugsName() 
    {
        return drugsName;
    }
    public void setDrugsPrice(Long drugsPrice) 
    {
        this.drugsPrice = drugsPrice;
    }

    public Long getDrugsPrice() 
    {
        return drugsPrice;
    }
    public void setDrugsKind(String drugsKind) 
    {
        this.drugsKind = drugsKind;
    }

    public String getDrugsKind() 
    {
        return drugsKind;
    }
    public void setDrugsCount(Long drugsCount) 
    {
        this.drugsCount = drugsCount;
    }

    public Long getDrugsCount() 
    {
        return drugsCount;
    }
    public void setPurchaserName(String purchaserName) 
    {
        this.purchaserName = purchaserName;
    }

    public String getPurchaserName() 
    {
        return purchaserName;
    }
    public void setPurchaserPhone(String purchaserPhone) 
    {
        this.purchaserPhone = purchaserPhone;
    }

    public String getPurchaserPhone() 
    {
        return purchaserPhone;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("drugsId", getDrugsId())
            .append("drugsName", getDrugsName())
            .append("drugsPrice", getDrugsPrice())
            .append("drugsKind", getDrugsKind())
            .append("drugsCount", getDrugsCount())
            .append("purchaserName", getPurchaserName())
            .append("purchaserPhone", getPurchaserPhone())
            .toString();
    }
}
