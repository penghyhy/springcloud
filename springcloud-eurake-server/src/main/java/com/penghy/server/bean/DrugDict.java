package com.penghy.server.bean;

import cn.afterturn.easypoi.excel.annotation.Excel;

/**
 * DrugDict 保险药品目录实体
 *
 * @author tianshuai
 * @date 2019-03-26
 */
public class DrugDict  {
    private static final long serialVersionUID = 1L;

    /**
     * 保险药品目录内码id
     */
    @Excel(name = "id")
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
    private String insureSelfScale;
    /**
     * 复方自付比例
     */
    private String compoundSelfScale;
    /**
     * si_drug_dict2his药品规格序号
     */
    private String drugSpecId;
    /**
     * si_drug_dict2his产地代码序号
     */
    private String drugFactoryId;
    /**
     * si_drug_dict2his人员类别代码
     */
    private String personStyleCode;
    /**
     * 保险药品代码
     */
    private String insureDrugCode;
    /**
     * 药品标准代码
     */
    private String drugStandardCode;
    /**
     * 药品中文名称
     */
    private String drugChineseName;

    private Integer deleteFlag;

    /**
     * 药品化学名称
     */
    private String drugChemName;
    /**
     * 药品英文名称
     */
    private String drugEnglishName;
    /**
     * 保险药品规格
     */
    private String insureDrugSpec;
    /**
     * 保险药品剂型
     */
    private String drugDosageForm;
    /**
     * 收费项目编码
     */
    private String chargeItemCode;
    /**
     * 收费项目名称
     */
    private String chargeItemName;
    /**
     * 药品产地名称
     */
    private String drugFactoryName;
    /**
     * 药品包装单位
     */
    private String drugPackageUnit;
    /**
     * 保险药品类型
     */
    private String insuDrugType;
    /**
     * 药品最小剂量
     */
    private String drugMinDose;
    /**
     * 最小剂量单位
     */
    private String minDoseUnit;
    /**
     * 药品最小单位
     */
    private String drugMinUnit;
    /**
     * 药品每日用量
     */
    private String drugDailyDosage;
    /**
     * 药品使用频次
     */
    private String drugUsageFrequency;
    /**
     * 药品使用方法
     */
    private String drugUsageMethod;
    /**
     * 项目适用范围
     */
    private String itemApplyScope;
    /**
     * 保险药品等级
     */
    private String insureDrugGrade;
    /**
     * 药品备注说明
     */
    private String drugRemark;
    /**
     * 处方用药判别
     */
    private String prescriptionUsageFlag;
    /**
     * 标准用药帖数
     */
    private String standardUsagePosts;
    /**
     * 药品标准单价
     */
    private String drugStandardPrice;
    /**
     * 门诊住院判别
     */
    private String oiFlag;
    /**
     * 门诊单价限额
     */
    private String outpatientPriceQuota;
    /**
     * 住院单价限额
     */
    private String inpatientPriceQuota;
    /**
     * 门诊使用限量
     */
    private String outpatientUsageQuota;
    /**
     * 住院使用限量
     */
    private String inpatientUsageQuota;
    /**
     * 药品每次用量
     */
    private String drugEachDose;
    /**
     * ) 项目限制判别 说明：0-不限制,1-只提示,2-提示(符合可用，不符合自费)
     */
    private String itemLimitFlag;
    /**
     * 项目审批类别 说明：0-不审批,1-医院审批,2-中心审批
     */
    private String itemApprovalStyle;
    /**
     * 药品转换比例
     */
    private String drugSwicthScale;

    /**
     * 包装材质
     */
    private String drugTexture;

    /**
     * 使用开始日期
     */
    private String useStartTime;
    /**
     * 使用结束日期
     */
    private String useEndTime;
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
    private String drugApproveNum;

    private String orderby;

    private String createTime;
    private String updater;
    private String creator;
    private String updateTime;

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getOrderby() {
        return orderby;
    }

    public void setOrderby(String orderby) {
        this.orderby = orderby;
    }

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

    public String getInsureSelfScale() {
        return insureSelfScale;
    }

    public void setInsureSelfScale(String insureSelfScale) {
        this.insureSelfScale = insureSelfScale;
    }

    public String getCompoundSelfScale() {
        return compoundSelfScale;
    }

    public void setCompoundSelfScale(String compoundSelfScale) {
        this.compoundSelfScale = compoundSelfScale;
    }

    public String getDrugSpecId() {
        return drugSpecId;
    }

    public void setDrugSpecId(String drugSpecId) {
        this.drugSpecId = drugSpecId;
    }

    public String getDrugFactoryId() {
        return drugFactoryId;
    }

    public void setDrugFactoryId(String drugFactoryId) {
        this.drugFactoryId = drugFactoryId;
    }

    public String getPersonStyleCode() {
        return personStyleCode;
    }

    public void setPersonStyleCode(String personStyleCode) {
        this.personStyleCode = personStyleCode;
    }

    public String getInsureDrugCode() {
        return insureDrugCode;
    }

    public void setInsureDrugCode(String insureDrugCode) {
        this.insureDrugCode = insureDrugCode;
    }

    public String getDrugStandardCode() {
        return drugStandardCode;
    }

    public void setDrugStandardCode(String drugStandardCode) {
        this.drugStandardCode = drugStandardCode;
    }

    public String getDrugChineseName() {
        return drugChineseName;
    }

    public void setDrugChineseName(String drugChineseName) {
        this.drugChineseName = drugChineseName;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getDrugChemName() {
        return drugChemName;
    }

    public void setDrugChemName(String drugChemName) {
        this.drugChemName = drugChemName;
    }

    public String getDrugEnglishName() {
        return drugEnglishName;
    }

    public void setDrugEnglishName(String drugEnglishName) {
        this.drugEnglishName = drugEnglishName;
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

    public String getDrugFactoryName() {
        return drugFactoryName;
    }

    public void setDrugFactoryName(String drugFactoryName) {
        this.drugFactoryName = drugFactoryName;
    }

    public String getDrugPackageUnit() {
        return drugPackageUnit;
    }

    public void setDrugPackageUnit(String drugPackageUnit) {
        this.drugPackageUnit = drugPackageUnit;
    }

    public String getInsuDrugType() {
        return insuDrugType;
    }

    public void setInsuDrugType(String insuDrugType) {
        this.insuDrugType = insuDrugType;
    }

    public String getDrugMinDose() {
        return drugMinDose;
    }

    public void setDrugMinDose(String drugMinDose) {
        this.drugMinDose = drugMinDose;
    }

    public String getMinDoseUnit() {
        return minDoseUnit;
    }

    public void setMinDoseUnit(String minDoseUnit) {
        this.minDoseUnit = minDoseUnit;
    }

    public String getDrugMinUnit() {
        return drugMinUnit;
    }

    public void setDrugMinUnit(String drugMinUnit) {
        this.drugMinUnit = drugMinUnit;
    }

    public String getDrugDailyDosage() {
        return drugDailyDosage;
    }

    public void setDrugDailyDosage(String drugDailyDosage) {
        this.drugDailyDosage = drugDailyDosage;
    }

    public String getDrugUsageFrequency() {
        return drugUsageFrequency;
    }

    public void setDrugUsageFrequency(String drugUsageFrequency) {
        this.drugUsageFrequency = drugUsageFrequency;
    }

    public String getDrugUsageMethod() {
        return drugUsageMethod;
    }

    public void setDrugUsageMethod(String drugUsageMethod) {
        this.drugUsageMethod = drugUsageMethod;
    }

    public String getItemApplyScope() {
        return itemApplyScope;
    }

    public void setItemApplyScope(String itemApplyScope) {
        this.itemApplyScope = itemApplyScope;
    }

    public String getInsureDrugGrade() {
        return insureDrugGrade;
    }

    public void setInsureDrugGrade(String insureDrugGrade) {
        this.insureDrugGrade = insureDrugGrade;
    }

    public String getDrugRemark() {
        return drugRemark;
    }

    public void setDrugRemark(String drugRemark) {
        this.drugRemark = drugRemark;
    }

    public String getPrescriptionUsageFlag() {
        return prescriptionUsageFlag;
    }

    public void setPrescriptionUsageFlag(String prescriptionUsageFlag) {
        this.prescriptionUsageFlag = prescriptionUsageFlag;
    }

    public String getStandardUsagePosts() {
        return standardUsagePosts;
    }

    public void setStandardUsagePosts(String standardUsagePosts) {
        this.standardUsagePosts = standardUsagePosts;
    }

    public String getDrugStandardPrice() {
        return drugStandardPrice;
    }

    public void setDrugStandardPrice(String drugStandardPrice) {
        this.drugStandardPrice = drugStandardPrice;
    }

    public String getOiFlag() {
        return oiFlag;
    }

    public void setOiFlag(String oiFlag) {
        this.oiFlag = oiFlag;
    }

    public String getOutpatientPriceQuota() {
        return outpatientPriceQuota;
    }

    public void setOutpatientPriceQuota(String outpatientPriceQuota) {
        this.outpatientPriceQuota = outpatientPriceQuota;
    }

    public String getInpatientPriceQuota() {
        return inpatientPriceQuota;
    }

    public void setInpatientPriceQuota(String inpatientPriceQuota) {
        this.inpatientPriceQuota = inpatientPriceQuota;
    }

    public String getOutpatientUsageQuota() {
        return outpatientUsageQuota;
    }

    public void setOutpatientUsageQuota(String outpatientUsageQuota) {
        this.outpatientUsageQuota = outpatientUsageQuota;
    }

    public String getInpatientUsageQuota() {
        return inpatientUsageQuota;
    }

    public void setInpatientUsageQuota(String inpatientUsageQuota) {
        this.inpatientUsageQuota = inpatientUsageQuota;
    }

    public String getDrugEachDose() {
        return drugEachDose;
    }

    public void setDrugEachDose(String drugEachDose) {
        this.drugEachDose = drugEachDose;
    }

    public String getItemLimitFlag() {
        return itemLimitFlag;
    }

    public void setItemLimitFlag(String itemLimitFlag) {
        this.itemLimitFlag = itemLimitFlag;
    }

    public String getItemApprovalStyle() {
        return itemApprovalStyle;
    }

    public void setItemApprovalStyle(String itemApprovalStyle) {
        this.itemApprovalStyle = itemApprovalStyle;
    }

    public String getDrugSwicthScale() {
        return drugSwicthScale;
    }

    public void setDrugSwicthScale(String drugSwicthScale) {
        this.drugSwicthScale = drugSwicthScale;
    }

    public String getDrugTexture() {
        return drugTexture;
    }

    public void setDrugTexture(String drugTexture) {
        this.drugTexture = drugTexture;
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

    public String getDrugApproveNum() {
        return drugApproveNum;
    }

    public void setDrugApproveNum(String drugApproveNum) {
        this.drugApproveNum = drugApproveNum;
    }
}