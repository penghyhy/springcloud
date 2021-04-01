package com.penghy.mytest.util;

import com.penghy.mytest.model.DataBean;
import com.penghy.mytest.model.MapBean;
import com.penghy.mytest.model.MsgRegBean;
import com.penghy.mytest.model.RegBean;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.*;

public class JaxbObjectAndXmlUtil {

    /**
     * @param xmlStr 字符串
     * @param c      对象Class类型
     * @return 对象实例
     */
    @SuppressWarnings("unchecked")
    public static <T> T xml2Object(String xmlStr, Class<T> c) {
        try {
            JAXBContext context = JAXBContext.newInstance(c);
            Unmarshaller unmarshaller = context.createUnmarshaller();

            T t = (T) unmarshaller.unmarshal(new StringReader(xmlStr));

            return t;

        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }

    }

    /**
     * @param object 对象
     * @return 返回xmlStr
     */
    public static String object2Xml(Object object) {
        try {
            StringWriter writer = new StringWriter();
            JAXBContext context = JAXBContext.newInstance(object.getClass());
            Marshaller marshal = context.createMarshaller();

            marshal.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); // 格式化输出
            marshal.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");// 编码格式,默认为utf-8
            marshal.setProperty(Marshaller.JAXB_FRAGMENT, false);// 是否省略xml头信息
            marshal.setProperty("jaxb.encoding", "GBK");
            marshal.marshal(object, writer);

            return new String(writer.getBuffer());

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * (多层)map转换为xml格式字符串
     *
     * @param map     需要转换为xml的map
     * @param isCDATA 是否加入CDATA标识符 true:加入 false:不加入
     * @return xml字符串
     */
    public static String multilayerMapToXml(Map<String, Object> map, boolean isCDATA) {
        String parentName = "xml";
        Document doc = DocumentHelper.createDocument();
        doc.addElement(parentName);
        String xml = recursionMapToXml(doc.getRootElement(), parentName, map, isCDATA);
        return formatXML(xml);
    }

    /**
     * multilayerMapToXml核心方法，递归调用
     *
     * @param element    节点元素
     * @param parentName 根元素属性名
     * @param map        需要转换为xml的map
     * @param isCDATA    是否加入CDATA标识符 true:加入 false:不加入
     * @return xml字符串
     */
    @SuppressWarnings("unchecked")
    private static String recursionMapToXml(Element element, String parentName, Map<String, Object> map, boolean isCDATA) {
        Element xmlElement = element.addElement(parentName);
        map.keySet().forEach(key -> {
            Object obj = map.get(key);
            if (obj instanceof Map) {
                recursionMapToXml(xmlElement, key, (Map<String, Object>) obj, isCDATA);
            } else {
                String value = obj == null ? "" : obj.toString();
                if (isCDATA) {
                    xmlElement.addElement(key).addCDATA(value);
                } else {
                    xmlElement.addElement(key).addText(value);
                }
            }
        });
        return xmlElement.asXML();
    }

    /**
     * 格式化xml,显示为容易看的XML格式
     *
     * @param xml 需要格式化的xml字符串
     * @return
     */
    public static String formatXML(String xml) {
        String requestXML = null;
        try {
            // 拿取解析器
            SAXReader reader = new SAXReader();
            Document document = reader.read(new StringReader(xml));
            if (null != document) {
                StringWriter stringWriter = new StringWriter();
                // 格式化,每一级前的空格
                OutputFormat format = new OutputFormat("    ", true);
                // xml声明与内容是否添加空行
                format.setNewLineAfterDeclaration(true);
                // 是否设置xml声明头部
                format.setSuppressDeclaration(true);
                // 是否分行
                format.setNewlines(true);
                XMLWriter writer = new XMLWriter(stringWriter, format);
                writer.write(document);
                writer.flush();
                writer.close();
                requestXML = stringWriter.getBuffer().toString();
            }
            return requestXML;
        } catch (Exception e) {
            return null;
        }
    }


    public static String callMapToXML(Map map) {
//        logger.info("将Map转成Xml, Map：" + map.toString());
        StringBuffer sb = new StringBuffer();
        sb.append("<?xml version=\"1.0\" encoding=\"GBK\" standalone=\"yes\"?><input>");
        mapToXMLTest2(map, sb);
        sb.append("</input>");
//        logger.info("将Map转成Xml, Xml：" + sb.toString());
        System.out.print("将Map转成Xml, Xml：" + sb.toString());
        System.out.print("将Map转成Xml, Xml：" + formatXML(sb.toString()));
        try {
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    private static void mapToXMLTest2(Map map, StringBuffer sb) {
        Set set = map.keySet();
        for (Iterator it = set.iterator(); it.hasNext(); ) {
            String key = (String) it.next();
            Object value = map.get(key);
            if (null == value)
                value = "";
            if (value.getClass().getName().equals("java.util.ArrayList")) {
                ArrayList list = (ArrayList) map.get(key);
                sb.append("<" + key + ">");
                for (int i = 0; i < list.size(); i++) {
                    HashMap hm = (HashMap) list.get(i);
                    mapToXMLTest2(hm, sb);
                }
                sb.append("</" + key + ">");

            } else {
                if (value instanceof HashMap) {
                    sb.append("<" + key + ">");
                    mapToXMLTest2((HashMap) value, sb);
                    sb.append("</" + key + ">");
                } else {
                    sb.append("<" + key + ">" + value + "</" + key + ">");
                }

            }

        }
    }


    public static void main(String[] args) {
        /** 构造测试报文头对象 */
        DataBean dataBean = new DataBean();
        dataBean.setBatch_no("N20150204");
        dataBean.setData_type("000001");
        dataBean.setVersion("v1.0");
        dataBean.setUser_name("xx");
        dataBean.setMsg_sign("未知");
        dataBean.setRd_num("6631383");
        dataBean.setRd_time("20150204");
        dataBean.setK_sign("75CC479AAC09F00BA28F0E968B1BC9D1B90ADCC2");

        /** 构造测试报文体对象 */
        RegBean regBean = new RegBean();
        regBean.setReg_sn("REG20150204");
        regBean.setUser_id(12);
        regBean.setReg_no("33");
        regBean.setReg_way("pc");
        regBean.setSet_time("20150204 16:18");
        regBean.setRet_url("未知");
        regBean.setRemarks("无备注");

        MsgRegBean msgBean = new MsgRegBean();
        List<RegBean> regBeans = new ArrayList<RegBean>();
        regBeans.add(regBean);
        regBeans.add(regBean);

        msgBean.setRegBeans(regBeans);
        msgBean.setDataBean(dataBean);

        MapBean mapBean = new MapBean();
        Map<String, Object> maps = new HashMap<>();
        maps.put("1111", "1112312");
        mapBean.setMaps(maps);

        String xmlStr = JaxbObjectAndXmlUtil.object2Xml(msgBean);//构造报文 XML 格式的字符串
        System.out.println("对象转xml报文： \n" + xmlStr);

        String xmlStr2 = JaxbObjectAndXmlUtil.multilayerMapToXml(maps, false);//构造报文 XML 格式的字符串
        System.out.println("对象转xml报文2： \n" + xmlStr2);


        Map<String, Object> data = new HashMap<>();
        data.put("akc190", "1");
        data.put("aka130", "口腔溃疡");
        data.put("yab003", "河南");

        List<Map<String, Object>> chargeList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Map<String, Object> detail = new HashMap<>();
            detail.put("chargeId" + i, i);
            detail.put("chargename" + i, "药品" + i);
            detail.put("chargeprice" + i, "价格" + i);

            Map<String, Object> charge = new HashMap<>();
            charge.put("row", detail);
            chargeList.add(charge);
        }
        data.put("dataset", chargeList);

        System.out.println("报文转xml转： \n" + JaxbObjectAndXmlUtil.callMapToXML(data));
        try {
//            xml2map(JaxbObjectAndXmlUtil.callMapToXML(data));
//            System.out.println(xml2map(JaxbObjectAndXmlUtil.callMapToXML(data)));
//            System.out.println(xmlToJson(JaxbObjectAndXmlUtil.callMapToXML(data)));



//            System.out.println(xml2JSON(JaxbObjectAndXmlUtil.callMapToXML(data)));
            System.out.println("aaaaaaaaaaaaaaaaaaa:"+ xmlToMap(JaxbObjectAndXmlUtil.callMapToXML(data)));
        } catch (Exception e) {
            e.printStackTrace();
        }


//        MsgRegBean msgBean2 = JaxbObjectAndXmlUtil.xml2Object(xmlStr, MsgRegBean.class);
//        System.out.println("报文转xml转： \n"+JSON.toJSONString(msgBean2));
    }








//------------------------------------------------------------------------------------------------------------
    /**
     * 将xml转换成Map
     * @param xml
     * @return
     */
    public static Map<String, Object> xmlToMap(String xml) {
        Document doc = null;
        try {
            doc = DocumentHelper.parseText(xml);
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        Map<String, Object> map = new HashMap<String, Object>();
        if (doc == null)
            return map;
        Element rootElement = doc.getRootElement();
        element2map(rootElement, map);
        return map;
    }

    private static void element2map(Element elmt, Map<String, Object> map) {
        if (null == elmt) {
            return;
        }
        String name = elmt.getName();
        if (elmt.isTextOnly()) {
            map.put(name, elmt.getText());
        } else {
            Map<String, Object> mapSub = new HashMap<String, Object>();
            List<Element> elements = (List<Element>) elmt.elements();
            for (Element elmtSub : elements) {
                element2map(elmtSub, mapSub);
            }
            Object first = map.get(name);
            if (null == first) {
                map.put(name, mapSub);
            } else {
                if (first instanceof List<?>) {
                    ((List) first).add(mapSub);
                } else {
                    List<Object> listSub = new ArrayList<Object>();
                    listSub.add(first);
                    listSub.add(mapSub);
                    map.put(name, listSub);
                }
            }
        }
    }

}
