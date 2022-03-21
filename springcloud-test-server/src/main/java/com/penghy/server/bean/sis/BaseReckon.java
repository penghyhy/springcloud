package com.penghy.server.bean.sis;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;


/**

 */
public class BaseReckon {
    private static final long serialVersionUID = 1L;

    /**
     * 保险疾病目录内码id
     */
    private String mediInsureId;
    /**
     * 目录类别序号
     */
    private String reckonId;
    /**
     * His疾病代码
     */
    private Integer reckonType;
    /**
     * 保险疾病代码
     */
    private String reckonEn;
    /**
     * 疾病标准编码
     */
    private String reckonCn;
    /**
     * 疾病中文名称
     */
    private Integer patientType;
    /**
     * 疾病英文名称
     */
    private Integer deleteFlag;
    /**
     * 保险疾病类型
     */
    private Integer settleType;
    /**
     * 特殊病种编码
     */
    private String recInsFlag;
    /**
     * 疾病ICD10码
     */
    private String showFrontFlag;
    /**
     * 疾病ICD09码
     */
    private String showFrontEn;
    /**
     * 疾病备注说明
     */
    private String showFrontCn;

    public String getMediInsureId() {
        return mediInsureId;
    }

    public void setMediInsureId(String mediInsureId) {
        this.mediInsureId = mediInsureId;
    }

    public String getReckonId() {
        return reckonId;
    }

    public void setReckonId(String reckonId) {
        this.reckonId = reckonId;
    }

    public Integer getReckonType() {
        return reckonType;
    }

    public void setReckonType(Integer reckonType) {
        this.reckonType = reckonType;
    }

    public String getReckonEn() {
        return reckonEn;
    }

    public void setReckonEn(String reckonEn) {
        this.reckonEn = reckonEn;
    }

    public String getReckonCn() {
        return reckonCn;
    }

    public void setReckonCn(String reckonCn) {
        this.reckonCn = reckonCn;
    }

    public Integer getPatientType() {
        return patientType;
    }

    public void setPatientType(Integer patientType) {
        this.patientType = patientType;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getSettleType() {
        return settleType;
    }

    public void setSettleType(Integer settleType) {
        this.settleType = settleType;
    }

    public String getRecInsFlag() {
        return recInsFlag;
    }

    public void setRecInsFlag(String recInsFlag) {
        this.recInsFlag = recInsFlag;
    }

    public String getShowFrontFlag() {
        return showFrontFlag;
    }

    public void setShowFrontFlag(String showFrontFlag) {
        this.showFrontFlag = showFrontFlag;
    }

    public String getShowFrontEn() {
        return showFrontEn;
    }

    public void setShowFrontEn(String showFrontEn) {
        this.showFrontEn = showFrontEn;
    }

    public String getShowFrontCn() {
        return showFrontCn;
    }

    public void setShowFrontCn(String showFrontCn) {
        this.showFrontCn = showFrontCn;
    }
}