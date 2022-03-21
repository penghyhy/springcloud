package com.penghy.server.bean.sis;


import java.math.BigDecimal;

/**

 */
public class Reckon {
    private static final long serialVersionUID = 1L;

    /**
     * 保险疾病目录内码id
     */
    private String conputeDetailId;
    /**
     * 目录类别序号
     */
    private String settleRecordId;
    /**
     * His疾病代码
     */
    private Integer computeClassId;
    /**
     * 保险疾病代码
     */
    private String computeClassEn;
    /**
     * 疾病标准编码
     */
    private String computeClassName;
    /**
     * 疾病中文名称
     */
    private Integer computeClassFlag;
    /**
     * 疾病英文名称
     */
    private BigDecimal computeClassFees;

    public String getConputeDetailId() {
        return conputeDetailId;
    }

    public void setConputeDetailId(String conputeDetailId) {
        this.conputeDetailId = conputeDetailId;
    }

    public String getSettleRecordId() {
        return settleRecordId;
    }

    public void setSettleRecordId(String settleRecordId) {
        this.settleRecordId = settleRecordId;
    }

    public Integer getComputeClassId() {
        return computeClassId;
    }

    public void setComputeClassId(Integer computeClassId) {
        this.computeClassId = computeClassId;
    }

    public String getComputeClassEn() {
        return computeClassEn;
    }

    public void setComputeClassEn(String computeClassEn) {
        this.computeClassEn = computeClassEn;
    }

    public String getComputeClassName() {
        return computeClassName;
    }

    public void setComputeClassName(String computeClassName) {
        this.computeClassName = computeClassName;
    }

    public Integer getComputeClassFlag() {
        return computeClassFlag;
    }

    public void setComputeClassFlag(Integer computeClassFlag) {
        this.computeClassFlag = computeClassFlag;
    }

    public BigDecimal getComputeClassFees() {
        return computeClassFees;
    }

    public void setComputeClassFees(BigDecimal computeClassFees) {
        this.computeClassFees = computeClassFees;
    }
}