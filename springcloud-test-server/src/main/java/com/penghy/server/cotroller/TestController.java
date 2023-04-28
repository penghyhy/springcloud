package com.penghy.server.cotroller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.penghy.server.bean.*;
import com.penghy.server.bean.sis.PatiTrade;
import com.penghy.server.service.PersonService;
import com.penghy.server.util.Pinyin4jUtil;
import com.penghy.server.uploadtest.service.impl.ImportserviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.util.*;

@RestController
@RequestMapping("/httpService")
public class TestController {

    @Autowired
    private PersonService personService;

    @Autowired
    private ImportserviceImpl importservice;


    @PostMapping("/upload")
    public void selectwowjoydrugdict(@RequestParam("file") MultipartFile file) throws Exception {
        importservice.importTprkxx(file);
    }

    /**
     * 查询sis服务中的药品信息
     *
     * @throws Exception
     */
    @RequestMapping("/selectwowjoydrugdict")
    public void selectwowjoydrugdict() throws Exception {
        List<DrugDict1> dd = personService.selectwowjoydrugdict();
        for (DrugDict1 drugDict : dd) {
            String get = Pinyin4jUtil.getPinYin(drugDict.getDrugChineseName());
            personService.updatetwowjoydrugdict(drugDict.getIncrementId(), get);
        }
//        List<Disease1> cc = dd;
    }

    /**
     * 查询sis服务中的诊疗信息
     *
     * @throws Exception
     */
    @RequestMapping("/selectwowjoyorderdict")
    public void selectwowjoyorderdict() throws Exception {
        List<OrderDict1> dd = personService.selectwowjoyorderdict();
        for (OrderDict1 orderDict1 : dd) {
            String get = Pinyin4jUtil.getPinYin(orderDict1.getOrderChineseName());
            personService.updatetwowjoyorderdict(orderDict1.getIncrementId(), get);
        }
//        List<Disease1> cc = dd;
    }

    /**
     * 查询sis服务中的诊疗信息
     *
     * @throws Exception
     */
    @RequestMapping("/selectwowjoyopearationdict")
    public void selectwowjoyopearationdict() throws Exception {
        List<Opeartion> dd = personService.selectwowjoyopearationdict();
        for (Opeartion orderDict1 : dd) {
            String get = Pinyin4jUtil.getPinYin(orderDict1.getOperationChineseName());
            personService.updatetwowjoyoperationdict(orderDict1.getIncrementId(), get);
        }
//        List<Disease1> cc = dd;
    }


    /**
     * 8
     * 查询sis服务中的通用项目信息
     *
     * @throws Exception
     */
    @RequestMapping("/selectwowjoypubdict")
    public void selectwowjoypubdict() throws Exception {
        List<PubDict> dd = personService.selectwowjoypubdict();
//        RedisUtil.setNoExpiry("list:aaa:bbb", (Serializable) dd);
        for (PubDict pubDict : dd) {
            String get = Pinyin4jUtil.getPinYin(pubDict.getInsureDictName());
            personService.updatetwowjoypubdict(pubDict.getIncrementId(), get);
        }
    }

    /**
     * 查询sis服务中的通用项目信息
     *
     * @throws Exception
     */
    @PostMapping("/queryBaeReckonList")
    public String queryBaeReckonList(@RequestParam String patiTrade) throws Exception {
        return personService.queryBaeReckonList();
    }

    /**
     * 查询sis服务中的通用项目信息
     *
     * @throws Exception
     */
    @RequestMapping("/selectwowjoyOtherdict")
    public void selectwowjoyOtherdict() throws Exception {
        List<Map<String, Object>> dd = personService.selectwowjoyOtherdict();
        for (Map<String, Object> pubDict : dd) {
            String get = Pinyin4jUtil.getPinYin(pubDict.get("disease_Chinese_name").toString());
            personService.updatewowjoyOtherdict(Integer.valueOf(pubDict.get("increment_id").toString()), get);
        }
    }

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
    @RequestMapping("/11")
    @Transactional
    public void insert() throws Exception {
        Person a = new Person();
        a.setId(122);
        a.setName("我是小彭1129");
        personService.insert(a);
        try {
            throw new Exception("失败");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/12")
    public void insert12() throws Exception {

        personService.insertDrugDict();
    }

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

    /**
     * 查询sis服务中的通用项目信息
     *
     * @throws Exception
     */
    @RequestMapping("/selectwowjoytest")
    public void selectwowjoytest() throws Exception {
        List<String> dd = personService.selecttest();
        BigDecimal a3 = BigDecimal.ZERO;
        BigDecimal a4 = BigDecimal.ZERO;
        BigDecimal a5 = BigDecimal.ZERO;
        BigDecimal a6 = BigDecimal.ZERO;
        BigDecimal a7 = BigDecimal.ZERO;
        BigDecimal a8 = BigDecimal.ZERO;
        BigDecimal a9 = BigDecimal.ZERO;
        BigDecimal a10 = BigDecimal.ZERO;
        BigDecimal a11 = BigDecimal.ZERO;
        BigDecimal a12 = BigDecimal.ZERO;
        BigDecimal a13 = BigDecimal.ZERO;
        BigDecimal a14 = BigDecimal.ZERO;
        BigDecimal a15 = BigDecimal.ZERO;
        BigDecimal a16 = BigDecimal.ZERO;
        BigDecimal a17 = BigDecimal.ZERO;
        BigDecimal a18 = BigDecimal.ZERO;
        //            JSONObject aao = JSON.parseObject(aa_);
//            JSONObject aaoo = JSONObject.parseObject(aao.get("output").toString());
//            Map<String, Object>  aaooo = ((List<Map<String, Object>>)aaoo.get("result")).get(0);
        for (String aa : dd) {
            String aa_ = aa.split("----")[0];
            JSONObject aao_ = JSON.parseObject(aa_);
            JSONObject aaoo = JSONObject.parseObject(aao_.get("output").toString());
            Map<String, Object> aaooo = ((List<Map<String, Object>>) aaoo.get("result")).get(0);
            a3 = a3.add(new BigDecimal(aaooo.get("fulamt_ownpay_amt").toString()));
            a4 = a4.add(new BigDecimal(aaooo.get("overlmt_amt").toString()));
            a5 = a5.add(new BigDecimal(aaooo.get("preselfpay_amt").toString()));
//            a6 = a6.add(new BigDecimal(aa.split("\\|", -1)[5]));
//            a7 = a7.add(new BigDecimal(aa.split("\\|", -1)[6]));
//            a8 = a8.add(new BigDecimal(aa.split("\\|", -1)[7]));
//            a9 = a9.add(new BigDecimal(aa.split("\\|", -1)[8]));
//            a10 = a10.add(new BigDecimal(aa.split("\\|", -1)[9]));
//            a11 = a11.add(new BigDecimal(aa.split("\\|", -1)[10]));
//            a12 = a12.add(new BigDecimal(aa.split("\\|", -1)[11]));
//            a13 = a13.add(new BigDecimal(aa.split("\\|", -1)[12]));
//            a14 = a14.add(new BigDecimal(aa.split("\\|", -1)[13]));
//            a15 = a15.add(new BigDecimal(aa.split("\\|", -1)[14]));
//            a16 = a16.add(new BigDecimal(aa.split("\\|", -1)[15]));
//            a17 = a17.add(new BigDecimal(aa.split("\\|", -1)[16]));
//            a18 = a18.add(new BigDecimal(aa.split("\\|", -1)[17]));
        }
        System.out.println("费用总额:" + a3 + "，自费总额（非医保）:" + a4 + "自理总额（目录内自负比例部分）:" + a5 + "个人现金支付:" + a6 + "报销金额~" + a7 + "统筹基金支付~" + a8 + "往年帐户支付~" + a9 + "当年帐户支付~" + a10 + "大病救助支付~" + a11 + "公务员补助支付~" +
                a12 + "二乙基金支付~" + a13 + "离休基金支付~" + a14 + "劳模基金支付~" + a15 + "补助基金支付~" + a16 + "民政补助（伤残基金）支付~" + a17 + "家庭共济基金~" + a18);

    }

    /**
     * 导入
     *
     * @param
     */
    @RequestMapping(value = "/import")
    public void importExcel() {
        personService.impxlsx("C:\\\\Users\\\\13735\\\\Desktop\\\\郑州市第三人民医院出差发票\\\\busyTransInfo.xlsx");
//    public List<DrugDict> importExcel(@RequestParam("file") MultipartFile file) {
//        long start = System.currentTimeMillis();
//        File file1 = new File("C:\\Users\\13735\\Desktop\\郑州市第三人民医院出差发票\\busyTransInfo.xlsx");
//        List<DrugDict> drugDictList = new ArrayList<>();
//        try {
//            drugDictList = ExcelImportUtil.importExcel(file.getResource().getFile(), DrugDict.class, new ImportParams());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }


    /**
     * @throws Exception
     */
    @RequestMapping("/insertPRK")
    public void insertPRK() {
        List<String> dd = personService.getIncrementId();
        StringJoiner a = new StringJoiner(",");
        String sql = "";
        if (dd.size() > 0) {
            int i = 1;
            for (String dda : dd) {
                a.add(dda);
                i++;
            }
            sql = "update si_material_dict set delete_flag=1 where increment_id in (" + a + ");";
            System.out.println(sql);
            personService.insertPRK(sql);
        }
    }

    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("3.86");
        BigDecimal b = new BigDecimal("3.84");
        System.out.println(a.subtract(b).setScale(2,BigDecimal.ROUND_HALF_UP).abs());
        System.out.println(a.subtract(b).setScale(2,BigDecimal.ROUND_HALF_UP).abs().compareTo(new BigDecimal("0.01"))>0);
        try {
            if (1/0==1) {

            }
            System.out.println("cccc");
        } catch (Exception e) {
            System.out.println("bbbbb");
        }
        System.out.println("aaaa");
    }

    @RequestMapping(value = "/getTradeLogs")
    public void getTradeLogs() {
        personService.getTradeLogs();
    }

}
