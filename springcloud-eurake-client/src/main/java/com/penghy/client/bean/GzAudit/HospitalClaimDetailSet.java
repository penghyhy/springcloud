package com.penghy.client.bean.GzAudit;

import java.util.List;

/**
 * 处方明细循环体
 *
 * @author HY-001
 * @date 2020-12-11 14:57:00
 */
public class HospitalClaimDetailSet {
    private List<ClaimDetailHospital> ClaimDetailHospitalList;

    public List<ClaimDetailHospital> getClaimDetailHospitalList() {
        return ClaimDetailHospitalList;
    }

    public void setClaimDetailHospitalList(List<ClaimDetailHospital> claimDetailHospitalList) {
        ClaimDetailHospitalList = claimDetailHospitalList;
    }
}
