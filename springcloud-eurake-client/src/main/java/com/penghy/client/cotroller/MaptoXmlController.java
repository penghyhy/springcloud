package com.penghy.client.cotroller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.penghy.client.bean.GzAudit.*;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/httpService1")
public class MaptoXmlController {



    @ResponseBody
    @RequestMapping("/hello1")
    public String hello(String name) {
        return name + ", Welcome to Spring Boot 2";
    }


    @RequestMapping(value = "/sendPostDataByMap", method = RequestMethod.POST)
    public String sendPostDataByMap(HttpServletRequest request, HttpServletResponse response) {
        String result = "调用成功：数据是 " + "name:" + request.getParameter("name") + " city:" + request.getParameter("city");
        return JSON.toJSONString(result);
    }

    @RequestMapping(value = "/sendPostDataByJson", method = RequestMethod.POST)
    public String sendPostDataByJson(HttpServletRequest request, HttpServletResponse response, @RequestBody String requestBody) {
        JSONObject jsonObject = JSONObject.parseObject(requestBody);
        String result = "调用成功：数据是 " + "name:" + jsonObject.getString("name") + " city:" + jsonObject.getString("city");
        return JSON.toJSONString(result);
    }

    @RequestMapping(value = "/sendPostDataByMap2", method = RequestMethod.POST)
    public Map<String, Object> sendPostDataByMap2(HttpServletRequest request, HttpServletResponse response, @RequestBody String requestBody) {
        JSONObject jsonObject = JSONObject.parseObject(requestBody);
        String result = "调用成功：数据是 " + "name:" + jsonObject.getString("name") + " city:" + jsonObject.getString("city");
        Map<String, Object> result1 = new HashMap<>();
        result1.put("aaa", "aaa");
        result1.put("bbb", "aaa");
        result1.put("ccc", "aaa");
        List<Map<String, Object>> list = new ArrayList<>();
        Map<String, Object> result2 = new HashMap<>();
        Map<String, Object> result3 = new HashMap<>();
        result2.put("ddd", "ccc");
        result2.put("eee", "c1");
        result2.put("eeef", "c2");
        result3.put("ddd3", "ccc");
        result3.put("eee3", "c1");
        result3.put("eeef3", "c2");
        result1.put("result2", result2);
        result1.put("result3", result3);
        list.add(result2);
        list.add(result3);
        result1.put("list", list);
        return result1;
    }

    @RequestMapping(value = "/sendPostDataByMap3", method = RequestMethod.POST)
    private List<Map<String, Object>> sendPostDataByMap3(HttpServletRequest request, HttpServletResponse response, @RequestBody String requestBody) {
        sendPostDataByMap2(request, response, requestBody);
        List<Map<String, Object>> maps = new ArrayList<>();
        maps.add(sendPostDataByMap2(request, response, requestBody));
        maps.add(sendPostDataByMap2(request, response, requestBody));
        return maps;
    }

    @RequestMapping(value = "/sendGetData", method = RequestMethod.GET)
    public String sendGetData(HttpServletRequest request, HttpServletResponse response) {
        String result = "调用成功：数据是 " + "name:" + request.getParameter("name") + " city:" + request.getParameter("city");
        return JSON.toJSONString(result);
    }

    //
//    private void httpURLGETCase() {
//        String methodUrl = "http://localhost:9000/hello1";
//        HttpURLConnection connection = null;
//        BufferedReader reader = null;
//        String line = null;
//        try {
//            URL url = new URL(methodUrl + "?mobile=15334567890&name=zhansan");
//            connection = (HttpURLConnection) url.openConnection();// 根据URL生成HttpURLConnection
//            connection.setRequestMethod("GET");// 默认GET请求
//            connection.connect();// 建立TCP连接
//            if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
//                reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));// 发送http请求
//                StringBuilder result = new StringBuilder();
//                // 循环读取流
//                while ((line = reader.readLine()) != null) {
//                    result.append(line).append(System.getProperty("line.separator"));// "\n"
//                }
//                System.out.println(result.toString());
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                reader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            connection.disconnect();
//        }
//    }
//
//
//    private static void httpURLPOSTCase() {
//                 String methodUrl = "http://localhost:9000/hello1";
//                 HttpURLConnection connection = null;
//                 OutputStream dataout = null;
//                 BufferedReader reader = null;
//                 String line = null;
//                 try {
//                         URL url = new URL(methodUrl);
//                        connection = (HttpURLConnection) url.openConnection();// 根据URL生成HttpURLConnection
//                         connection.setDoOutput(true);// 设置是否向connection输出，因为这个是post请求，参数要放在http正文内，因此需要设为true,默认情况下是false
//                         connection.setDoInput(true); // 设置是否从connection读入，默认情况下是true;
//                         connection.setRequestMethod("POST");// 设置请求方式为post,默认GET请求
//                         connection.setUseCaches(false);// post请求不能使用缓存设为false
//                         connection.setConnectTimeout(3000);// 连接主机的超时时间
//                         connection.setReadTimeout(3000);// 从主机读取数据的超时时间
//                         connection.setInstanceFollowRedirects(true);// 设置该HttpURLConnection实例是否自动执行重定向
//                         connection.setRequestProperty("connection", "Keep-Alive");// 连接复用
//                         connection.setRequestProperty("charset", "utf-8");
//
//                         connection.setRequestProperty("Content-Type", "application/json");
//                         connection.setRequestProperty("Authorization", "Bearer 66cb225f1c3ff0ddfdae31rae2b57488aadfb8b5e7");
//                         connection.connect();// 建立TCP连接,getOutputStream会隐含的进行connect,所以此处可以不要
//
//                         dataout = new DataOutputStream(connection.getOutputStream());// 创建输入输出流,用于往连接里面输出携带的参数
//                         String body = "[{\"orderNo\":\"44921902\",\"adviser\":\"张怡筠\"}]";
//                         dataout.write(body.getBytes());
//                         dataout.flush();
//                         dataout.close();
//
//                         if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
//                                 reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));// 发送http请求
//                                 StringBuilder result = new StringBuilder();
//                                 // 循环读取流
//                                 while ((line = reader.readLine()) != null) {
//                                         result.append(line).append(System.getProperty("line.separator"));//
//                                     }
//                                 System.out.println(result.toString());
//                             }
//                     } catch (IOException e) {
//                         e.printStackTrace();
//                     } finally {
//                        try {
//                                 reader.close();
//                             } catch (IOException e) {
//                                 e.printStackTrace();
//                             }
//                         connection.disconnect();
//                     }
//             }

//    @RequestMapping("/insert1112")
//    public void insertDrugDict() throws Exception {
//        personService.insertDrugDict();
//    }
//
//    @RequestMapping("/insertOrderDict")
//    public void insertOrderDict() throws Exception {
//        personService.insertOrderDict();
//    }

//    @RequestMapping("/updateDrugDict")
//    public void updateDrugDict() throws Exception {
//        personService.updateDrugDict();
//    }

    public static void main(String[] args) {

        HospitalClaimDetailSet hospitalClaimDetailSet = new HospitalClaimDetailSet();

        // 处方单明细信息
        ClaimDetailHospital claimDetailHospital1 = new ClaimDetailHospital();
        claimDetailHospital1.setAKF003("AKF003_1");
        claimDetailHospital1.setAKF005("AKF005_1");

        ClaimDetailHospital claimDetailHospital2 = new ClaimDetailHospital();
        claimDetailHospital2.setAKF003("AKF003_1");
        claimDetailHospital2.setAKF005("AKF005_1");

        List<ClaimDetailHospital> claimDetailHospitals = new ArrayList<>();
        claimDetailHospitals.add(claimDetailHospital1);
        claimDetailHospitals.add(claimDetailHospital2);
//        hospitalClaimDetailSet.setClaimDetailHospitalList(claimDetailHospitals);



        HospitalClaim hospitalClaim = new HospitalClaim();
        hospitalClaim.setBENEFIT_GROUP_ID("group_id");
        hospitalClaim.setBENEFIT_TYPE("type");

        PackHospital packHospital = new PackHospital();
        packHospital.setHospitalClaimDetailSet(claimDetailHospitals);
        packHospital.setHospitalClaim(hospitalClaim);
        Body body = new Body();

        body.setYSBM("彭怀洋"); // 接口id
        body.setPackHospital(packHospital);

        Head head = new Head();
        head.setSFZH("aaa");

        Msg msg = new Msg();
        msg.setBODY(body);
        msg.setHEAD(head);


        XStream xstream = new XStream(new DomDriver("UTF-8", new XmlFriendlyReplacer("_-", "_"))) ;


        xstream.alias("MSG", Msg.class);

        xstream.alias("HEAD", Head.class);

        xstream.alias("BODY", Body.class);

        xstream.alias("PackHospital", PackHospital.class);

        xstream.alias("HospitalClaim", HospitalClaim.class);

        xstream.alias("ClaimDetailHospital", ClaimDetailHospital.class);

        xstream.alias("HospitalClaimDetailSet", HospitalClaimDetailSet.class);

        xstream.aliasAttribute("xmlns", "head1");
        xstream.useAttributeFor(PackHospital.class, "head1");
        xstream.aliasAttribute("xmlns:i", "head2");
        xstream.useAttributeFor(PackHospital.class, "head2");




        String requestXml =  msg.msgInfo+xstream.toXML(msg);

        System.out.println(requestXml);
    }

}
