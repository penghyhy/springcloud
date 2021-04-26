package com.penghy.server.bean;


/**
 * Disease 保险疾病目录实体
 *
 * @author tianshuai
 * @date 2019-03-26
 */
public class PubDict {
    private static final long serialVersionUID = 1L;

    /**
     * 保险疾病目录内码id
     */
    private String id;

    private Integer incrementId;

    public Integer getIncrementId() {
        return incrementId;
    }

    public void setIncrementId(Integer incrementId) {
        this.incrementId = incrementId;
    }

    /**
     * 目录类别序号
     */
    private String dictBookId;
    /**
     * 保险疾病代码
     */
    private String insureDictCode;
    /**
     *
     */
    private String insureDictName;

    /**
     *
     */
    private String orgCode;

    /**
     *
     */
    private String insureItemRemark;

    /**
     *
     */
    private String deleteFlag;

    /**
     *
     */
    private String orderby;

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

    public String getInsureDictCode() {
        return insureDictCode;
    }

    public void setInsureDictCode(String insureDictCode) {
        this.insureDictCode = insureDictCode;
    }

    public String getInsureDictName() {
        return insureDictName;
    }

    public void setInsureDictName(String insureDictName) {
        this.insureDictName = insureDictName;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getInsureItemRemark() {
        return insureItemRemark;
    }

    public void setInsureItemRemark(String insureItemRemark) {
        this.insureItemRemark = insureItemRemark;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getOrderby() {
        return orderby;
    }

    public void setOrderby(String orderby) {
        this.orderby = orderby;
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