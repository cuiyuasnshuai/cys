package com.ruoyi.resandmed.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 药单药品对象 cys_resandmed
 * 
 * @author 崔元帅
 * @date 2024-05-07
 */
public class CysResandmed extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long prescriptionId;

    /** $column.columnComment */
    private Long drugsId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long amount;

    public void setPrescriptionId(Long prescriptionId) 
    {
        this.prescriptionId = prescriptionId;
    }

    public Long getPrescriptionId() 
    {
        return prescriptionId;
    }
    public void setDrugsId(Long drugsId) 
    {
        this.drugsId = drugsId;
    }

    public Long getDrugsId() 
    {
        return drugsId;
    }
    public void setAmount(Long amount) 
    {
        this.amount = amount;
    }

    public Long getAmount() 
    {
        return amount;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("prescriptionId", getPrescriptionId())
            .append("drugsId", getDrugsId())
            .append("amount", getAmount())
            .toString();
    }
}
