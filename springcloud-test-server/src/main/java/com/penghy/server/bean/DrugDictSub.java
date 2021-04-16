package com.penghy.server.bean;

public class DrugDictSub {

    private static final long serialVersionUID = 1L;

    private String dictBookId;

    private String insureDrugCode;

    private String subFieldName;

    private String subFieldContent;


    public String getDictBookId() {
        return dictBookId;
    }

    public void setDictBookId(String dictBookId) {
        this.dictBookId = dictBookId;
    }

    public String getInsureDrugCode() {
        return insureDrugCode;
    }

    public void setInsureDrugCode(String insureDrugCode) {
        this.insureDrugCode = insureDrugCode;
    }

    public String getSubFieldName() {
        return subFieldName;
    }

    public void setSubFieldName(String subFieldName) {
        this.subFieldName = subFieldName;
    }

    public String getSubFieldContent() {
        return subFieldContent;
    }

    public void setSubFieldContent(String subFieldContent) {
        this.subFieldContent = subFieldContent;
    }
}
