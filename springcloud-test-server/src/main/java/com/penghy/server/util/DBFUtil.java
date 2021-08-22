package com.penghy.server.util;

import com.linuxense.javadbf.DBFReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.*;
import java.util.concurrent.TimeUnit;

@Component
public class DBFUtil {
    public static String getFirstPinYinHeadChar(String str) {
        return "";
    }

    /**
     * 读dbf记录
     *
     * @param path
     * @return
     * @throws IOException
     */
    public static List<Map<String, String>> readDbf(String path, String charsetName) throws IOException {
        List<Map<String, String>> rowList = new ArrayList<>();
//		InputStream fis = new FileInputStream(path);
        DBFReader dbfReader = new DBFReader(new FileInputStream(path), Charset.forName(charsetName));
        Object[] rowValues;
        while ((rowValues = dbfReader.nextRecord()) != null) {
            Map<String, String> rowMap = new HashMap<String, String>();
            for (int i = 0; i < rowValues.length; i++) {
                rowMap.put(dbfReader.getField(i).getName(), String.valueOf(rowValues[i]).trim());
            }
//			System.out.println(rowMap);
            rowList.add(rowMap);
        }
        dbfReader.close();
//		fis.close();
        return rowList;
    }

    /**
     * 获取字段名
     *
     * @param path
     * @param charsetName
     * @return
     * @throws IOException
     */
    public static String[] getFieldName(String path, String charsetName) throws IOException {
//		InputStream fis = new FileInputStream(path);
        DBFReader dbfReader = new DBFReader(new FileInputStream(path), Charset.forName(charsetName));
        int fieldCount = dbfReader.getFieldCount();//获取字段数量
        String[] fieldName = new String[fieldCount];
        for (int i = 0; i < fieldCount; i++) {
            fieldName[i] = dbfReader.getField(i).getName();
        }
        dbfReader.close();
//		fis.close();
        return fieldName;
    }

    public static void main(String[] args) {
        try {
//            DbfWriterAndReadUtil.createDbf("b.dbf", fieldList, "GBK");
//            DbfWriterAndReadUtil.writeDbf("b.dbf", rowList, "GBK");
            String[] fieldName = DBFUtil.getFieldName("D:\\wowjoy\\sis_wowjoyservice\\wowjoy_zzsy\\TLYB\\outdata\\YPML2021.dbf", "GBK");
            for (int i = 0; i < fieldName.length; i++) {
                System.out.println(fieldName[i]);
            }

            List<Map<String, String>> getRowList = DBFUtil.readDbf("D:\\wowjoy\\sis_wowjoyservice\\wowjoy_zzsy\\TLYB\\outdata\\YPML2021.dbf", "GBK");
            for (Map<String, String> entity : getRowList) {
                System.out.println(entity);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
