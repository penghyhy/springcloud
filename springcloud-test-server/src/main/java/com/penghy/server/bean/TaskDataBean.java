package com.penghy.server.bean;

public class TaskDataBean {

    /**
     * 保险疾病目录内码id
     */
    private Integer id;
    /**
     * 目录类别序号
     */
    private String dictBookId;
    /**
     * His疾病代码
     */
    private String diseaseId;

    /**
     *
     * @return
     */
    private Integer value;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
