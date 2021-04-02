package com.penghy.client.bean.GzAudit;

/**
 * 处方主单信息
 *
 * @author HY-001
 * @Date 2020-12-11 11:22:20
 */

public class HospitalClaim {

    // 人员类别非空
    private String BENEFIT_GROUP_ID;

    // 参保类型非空
    private String BENEFIT_TYPE;

    //医保内金额非空
    private String BMI_CONVERED_AMOUNT;

    //登记时间非空
    private String CKC892;

    //入院诊断非空
    private String DIAGNOSIS_IN;

    //出院诊断非空
    private String DIAGNOSIS_OUT;

    //其他副诊断非空
    private String DIAGNOSIS_TOTHER;

    //性别非空
    private String GENDER;

    //定点机构ID非空
    private String HOSPITAL_ID;

    // 定点机构等级非空
    private String HOSPITAL_LEVEL;

    //病区
    private String HS_AREA_CODE;

    // 入院诊断中文名
    private String HS_DIAGNOSIS_IN_NAME;

    // 出院诊断中文名
    private String HS_DIAGNOSIS_OUT_NAME;

    // 病案号
    private String HS_IN_NUMBER;

    // 住院号\门诊号非空
    private String HS_NUMBER;

    // 参保人姓名非空
    private String HS_PATIENT_NAME;

    // 住院状态非空
    private String HS_STATUS;

    // 定点机构类型非空
    private String HospitalType;

    // 主单ID唯一编码.非空
    private String ID;

    // 入院日期yyyy-MM-dd，非空
    private String IN_DATE;

    // 是否哺乳期0否1是，默认0
    private String IsLactation;

    // 是否孕期0否1是，默认0
    private String IsPregnant;

    // 就医方式 非空
    private String MEDICAL_TYPE;

    // 出院日期yyyy-MM-dd，非空还未出院的传当天日期）
    private String OUT_DATE;

    // 出生日期yyyy-MM-dd，非空
    private String PATIENT_BIRTH;

    // 参保人特殊保险类型组编码 非空
    private String PatientBenefitGroupCode;

    // Patient_IDStr参保人唯一编码非空
    private String Patient_IDStr;

    ///门诊单据用实际结算日期；住院单据，如已经出院结算，则用结算日期，如尚未出院结算，用当天费用增量或医嘱增量日期
    private String SETTLE_DATE;

    // 总费用非空
    private String TOTAL_COST;

    // 是否异地就医0否1是, 默认0
    private String UNUSUAL_FLAG;

    // 医院类型是否公立医院1是0 否
    private String Z_AACT007;

    // 默认0，非空
    private String Z_AACT008;

    // 默认0，非空
    private String Z_BAC021;

    public String getBENEFIT_GROUP_ID() {
        return BENEFIT_GROUP_ID;
    }

    public void setBENEFIT_GROUP_ID(String BENEFIT_GROUP_ID) {
        this.BENEFIT_GROUP_ID = BENEFIT_GROUP_ID;
    }

    public String getBENEFIT_TYPE() {
        return BENEFIT_TYPE;
    }

    public void setBENEFIT_TYPE(String BENEFIT_TYPE) {
        this.BENEFIT_TYPE = BENEFIT_TYPE;
    }

    public String getBMI_CONVERED_AMOUNT() {
        return BMI_CONVERED_AMOUNT;
    }

    public void setBMI_CONVERED_AMOUNT(String BMI_CONVERED_AMOUNT) {
        this.BMI_CONVERED_AMOUNT = BMI_CONVERED_AMOUNT;
    }

    public String getCKC892() {
        return CKC892;
    }

    public void setCKC892(String CKC892) {
        this.CKC892 = CKC892;
    }

    public String getDIAGNOSIS_IN() {
        return DIAGNOSIS_IN;
    }

    public void setDIAGNOSIS_IN(String DIAGNOSIS_IN) {
        this.DIAGNOSIS_IN = DIAGNOSIS_IN;
    }

    public String getDIAGNOSIS_OUT() {
        return DIAGNOSIS_OUT;
    }

    public void setDIAGNOSIS_OUT(String DIAGNOSIS_OUT) {
        this.DIAGNOSIS_OUT = DIAGNOSIS_OUT;
    }

    public String getDIAGNOSIS_TOTHER() {
        return DIAGNOSIS_TOTHER;
    }

    public void setDIAGNOSIS_TOTHER(String DIAGNOSIS_TOTHER) {
        this.DIAGNOSIS_TOTHER = DIAGNOSIS_TOTHER;
    }

    public String getGENDER() {
        return GENDER;
    }

    public void setGENDER(String GENDER) {
        this.GENDER = GENDER;
    }

    public String getHOSPITAL_ID() {
        return HOSPITAL_ID;
    }

    public void setHOSPITAL_ID(String HOSPITAL_ID) {
        this.HOSPITAL_ID = HOSPITAL_ID;
    }

    public String getHOSPITAL_LEVEL() {
        return HOSPITAL_LEVEL;
    }

    public void setHOSPITAL_LEVEL(String HOSPITAL_LEVEL) {
        this.HOSPITAL_LEVEL = HOSPITAL_LEVEL;
    }

    public String getHS_AREA_CODE() {
        return HS_AREA_CODE;
    }

    public void setHS_AREA_CODE(String HS_AREA_CODE) {
        this.HS_AREA_CODE = HS_AREA_CODE;
    }

    public String getHS_DIAGNOSIS_IN_NAME() {
        return HS_DIAGNOSIS_IN_NAME;
    }

    public void setHS_DIAGNOSIS_IN_NAME(String HS_DIAGNOSIS_IN_NAME) {
        this.HS_DIAGNOSIS_IN_NAME = HS_DIAGNOSIS_IN_NAME;
    }

    public String getHS_DIAGNOSIS_OUT_NAME() {
        return HS_DIAGNOSIS_OUT_NAME;
    }

    public void setHS_DIAGNOSIS_OUT_NAME(String HS_DIAGNOSIS_OUT_NAME) {
        this.HS_DIAGNOSIS_OUT_NAME = HS_DIAGNOSIS_OUT_NAME;
    }

    public String getHS_IN_NUMBER() {
        return HS_IN_NUMBER;
    }

    public void setHS_IN_NUMBER(String HS_IN_NUMBER) {
        this.HS_IN_NUMBER = HS_IN_NUMBER;
    }

    public String getHS_NUMBER() {
        return HS_NUMBER;
    }

    public void setHS_NUMBER(String HS_NUMBER) {
        this.HS_NUMBER = HS_NUMBER;
    }

    public String getHS_PATIENT_NAME() {
        return HS_PATIENT_NAME;
    }

    public void setHS_PATIENT_NAME(String HS_PATIENT_NAME) {
        this.HS_PATIENT_NAME = HS_PATIENT_NAME;
    }

    public String getHS_STATUS() {
        return HS_STATUS;
    }

    public void setHS_STATUS(String HS_STATUS) {
        this.HS_STATUS = HS_STATUS;
    }

    public String getHospitalType() {
        return HospitalType;
    }

    public void setHospitalType(String hospitalType) {
        HospitalType = hospitalType;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getIN_DATE() {
        return IN_DATE;
    }

    public void setIN_DATE(String IN_DATE) {
        this.IN_DATE = IN_DATE;
    }

    public String getIsLactation() {
        return IsLactation;
    }

    public void setIsLactation(String isLactation) {
        IsLactation = isLactation;
    }

    public String getIsPregnant() {
        return IsPregnant;
    }

    public void setIsPregnant(String isPregnant) {
        IsPregnant = isPregnant;
    }

    public String getMEDICAL_TYPE() {
        return MEDICAL_TYPE;
    }

    public void setMEDICAL_TYPE(String MEDICAL_TYPE) {
        this.MEDICAL_TYPE = MEDICAL_TYPE;
    }

    public String getOUT_DATE() {
        return OUT_DATE;
    }

    public void setOUT_DATE(String OUT_DATE) {
        this.OUT_DATE = OUT_DATE;
    }

    public String getPATIENT_BIRTH() {
        return PATIENT_BIRTH;
    }

    public void setPATIENT_BIRTH(String PATIENT_BIRTH) {
        this.PATIENT_BIRTH = PATIENT_BIRTH;
    }

    public String getPatientBenefitGroupCode() {
        return PatientBenefitGroupCode;
    }

    public void setPatientBenefitGroupCode(String patientBenefitGroupCode) {
        PatientBenefitGroupCode = patientBenefitGroupCode;
    }

    public String getPatient_IDStr() {
        return Patient_IDStr;
    }

    public void setPatient_IDStr(String patient_IDStr) {
        Patient_IDStr = patient_IDStr;
    }

    public String getSETTLE_DATE() {
        return SETTLE_DATE;
    }

    public void setSETTLE_DATE(String SETTLE_DATE) {
        this.SETTLE_DATE = SETTLE_DATE;
    }

    public String getTOTAL_COST() {
        return TOTAL_COST;
    }

    public void setTOTAL_COST(String TOTAL_COST) {
        this.TOTAL_COST = TOTAL_COST;
    }

    public String getUNUSUAL_FLAG() {
        return UNUSUAL_FLAG;
    }

    public void setUNUSUAL_FLAG(String UNUSUAL_FLAG) {
        this.UNUSUAL_FLAG = UNUSUAL_FLAG;
    }

    public String getZ_AACT007() {
        return Z_AACT007;
    }

    public void setZ_AACT007(String z_AACT007) {
        Z_AACT007 = z_AACT007;
    }

    public String getZ_AACT008() {
        return Z_AACT008;
    }

    public void setZ_AACT008(String z_AACT008) {
        Z_AACT008 = z_AACT008;
    }

    public String getZ_BAC021() {
        return Z_BAC021;
    }

    public void setZ_BAC021(String z_BAC021) {
        Z_BAC021 = z_BAC021;
    }
}
