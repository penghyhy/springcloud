package com.penghy.client.bean.GzAudit;


/**
 * 处方明细信息
 *
 * @author HY-001
 * @date 2020-12-11 14:57:00
 */
public class ClaimDetailHospital {

    // 帖数默认0
    private String AKF003;

    // 医师编码非空
    private String AKF005;

    // 预留三默认0, 非空
    private String ApprovalNumber;

    // 预留一默认1, 非空
    private String BKA609;

    // 预留二 默认0，非空
    private String BKC227;

    // 总费用非空
    private String COSTS;

    // 科 室 名 称 | 医 生姓名；非空
    private String DEPTNAME;

    // 医保内金额非空。全自费的为0，默认等于总金额
    private String ELIGIBLE_AMOUNT;

    // 用药频次，非空
    private String FREQUENCY_INTERVAL;

    // 明细ID唯一编码。非 空
    private String ID;

    //服务日期yyyy-MM-dd，非空
    private String ITEM_DATE;

    // 项目编码 非空
    private String ITEM_ID;

    //项目名称非空
    private String ITEM_NAME;

    // 项目类型非空
    private String ITEM_TYPE;

    // 数量非空
    private String NUMBERS;

    // 单价
    private String PRICE;

    // 医师级别
    private String PhysicianLevel;

    // 规格非空
    private String Specification;

    // 每次用量非空
    private String USAGE;

    // 用药天数默认0
    private String USAGE_DAYS;

    // 包装单位非空
    private String USAGE_UNIT;

    //计费标记默认0
    private String ZZZ_Flag;

    // 医师行政职务
    private String Z_PhysicianAP;


    public String getAKF003() {
        return AKF003;
    }

    public void setAKF003(String AKF003) {
        this.AKF003 = AKF003;
    }

    public String getAKF005() {
        return AKF005;
    }

    public void setAKF005(String AKF005) {
        this.AKF005 = AKF005;
    }

    public String getApprovalNumber() {
        return ApprovalNumber;
    }

    public void setApprovalNumber(String approvalNumber) {
        ApprovalNumber = approvalNumber;
    }

    public String getBKA609() {
        return BKA609;
    }

    public void setBKA609(String BKA609) {
        this.BKA609 = BKA609;
    }

    public String getBKC227() {
        return BKC227;
    }

    public void setBKC227(String BKC227) {
        this.BKC227 = BKC227;
    }

    public String getCOSTS() {
        return COSTS;
    }

    public void setCOSTS(String COSTS) {
        this.COSTS = COSTS;
    }

    public String getDEPTNAME() {
        return DEPTNAME;
    }

    public void setDEPTNAME(String DEPTNAME) {
        this.DEPTNAME = DEPTNAME;
    }

    public String getELIGIBLE_AMOUNT() {
        return ELIGIBLE_AMOUNT;
    }

    public void setELIGIBLE_AMOUNT(String ELIGIBLE_AMOUNT) {
        this.ELIGIBLE_AMOUNT = ELIGIBLE_AMOUNT;
    }

    public String getFREQUENCY_INTERVAL() {
        return FREQUENCY_INTERVAL;
    }

    public void setFREQUENCY_INTERVAL(String FREQUENCY_INTERVAL) {
        this.FREQUENCY_INTERVAL = FREQUENCY_INTERVAL;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getITEM_DATE() {
        return ITEM_DATE;
    }

    public void setITEM_DATE(String ITEM_DATE) {
        this.ITEM_DATE = ITEM_DATE;
    }

    public String getITEM_ID() {
        return ITEM_ID;
    }

    public void setITEM_ID(String ITEM_ID) {
        this.ITEM_ID = ITEM_ID;
    }

    public String getITEM_NAME() {
        return ITEM_NAME;
    }

    public void setITEM_NAME(String ITEM_NAME) {
        this.ITEM_NAME = ITEM_NAME;
    }

    public String getITEM_TYPE() {
        return ITEM_TYPE;
    }

    public void setITEM_TYPE(String ITEM_TYPE) {
        this.ITEM_TYPE = ITEM_TYPE;
    }

    public String getNUMBERS() {
        return NUMBERS;
    }

    public void setNUMBERS(String NUMBERS) {
        this.NUMBERS = NUMBERS;
    }

    public String getPRICE() {
        return PRICE;
    }

    public void setPRICE(String PRICE) {
        this.PRICE = PRICE;
    }

    public String getPhysicianLevel() {
        return PhysicianLevel;
    }

    public void setPhysicianLevel(String physicianLevel) {
        PhysicianLevel = physicianLevel;
    }

    public String getSpecification() {
        return Specification;
    }

    public void setSpecification(String specification) {
        Specification = specification;
    }

    public String getUSAGE() {
        return USAGE;
    }

    public void setUSAGE(String USAGE) {
        this.USAGE = USAGE;
    }

    public String getUSAGE_DAYS() {
        return USAGE_DAYS;
    }

    public void setUSAGE_DAYS(String USAGE_DAYS) {
        this.USAGE_DAYS = USAGE_DAYS;
    }

    public String getUSAGE_UNIT() {
        return USAGE_UNIT;
    }

    public void setUSAGE_UNIT(String USAGE_UNIT) {
        this.USAGE_UNIT = USAGE_UNIT;
    }

    public String getZZZ_Flag() {
        return ZZZ_Flag;
    }

    public void setZZZ_Flag(String ZZZ_Flag) {
        this.ZZZ_Flag = ZZZ_Flag;
    }

    public String getZ_PhysicianAP() {
        return Z_PhysicianAP;
    }

    public void setZ_PhysicianAP(String z_PhysicianAP) {
        Z_PhysicianAP = z_PhysicianAP;
    }
}
