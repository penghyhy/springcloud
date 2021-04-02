package com.penghy.client.bean.GzAudit;


/**
 * 主结构体
 *
 * @author HY-001
 * @Date 2020-12-11 11:20:18
 */

public class Body {

    /**
     * 医师编码
     * 当前提交审核请求的医师
     */
    private String YSBM;

    /**
     * 身份证号
     */
    private String SFZH;

    /**
     * 总条数
     * 当前待结算费用明细总条数 （住院审核时必传，门诊不用传）
     */
    private String TOTALNUM;

    /**
     * 总金额
     * 当前待结算费用明细总金额（住院审核时必传，门诊不用传）
     */
    private String TOTALAMOUNT;

    /**
     * 单据数据包
     */
    private PackHospital PackHospital;


    public String getYSBM() {
        return YSBM;
    }

    public void setYSBM(String YSBM) {
        this.YSBM = YSBM;
    }

    public String getSFZH() {
        return SFZH;
    }

    public void setSFZH(String SFZH) {
        this.SFZH = SFZH;
    }

    public String getTOTALNUM() {
        return TOTALNUM;
    }

    public void setTOTALNUM(String TOTALNUM) {
        this.TOTALNUM = TOTALNUM;
    }

    public String getTOTALAMOUNT() {
        return TOTALAMOUNT;
    }

    public void setTOTALAMOUNT(String TOTALAMOUNT) {
        this.TOTALAMOUNT = TOTALAMOUNT;
    }

    public com.penghy.client.bean.GzAudit.PackHospital getPackHospital() {
        return PackHospital;
    }

    public void setPackHospital(com.penghy.client.bean.GzAudit.PackHospital packHospital) {
        PackHospital = packHospital;
    }
}
