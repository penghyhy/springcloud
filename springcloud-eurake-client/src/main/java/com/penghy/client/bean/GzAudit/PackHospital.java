package com.penghy.client.bean.GzAudit;

import java.util.List;

/**
 * 单据数据包
 *
 * @author HY-001
 * @Date 2020-12-11 11:20:20
 */

public class PackHospital {

    String head1 = "http://schemas.datacontract.org/2004/07/BMI.Engine.Common.Hospital";
    String head2 = "http://www.w3.org/2001/XMLSchema-instance";

    /**
     * 处方主单信息
     */
    private HospitalClaim HospitalClaim;

    /**
     * 处方明细循环体
     */
    private List<ClaimDetailHospital> HospitalClaimDetailSet;

    public com.penghy.client.bean.GzAudit.HospitalClaim getHospitalClaim() {
        return HospitalClaim;
    }

    public void setHospitalClaim(com.penghy.client.bean.GzAudit.HospitalClaim hospitalClaim) {
        HospitalClaim = hospitalClaim;
    }

    public List<ClaimDetailHospital> getHospitalClaimDetailSet() {
        return HospitalClaimDetailSet;
    }

    public void setHospitalClaimDetailSet(List<ClaimDetailHospital> hospitalClaimDetailSet) {
        HospitalClaimDetailSet = hospitalClaimDetailSet;
    }
}
