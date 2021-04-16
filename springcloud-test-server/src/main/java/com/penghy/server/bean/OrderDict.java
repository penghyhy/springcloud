package com.penghy.server.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

/**
 * OrderDict 保险诊疗目录实体
 *
 * @author tianshuai
 * @date 2019-03-26
 */
public class OrderDict {
    private static final long serialVersionUID = 1L;

    /**
     * 保险诊疗目录内码id
     */
    private String id;
    /**
     * 目录类别序号
     */
    private String dictBookId;
    /**
     * 默认待遇类别
     */
    private String defaultTreatmentType;
    /**
     * 医保自付比例
     */
    private BigDecimal insureSelfScale;
    /**
     * His收费项目IDsi_order_dict2his
     */
    private String chargeItemId;
    /**
     * si_order_dict2his人员类别代码
     */
    private String personStyleCode;
    /**
     * 保险诊疗代码
     */
    private String insureOrderCode;
    /**
     * 诊疗标准代码
     */
    private String orderStandardCode;
    /**
     * 诊疗中文名称
     */
    private String orderChineseName;
    /**
     * 诊疗英文名称
     */
    private String orderEnglishName;
    /**
     * 保险诊疗等级
     */
    private String insureOrderGrade;
    /**
     * 收费项目编码
     */
    private String chargeItemCode;
    /**
     * 收费项目名称
     */
    private String chargeItemName;
    /**
     * 项目适用范围
     */
    private String chageApplyScope;
    /**
     * 保险诊疗单位
     */
    private String insureOrderUnit;
    /**
     * 诊疗标准单价
     */
    private BigDecimal orderStandardPrice;
    /**
     * 诊疗备注说明
     */
    private String orderRemark;
    /**
     * 门诊住院判别
     */
    private Integer oiFlag;
    /**
     * 门诊单价限额
     */
    private BigDecimal outpatientPriceQuota;
    /**
     * 住院单价限额
     */
    private BigDecimal inpatientPriceQuota;
    /**
     * 门诊使用限量
     */
    private BigDecimal outpatientUsageQuota;
    /**
     * 住院使用限量
     */
    private BigDecimal inpatientUsageQuota;
    /**
     * 诊疗材料判别
     */
    private BigDecimal orderMaterialFlag;
    /**
     * 项目限制判别
     */
    private BigDecimal itemLimitFlag;
    /**
     * 项目审批类别
     */
    private BigDecimal itemApprovalFlag;
    /**
     * 使用开始日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date useStartTime;
    /**
     * 使用结束日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date useEndTime;
    /**
     * 汉字输入码一
     */
    private String searchCode1;
    /**
     * 汉字输入码二
     */
    private String searchCode2;
    /**
     * 汉字输入码三
     */
    private String searchCode3;

    /**
     * 批准文号
     */
    private String orderApproveNum;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDictBookId() {
        return dictBookId;
    }

    public void setDictBookId(String dictBookId) {
        this.dictBookId = dictBookId;
    }

    public String getDefaultTreatmentType() {
        return defaultTreatmentType;
    }

    public void setDefaultTreatmentType(String defaultTreatmentType) {
        this.defaultTreatmentType = defaultTreatmentType;
    }

    public BigDecimal getInsureSelfScale() {
        return insureSelfScale;
    }

    public void setInsureSelfScale(BigDecimal insureSelfScale) {
        this.insureSelfScale = insureSelfScale;
    }

    public String getChargeItemId() {
        return chargeItemId;
    }

    public void setChargeItemId(String chargeItemId) {
        this.chargeItemId = chargeItemId;
    }

    public String getPersonStyleCode() {
        return personStyleCode;
    }

    public void setPersonStyleCode(String personStyleCode) {
        this.personStyleCode = personStyleCode;
    }

    public String getInsureOrderCode() {
        return insureOrderCode;
    }

    public void setInsureOrderCode(String insureOrderCode) {
        this.insureOrderCode = insureOrderCode;
    }

    public String getOrderStandardCode() {
        return orderStandardCode;
    }

    public void setOrderStandardCode(String orderStandardCode) {
        this.orderStandardCode = orderStandardCode;
    }

    public String getOrderChineseName() {
        return orderChineseName;
    }

    public void setOrderChineseName(String orderChineseName) {
        this.orderChineseName = orderChineseName;
    }

    public String getOrderEnglishName() {
        return orderEnglishName;
    }

    public void setOrderEnglishName(String orderEnglishName) {
        this.orderEnglishName = orderEnglishName;
    }

    public String getInsureOrderGrade() {
        return insureOrderGrade;
    }

    public void setInsureOrderGrade(String insureOrderGrade) {
        this.insureOrderGrade = insureOrderGrade;
    }

    public String getChargeItemCode() {
        return chargeItemCode;
    }

    public void setChargeItemCode(String chargeItemCode) {
        this.chargeItemCode = chargeItemCode;
    }

    public String getChargeItemName() {
        return chargeItemName;
    }

    public void setChargeItemName(String chargeItemName) {
        this.chargeItemName = chargeItemName;
    }

    public String getChageApplyScope() {
        return chageApplyScope;
    }

    public void setChageApplyScope(String chageApplyScope) {
        this.chageApplyScope = chageApplyScope;
    }

    public String getInsureOrderUnit() {
        return insureOrderUnit;
    }

    public void setInsureOrderUnit(String insureOrderUnit) {
        this.insureOrderUnit = insureOrderUnit;
    }

    public BigDecimal getOrderStandardPrice() {
        return orderStandardPrice;
    }

    public void setOrderStandardPrice(BigDecimal orderStandardPrice) {
        this.orderStandardPrice = orderStandardPrice;
    }

    public String getOrderRemark() {
        return orderRemark;
    }

    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark;
    }

    public Integer getOiFlag() {
        return oiFlag;
    }

    public void setOiFlag(Integer oiFlag) {
        this.oiFlag = oiFlag;
    }

    public BigDecimal getOutpatientPriceQuota() {
        return outpatientPriceQuota;
    }

    public void setOutpatientPriceQuota(BigDecimal outpatientPriceQuota) {
        this.outpatientPriceQuota = outpatientPriceQuota;
    }

    public BigDecimal getInpatientPriceQuota() {
        return inpatientPriceQuota;
    }

    public void setInpatientPriceQuota(BigDecimal inpatientPriceQuota) {
        this.inpatientPriceQuota = inpatientPriceQuota;
    }

    public BigDecimal getOutpatientUsageQuota() {
        return outpatientUsageQuota;
    }

    public void setOutpatientUsageQuota(BigDecimal outpatientUsageQuota) {
        this.outpatientUsageQuota = outpatientUsageQuota;
    }

    public BigDecimal getInpatientUsageQuota() {
        return inpatientUsageQuota;
    }

    public void setInpatientUsageQuota(BigDecimal inpatientUsageQuota) {
        this.inpatientUsageQuota = inpatientUsageQuota;
    }

    public BigDecimal getOrderMaterialFlag() {
        return orderMaterialFlag;
    }

    public void setOrderMaterialFlag(BigDecimal orderMaterialFlag) {
        this.orderMaterialFlag = orderMaterialFlag;
    }

    public BigDecimal getItemLimitFlag() {
        return itemLimitFlag;
    }

    public void setItemLimitFlag(BigDecimal itemLimitFlag) {
        this.itemLimitFlag = itemLimitFlag;
    }

    public BigDecimal getItemApprovalFlag() {
        return itemApprovalFlag;
    }

    public void setItemApprovalFlag(BigDecimal itemApprovalFlag) {
        this.itemApprovalFlag = itemApprovalFlag;
    }

    public Date getUseStartTime() {
        return useStartTime;
    }

    public void setUseStartTime(Date useStartTime) {
        this.useStartTime = useStartTime;
    }

    public Date getUseEndTime() {
        return useEndTime;
    }

    public void setUseEndTime(Date useEndTime) {
        this.useEndTime = useEndTime;
    }

    public String getSearchCode1() {
        return searchCode1;
    }

    public void setSearchCode1(String searchCode1) {
        this.searchCode1 = searchCode1;
    }

    public String getSearchCode2() {
        return searchCode2;
    }

    public void setSearchCode2(String searchCode2) {
        this.searchCode2 = searchCode2;
    }

    public String getSearchCode3() {
        return searchCode3;
    }

    public void setSearchCode3(String searchCode3) {
        this.searchCode3 = searchCode3;
    }

    public String getOrderApproveNum() {
        return orderApproveNum;
    }

    public void setOrderApproveNum(String orderApproveNum) {
        this.orderApproveNum = orderApproveNum;
    }
}