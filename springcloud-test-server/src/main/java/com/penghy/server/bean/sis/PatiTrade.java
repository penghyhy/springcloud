package com.penghy.server.bean.sis;


/**

 */
public class PatiTrade {
    private static final long serialVersionUID = 1L;

    /**
     * 保险疾病目录内码id
     */
    private String settleRecordId;
    /**
     * 目录类别序号
     */
    private String insureSettleInfo;

    public String getSettleRecordId() {
        return settleRecordId;
    }

    public void setSettleRecordId(String settleRecordId) {
        this.settleRecordId = settleRecordId;
    }

    public String getInsureSettleInfo() {
        return insureSettleInfo;
    }

    public void setInsureSettleInfo(String insureSettleInfo) {
        this.insureSettleInfo = insureSettleInfo;
    }
}