package com.penghy.server.bean;

import java.util.List;

public class TaskDataBean<T> {

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

    private List<TaskDataBean> taskDataBeanList;

    // 返回数据
    private T data;

    public TaskDataBean() {
        super();
    }

    public TaskDataBean(T data) {
        super();
        this.data = data;
    }

    /**
     *
     * @return
     */
    private Integer value;








    public TaskDataBean<T> setData(T data) {
        this.data = data;
        return this;
    }

    public T getData() {
        return data;
    }

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

    public List<TaskDataBean> getTaskDataBeanList() {
        return taskDataBeanList;
    }

    public void setTaskDataBeanList(List<TaskDataBean> taskDataBeanList) {
        this.taskDataBeanList = taskDataBeanList;
    }
}
