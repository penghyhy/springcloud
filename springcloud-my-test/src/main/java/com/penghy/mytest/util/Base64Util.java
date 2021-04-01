package com.penghy.mytest.util;

import com.eimageglobal.rsa.util.RSAUtils;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

public class Base64Util {
    final static Base64.Encoder encoder = Base64.getEncoder();
    final static Base64.Decoder decoder = Base64.getDecoder();

    /**
     * 给字符串加密
     *
     * @param text
     * @return
     */
    public static String encode(String text) {
        byte[] textByte = new byte[0];
        try {
            textByte = text.getBytes("gbk");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String encodedText = encoder.encodeToString(textByte);
        return encodedText;
    }

    public static Map<String, Object> encodeMap(Map<String, Object> params) {
        params.forEach((k, v) -> params.put(k, encode(v.toString())));
        return params;
    }

    public static Map<String, Object> decodeMap(Map<String, Object> params) {
        params.forEach((k, v) -> params.put(k, decode(v.toString())));
        return params;
    }

    /**
     * 将加密后的字符串进行解密
     *
     * @param encodedText
     * @return
     */
    public static String decode(String encodedText) {
        String text = null;
        try {
            text = new String(decoder.decode(encodedText), "GBK");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return text;
    }

    public static void main(String[] args) throws UnsupportedEncodingException {


        String a = "[{ob7SvbGjvdO/2szhyr6hvzq3vbeow/s6Y2xpbmljUmVnaXN0ZXJBcmd1bWVudDQ6SElTw8XV77rFsrvE3M6qv9U6bnVsbDsKt723qMP7OmNsaW5pY1JlZ2lzdGVyQXJndW1lbnQxMjq+zdXvv8bK0rHgwuuyu8Tczqq/1TpudWxsOwq3vbeow/s6Y2xp... (574 bytes)]";

        System.out.println(a.substring(0, a.length() - 1) + "}]");
        String aaa = "(?:\\[|\\])";
        a.replace("\\[", ",");
        System.out.println(a);
        String username = "曾平龙";
        String password = "22222";
        Map<String, Object> params = new HashMap<>();
        params.put("aaa", "52223019741117043X");
        encryptByPublickey(params);
        params.put("bbb", "2020");
        params.put("ccc", "");

        // 加密
        System.out.println("====  [加密后] 用户名/密码  =====");
        System.out.println(Base64Util.encodeMap(params));
        System.out.println(Base64Util.encode(username));
        System.out.println(Base64Util.encode(password));

        String aa = "NTIyMjI5MTkyNzA1MTgwNDI0";
        System.out.println(aa);


        // 解密
        System.out.println("\n====  [解密后] 用户名/密码  =====");


        System.out.println(Base64Util.decode("ob7SvbGjvdO/2szhyr6hvzpuZXN0ZWQgZXhjZXB0aW9uIGlzIG9yZy5hcGFjaGUuaWJhdGlzLmV4Y2VwdGlvbnMuUGVyc2lzdGVuY2VFeGNlcHRpb246IAojIyMgRXJyb3IgcXVlcnlpbmcgZGF0YWJhc2UuICBDYXVzZTogb3JnLnNwcmluZ2ZyYW1ld29yay5qZGJjLkNhbm5vdEdldEpkYmNDb25uZWN0aW9uRXhjZXB0aW9uOiBDb3VsZCBub3QgZ2V0IEpEQkMgQ29ubmVjdGlvbjsgbmVzdGVkIGV4Y2VwdGlvbiBpcyBjb20uYWxpYmFiYS5kcnVpZC5wb29sLkdldENvbm5lY3Rpb25UaW1lb3V0RXhjZXB0aW9uOiB3YWl0IG1pbGxpcyA2MDAwMCwgYWN0aXZlIDIsIG1heEFjdGl2ZSA0MAojIyMgVGhlIGVycm9yIG1heSBleGlzdCBpbiBmaWxlIFsvaG9tZS9kYXRhL2FwcC9hZ2VudC9XRUItSU5GL2NsYXNzZXMvYWdlbnRzcWxtYXAvYmFpc2VpbmZvL0FnZW50SW5zTWFwcGVyLnhtbF0KIyMjIFRoZSBlcnJvciBtYXkgaW52b2x2ZSBuZXQuanFzb2Z0Lm5jbXNhcGkuYWdlbnQuZGF0YXNvdXJjZS5iYXNlaW5mby5kYW8uQWdlbnRJbnNEYW8uZ2V0SW5zR2JDb2RlCiMjIyBUaGUgZXJyb3Igb2NjdXJyZWQgd2hpbGUgZXhlY3V0aW5nIGEgcXVlcnkKIyMjIENhdXNlOiBvcmcuc3ByaW5nZnJhbWV3b3JrLmpkYmMuQ2Fubm90R2V0SmRiY0Nvbm5lY3Rpb25FeGNlcHRpb246IENvdWxkIG5vdCBnZXQgSkRCQyBDb25uZWN0aW9uOyBuZXN0ZWQgZXhjZXB0aW9uIGlzIGNvbS5hbGliYWJhLmRydWlkLnBvb2wuR2V0Q29ubmVjdGlvblRpbWVvdXRFeGNlcHRpb246IHdhaXQgbWlsbGlzIDYwMDAwLCBhY3RpdmUgMiwgbWF4QWN0aXZlIDQw"));
        // {code=1101, accountType=, name=一般门诊, otherParam=, comment=, isRedemImmediate=1}
        // {code=111, accountType=, name=门诊二次, otherParam=, comment=, isRedemImmediate=1}
        // {code=1201, accountType=, name=常见慢性病门诊, otherParam=, comment=, isRedemImmediate=1}
        // {code=1201, accountType=, name=常见慢性病门诊, otherParam=, comment=, isRedemImmediate=1}
        // {code=1203, accountType=, name=省定重大疾病单病种付费门诊, otherParam=, comment=, isRedemImmediate=1}
        // {code=1204, accountType=, name=门诊按病种付费, otherParam=, comment=, isRedemImmediate=1}
        // {code=1205, accountType=, name=狂犬疫苗门诊, otherParam=, comment=, isRedemImmediate=1}
        // {code=1206, accountType=, name=特殊病种门诊, otherParam=, comment=, isRedemImmediate=1}
        // {code=1207, accountType=, name=特药补偿, otherParam=, comment=, isRedemImmediate=1}
        // {code=1213, accountType=, name=门诊两病, otherParam=, comment=, isRedemImmediate=1}
        // {code=2101, accountType=, name=普通住院, otherParam=, comment=, isRedemImmediate=1}
        // {code=2102, accountType=, name=省定重大疾病单病种付费住院, otherParam=, comment=, isRedemImmediate=1}

        Map<String, Object> maps = new HashMap<>();
        maps.put("拉取SQL", "Q0wwMDAwMDA0");
        maps.put("name", "yqG2qNbYtPO8srKhtaWyodbWuLa30deh1Lo=");
        maps.put("otherParam", "");
        maps.put("comment", "");
        maps.put("accountType", "");
        maps.put("isRedemImmediate", "MQ==");


        System.out.println(Base64Util.decodeMap(maps));
        System.out.println(Base64Util.decode("ob7SvbGjvdO/2szhyr6hvzq3vbeow/s6Z2V0Q2xpbmljSW5mb0FyZ3VtZW50MzqyubOlxOq33bK7xNzOqr/VOm51bGw7Cre9t6jD+zpnZXRDbGluaWNJbmZvQXJndW1lbnQ1Or7N1e+/qLrFsrvE3M6qv9U6bnVsbDsK"));
        Base64.getDecoder().decode("1PjGvcH6");
//        System.out.println(Base64Util.decode("1PjGvcH6"));
//        System.out.println(URLDecoder.decode(new String(Base64Util.decode("1PjGvcH6").getBytes("iso8859-1"), "utf-8"),"utf-8"));
//        System.out.println(new String(Base64Util.decode("1PjGvcH6").getBytes("iso8859-1"), "GBK"));
//        System.out.println(new String(Base64Util.decode("1PjGvcH6").getBytes("iso8859-1"), "utf-8"));
//        System.out.println(Base64Util.decode(Base64Util.encode(password)));
    }


    public static String encryptByPublickey(Map<String, Object> params) {
//        String hospitalId = params.get("hospitalId").toString();
//        String time = params.get("time").toString();
//        String patientId = params.get("patientId").toString();
//        String accessNumber = params.get("accessNumber").toString();

        String data = "复方氨基酸（18AA）复方氨基酸（18AA-Ⅰ）复方氨基酸（18AA-Ⅱ）复方氨基酸（18AA-Ⅲ）";
        System.out.println(data.getBytes().length);

        try {
            String data1 = "hospitalId=08780006&time=2020-11-09 12:45:42&patientId=2011090195&accessNumber=DX202011090778";
            String key = RSAUtils.encryptByPublicKey(data1, "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC1Rf9O2S4dbJ9rPWiSGJC5AjbqzeQpWccFc5uFqyndI70OZl/OLdxJJh9f1LrhNO78vpuguD+bFLzIbKuxLnEKxgXMxYO42F+Pa2\n" +
                    "B0a5k3LY4ZDgNaH+h6rWtMrz49pMiICKO/JCEzJTfZWbTgUM+ksk/nvvTJAuF5dGCnfg8tSQIDAQAB");
            System.out.println(key);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "";
    }
}
