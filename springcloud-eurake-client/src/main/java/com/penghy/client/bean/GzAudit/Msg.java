package com.penghy.client.bean.GzAudit;

public class Msg {

    public static String msgInfo = "<?xml version='1.0' encoding='UTF-8'?>";

    private Head HEAD;

    private Body BODY;

    public Head getHEAD() {
        return HEAD;
    }

    public void setHEAD(Head HEAD) {
        this.HEAD = HEAD;
    }

    public Body getBODY() {
        return BODY;
    }

    public void setBODY(Body BODY) {
        this.BODY = BODY;
    }
}
