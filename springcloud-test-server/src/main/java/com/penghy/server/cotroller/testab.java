package com.penghy.server.cotroller;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ctc.wstx.util.StringUtil;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.penghy.server.bean.Disease;
import com.penghy.server.bean.DrugDict;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.*;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class testab {
    public static byte[] File2byte(File tradeFile) {
        byte[] buffer = null;
        try {
            FileInputStream fis = new FileInputStream(tradeFile);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] b = new byte[1024];
            int n;
            while ((n = fis.read(b)) != -1) {
                bos.write(b, 0, n);
            }
            fis.close();
            bos.close();
            buffer = bos.toByteArray();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return buffer;
    }

    public static void main(String[] args) throws Exception {

       int cue = 100>>3;
       int cue1 = 8>>3;
       int cue2 = 2<<4;
       int cue3 = 5<<4;

        System.out.println(cue);
        System.out.println(cue1);
        System.out.println(cue2);
        System.out.println(cue3);
        System.out.println();


        String test1 = "[{\"fund_pay_type\":\"310100\",\"fund_payamt\":10103.92,\"setl_proc_info\":\"[{\\\"hifpPayInscp\\\":12028.48,\\\"polItemCode\\\":\\\"C001\\\",\\\"poolPropSelfpay\\\":0.84,\\\"hifpPay\\\":10103.92}]\",\"crt_payb_lmt_amt\":0,\"inscp_scp_amt\":0,\"fund_pay_type_name\":\"城镇职工基本医疗保险统筹基金\"},{\"fund_pay_type\":\"620100\",\"fund_payamt\":844.62,\"setl_proc_info\":\"[]\",\"crt_payb_lmt_amt\":0,\"inscp_scp_amt\":0,\"fund_pay_type_name\":\"商业保险责任二支出\"}]";
        JSONArray jsonObjec111t = JSONArray.parseArray(test1);
        for (Object a : jsonObjec111t){
            JSONObject x = (JSONObject) a;
            String ttt = MapUtils.getString(x,"fund_pay_type");
            System.out.println(ttt);
        }

        List<Map<String,Object>> aa = Lists.newArrayList();
        Map<String,Object> aa1 = Maps.newHashMap();
        Map<String,Object> aa2 = Maps.newHashMap();
        Map<String,Object> aa3 = Maps.newHashMap();
        Map<String,Object> aa4 = Maps.newHashMap();
        aa1.put("cum_type_code","111");
        aa1.put("cum","1");
        aa2.put("cum_type_code","12");
        aa2.put("cum","2");
        aa3.put("cum_type_code","111");
        aa3.put("cum","4");
        aa4.put("cum_type_code","111");
        aa4.put("cum","5");
        aa.add(aa1);
        aa.add(aa2);
        aa.add(aa3);
        aa.add(aa4);

        Map<String, BigDecimal> collect2= aa.stream().collect(Collectors.groupingBy(x->x.get("cum_type_code").toString(),
                Collectors.reducing(BigDecimal.ZERO,
                        t->new BigDecimal(t.get("cum").toString()), BigDecimal::add)));

        System.out.println(collect2);


//
//        List<Map<String,Object>> mapList = Lists.newArrayList();
//        aa.stream().collect(Collectors.groupingBy(r-> r.get("cum_type_code"))).forEach((code, list) -> {
//            Map<String,Object> bb = Maps.newHashMap();
//            list.stream().forEach(r -> {
//                if (bb.isEmpty()) {
//                    bb.putAll(r);
//                } else {
//                    bb.put("cum", new BigDecimal(bb.get("cum").toString()).add(new BigDecimal(r.get("cum").toString())));
//                }
//            });
//            mapList.add(bb);
//        });
//
//        System.out.println(mapList);




        Disease disease = new Disease();
        String aadfdg = "|||{{{";
        if (!"{".equals(aadfdg.substring(0, 1))) {
            System.out.println("true");
        }

        BigDecimal acccc = BigDecimal.ZERO.setScale(2);
        BigDecimal bcccc = BigDecimal.ZERO;
        String jsonmap = "{orgName=, prescriptionInfos=[{hisPrescriptionInfo={unusualFlag=0, settleFlag=0, personMediaNo=30005201, inpatientTime=2022-05-16 17:24:23, personSex=2, prescripMainId=1000011958, cashTime=2022-05-30 14:26:00, patiDiseaseList=[{diseaseName=乳腺恶性肿瘤，外侧, diagNo=1, diseDate=2022-05-16 17:24:00, diagType=2, diseaseType=1, diseaseId=3211}, {diseaseName=化疗后骨髓抑制, diagNo=2, diseDate=2022-05-16 17:31:00, diagType=2, diseaseType=1, diseaseId=6278}], orgType=, settleRecordId=30005201, medMdtrtType=2, currMdtrtId=1000011958, birthdateTime=1984-07-19, bedno=36, drCodg=d7dde840052cbd5c22081e501ca58ecb, acctPayamt=0, lactationFlag=0, inpatiArea=null, dscgDeptName=甲状腺乳腺外科(北), personInsureName=李娟, admDeptCodg=f720e5c742e0cb5b99d016cf42709e23, wardno=83c4b36a5b934284bd23e999c6167626, registerTime=2022-05-16 17:24:23, hifpPayamt=0, gestationFlag=0, hospitalTypeFlag=1, dscgDeptCodg=f720e5c742e0cb5b99d016cf42709e23, totalAmount=934.00, insureType=, ownpayAmt=259.0, maAmt=0, admDeptName=甲状腺乳腺外科(北), settleType=, outTime=}, fsiOperationDtos=[{mainOprnFlag=1, setlListOprnId=f44a8f131a247c3c48e97598b1803437, oprnDate=2022-05-26, oprnCode=86.0500x008, operDrCode=d7dde840052cbd5c22081e501ca58ecb, anstDrCode=d7dde840052cbd5c22081e501ca58ecb, anstWay=2, operDrName=郑帅, anstDrName=郑帅, oprnName=皮下植入装置取出术}], hisChargeDetailInfo=[{itemSpec=, deptName=甲状腺乳腺外科(北), itemType=5, physicianLevel=11, grpno=, itemUnit=次, chargeType=D01, itemDate=2022-05-30, drordBhvr=, physicianAp=, doctorName=郑帅, itemName=适型调强放射治疗（IMRT）, longDrordFlag=0, drordBegnDate=, drugFactoryID=0, doctorId=d7dde840052cbd5c22081e501ca58ecb, itemAmount=934, bigFactoryId=, itemOnceDose=, itemAmt=934, currDrordFlag=, hosplistName=, lv3HospItemPric=0, herbalTposts=0, lv2HospItemPric=0, deptId=f720e5c742e0cb5b99d016\n" +
                "cf42709e23, useDrugRateId=, selfpayAmt=934, lv1HospItemPric=0, itemCount=1, drordStopDate=, itemId=240300015, rxno=, hosplistDosform=, rxId=, ownpayAmt=0, chargeId=240300015, doctorCode=0755, itemUseDays=, itemPrice=934, bigSpecId=, hosplistCode=}]}], userName=管理员, userId=A5346FD8BB604B29840FF7514345C1AD, userCode=6666, userDeptName=测试科室, inParam={personInusreCardno=, tradeTime=2022-05-30 16:05:15, cashId=30005201, preChargeCount=1, personIdCardno=410526198407199087, preChargeAmount=934.00, insureCardInfo=, auditType=}, userDeptId=e740d7e296764da884288ca94a50f27f, patiStyleId=418, orgCode=1001, patiTypeCode=418, userStaffId=0dd7a61a879911ea82f0faeb6962fcae, busySystemClass=3, operateWinip=null, funcType=2, orgStaffId=}";
        jsonmap = jsonmap.replaceAll(" ", "");
        jsonmap = jsonmap.replaceAll("\\{", "{\"");
        jsonmap = jsonmap.replaceAll("\\{", "{\"");
        jsonmap = jsonmap.replaceAll("=", "\":\"");
        jsonmap = jsonmap.replaceAll(",", "\",\"");
        jsonmap = jsonmap.replaceAll("}", "\"}");
        jsonmap = jsonmap.replaceAll("}\"", "}");
        jsonmap = jsonmap.replaceAll("\"\\{", "{");
        jsonmap = jsonmap.replaceAll("\"\\[\\{\"", "\\[\\{");
        jsonmap = jsonmap.replaceAll("\\{\"\"", "{\"");
        jsonmap = jsonmap.replaceAll("}]\"}", "}]}");

        JSONObject jsonObject = JSONObject.parseObject(jsonmap);
//        String rowlist = MapUtils.getString(jsonObject, "sqldata");
//        List<Map<String, Object>> resultList = Lists.newArrayList();
//
//        if (StringUtils.isNotBlank(rowlist)) {
//            JSONObject jsonObject1 = JSONObject.parseObject(rowlist);
//            try {
//                resultList = (List<Map<String, Object>>) jsonObject1.get("row");
//            } catch (Exception e) {
//                resultList.add((Map<String, Object>) jsonObject1.get("row"));
//            }
//        }

        System.out.println(jsonObject);


        // 单位编号
        String prm_aab001 = MapUtils.getString(jsonObject, "prm_aab001");
        // 单位名称
        String prm_aab004 = MapUtils.getString(jsonObject, "prm_aab004");
        // 个人编号
        String prm_aac001 = MapUtils.getString(jsonObject, "prm_aac001");
        // 公民身份号码
        String prm_aac002 = MapUtils.getString(jsonObject, "prm_aac002");
        // 姓名
        String prm_aac003 = MapUtils.getString(jsonObject, "prm_aac003");
        // 性别
        String prm_aac004 = MapUtils.getString(jsonObject, "prm_aac004");
        // 出生日期
        String prm_aac006 = MapUtils.getString(jsonObject, "prm_aac006");
        // 行政职务
        String prm_aac020 = MapUtils.getString(jsonObject, "prm_aac020");
        //  个人参保状态
        String prm_aac031 = MapUtils.getString(jsonObject, "prm_aac031");
        // 电话
        String prm_aae005 = MapUtils.getString(jsonObject, "prm_aae005");
        // 地址
        String prm_aae006 = MapUtils.getString(jsonObject, "prm_aae006");
        // 医疗人员类别
        String prm_akc021 = MapUtils.getString(jsonObject, "prm_akc021");
        // 实足年龄
        String prm_akc023 = MapUtils.getString(jsonObject, "prm_akc023");
        // 个人账户余额
        String prm_akc087 = MapUtils.getString(jsonObject, "prm_akc087");
        // 02-电子社保卡（医保付款码）；03-医保电子凭证;医保电子凭证及电子社保卡时不为空
        String prm_qrcodetype = MapUtils.getString(jsonObject, "prm_qrcodetype");
        // 特殊病标识  限遵义统筹区：1 为 已申报慢特病，0 为 未申报慢特病
        String prm_symbol = MapUtils.getString(jsonObject, "prm_symbol");
        // 分中心编号
        String prm_yab003 = MapUtils.getString(jsonObject, "prm_yab003");
        // 参保所属分中心
        String prm_yab139 = MapUtils.getString(jsonObject, "prm_yab139");
        // 卡号
        String prm_yac005 = MapUtils.getString(jsonObject, "prm_yac005");
        // 二维码
        String prm_yae921 = MapUtils.getString(jsonObject, "prm_yae921");
        // 居民门诊统筹限额已累计金额
        String prm_yka128 = MapUtils.getString(jsonObject, "prm_yka128");
        // 执行社会保险办法
        String prm_ykb065 = MapUtils.getString(jsonObject, "prm_ykb065");
        // 特殊疾病信息
        String prm_ykc010 = MapUtils.getString(jsonObject, "prm_ykc010");
//        JSONObject jsonObject1 = JSONObject.parseObject(prm_ykc010);
//        List<Map<String,Object>> specialList = (List<Map<String,Object>>)jsonObject1.get("row");
//        //开始时间
//        String aae030 =  MapUtils.getString(jsonObject,"aae030");
//        // 结束时间
//        String aae031 =  MapUtils.getString(jsonObject,"aae031");
//        // 医院编码
//        String akb020 =  MapUtils.getString(jsonObject,"akb020");
//        // 分中心
//        String yab003 =  MapUtils.getString(jsonObject,"yab003");
//        // 疾病编码
//        String yka026 =  MapUtils.getString(jsonObject,"yka026");
//        // 病种名称
//        String yka027 =  MapUtils.getString(jsonObject,"yka027");
//        //补助标准
//        String yka068 =  MapUtils.getString(jsonObject,"yka068");
//        // 拼音助记码
//        String yka260 =  MapUtils.getString(jsonObject,"yka260");
//        // 病种标志编码
//        String ykd111 =  MapUtils.getString(jsonObject,"ykd111");
//        // 病种标志名称
//        String ykd112 =  MapUtils.getString(jsonObject,"ykd112");

        // 住院状态
        String prm_ykc023 = MapUtils.getString(jsonObject, "prm_ykc023");
        // 是否待遇等待 期
        String prm_ykc101 = MapUtils.getString(jsonObject, "prm_ykc101");
        // 公务员级别
        String prm_ykc120 = MapUtils.getString(jsonObject, "prm_ykc120");
        // 异地安置标志
        String prm_ykc150 = MapUtils.getString(jsonObject, "prm_ykc150");
        // 居 民医 疗 人 员 类别
        String prm_ykc280 = MapUtils.getString(jsonObject, "prm_ykc280");
        // 居 民医 疗 人 员 身份
        String prm_ykc281 = MapUtils.getString(jsonObject, "prm_ykc281");
        // 人员类别
        String prm_ykc296 = MapUtils.getString(jsonObject, "prm_ykc296");
        // 业务类型
        String prm_ykc305 = MapUtils.getString(jsonObject, "prm_ykc305");


        try {
            File filePath = new File("D:\\wowjoy\\医保接口文档\\衢州医保\\衢州新医保\\衢州人员备案.rar");
            byte[] bytes = File2byte(filePath);
            System.out.println(bytes);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        String a1108 = "35455.7|0.00|10316.06|3189.63|0.00|0.00|21950.01|9362.01|1250.22|1211.36|0|0|3000.00|20632.11|0|0|0|0|23632.11|3000.00|1|0|0|0|0|";


        FileInputStream af = new FileInputStream("");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("d:/a.txt"); // 内容是：abc
            StringBuilder sb = new StringBuilder();
            int temp = 0;
            //当temp等于-1时，表示已经到了文件结尾，停止读取
            while ((temp = fis.read()) != -1) {
                sb.append((char) temp);
            }
            System.out.println(sb);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                //这种写法，保证了即使遇到异常情况，也会关闭流对象。
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println(a1108.split("\\|", -1).length);

        String acccccc = "000011111111";
        acccccc = acccccc.substring(acccccc.length() - 4, acccccc.length());


        String ea = "1 |1|A|1.0|2|B|2.0|3|C|3.0|4|";
        ea = ea.substring(ea.indexOf("|") + 1, ea.length());
        String dfadf[] = ea.split("\\|", -1);
        int c = ea.split("\\|", -1).length % 3;
        int ccc = ea.split("\\|", -1).length / 3;
        List<Map<String, Object>> malist = new ArrayList<>();
        for (int i = 0; i < ccc; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("aa", dfadf[i * 3]);
            map.put("aab", dfadf[i * 3 + 1]);
            map.put("aac", dfadf[i * 3 + 2]);
            malist.add(map);
        }
        System.out.println(JSONArray.toJSON(malist).toString());
        try {
            try {
                int i = 1 / 0;
            } catch (Exception e) {
                throw new Exception(e.getMessage() + "aaa");
            }
        } catch (Exception e) {
            System.out.println(e);

            throw new Exception(e + "," + e.getStackTrace()[0].getMethodName() + "," + e.getStackTrace()[0].getLineNumber() + "," + e.getMessage() + "bbbb");
        }

        String ta = "111111";
        String[] ccd = ta.split("/");

        BigDecimal aaaaaaa = new BigDecimal("-100");
        BigDecimal aac = new BigDecimal("1").multiply(aaaaaaa.abs());

        Testdelete t = new Testdelete();

        Map<String, Object> transInfo = new HashMap<>();
        Map<String, Object> inputdata = new HashMap<>();
        Map<String, Object> initdata = new HashMap<>();

        initdata.put("i", "i");
        initdata.put("ii", "ii");
        initdata.put("iii", "iii");
        initdata.put("iiii", "iiii");
        initdata.put("iiiii", "iiiii");
        System.out.println(JSONArray.toJSON(initdata).toString());

        inputdata.put("data", initdata);
        System.out.println(JSONArray.toJSON(inputdata).toString());


        transInfo.put("inpudata", inputdata);
        System.out.println(JSONArray.toJSON(transInfo).toString());
        System.out.println(JSONArray.toJSON(transInfo.get("inpudata")).toString());


        List<Map<String, Object>> lists = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("i", i);
            map.put("ii", i + "i");
            lists.add(map);
        }
        lists.forEach(m -> {
            m.put("iii", m.get("i"));
            m.put("iiii", m.get("ii"));
        });

        System.out.println(lists);

        try {
            Integer a = Integer.valueOf("");

        } catch (Exception e) {


        }

        String buffer = "1|1.1|1.2|1.3|1.4|1.5|1.6|$2|2.1|2.2|2.3|2.4|2.5|2.6|$3|3.1|3.2|3.3|3.4|3.5|3.6|$";
        String[] buff = buffer.split("\\$", -1);
        List<Map<String, Object>> returnList = new ArrayList<>();
        String chargeStr = "";
        for (int i = 0; i < buff.length; i++) {
            Map<String, Object> map = new HashMap<>();
            chargeStr = buff[i];
            if (StringUtils.isBlank(chargeStr) || "$".equals(chargeStr)) {
                break;
            }
            String[] charg = chargeStr.split("\\|", -1);
            map.put("field0", charg[0]);
            map.put("field1", charg[1]);
            map.put("field2", charg[2]);
            map.put("field3", charg[3]);
            map.put("field4", charg[4]);
            map.put("field5", charg[5]);
            returnList.add(map);
        }

        List<Map<String, Object>> list2 = new ArrayList<>();
        Map<String, Object> map2 = new HashMap<>();
        map2.put("field1", "1");
        map2.put("field22", "1.11");
        map2.put("field23", "1.21");
        Map<String, Object> map3 = new HashMap<>();
        map3.put("field1", "2");
        map3.put("field22", "2.11");
        map3.put("field23", "2.21");
        Map<String, Object> map4 = new HashMap<>();
        map4.put("field1", "3");
        map4.put("field22", "3.11");
        map4.put("field23", "3.21");
        Map<String, Object> map5 = new HashMap<>();
        map5.put("field1", "4");
        map5.put("field22", "4.11");
        map5.put("field23", "4.21");
        list2.add(map2);
        list2.add(map3);
        list2.add(map4);
        list2.add(map5);


//        List<Map<String,Object>> returnList2 = returnList.stream().map(map->list2.stream().filter(m-> Objects.equals(m.get("field0"),map.get("field21"))).
//                findFirst().map( m->{
//                    map.putAll(m);
//                    return map;
//                }).orElse(null)).filter(Objects::nonNull).collect(Collectors.toList());


        List<Map<String, Object>> resultList2 = list2.stream().map(m -> {
            m.put("grade", 0);
            returnList.stream().filter(m2 -> Objects.equals(m.get("field1"), m2.get("field0"))).forEach(s -> m.putAll(s));
            return m;
        }).collect(Collectors.toList());
        resultList2.stream().forEach(s -> System.out.println(s));

        System.out.println(resultList2);

        String cc = "111##22";
        if (!cc.contains("##")) {
            System.out.println(1);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            System.out.println("你好");
            System.out.println(i);
            System.out.println("你好2");
        }

        String ac = "ACCCC";
        String a1 = (ac + "0000000000").substring(0, 10);
//        String a1 = "";
        String aaa = a1.split("~", -1)[1].split("\\|", -1)[4];


        a1 = a1.substring(0, a1.indexOf("."));

        String aaav = a1.split("\\|", -1)[1];

        BigDecimal amout = new BigDecimal("14.63");
        BigDecimal price = new BigDecimal("102.42");

        BigDecimal dd = amout.divide(price, 10, BigDecimal.ROUND_CEILING).setScale(4, BigDecimal.ROUND_HALF_UP);


        long start = System.currentTimeMillis();
        List<DrugDict> drugDictList = new ArrayList<>();
        ImportParams importParams = new ImportParams();
        importParams.setSheetNum(1);
        File file1 = new File("C:\\Users\\13735\\Desktop\\郑州市第三人民医院出差发票\\工作簿1.xlsx");
        drugDictList = ExcelImportUtil.importExcel(file1, DrugDict.class, importParams);
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(drugDictList);
        String s = new String("NCLGD20190035a\t(新)喷剂敷料\t1989-12-31\t99\t3\tpjfl\tkygo\t\t消护舒缓型：3g、5g、10g、15g、20g、30g、50\t\t1\t粤中械备20190035号\t通常为溶液或软膏（不包括凝胶）。所含成分不具有药理学作用。所含成分不可被人体吸收。非无菌提供。通过在创面表面形成保护层，起物理屏障作用。用于小创口、擦伤、切割伤等浅表性创面及周围皮肤的护理。\t\t\t\t1\t\tC1701022160400012087\t200\t中山市粤美医疗生物科技有限公司\t1\t\t粤中械备20190035号\t\t\t1\t1\t\t\t1\t\t2\t1\t\t1\t0\t1\t0\t\t0\t0\t30530983\t2020-7-22\t\t\t\n");
//        String aa = "NCLJ20152142328\t(新)疤痕硅凝胶\t1989-12-31\t99\t03\tbhgnj\tuudue\t\t15ml\t\t1\t国械注进20152142328\t\"疤痕硅凝胶\t15ml\t530.00\t国械注进20152142328\t2025.07.14\t奇克勒斯特有限公司\t本产品是一种处理疤痕的外用硅凝胶。本产品成分为二甲聚硅氧烷（64%）、聚硅氧化合物（15%）、鲸蜡硬质基聚二甲基硅氧烷交联聚合物（18%）和环己硅氧烷（3%）。\t该产品与其他标准疤痕治疗方法配合使用，适用于辅助改善皮肤上的小面积部位或手术缝合伤口愈合后留下的线状疤痕，不用于未愈合的伤口。该产品与其他标准疤痕治疗方法配合使用，适用于辅助改善皮肤上的小面积部位或手术缝合伤口愈合后留下的线状疤痕，不用于未愈合的伤口。\"\t\t\t\t1\t\tC1702012160100000572\t530\t奇克勒斯特有限公司\t1\t\t国械注进20152142328\t\t\t1\t1\t\t\t1\t\t02\t1\t\t2\t0\t1\t0\t\t0\t0\t30531131\t2020-09-08\t\t\t";
////        String aa = "NCLZ20193021948	(新)a-氰基丙烯酸脂快速医用胶	1989-12-31	99	03	a-qjbxszksyyj	a-ragosengaee		医用创面封闭型、医用EC型、医用吻合型、医用ZT型、医用癌浆		1	国械注准20193021948	a-氰基丙烯酸脂快速医用胶以a-氰基丙烯酸正辛脂（508）为主体胶，添加聚甲基丙烯酸甲酯（PMMA)而成用于手术接口接近皮肤表面边缘的封闭，包括微创介入手术穿刺的封闭，完全清创后创口的封闭，不可用于皮肤亚表层的闭合；在其他地方无效的情况下，可用于体内直视下或腔镜下清创后创面喷涂，对器官、组织创面渗血的封闭_止血。				1		C1408051860000000543	1000	广州高新技术产业开发区科学城金峰园路2号	1		国械注准20193021948			1	1			1		02	1		1	0	1	0		0	0	30531130	2020-09-23";
//        String bbb[] = aa.split("\t", -1);
////        String str = "this is \"Tom\" and \"Eric\"， this is \"Bruce lee\", he is a chinese, name is \"李小龙\"。";
//
//        Pattern p1 = Pattern.compile("\"(.*?)\"");
//
//        Matcher m = p1.matcher(aa);
//        StringBuilder stringBuilder = new StringBuilder();
//
//        ArrayList<String> list = new ArrayList<String>();
//        while (m.find()) {
//            list.add(m.group().trim().replace("\"", "") + " ");
//// stringBuilder.append(m.group().trim().replace("\"","")+" ");
//        }
//// System.out.println(stringBuilder.toString());
//        System.out.println(list.toString().replaceAll("\t",""));

    }
//
//       aa = aa.replaceAll("\\|\\.","\\|0\\.");
//       if (".".equals(aa.substring(0,1))) {
//           aa = "0"+aa;
//       }
//        System.out.println(aa);
//        a aa = new b();
//        aa.aa();
//        aa.aa2();
//        b bb = (b) aa;
//        bb.bb();
//        bb.bb2();
//        bb.aa();
//        bb.aa2();


    private void settleInfo(Map<String, Object> jsonObject) {
        String JGCDJE = MapUtils.getString(jsonObject, "JGCDJE");
        String SFFYHJ = MapUtils.getString(jsonObject, "SFFYHJ");
        String businesssequence = MapUtils.getString(jsonObject, "businesssequence");
        String businessvalidate = MapUtils.getString(jsonObject, "businessvalidate");
        String hisAmount = MapUtils.getString(jsonObject, "hisAmount");
        // 医院承担
        String hosp_part_amt = MapUtils.getString(jsonObject, "hosp_part_amt");
        // 单位编号
        String prm_aab001 = MapUtils.getString(jsonObject, "prm_aab001");
        // 单位名称
        String prm_aab004 = MapUtils.getString(jsonObject, "prm_aab004");
        // 个人编号
        String prm_aac001 = MapUtils.getString(jsonObject, "prm_aac001");
        // 公民身份号码
        String prm_aac002 = MapUtils.getString(jsonObject, "prm_aac002");
        // 姓名
        String prm_aac003 = MapUtils.getString(jsonObject, "prm_aac003");
        // 性别
        String prm_aac004 = MapUtils.getString(jsonObject, "prm_aac004");
        // 出生日期
        String prm_aac006 = MapUtils.getString(jsonObject, "prm_aac006");
        // 年度
        String prm_aae001 = MapUtils.getString(jsonObject, "prm_aae001");
        // 经办时间
        String prm_aae036 = MapUtils.getString(jsonObject, "prm_aae036");
        // 支付类别
        String prm_aka130 = MapUtils.getString(jsonObject, "prm_aka130");
        //  医疗人员类别
        String prm_akc021 = MapUtils.getString(jsonObject, "prm_akc021");
        // 实足年龄
        String prm_akc023 = MapUtils.getString(jsonObject, "prm_akc023");
        // 本次个人账户支付后帐户余额
        String prm_akc087 = MapUtils.getString(jsonObject, "prm_akc087");
        // 本年真实住院次数
        String prm_akc090 = MapUtils.getString(jsonObject, "prm_akc090");
        // 就诊编号
        String prm_akc190 = MapUtils.getString(jsonObject, "prm_akc190");
        //  城乡居民卫计局补偿金额（卫计补偿）
        String prm_ake032 = MapUtils.getString(jsonObject, "prm_ake032");
        // 其他基金支付
        String prm_ake173 = MapUtils.getString(jsonObject, "prm_ake173");
        // 医疗救助补偿金额
        String prm_ake181 = MapUtils.getString(jsonObject, "prm_ake181");
        // 优抚补偿金额
        String prm_ake183 = MapUtils.getString(jsonObject, "prm_ake183");
        String prm_bzxj = MapUtils.getString(jsonObject, "prm_bzxj");
        String prm_sdxj = MapUtils.getString(jsonObject, "prm_sdxj");
        // 分中心编号
        String prm_yab003 = MapUtils.getString(jsonObject, "prm_yab003");
        //  参保所属分中心
        String prm_yab139 = MapUtils.getString(jsonObject, "prm_yab139");
        // 清算期号
        String prm_yae366 = MapUtils.getString(jsonObject, "prm_yae366");
        // 单病种(结算)病种名称
        String prm_yka027 = MapUtils.getString(jsonObject, "prm_yka027");
        // 单病种(结算)医疗机构自费费用
        String prm_yka028 = MapUtils.getString(jsonObject, "prm_yka028");
        // 清算方式
        String prm_yka054 = MapUtils.getString(jsonObject, "prm_yka054");
        // 费用总额
        String prm_yka055 = MapUtils.getString(jsonObject, "prm_yka055");
        // 全自费金额
        String prm_yka056 = MapUtils.getString(jsonObject, "prm_yka056");
        // 挂钩自付金额
        String prm_yka057 = MapUtils.getString(jsonObject, "prm_yka057");
        //  进入起付线金额
        String prm_yka058 = MapUtils.getString(jsonObject, "prm_yka058");
        // 大额医疗支付金额
        String prm_yka062 = MapUtils.getString(jsonObject, "prm_yka062");
        // 个人账户支付部分
        String prm_yka065 = MapUtils.getString(jsonObject, "prm_yka065");
        // 大额补充保险报销金额
        String prm_yka082 = MapUtils.getString(jsonObject, "prm_yka082");
        // 大病额外报销金额
        String prm_yka083 = MapUtils.getString(jsonObject, "prm_yka083");
        // 公务员额外报销金额
        String prm_yka084 = MapUtils.getString(jsonObject, "prm_yka084");
        // 工会额外报销金额
        String prm_yka085 = MapUtils.getString(jsonObject, "prm_yka085");
        // 进口自付金额
        String prm_yka086 = MapUtils.getString(jsonObject, "prm_yka086");
        // 诊疗超标自付金额
        String prm_yka087 = MapUtils.getString(jsonObject, "prm_yka087");
        // 床位超标自付金额
        String prm_yka088 = MapUtils.getString(jsonObject, "prm_yka088");
        // 单病种(结算)编码
        String prm_yka089 = MapUtils.getString(jsonObject, "prm_yka089");
        // 限价材料超标自付金额
        String prm_yka090 = MapUtils.getString(jsonObject, "prm_yka090");
        // 结算编号
        String prm_yka103 = MapUtils.getString(jsonObject, "prm_yka103");
        // 符合范围金额
        String prm_yka111 = MapUtils.getString(jsonObject, "prm_yka111");
        // 已使用额度
        String prm_yka119 = MapUtils.getString(jsonObject, "prm_yka119");
        // 基本统筹已累计金额
        String prm_yka120 = MapUtils.getString(jsonObject, "prm_yka120");
        // 大额统筹已累计金额
        String prm_yka122 = MapUtils.getString(jsonObject, "prm_yka122");
        // 超限额标志
        String prm_yka194 = MapUtils.getString(jsonObject, "prm_yka194");
        // 基本医疗统筹支付金额
        String prm_yka248 = MapUtils.getString(jsonObject, "prm_yka248");
        // 清算类别
        String prm_yka316 = MapUtils.getString(jsonObject, "prm_yka316");
        // 单病种(结算)包干标准
        String prm_yka345 = MapUtils.getString(jsonObject, "prm_yka345");
        // 公务员补助普通门诊起付年度累计(含慢性病)
        String prm_yka368 = MapUtils.getString(jsonObject, "prm_yka368");
        // 门诊产前补助
        String prm_yka501 = MapUtils.getString(jsonObject, "prm_yka501");
        // 医保结算费用总
        String prm_yka525 = MapUtils.getString(jsonObject, "prm_yka525");
        // 规定病种起付线累计
        String prm_yka900 = MapUtils.getString(jsonObject, "prm_yka900");
        // 慢性病门诊预设线累计
        String prm_yka902 = MapUtils.getString(jsonObject, "prm_yka902");
        // 慢性病门诊补助年度累计
        String prm_yka903 = MapUtils.getString(jsonObject, "prm_yka903");
        // 清算分中心
        String prm_ykb037 = MapUtils.getString(jsonObject, "prm_ykb037");
        // 公务员级别
        String prm_ykc120 = MapUtils.getString(jsonObject, "prm_ykc120");
        // 居民医疗人员类别
        String prm_ykc280 = MapUtils.getString(jsonObject, "prm_ykc280");
        // 居民医疗人员身份
        String prm_ykc281 = MapUtils.getString(jsonObject, "prm_ykc281");
        // 城乡居民人员类别，目前 仅限贵安，六盘水
        String prm_ykc299 = MapUtils.getString(jsonObject, "prm_ykc299");
        // 重大疾病标识（1 为重大疾病）
        String prm_ykd092 = MapUtils.getString(jsonObject, "prm_ykd092");
        // 本年公务员门诊补助累计额(含慢性病)
        String prm_yke025 = MapUtils.getString(jsonObject, "prm_yke025");
        // 公务员补助报销金额
        String prm_yke030 = MapUtils.getString(jsonObject, "prm_yke030");
        String prm_ysxj = MapUtils.getString(jsonObject, "prm_ysxj");
        // 本次现金支付
        String psn_cash_pay = MapUtils.getString(jsonObject, "psn_cash_pay");
        String selfUnderFees = MapUtils.getString(jsonObject, "selfUnderFees");
    }


}

