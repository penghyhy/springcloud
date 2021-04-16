package com.penghy.server.bean;

public class OrderDictSub {

    private static final long serialVersionUID = 1L;

    private String dictBookId;

    private String insureOrderOcde;

    private String subFieldName;

    private String subFieldContent;


    public String getDictBookId() {
        return dictBookId;
    }

    public void setDictBookId(String dictBookId) {
        this.dictBookId = dictBookId;
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

    public String getInsureOrderOcde() {
        return insureOrderOcde;
    }

    public void setInsureOrderOcde(String insureOrderOcde) {
        this.insureOrderOcde = insureOrderOcde;
    }
}
