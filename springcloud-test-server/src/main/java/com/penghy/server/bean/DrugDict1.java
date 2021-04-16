package com.penghy.server.bean;

public class DrugDict1 {

    private static final long serialVersionUID = 1L;

    private int incrementId;

    private String insureDrugCode;

    public int getIncrementId() {
        return incrementId;
    }

    public void setIncrementId(int incrementId) {
        this.incrementId = incrementId;
    }

    private String drugChineseName;

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
    private String drugMinUnit;

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
    private String drugEnglishName;

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

    private String drugApproveNum;

    /**
     * 备注
     */
    private String drugRemark;

    /**
     * 使用范围
     */
    private String itemApplyScope;

    private String insureDrugGrade;

    public String getInsureDrugGrade() {
        return insureDrugGrade;
    }

    public void setInsureDrugGrade(String insureDrugGrade) {
        this.insureDrugGrade = insureDrugGrade;
    }

    public String getInsureDrugCode() {
        return insureDrugCode;
    }

    public void setInsureDrugCode(String insureDrugCode) {
        this.insureDrugCode = insureDrugCode;
    }

    public String getDrugChineseName() {
        return drugChineseName;
    }

    public void setDrugChineseName(String drugChineseName) {
        this.drugChineseName = drugChineseName;
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

    public String getDrugMinUnit() {
        return drugMinUnit;
    }

    public void setDrugMinUnit(String drugMinUnit) {
        this.drugMinUnit = drugMinUnit;
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

    public String getDrugEnglishName() {
        return drugEnglishName;
    }

    public void setDrugEnglishName(String drugEnglishName) {
        this.drugEnglishName = drugEnglishName;
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

    public String getDrugApproveNum() {
        return drugApproveNum;
    }

    public void setDrugApproveNum(String drugApproveNum) {
        this.drugApproveNum = drugApproveNum;
    }

    public String getDrugRemark() {
        return drugRemark;
    }

    public void setDrugRemark(String drugRemark) {
        this.drugRemark = drugRemark;
    }

    public String getItemApplyScope() {
        return itemApplyScope;
    }

    public void setItemApplyScope(String itemApplyScope) {
        this.itemApplyScope = itemApplyScope;
    }
}
