package com.penghy.server.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;


/**
 * Disease 保险疾病目录实体
 *
 * @author tianshuai
 * @date 2019-03-26
 */
public class Disease {
    private static final long serialVersionUID = 1L;

    /**
     * 保险疾病目录内码id
     */
    private String id;
    /**
     * 目录类别序号
     */
    private String dictBookId;
    /**
     * His疾病代码
     */
    private String diseaseId;
    /**
     * 保险疾病代码
     */
    private String insureDiseaseCode;
    /**
     * 疾病标准编码
     */
    private String diseaseStandardCode;
    /**
     * 疾病中文名称
     */
    private String diseaseChineseName;
    /**
     * 疾病英文名称
     */
    private String diseaseEnglishName;
    /**
     * 保险疾病类型
     */
    private BigDecimal insureDiseaseStyle;
    /**
     * 特殊病种编码
     */
    private String specialDiseaseCode;
    /**
     * 疾病ICD10码
     */
    private String diseaseIcd10;
    /**
     * 疾病ICD09码
     */
    private String diseaseIcd9;
    /**
     * 疾病备注说明
     */
    private String diseaseRemark;
    /**
     * 使用开始日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date useStartTime;
    /**
     * 使用结束日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date useEndTime;
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

    public String getDiseaseId() {
        return diseaseId;
    }

    public void setDiseaseId(String diseaseId) {
        this.diseaseId = diseaseId;
    }

    public String getInsureDiseaseCode() {
        return insureDiseaseCode;
    }

    public void setInsureDiseaseCode(String insureDiseaseCode) {
        this.insureDiseaseCode = insureDiseaseCode;
    }

    public String getDiseaseStandardCode() {
        return diseaseStandardCode;
    }

    public void setDiseaseStandardCode(String diseaseStandardCode) {
        this.diseaseStandardCode = diseaseStandardCode;
    }

    public String getDiseaseChineseName() {
        return diseaseChineseName;
    }

    public void setDiseaseChineseName(String diseaseChineseName) {
        this.diseaseChineseName = diseaseChineseName;
    }

    public String getDiseaseEnglishName() {
        return diseaseEnglishName;
    }

    public void setDiseaseEnglishName(String diseaseEnglishName) {
        this.diseaseEnglishName = diseaseEnglishName;
    }

    public BigDecimal getInsureDiseaseStyle() {
        return insureDiseaseStyle;
    }

    public void setInsureDiseaseStyle(BigDecimal insureDiseaseStyle) {
        this.insureDiseaseStyle = insureDiseaseStyle;
    }

    public String getSpecialDiseaseCode() {
        return specialDiseaseCode;
    }

    public void setSpecialDiseaseCode(String specialDiseaseCode) {
        this.specialDiseaseCode = specialDiseaseCode;
    }

    public String getDiseaseIcd10() {
        return diseaseIcd10;
    }

    public void setDiseaseIcd10(String diseaseIcd10) {
        this.diseaseIcd10 = diseaseIcd10;
    }

    public String getDiseaseIcd9() {
        return diseaseIcd9;
    }

    public void setDiseaseIcd9(String diseaseIcd9) {
        this.diseaseIcd9 = diseaseIcd9;
    }

    public String getDiseaseRemark() {
        return diseaseRemark;
    }

    public void setDiseaseRemark(String diseaseRemark) {
        this.diseaseRemark = diseaseRemark;
    }

    public Date getUseStartTime() {
        return useStartTime;
    }

    public void setUseStartTime(Date useStartTime) {
        this.useStartTime = useStartTime;
    }

    public Date getUseEndTime() {
        return useEndTime;
    }

    public void setUseEndTime(Date useEndTime) {
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
}