package com.penghy.client.cotroller;


import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {
//
//    @Autowired
//    private PersonService mySQLTestService;
////    @Autowired
////    private RedisUtil redisUtil;
//    @Autowired
//    private PersonService personService;
//
//
//    @ResponseBody
//    @RequestMapping("/hello")
//    public String hello(String name) {
//        return name + ", Welcome to Spring Boot 2";
//    }
//
//
//    @RequestMapping("/select")
//    public List<Person> select() throws Exception {
////        redisUtil.set("1111", mySQLTestService.select(), 100);
//        return mySQLTestService.select();
//    }
//
//    @RequestMapping("/insert11")
//    public void insert() throws Exception {
//        Person a = new Person();
//        a.setId(1221);
//        a.setName("我是小彭1129");
//        personService.insert(a);
//    }
//
//    @RequestMapping("/selectDisease")
//    public void selectDisease() throws Exception {
//        List<Disease> dd = mySQLTestService.selectDisease();
//        for (Disease disease : dd) {
//            String get = Pinyin4jUtil.getPinYin(disease.getDisease_Chinese_name());
//            mySQLTestService.update(disease.getIncrement_id(), get);
//        }
//        List<Disease> cc = dd;
//    }
//
//
//    /**
//     * post请求传输map数据
//     *
//     * @param url
//     * @param map
//     * @param encoding
//     * @return
//     * @throws ClientProtocolException
//     * @throws IOException
//     */
//    public static String sendPostDataByMap(String url, Map<String, String> map, String encoding) throws Exception {
//        String result = "";
//
//        // 创建httpclient对象
//        CloseableHttpClient httpClient = HttpClients.createDefault();
//        // 创建post方式请求对象
//        HttpPost httpPost = new HttpPost(url);
//
//        // 装填参数
//        List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
//        if (map != null) {
//            for (Entry<String, String> entry : map.entrySet()) {
//                nameValuePairs.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
//            }
//        }
//
//        // 设置参数到请求对象中
//        httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs, encoding));
//
//        // 设置header信息
//        // 指定报文头【Content-type】、【User-Agent】
////        httpPost.setHeader("Content-type", "application/x-www-form-urlencoded");
//        httpPost.setHeader("Content-type", "application/json");
////        httpPost.setHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
//
//        // 执行请求操作，并拿到结果（同步阻塞）
//        CloseableHttpResponse response = httpClient.execute(httpPost);
//        // 获取结果实体
//        // 判断网络连接状态码是否正常(0--200都数正常)
//        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
//            result = EntityUtils.toString(response.getEntity(), "utf-8");
//        }
//        // 释放链接
//        response.close();
//
//        return result;
//    }
//
//    /**
//     * post请求传输json数据
//     *
//     * @param url
//     * @param json
//     * @param encoding
//     * @return
//     * @throws ClientProtocolException
//     * @throws IOException
//     */
//    public static String sendPostDataByJson(String url, String json, String encoding) throws ClientProtocolException, IOException {
//        String result = "";
//
//        // 创建httpclient对象
//        CloseableHttpClient httpClient = HttpClients.createDefault();
//
//        // 创建post方式请求对象
//        HttpPost httpPost = new HttpPost(url);
//        httpPost.setHeader("Content-type", "application/json");
//
//        // 设置参数到请求对象中
//        StringEntity stringEntity = new StringEntity(json, ContentType.APPLICATION_JSON);
//        stringEntity.setContentEncoding("utf-8");
//        httpPost.setEntity(stringEntity);
//
//        // 执行请求操作，并拿到结果（同步阻塞）
//        CloseableHttpResponse response = httpClient.execute(httpPost);
//
//        // 获取结果实体
//        // 判断网络连接状态码是否正常(0--200都数正常)
//        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
//            result = EntityUtils.toString(response.getEntity(), "utf-8");
//        }
//        // 释放链接
//        response.close();
//
//        return result;
//    }
//
//    /**
//     * get请求传输数据
//     *
//     * @param url
//     * @param encoding
//     * @return
//     * @throws ClientProtocolException
//     * @throws IOException
//     */
//    public String sendGetData(String url, String encoding) throws ClientProtocolException, IOException {
//        String result = "";
//
//        // 创建httpclient对象
//        CloseableHttpClient httpClient = HttpClients.createDefault();
//
//        // 创建get方式请求对象
//        HttpGet httpGet = new HttpGet(url);
//        httpGet.addHeader("Content-type", "application/json");
//        // 通过请求对象获取响应对象
//        CloseableHttpResponse response = httpClient.execute(httpGet);
//
//        // 获取结果实体
//        // 判断网络连接状态码是否正常(0--200都数正常)
//        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
//            result = EntityUtils.toString(response.getEntity(), "utf-8");
//        }
//        // 释放链接
//        response.close();
//
//        return result;
//    }
//
//    @RequestMapping("/select1")
//    public String testSendPostDataByMap() throws Exception {
//        String url = "http://localhost:9001/httpService/sendPostDataByMap";
//        Map<String, String> map = new HashMap<String, String>();
//        map.put("name", "wyj");
//        map.put("city", "南京");
//        String body = sendPostDataByMap(url, map, "utf-8");
//        System.out.println("响应结果：" + body);
//        return body;
//    }
//
//    @RequestMapping("/select2")
//    public String testSendPostDataByJson() throws Exception {
//        String url = "http://localhost:9001/httpService/sendPostDataByJson";
//        Map<String, String> map = new HashMap<String, String>();
//        map.put("name", "wyj");
//        map.put("city", "南京");
//        String body = sendPostDataByJson(url, JSON.toJSONString(map), "utf-8");
//        System.out.println("响应结果：" + body);
//        return body;
//    }
//
//    @RequestMapping("/select3")
//    public String testSendGetData() throws Exception {
//        String url = "http://localhost:9001/httpService/sendGetData?name=wyj&city=南京";
//        String body = sendGetData(url, "utf-8");
//        System.out.println("响应结果：" + body);
//        return body;
//    }
//
//    public static void main(String[] args) {
//        String md5Str = DigestUtils.md5DigestAsHex("DC03005".getBytes());
////        46350a670f11010725971f20391dd63b
////        46350A670F11010725971F20391DD63B
//
////        try{
////            URLDecoder.decode("%7B%22FKey%22%3A%227239753042d04dc5b160256d20673d36%22%2C%22FCode%22%3A%222100%22%2C%22FCmd%22%3A%22HzMediInsuranceService%22%2C%22FErrorCode%22%3A0%2C%22FHospCode%22%3A%227360%22%2C%22FInData%22%3A%222100%5E7360%5E6666%5E20200716085454-7360-00006666-9184%7C330100%5E20200716121745736000006096%5E0%5E330100D1560000050075B2D7E12CE9D6%7C%7C%7C%7C%7C20200716121745%7C%7C%5E1%5E%22%2C%22FInData2%22%3A%22%22%2C%22FOutData%22%3A%2220200716121652-7360-9326%5E1%5E10541978%7C0039327%7C%E6%9D%AD%E5%B7%9E%E5%8D%8E%E5%8D%93%E4%BF%A1%E6%81%AF%E7%A7%91%E6%8A%80%E6%9C%89%E9%99%90%E5%85%AC%E5%8F%B8%7C350623198502265716%7C%E6%B4%AA%E6%B7%BB%E6%9C%89%7C1%7C01%7C19850226%7CW12977573%7C11%7C01560836%7C330110%7C2020%7C0%7C0.0%7C0.0%7C000000000%7C3%7C%7C000%7C0%7C%2B%7C1152.0%7C2.01%7C1000.0%7C0.0%7C0.0%7C147.16%7C0%7C330100D1560000050075B2D7E12CE9D6%7C12%7C0.0%7C0.0%7C1%7C%7C%5E%5E%22%2C%22FtransType%22%3A0%2C%22FtradeDesc%22%3A%22%22%2C%22FtradeAmt%22%3A0%2C%22Fsrc%22%3A%22%22%2C%22FbatNo%22%3A0%2C%22FposSeq%22%3A0%2C%22FposId%22%3A0%2C%22FBusinesssequence%22%3A%22%22%2C%22FBusinessvalidate%22%3A%22%22%2C%22FtransId%22%3A0%7D", "UTF-8");
////        } catch (Exception e) {
////
////        }
//        System.out.println(md5Str);
//
//        try {
//            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//            System.out.println(formatter.parse("20200101"));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
