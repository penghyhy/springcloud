package com.penghy.server.cotroller;


import com.alibaba.fastjson.JSONArray;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
