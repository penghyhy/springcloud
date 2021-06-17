package com.penghy.server.bean;

public class OrderDict1 {

    private static final long serialVersionUID = 1L;

    private int incrementId;

    private String insureOrderCode;

    private String orderChineseName;

    public int getIncrementId() {
        return incrementId;
    }

    public void setIncrementId(int incrementId) {
        this.incrementId = incrementId;
    }

    /**
     * 大类
     */
    private String chargeItemCode;

    /**
     * 产地名称
     */
    private String drugFactoryName;

    /**
     * 最小计价单位
     */
    private String insureOrderUnit;

    /**
     * 规格
     */
    private String insureDrugSpec;

    /**
     * 剂型
     */
    private String drugDosageForm;

    /**
     * 英文名称
     */
    private String orderEnglishName;

    /**
     * 搜索码1
     */
    private String searchCode1;

    /**
     * 搜索码2
     */
    private String searchCode2;

    /**
     * 启用开始时间
     */
    private String useStartTime;

    private String useEndTime;

    private String orderApproveNum;

    private String insureOrderGrade;


    /**
     * 备注
     */
    private String orderRemark;

    /**
     * 使用范围
     */
    private String chageApplyScope;


    public String getInsureOrderGrade() {
        return insureOrderGrade;
    }

    public void setInsureOrderGrade(String insureOrderGrade) {
        this.insureOrderGrade = insureOrderGrade;
    }

    public String getInsureOrderCode() {
        return insureOrderCode;
    }

    public void setInsureOrderCode(String insureOrderCode) {
        this.insureOrderCode = insureOrderCode;
    }

    public String getOrderChineseName() {
        return orderChineseName;
    }

    public void setOrderChineseName(String orderChineseName) {
        this.orderChineseName = orderChineseName;
    }

    public String getChargeItemCode() {
        return chargeItemCode;
    }

    public void setChargeItemCode(String chargeItemCode) {
        this.chargeItemCode = chargeItemCode;
    }

    public String getDrugFactoryName() {
        return drugFactoryName;
    }

    public void setDrugFactoryName(String drugFactoryName) {
        this.drugFactoryName = drugFactoryName;
    }

    public String getInsureOrderUnit() {
        return insureOrderUnit;
    }

    public void setInsureOrderUnit(String insureOrderUnit) {
        this.insureOrderUnit = insureOrderUnit;
    }

    public String getInsureDrugSpec() {
        return insureDrugSpec;
    }

    public void setInsureDrugSpec(String insureDrugSpec) {
        this.insureDrugSpec = insureDrugSpec;
    }

    public String getDrugDosageForm() {
        return drugDosageForm;
    }

    public void setDrugDosageForm(String drugDosageForm) {
        this.drugDosageForm = drugDosageForm;
    }

    public String getOrderEnglishName() {
        return orderEnglishName;
    }

    public void setOrderEnglishName(String orderEnglishName) {
        this.orderEnglishName = orderEnglishName;
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

    public String getUseStartTime() {
        return useStartTime;
    }

    public void setUseStartTime(String useStartTime) {
        this.useStartTime = useStartTime;
    }

    public String getUseEndTime() {
        return useEndTime;
    }

    public void setUseEndTime(String useEndTime) {
        this.useEndTime = useEndTime;
    }

    public String getOrderApproveNum() {
        return orderApproveNum;
    }

    public void setOrderApproveNum(String orderApproveNum) {
        this.orderApproveNum = orderApproveNum;
    }

    public String getOrderRemark() {
        return orderRemark;
    }

    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark;
    }

    public String getChageApplyScope() {
        return chageApplyScope;
    }

    public void setChageApplyScope(String chageApplyScope) {
        this.chageApplyScope = chageApplyScope;
    }
}
