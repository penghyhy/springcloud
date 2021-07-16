package com.penghy.server.cotroller;


import com.alibaba.fastjson.JSONArray;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayInputStream;
import java.util.*;

@RestController
@RequestMapping("/httpService1")
public class MaptoXmlController {

    public static byte[] callMapToXML(Map map) {
        StringBuffer sb = new StringBuffer();
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?><bizdata>");
        mapToXMLTest2(map, sb);
        sb.append("</bizdata>");
        try {
            return sb.toString().getBytes("UTF-8");
        } catch (Exception e) {
        }
        return null;
    }

    public static Map<String, Object> parseXml(String xml) throws DocumentException {
        Map map = new HashMap();
        try {
            SAXReader saxReader = new SAXReader();
            Document document = saxReader.read(new ByteArrayInputStream(xml.getBytes("GBK")));//xml串第一行不能有空格，否则报错
            Element root = document.getRootElement();//得到xml文档根节点元素，即最上层的"<xml>"
            elementTomap(root, map);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }
    public static Map<String, Object> elementTomap(Element outele, Map<String, Object> outmap) {
        List<Element> list = outele.elements();
        int size = list.size();
        if (size == 0) {
            outmap.put(outele.getName(), outele.getTextTrim());
        } else {
            Map<String, Object> innermap = new HashMap<String, Object>();
            int i = 1;

            for (Element ele1 : list) {
                String eleName = ele1.getName();

                String value = ele1.getText();
                Object obj = innermap.get(eleName);
                if (obj == null) {
                    elementTomap(ele1, innermap);
                } else {
                    if (obj instanceof Map) {
                        List<Map<String, Object>> list1 = new ArrayList<Map<String, Object>>();
                        list1.add((Map<String, Object>) innermap.remove(eleName));
                        elementTomap(ele1, innermap);
                        list1.add((Map<String, Object>) innermap.remove(eleName));
                        innermap.put(eleName, list1);
                    } else if (obj instanceof String) {

                        innermap.put(eleName + i, value);
                        i++;
                    } else {
                        elementTomap(ele1, innermap);
                        Map<String, Object> listValue = (Map<String, Object>) innermap.get(eleName);
                        ((List<Map<String, Object>>) obj).add(listValue);
                        innermap.put(eleName, obj);
                    }

                }
            }
            outmap.put(outele.getName(), innermap);
        }
        return outmap;
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

        String xml ="<?xml version=\"1.0\" encoding=\"GBK\" standalone=\"yes\" ?>\n" +
                "<output><sqldata><row><aaa100>AAA003</aaa100><aaa101>增发类别</aaa101><aaa102>101</aaa102><aaa103>全国劳动英模、劳动模范（荣誉称号）</aaa103></row><row><aaa100>AAA003</aaa100><aaa101>增发类别</aaa101><aaa102>102</aaa102><aaa103>部省先进一次（荣誉称号）</aaa103></row><row><aaa100>AAA003</aaa100><aaa101>增发类别</aaa101><aaa102>103</aaa102><aaa103>部省先进二次及以上（荣誉称号</aaa103></row><row><aaa100>AAA003</aaa100><aaa101>增发类别</aaa101><aaa102>201</aaa102><aaa103>部队军以上单位授予的战斗英雄称号（立功）</aaa103></row><row><aaa100>AAA003</aaa100><aaa101>增发类别</aaa101><aaa102>202</aaa102><aaa103>一等功、特等功、甲等功（立功）</aaa103></row><row><aaa100>AAA003</aaa100><aaa101>增发类别</aaa101><aaa102>203</aaa102><aaa103>二等功和省公检法司授予的一等功（立功）</aaa103></row><row><aaa100>AAA003</aaa100><aaa101>增发类别</aaa101><aaa102>301</aaa102><aaa103>国家发明奖、成果奖、科技进步一、二等奖（受奖）</aaa103></row><row><aaa100>AAA003</aaa100><aaa101>增发类别</aaa101><aaa102>302</aaa102><aaa103>国家三、四等奖和部、省一等奖（受奖）</aaa103></row><row><aaa100>AAA003</aaa100><aaa101>增发类别</aaa101><aaa102>303</aaa102><aaa103>部、省二等奖（受奖）</aaa103></row><row><aaa100>AAA003</aaa100><aaa101>增发类别</aaa101><aaa102>304</aaa102><aaa103>部、省二等奖两次以上（受奖）</aaa103></row><row><aaa100>AAA003</aaa100><aaa101>增发类别</aaa101><aaa102>305</aaa102><aaa103>中级及中级以上职称</aaa103></row><row><aaa100>AAA003</aaa100><aaa101>增发类别</aaa101><aaa102>306</aaa102><aaa103>三线工作二十年及以上</aaa103></row><row><aaa100>AAA003</aaa100><aaa101>增发类别</aaa101><aaa102>307</aaa102><aaa103>外知</aaa103></row><row><aaa100>AAA003</aaa100><aaa101>增发类别</aaa101><aaa102>401</aaa102><aaa103>支边累计20年以上，退休后留在边远地区</aaa103></row><row><aaa100>AAA003</aaa100><aaa101>增发类别</aaa101><aaa102>501</aaa102><aaa103>支边累计20年以上，在当地办退休</aaa103></row><row><aaa100>AAA003</aaa100><aaa101>增发类别</aaa101><aaa102>601</aaa102><aaa103>三线三类地区工作累计满20年，就地安置</aaa103></row><row><aaa100>AAA003</aaa100><aaa101>增发类别</aaa101><aaa102>602</aaa102><aaa103>三线一、二类地区工作累计满20年，就地安置</aaa103></row><row><aaa100>AAA003</aaa100><aaa101>增发类别</aaa101><aaa102>701</aaa102><aaa103>西藏工作满10年不满15年</aaa103></row><row><aaa100>AAA003</aaa100><aaa101>增发类别</aaa101><aaa102>702</aaa102><aaa103>西藏工作满15年以上</aaa103></row><row><aaa100>AAA030</aaa100><aaa101>银行利率类型</aaa101><aaa102>100</aaa102><aaa103>活期</aaa103></row></sqldata></output>";
try {
    Map<String,Object> aa = parseXml(xml);
    Map<String,Object> output = (Map<String,Object>)aa.get("output");
    Map<String,Object> sqldata = (Map<String,Object>)output.get("sqldata");

    List<Map<String,Object>> al = (List<Map<String,Object>>)sqldata.get("row");
    System.out.println(parseXml(xml));
} catch (Exception e) {

}

        Map<String, Object> dataMap = new LinkedHashMap<String, Object>(); //默认
        dataMap.put("rtnCode", "02");
        dataMap.put("rtnMsg", "查询失败");
        dataMap.put("idWltCloudDistrict", "专区id");

        Map<String, Object> bizMap = new LinkedHashMap<String, Object>();
        bizMap.put("serviceId", "serviceId001");
        bizMap.put("data", dataMap);//data节点是一个map

        Map<String, Object> objMap = new LinkedHashMap<String, Object>();
        objMap.put("idWltCloudDistrict", "专区id");
        objMap.put("districtName", "专区名称");
        objMap.put("validateDateStart", "专区有效期开始");
        objMap.put("validateDateEnd", "专区有效期结束");
        objMap.put("status", "专区状态(00-待发布;01-销售中; 02-已下架;)");
        objMap.put("partnerId", "合作伙伴id");
        objMap.put("channelId", "渠道id");
        objMap.put("areaId", "商圈专区id");
        dataMap.putAll(objMap); //

        List<Map<String, Object>> prodKindList1 = new ArrayList<Map<String, Object>>();
        for (int i = 1; i <= 2; i++) {
            // 第二层
            List<Map<String, Object>> prodKindList2 = new ArrayList<Map<String, Object>>();
            for (int j = 1; j <= 2; j++) {
                Map<String, Object> prodKindObj2 = new LinkedHashMap<String, Object>();
                prodKindObj2.put("idWltCloudProdKind", "类目ID");
                prodKindObj2.put("prodKindName", "类目名称");
                prodKindObj2.put("prodKindIdx", "类目序号");
                Map<String, Object> prodKind2 = new LinkedHashMap<String, Object>();
                prodKind2.put("prodKind", prodKindObj2);
                prodKindList2.add(prodKind2);
            }

            //第一层
            Map<String, Object> prodKindOjb1 = new LinkedHashMap<String, Object>();
            prodKindOjb1.put("idWltCloudProdKind", "类目ID");
            prodKindOjb1.put("prodKindName", "类目名称");
            prodKindOjb1.put("prodKindIdx", "类目序号");
            prodKindOjb1.put("prodKindList", prodKindList2);
            Map<String, Object> prodKind1 = new LinkedHashMap<String, Object>();
            prodKind1.put("prodKind", prodKindOjb1);
            prodKindList1.add(prodKind1);
        }

        dataMap.put("prodKindList", prodKindList1);

        System.out.println(JSONArray.toJSON(callMapToXML(bizMap)).toString());
    }

}
