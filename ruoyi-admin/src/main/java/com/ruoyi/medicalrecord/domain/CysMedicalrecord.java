package com.ruoyi.medicalrecord.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 病历对象 cys_medicalrecord
 * 
 * @author 崔元帅
 * @date 2024-05-07
 */
public class CysMedicalrecord extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 病历单编号 */
    private Long medicalRecordId;

    /** 患者编号 */
    @Excel(name = "患者编号")
    private Long userId;

    /** 病历内容 */
    @Excel(name = "病历内容")
    private String medicalRecordContent;

    public void setMedicalRecordId(Long medicalRecordId) 
    {
        this.medicalRecordId = medicalRecordId;
    }

    public Long getMedicalRecordId() 
    {
        return medicalRecordId;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setMedicalRecordContent(String medicalRecordContent) 
    {
        this.medicalRecordContent = medicalRecordContent;
    }

    public String getMedicalRecordContent() 
    {
        return medicalRecordContent;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("medicalRecordId", getMedicalRecordId())
            .append("userId", getUserId())
            .append("createBy", getCreateBy())
            .append("medicalRecordContent", getMedicalRecordContent())
            .append("createTime", getCreateTime())
            .toString();
    }
}
