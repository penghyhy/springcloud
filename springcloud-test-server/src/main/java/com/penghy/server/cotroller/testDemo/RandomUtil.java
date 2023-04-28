package com.penghy.server.cotroller.testDemo;
/**
 * Created by Administrator on 2022/1/27 0027
 */

import com.google.common.collect.Maps;
import com.penghy.server.bean.Person;

import java.security.SecureRandom;
import java.util.Map;
import java.util.Random;
public class RandomUtil {
    private static final String SYMBOLS = "0123456789ABCDEFGHJKLMNOPQRSTUVWXYZ"; // 数字和26个字母组成
    private static final Random RANDOM = new SecureRandom();
    public static void main(String[] args) {

        String aa = "[]";
        System.out.println(aa.replace("[]",""));
//|0|1|2|3|4| |||||
//|0|1|2|3|4|5|||||
//|0|1|2|3|4| ||||  +"|"
        int disease = 9;
        int k= 6;
        String j= "";
        for (int n = 0;n<disease;n++) {
            if (n<k) {

                j= j+"|"+n;
            } else {
                j=j+"|";
            }
        }
        System.out.println(j);

        Person person = new Person();
        person.setId(1);
        person.setName("1111");
        getRandomNumber(person);
        System.out.println(person.getInsure_settle_info());


        String out = "1|2|3|4|5|6|7Z|8|";
        Map<String,Object> map1 = Maps.newHashMap();
        Map<String,Object> map2 = Maps.newHashMap();
        Map<String,Object> map3 = Maps.newHashMap();
        Map<String,Object> map4 = Maps.newHashMap();
        Map<String,Object> map5 = Maps.newHashMap();
        System.out.println(out.substring(out.indexOf("|")+1,out.length()));

        map1.put("aaa","111");

    }

    /**
     * 获取长度为 4 的随机字母+数字
     * @return 随机数字
     */
    public static String getRandomNumber(Person person) {
        char[] nonceChars = new char[4];  //指定长度为6位/自己可以要求设置

        for (int index = 0; index < nonceChars.length; ++index) {
            nonceChars[index] = SYMBOLS.charAt(RANDOM.nextInt(SYMBOLS.length()));
        }
        person.setInsure_settle_info(new String(nonceChars));
        return new String(nonceChars);
    }

}
