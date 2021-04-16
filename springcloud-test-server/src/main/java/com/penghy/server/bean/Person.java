package com.penghy.server.bean;

public class Person {

    private int id;

    private String name;

    private String settle_record_id;

    private String insure_settle_info;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getSettle_record_id() {
        return settle_record_id;
    }

    public void setSettle_record_id(String settle_record_id) {
        this.settle_record_id = settle_record_id;
    }

    public String getInsure_settle_info() {
        return insure_settle_info;
    }

    public void setInsure_settle_info(String insure_settle_info) {
        this.insure_settle_info = insure_settle_info;
    }
}
