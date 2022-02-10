package com.penghy.server.cotroller.testDemo;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.bouncycastle.crypto.RuntimeCryptoException;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.junit.jupiter.api.Test;

import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import java.math.BigInteger;
import java.security.Security;

public class SignGeneratorUtil {
    private final static String SECRET = "dLbaRxUCWJDbcG9";

    public static String encrytSHA256(String content, String secret) {

        try {
            Security.addProvider(new BouncyCastleProvider());
            SecretKey secretKey = new SecretKeySpec(secret.getBytes("UTF-8"), "HmacSm3");
            Mac mac = Mac.getInstance(secretKey.getAlgorithm());
            mac.init(secretKey);
            byte[] digest = mac.doFinal(content.getBytes("UTF-8"));
            return new HexBinaryAdapter().marshal(digest).toUpperCase();
        } catch (Exception e) {
            throw new RuntimeCryptoException("加密异常");
        }
    }

    @Test
    public void test3() {
        JSONObject json = new JSONObject();
        json.put("a", "a");
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("当前时间戳：" + currentTimeMillis);
        System.out.println("当前报文：" + json.toString());
        System.out.println(currentTimeMillis + "\n" + json.toString());
        System.out.println(encrytSHA256(currentTimeMillis + "\n" + json.toString(), SECRET));
    }

    @Test
    public void test2() {
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject json = new JSONObject();
        json.put("infno", "5101");
        json.put("msgid", "63000000000000000000000008");
        json.put("mdtrtarea_admvs", "610602");
        json.put("insuplc_admdvs", "610602");
        json.put("recer_sys_code", "FSI_LOCAL");
        json.put("dev_no", "");
        json.put("dev_safe_info", "");
        json.put("cainfo", "");
        json.put("signtype", "");
        json.put("infver", "1.0");
        json.put("opter_type", "1");
        json.put("opter", "system");
        json.put("opter_name", "测试");
        json.put("inf_time", "2020-12-03 10:00:00");
        json.put("fixmedins_code", "H33010200001");
        json.put("fixmedins_name", "延安致美****");
        json.put("sign_no", "");
        JSONObject input = new JSONObject();
        input.put("hosp_dept_codg", "1");
        json.put("input", input);
        System.out.println(encrytSHA256(currentTimeMillis + ":" + json.toString(), SECRET));
    }


//            <dependency>
//            <groupId>org.bouncycastle</groupId>
//            <artifactId>bcprov-jdk15on</artifactId>
//            <version>1.69</version>
//        </dependency>
//        <!-- 单元测试 -->
//        <dependency>
//            <groupId>junit</groupId>
//            <artifactId>junit</artifactId>
//            <version>4.12</version>
//            <scope>test</scope>
//        </dependency>
//        <dependency>
//            <groupId>org.junit.jupiter</groupId>
//            <artifactId>junit-jupiter</artifactId>
//            <version>RELEASE</version>
//            <scope>compile</scope>
//        </dependency>
}
