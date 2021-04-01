package com.penghy.mytest.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement( name = "msg_bean" )
public class MsgRegBean {
    private DataBean dataBean;

    private List<RegBean> regBeans;


    public DataBean getDataBean()
    {
        return dataBean;
    }

    @XmlElement(name = "data_bean")
    public void setDataBean(DataBean dataBean)
    {
        this.dataBean = dataBean;
    }

    @XmlElementWrapper(name = "reg_beans")
    @XmlElement(name = "reg_bean")
    public List<RegBean> getRegBeans()
    {
        return regBeans;
    }

    public void setRegBeans(List<RegBean> regBeans)
    {
        this.regBeans = regBeans;
    }
}
