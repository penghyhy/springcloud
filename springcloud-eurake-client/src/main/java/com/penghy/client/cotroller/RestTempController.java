package com.penghy.client.cotroller;


import com.alibaba.fastjson.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

//@RestController
//@RequestMapping("rest")
public class RestTempController {

    @RequestMapping("/hello1")
    public String postString(@RequestBody Map<String, Object> maps) {

        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:9001/httpService/sendPostDataByJson";
        MultiValueMap<String, String> map = new LinkedMultiValueMap<>();

        HttpHeaders header = new HttpHeaders();
        // 需求需要传参为form-data格式
        header.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity httpEntity = new HttpEntity(maps, header);
//        JSONObject response = restTemplate.postForObject(url,httpEntity, JSONObject.class);
        String response1 = restTemplate.postForObject(url, httpEntity, String.class);
        System.out.print(response1);
        return response1;
    }

    @RequestMapping("/hello2")
    public Map<String, Object> postObject(@RequestBody Map<String, Object> maps) {

        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:9001/httpService/sendPostDataByMap3";
        MultiValueMap<String, String> map = new LinkedMultiValueMap<>();

        HttpHeaders header = new HttpHeaders();
        // 需求需要传参为form-data格式
        header.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity httpEntity = new HttpEntity(maps, header);
        JSONObject response = restTemplate.postForObject(url, httpEntity, JSONObject.class);
//        String response1 = restTemplate.postForObject(url,httpEntity, String.class);
        Map<String, Object> res = response;
        return res;
    }

    @RequestMapping("/hello4")
    public List<Map<String, Object>> postObject4(@RequestBody Map<String, Object> maps) {

        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:9001/httpService/sendPostDataByMap3";
        MultiValueMap<String, String> map = new LinkedMultiValueMap<>();

        HttpHeaders header = new HttpHeaders();
        // 需求需要传参为form-data格式
        header.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity httpEntity = new HttpEntity(maps, header);
        List<Map<String, Object>> response = restTemplate.postForObject(url, httpEntity, List.class);
//        String response1 = restTemplate.postForObject(url,httpEntity, String.class);
//        Map<String, Object> res = response;
        return response;
    }

    @RequestMapping("/hello3")
    public Map<String, Object> getObject(@RequestBody Map<String, Object> maps) {

        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:9001/httpService/sendPostDataByJson";

        JSONObject response = restTemplate.getForObject(url, JSONObject.class);
//        String response1 = restTemplate.postForObject(url,httpEntity, String.class);
        return response;
    }
}
