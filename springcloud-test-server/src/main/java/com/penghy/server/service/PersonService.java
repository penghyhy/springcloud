package com.penghy.server.service;

import com.alibaba.fastjson.JSONArray;
import com.penghy.server.bean.*;
import com.penghy.server.bean.sis.BaseReckon;
import com.penghy.server.bean.sis.PatiTrade;
import com.penghy.server.bean.sis.Reckon;
import com.penghy.server.mapper.DrugDictMapper;
import com.penghy.server.mapper.DrugDictTempMapper;
import com.penghy.server.mapper.PersonMapper;
import com.penghy.server.util.Pinyin4jUtil;
import com.penghy.server.util.RedisUtil;
import org.apache.commons.lang.StringUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class PersonService {

    @Autowired
    private PersonMapper personMapper;  //这里会有报错，不用管
    @Autowired
    private DrugDictTempMapper drugDictTempMapper;
    @Autowired
    private DrugDictMapper drugDictMapper;

    public List<Person> select() {
        return personMapper.select();
    }

    public List<Person> select12() {

        RedisUtil.setNoExpiry("123222", "111111");
        System.out.println(RedisUtil.get("12322"));

        List<Person> pp = personMapper.select12();
//        RedisUtil.setNoExpiry("list:aaa:bbb",(Serializable)pp);
//        List<Person> ppp = (List<Person>) RedisUtil.getNoExpiry("list");
//        System.out.println(JSONArray.toJSON(ppp).toString());
//        RedisUtil.del("list");
        for (Person person : pp) {
            String settle = person.getInsure_settle_info().split("~", -1)[5];
            String a = settle.split("\\|", -1)[20];
            String b = settle.split("\\|", -1)[21];
            String c = settle.split("\\|", -1)[22];
            String d = settle.split("\\|", -1)[23];
            if (new BigDecimal(b).compareTo(BigDecimal.ZERO) > 0 || new BigDecimal(c).compareTo(BigDecimal.ZERO) > 0 || new BigDecimal(d).compareTo(BigDecimal.ZERO) > 0) {
                System.out.println(person.getSettle_record_id() + " --->" + "---" + a + "---" + b + "----" + c + "-----" + d);
            }

        }
        return personMapper.select12();

    }

    public void insert(Person person) {
//        for (int i = 0; i < 10; i++) {

        Map<String, Object> param = new HashMap<>();
        try {
            File file = new File("D:\\wowjoy\\医保相关文档\\郑州医保\\三院接口文档\\三院接口文档\\医保目录\\医保目录\\SFXMBM_20070701080101.txt");
//                File file = new File("D:\\wowjoy\\医保相关文档\\贵州医保\\penghuaiyang\\penghuaiyang\\dict0\\downloadDictList100.txt");
            InputStreamReader read = new InputStreamReader(
                    new FileInputStream(file), "GBK");
            BufferedReader bufferedReader = new BufferedReader(read);
            String line = null;
//                System.out.println("----------" + i);
            while ((line = bufferedReader.readLine()) != null) {
                try {
                    ItemDict itemDict = new ItemDict();
                    String[] detailInfo = line.split("\\t", -1);
                    itemDict.setField1(detailInfo[0]);
                    itemDict.setField2(detailInfo[1]);
                    itemDict.setField3(detailInfo[2]);
                    itemDict.setField4(detailInfo[3]);
                    itemDict.setField5(detailInfo[4]);
                    itemDict.setField6(detailInfo[5]);
                    itemDict.setField7(detailInfo[6]);
                    itemDict.setField8(detailInfo[7]);
                    itemDict.setField9(detailInfo[8]);
                    itemDict.setField10(detailInfo[9]);
                    itemDict.setField11(detailInfo[10]);
                    itemDict.setField12(detailInfo[11]);
                    itemDict.setField13(detailInfo[12]);
                    itemDict.setField14(detailInfo[13]);
                    itemDict.setField15(detailInfo[14]);
                    itemDict.setField16(detailInfo[15]);
                    itemDict.setField17(detailInfo[16]);
                    itemDict.setField18(detailInfo[17]);
                    itemDict.setField19(detailInfo[18]);
                    itemDict.setField20(detailInfo[19]);
                    itemDict.setField21(detailInfo[20]);
                    itemDict.setField22(detailInfo[21]);
                    itemDict.setField23(detailInfo[22]);
                    itemDict.setField24(detailInfo[23]);
                    itemDict.setField25(detailInfo[24]);
                    itemDict.setField26(detailInfo[25]);
                    itemDict.setField27(detailInfo[26]);
                    itemDict.setField28(detailInfo[27]);
                    itemDict.setField29(detailInfo[28]);
                    itemDict.setField30(detailInfo[29]);
                    itemDict.setField31(detailInfo[30]);
//                    itemDict.setField32(detailInfo[31]);
//                    itemDict.setField33(detailInfo[32]);
//                    itemDict.setField34(detailInfo[33]);
//                    itemDict.setField35(detailInfo[34]);
//                    itemDict.setField36(detailInfo[35]);
//                    itemDict.setField37(detailInfo[36]);
//                    itemDict.setField38(detailInfo[37]);
//                    itemDict.setField39(detailInfo[38]);
//                    itemDict.setField40(detailInfo[39]);
//                    itemDict.setField41(detailInfo[40]);
//                    itemDict.setField42(detailInfo[41]);
//                    itemDict.setField43(detailInfo[42]);


                    drugDictTempMapper.insertItemDict(itemDict);
                } catch (Exception e) {
                    System.out.println(line);
                    e.printStackTrace();
                    return;
                }
            }
        } catch (Exception e) {
            System.out.println("1111111");
        }
//        }
    }


    public void update(Integer incrementId, String searchCode1) {
        personMapper.update(incrementId, searchCode1);
    }

    public void updatetwowjoydrugdict(Integer incrementId, String searchCode1) {
        personMapper.updatetwowjoydrugdict(incrementId, searchCode1);
    }

    public void updatetwowjoyorderdict(Integer incrementId, String searchCode1) {
        personMapper.updatetwowjoyorderdict(incrementId, searchCode1);
    }

    public void updatetwowjoyoperationdict(Integer incrementId, String searchCode1) {
        personMapper.updatetwowjoyoperationdict(incrementId, searchCode1);
    }

    public void updatetwowjoypubdict(Integer incrementId, String searchCode1) {
        personMapper.updatetwowjoypubdict(incrementId, searchCode1);
    }

    public void updatewowjoyOtherdict(Integer incrementId, String searchCode1) {
        personMapper.updatewowjoyOtherdict(incrementId, searchCode1);
    }

    public void insertDrugDict() {
        List<ItemDict> itemDicts = drugDictTempMapper.queryDrugDictTempList(new ItemDict());

        for (ItemDict itemDict : itemDicts) {
            List<DrugDictSub> drugDictSubList = new ArrayList<>();
            DrugDict drugDict = new DrugDict();
            DrugDictSub drugDictSub = new DrugDictSub();
            StringBuffer content = new StringBuffer();
            StringBuffer fileName = new StringBuffer();
//            //1
//            content.append(itemDict.getYae036() == null ? "" : itemDict.getYae036());
//            content.append("|");
//            fileName.append("变更时间|");
//            //2
//            content.append(itemDict.getYkd110() == null ? "" : itemDict.getYkd110());
//            content.append("|");
//            fileName.append("统计类型|");
//            //3
//            content.append(itemDict.getYaa027() == null ? "" : itemDict.getYaa027());
//            content.append("|");
//            fileName.append("物价编码|");
//            //4
//            content.append(itemDict.getYka007() == null ? "" : itemDict.getYka007());
//            content.append("|");
//            fileName.append("批准文号|");
//            //5
//            content.append(itemDict.getYke100() == null ? "" : itemDict.getYke100());
//            content.append("|");
//            fileName.append("项目内涵|");
//            //6
//            content.append(itemDict.getYke054() == null ? "" : itemDict.getYke054());
//            content.append("|");
//            fileName.append("除外内容|");
//            //7
//            content.append(itemDict.getYae375() == null ? "" : itemDict.getYae375());
//            content.append("|");
//            fileName.append("目录特项使用标志|");
//            //8
//            content.append(itemDict.getYka233() == null ? "" : itemDict.getYka233());
//            content.append("|");
//            fileName.append("招标价格|");
//            //9
//            content.append(itemDict.getYka603() == null ? "" : itemDict.getYka603());
//            content.append("|");
//            fileName.append("新老目录标志|");
//            //10
//            content.append(itemDict.getYka604() == null ? "" : itemDict.getYka604());
//            content.append("|");
//            fileName.append("发票类别编号|");
//            //11
//            content.append(itemDict.getYka606() == null ? "" : itemDict.getYka606());
//            content.append("|");
//            fileName.append("批准文号备注|");
//            //12
//            content.append(itemDict.getYka609() == null ? "" : itemDict.getYka609());
//            content.append("|");
//            fileName.append("商品名|");
//            //13
//            content.append(itemDict.getYka459() == null ? "" : itemDict.getYka459());
//            content.append("|");
//            fileName.append("职工最高限价|");
//            //14
//            content.append(itemDict.getYka096Lx() == null ? "" : itemDict.getYka096Lx());
//            content.append("|");
//            fileName.append("离休自付比例|");
//            //15
//            content.append(itemDict.getYka096Jm() == null ? "" : itemDict.getYka096Jm());
//            content.append("|");
//            fileName.append("居民自付比例|");
//            //16
//            content.append(itemDict.getYka459Lx() == null ? "" : itemDict.getYka459Lx());
//            content.append("|");
//            fileName.append("离休最高限价|");
//            //17
//            content.append(itemDict.getYka459Jm() == null ? "" : itemDict.getYka459Jm());
//            content.append("|");
//            fileName.append("居民最高限价|");
//            //18
//            content.append(itemDict.getYka096Tj() == null ? "" : itemDict.getYka096Tj());
//            content.append("|");
//            fileName.append("生育自付比例|");
//            //19
//            content.append(itemDict.getYka459Tj() == null ? "" : itemDict.getYka459Tj());
//            content.append("|");
//            fileName.append("生育最高限价|");
//            //20
//            content.append(itemDict.getAka101() == null ? "" : itemDict.getAka101());
//            content.append("|");
//            fileName.append("医院等级|");
//            //21
//            content.append(itemDict.getYka096Gs() == null ? "" : itemDict.getYka096Gs());
//            content.append("|");
//            fileName.append("工伤自付比例|");
//            //22
//            content.append(itemDict.getYka459Gs() == null ? "" : itemDict.getYka459Gs());
//            content.append("|");
//            fileName.append("工伤最高限价|");
//            //23
//            content.append(itemDict.getYka828() == null ? "" : itemDict.getYka828());
//            content.append("|");
//            fileName.append("材料来源|");
//            //24
//            content.append(itemDict.getYka826() == null ? "" : itemDict.getYka826());
//            content.append("|");
//            fileName.append("是否民族药|");
//            //25
//            content.append(itemDict.getYka829() == null ? "" : itemDict.getYka829());
//            content.append("|");
//            fileName.append("是否单独收费|");
//            //26
//            content.append(itemDict.getYka751() == null ? "" : itemDict.getYka751());
//            content.append("|");
//            fileName.append("公立医院改革标识|");
//            //27
//            content.append(itemDict.getYkl824() == null ? "" : itemDict.getYkl824());
//            content.append("|");
//            fileName.append("工伤项目内涵|");
//            //28
//            content.append(itemDict.getYka430() == null ? "" : itemDict.getYka430());
//            content.append("|");
//            fileName.append("生育项目标志|");
//            //29
//            content.append(itemDict.getYka431() == null ? "" : itemDict.getYka431());
//            content.append("|");
//            fileName.append("工伤项目标志|");
//            //30
//            content.append(itemDict.getAaalsh() == null ? "" : itemDict.getAaalsh());
//            content.append("|");
//            fileName.append("流水号|");
//            //31
//            content.append(itemDict.getYka459Cg() == null ? "" : itemDict.getYka459Cg());
//            content.append("|");
//            fileName.append("采购药限价|");
//            //32
//            content.append(itemDict.getYka459Lb() == null ? "" : itemDict.getYka459Lb());
//            content.append("|");
//            fileName.append("居民两病目录限价|");

            String[] sub = content.toString().split("\\|", -1);
            String[] fileName1 = fileName.toString().split("\\|", -1);
            int i = -1;
            for (String subs : sub) {
                drugDictSub = new DrugDictSub();
                i++;
                if (subs == null || "".equals(subs)) {
                    continue;
                }
                drugDictSub.setDictBookId("104");
                drugDictSub.setInsureDrugCode(itemDict.getYka002());
                drugDictSub.setSubFieldName(fileName1[i]);
                String aa = sub[i].substring(0, 1);
                String bb = sub[i];
                if (".".equals(aa)) {
                    aa = "0";
                    System.out.println("金额为：" + bb);
                    bb = aa + bb;
                    System.out.println("金额为：" + bb);
                }
                drugDictSub.setSubFieldContent(bb);
                drugDictSubList.add(drugDictSub);
            }
            List<DrugDictSub> dd = drugDictSubList;

            drugDict.setDictBookId("221");
            drugDict.setInsureDrugCode(itemDict.getField2());
            drugDict.setDrugStandardCode("");
            drugDict.setDrugChineseName(itemDict.getField3());
            drugDict.setDrugChemName("");
            drugDict.setDrugEnglishName(itemDict.getField4());
            drugDict.setInsureDrugSpec(itemDict.getField19());
            drugDict.setDrugDosageForm(itemDict.getField13());
            drugDict.setChargeItemCode(itemDict.getField5());
            drugDict.setChargeItemName("");
            drugDict.setInsuDrugType("1");
            drugDict.setDrugMinDose("0");
            drugDict.setMinDoseUnit(itemDict.getField9());
            drugDict.setDrugDailyDosage("0");
            drugDict.setDrugUsageFrequency(StringUtils.isBlank(itemDict.getField15()) ? "0" : itemDict.getField15());
            drugDict.setDrugUsageMethod(itemDict.getField16());
            drugDict.setItemApplyScope("0");
            drugDict.setInsureDrugGrade(itemDict.getField7());
            drugDict.setDrugRemark(itemDict.getField39());
            drugDict.setPrescriptionUsageFlag(StringUtils.isBlank(itemDict.getField6()) ? "0" : itemDict.getField6());
            drugDict.setStandardUsagePosts("0");
            drugDict.setDrugStandardPrice("0");
            drugDict.setOiFlag("0");
            drugDict.setOutpatientPriceQuota("0");
            drugDict.setInpatientPriceQuota("0");
            drugDict.setOutpatientUsageQuota("0");
            drugDict.setInpatientUsageQuota("0");
            drugDict.setDrugEachDose(StringUtils.isBlank(itemDict.getField14()) ? "0" : itemDict.getField14());
            drugDict.setDrugFactoryName(itemDict.getField25());
            drugDict.setDrugTexture("");
            drugDict.setDrugPackageUnit(itemDict.getField18());
            drugDict.setDeleteFlag(0);
            drugDict.setSearchCode1(itemDict.getField8());
            drugDict.setSearchCode2(itemDict.getField17());
            drugDict.setSearchCode3(null);
            drugDict.setItemLimitFlag("0");
            drugDict.setItemApprovalStyle(StringUtils.isBlank(itemDict.getField34()) ? "0" : itemDict.getField34());
            drugDict.setDrugSwicthScale("0");
            drugDict.setUseStartTime(itemDict.getField37());
            drugDict.setUseEndTime(StringUtils.isBlank(itemDict.getField38()) ? null : itemDict.getField38());
            drugDict.setDrugApproveNum(itemDict.getField28());
            System.out.println(JSONArray.toJSON(drugDict).toString());

//            drugDict.setInsureDrugGrade(yka000);
//            personMapper.insertBatch(drugDictSubList);
//            System.out.println(itemDict.getYka002() + "从表插入完成！");
            drugDictMapper.insertDrugDict(drugDict);
//            System.out.println(itemDict.getYka002() + "主表插入完成！");
        }
    }

    public void insertOrderDict() {
        List<ItemDict> itemDicts = personMapper.queryaaaaaList();

        for (ItemDict itemDict : itemDicts) {
            List<OrderDictSub> orderDictSubList = new ArrayList<>();
            OrderDict1 orderDict = new OrderDict1();
            OrderDictSub orderDictSub = new OrderDictSub();
            StringBuffer content = new StringBuffer();
            StringBuffer fileName = new StringBuffer();
            //1
            content.append(itemDict.getYae036() == null ? "" : itemDict.getYae036());
            content.append("|");
            fileName.append("变更时间|");
            //2
            content.append(itemDict.getYkd110() == null ? "" : itemDict.getYkd110());
            content.append("|");
            fileName.append("统计类型|");
            //3
            content.append(itemDict.getYaa027() == null ? "" : itemDict.getYaa027());
            content.append("|");
            fileName.append("物价编码|");
            //4
            content.append(itemDict.getYka007() == null ? "" : itemDict.getYka007());
            content.append("|");
            fileName.append("批准文号|");
            //5
            content.append(itemDict.getYke100() == null ? "" : itemDict.getYke100());
            content.append("|");
            fileName.append("项目内涵|");
            //6
            content.append(itemDict.getYke054() == null ? "" : itemDict.getYke054());
            content.append("|");
            fileName.append("除外内容|");
            //7
            content.append(itemDict.getYae375() == null ? "" : itemDict.getYae375());
            content.append("|");
            fileName.append("目录特项使用标志|");
            //8
            content.append(itemDict.getYka233() == null ? "" : itemDict.getYka233());
            content.append("|");
            fileName.append("招标价格|");
            //9
            content.append(itemDict.getYka603() == null ? "" : itemDict.getYka603());
            content.append("|");
            fileName.append("新老目录标志|");
            //10
            content.append(itemDict.getYka604() == null ? "" : itemDict.getYka604());
            content.append("|");
            fileName.append("发票类别编号|");
            //11
            content.append(itemDict.getYka606() == null ? "" : itemDict.getYka606());
            content.append("|");
            fileName.append("批准文号备注|");
            //12
            content.append(itemDict.getYka609() == null ? "" : itemDict.getYka609());
            content.append("|");
            fileName.append("商品名|");
            //13
            content.append(itemDict.getYka459() == null ? "" : itemDict.getYka459());
            content.append("|");
            fileName.append("职工最高限价|");
            //14
            content.append(itemDict.getYka096Lx() == null ? "" : itemDict.getYka096Lx());
            content.append("|");
            fileName.append("离休自付比例|");
            //15
            content.append(itemDict.getYka096Jm() == null ? "" : itemDict.getYka096Jm());
            content.append("|");
            fileName.append("居民自付比例|");
            //16
            content.append(itemDict.getYka459Lx() == null ? "" : itemDict.getYka459Lx());
            content.append("|");
            fileName.append("离休最高限价|");
            //17
            content.append(itemDict.getYka459Jm() == null ? "" : itemDict.getYka459Jm());
            content.append("|");
            fileName.append("居民最高限价|");
            //18
            content.append(itemDict.getYka096Tj() == null ? "" : itemDict.getYka096Tj());
            content.append("|");
            fileName.append("生育自付比例|");
            //19
            content.append(itemDict.getYka459Tj() == null ? "" : itemDict.getYka459Tj());
            content.append("|");
            fileName.append("生育最高限价|");
            //20
            content.append(itemDict.getAka101() == null ? "" : itemDict.getAka101());
            content.append("|");
            fileName.append("医院等级|");
            //21
            content.append(itemDict.getYka096Gs() == null ? "" : itemDict.getYka096Gs());
            content.append("|");
            fileName.append("工伤自付比例|");
            //22
            content.append(itemDict.getYka459Gs() == null ? "" : itemDict.getYka459Gs());
            content.append("|");
            fileName.append("工伤最高限价|");
            //23
            content.append(itemDict.getYka828() == null ? "" : itemDict.getYka828());
            content.append("|");
            fileName.append("材料来源|");
            //24
            content.append(itemDict.getYka826() == null ? "" : itemDict.getYka826());
            content.append("|");
            fileName.append("是否民族药|");
            //25
            content.append(itemDict.getYka829() == null ? "" : itemDict.getYka829());
            content.append("|");
            fileName.append("是否单独收费|");
            //26
            content.append(itemDict.getYka751() == null ? "" : itemDict.getYka751());
            content.append("|");
            fileName.append("公立医院改革标识|");
            //27
            content.append(itemDict.getYkl824() == null ? "" : itemDict.getYkl824());
            content.append("|");
            fileName.append("工伤项目内涵|");
            //28
            content.append(itemDict.getYka430() == null ? "" : itemDict.getYka430());
            content.append("|");
            fileName.append("生育项目标志|");
            //29
            content.append(itemDict.getYka431() == null ? "" : itemDict.getYka431());
            content.append("|");
            fileName.append("工伤项目标志|");
            //30
            content.append(itemDict.getAaalsh() == null ? "" : itemDict.getAaalsh());
            content.append("|");
            fileName.append("流水号|");
            //31
            content.append(itemDict.getYka459Cg() == null ? "" : itemDict.getYka459Cg());
            content.append("|");
            fileName.append("采购药限价|");
            //32
            content.append(itemDict.getYka459Lb() == null ? "" : itemDict.getYka459Lb());
            content.append("|");
            fileName.append("居民两病目录限价|");

            String[] sub = content.toString().split("\\|", -1);
            String[] fileName1 = fileName.toString().split("\\|", -1);
            int i = -1;
            for (String subs : sub) {
                orderDictSub = new OrderDictSub();
                i++;
                if (subs == null || "".equals(subs)) {
                    continue;
                }
                orderDictSub.setDictBookId("105");
                orderDictSub.setInsureOrderOcde(itemDict.getYka002());
                orderDictSub.setSubFieldName(fileName1[i]);
                String aa = sub[i].substring(0, 1);
                String bb = sub[i];
                if (".".equals(aa)) {
                    aa = "0";
                    System.out.println("金额为：" + bb);
                    bb = aa + bb;
                    System.out.println("金额为：" + bb);
                }
                orderDictSub.setSubFieldContent(bb);
                orderDictSubList.add(orderDictSub);
            }
            orderDict.setInsureOrderCode(itemDict.getYka002());
            orderDict.setOrderChineseName(itemDict.getYka003());
            orderDict.setChargeItemCode(itemDict.getYka001());
            orderDict.setDrugFactoryName(itemDict.getYka601());
            orderDict.setInsureOrderUnit(itemDict.getYka295());
            orderDict.setInsureDrugSpec(itemDict.getAka074());
            orderDict.setDrugDosageForm(itemDict.getAka070());
            orderDict.setOrderEnglishName(itemDict.getYka284());
            orderDict.setSearchCode1(itemDict.getYka389());
            orderDict.setSearchCode2(itemDict.getYka401());
            orderDict.setUseStartTime(itemDict.getAae030());
            orderDict.setUseEndTime(itemDict.getAae031());
            orderDict.setOrderApproveNum(itemDict.getYka007());
            orderDict.setOrderRemark(itemDict.getAae013());
            orderDict.setChageApplyScope(itemDict.getYke103());
            String yka000 = itemDict.getYka096();
            if (BigDecimal.ONE.compareTo(new BigDecimal(itemDict.getYka096())) == 0) {
                yka000 = "3";
            } else if (BigDecimal.ZERO.compareTo(new BigDecimal(itemDict.getYka096())) == 0) {
                yka000 = "1";
            } else {
                yka000 = "2";
            }
            orderDict.setInsureOrderGrade(yka000);
            personMapper.insertorderBatch(orderDictSubList);
            System.out.println(itemDict.getYka002() + "从表插入完成！");
            personMapper.insertOrderDict(orderDict);
            System.out.println(itemDict.getYka002() + "主表插入完成！");
        }
    }

    public void updateDrugDict() {
        List<DrugDict1> drugDicts = personMapper.selectDrugDict();
        for (DrugDict1 dd : drugDicts) {

            if (dd.getIncrementId() == 0) {
                return;
            }
            personMapper.update(dd.getIncrementId(), Pinyin4jUtil.getPinYin(dd.getDrugChineseName()).replaceAll("\\(X\\)", ""));
        }
    }


    /**
     * 查询sis服务中的疾病信息表
     *
     * @return
     */
    public List<DrugDict1> selectwowjoydrugdict() {
        return personMapper.selectwowjoydrugdict();
    }

    /**
     * 查询sis服务中的诊疗信息表
     *
     * @return
     */
    public List<OrderDict1> selectwowjoyorderdict() {
        return personMapper.selectwowjoyorderdict();
    }

    public List<Opeartion> selectwowjoyopearationdict() {
        return personMapper.selectwowjoyopearationdict();
    }

    /**
     * 查询sis服务中的疾病信息表
     *
     * @return
     */
    public List<PubDict> selectwowjoypubdict() {
        return personMapper.selectwowjoypubdict();
    }

    /**
     * 查询sis服务中的疾病信息表
     *
     * @return
     */
    public List<Map<String, Object>> selectwowjoyOtherdict() {
        return personMapper.selectwowjoyOtherdict();
    }


    public List<String> selecttest() {
        return personMapper.selecttest();
    }


    public String impxlsx(String excelFile) {
        String msg = null;
        try {
            FileInputStream fs = new FileInputStream(new File(excelFile));
            XSSFWorkbook bok = new XSSFWorkbook(fs);
            Sheet sheet = bok.getSheetAt(0);
            msg = getRowAndCell(sheet);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;
    }


    /**
     * 获取行和列的数据
     *
     * @param sheet
     * @return
     */
    public String getRowAndCell(Sheet sheet) {
//        List<NewExpert> newExperts = new ArrayList<>();
        String msg = null;
        // 获得数据的总行数从0开始
        int totalRows = sheet.getLastRowNum();
        System.out.println("总行数==" + totalRows);
        // 循环输出表格中的内容,首先循环取出行,再根据行循环取出列
        for (int i = 1; i <= totalRows; i++) {
            Row row = sheet.getRow(i); //取出一行数据放入row
//            NewExpert newExpert = new NewExpert();
            int lastCellIndex = row.getLastCellNum();
            for (int j = 0; j < lastCellIndex; j++) {
                try {
                    Cell cell = row.getCell(j);//获得一列的数据
                    switch (j) {
                        case 0:
                            if (null != cell.getStringCellValue()) {

                            } else {
                                return msg = "第" + i + "行第" + j + 1 + "列数据有误！";
                            }
                            break;
                        case 1:
                            if (null != cell.getStringCellValue()) {

                            } else {
                                return msg = "第" + i + "行第" + j + 1 + "列数据有误！";
                            }
                            break;
                        case 2:
                            if (null != cell.getStringCellValue()) {

                            } else {
                                return msg = "第" + i + "行第" + j + 1 + "列数据有误！";
                            }
                            break;
                        case 3:
                            if (null != cell.getStringCellValue()) {

                            } else {
                                return msg = "第" + i + "行第" + j + 1 + "列数据有误！";
                            }
                            break;
                        case 4:
                            if (null != cell.getStringCellValue()) {

                            } else {
                                return msg = "第" + i + "行第" + j + 1 + "列数据有误！";
                            }
                            break;
                        case 5:
                            if (null != cell.getStringCellValue()) {

                            } else {
                                return msg = "第" + i + "行第" + j + 1 + "列数据有误！";
                            }
                            break;
                        case 6:
                            if (null != cell.getStringCellValue()) {

                            } else {
                                return msg = "第" + i + "行第" + j + 1 + "列数据有误！";
                            }
                            break;
                        case 7:
                            if (null != cell.getStringCellValue()) {

                            } else {
                                return msg = "第" + i + "行第" + j + 1 + "列数据有误！";
                            }
                            break;
                        case 8:
                            if (null != cell.getDateCellValue()) {

                            }
                            break;
                        case 9:
                            if (null != cell.getStringCellValue()) {

                            }
                            break;
                        case 10:
                            if (null != cell.getDateCellValue()) {

                            }
                            break;
                        case 11:
                            if (null != cell.getStringCellValue()) {

                            }
                            break;
                        case 12:
                            if (null != cell.getStringCellValue()) {

                            }
                            break;
                        case 13:
                            if (null != cell.getStringCellValue()) {

                            }
                            break;
                        case 14:
                            if (null != cell.getStringCellValue()) {

                            }
                            break;
                        //具体有多少列就处理多少列吧
                        default:
                            break;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    return msg = "导入失败，第" + i + "行第" + (j + 1) + "列数据有误！ ";
                }

            } //列循环结束

//            newExperts.add(newExpert);

        } //行end

//        try {
//            for (NewExpert expert : newExperts) {  //这里遍历保存数据
//                this.insert(expert);
//
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            return msg = e.getMessage();
//        }
        msg = "导入成功！";
        return msg;
    }

    public String queryBaeReckonList() {
        List<PatiTrade> patiTradeList = drugDictMapper.queryPatiTradeList();
        List<BaseReckon> baseReckonList = drugDictMapper.queryBaeReckonList();
        for (PatiTrade patiTrade : patiTradeList) {
            int k = 0;
            int i = 0;
            List<Reckon> reckonList = new ArrayList<>();
            String[] reckonFiles = patiTrade.getInsureSettleInfo().split("\\|", -1);
            for (BaseReckon reckon : baseReckonList) {
                if (reckon.getReckonType() != 1) {
                    k++;
                    i++;
                    continue;
                }
                String rec = reckonFiles[i];
                if (StringUtils.isBlank(rec)) {
                    rec = "0";
                }
//                System.out.println("下标为；"+i+",值为："+rec);
                Reckon reckon1 = new Reckon();
                reckon1.setComputeClassId(Integer.valueOf("4108" + reckon.getReckonId()));
                reckon1.setComputeClassName(reckon.getReckonCn());
                reckon1.setComputeClassEn(reckon.getReckonEn() + "4108");
                reckon1.setComputeClassFees(new BigDecimal(rec));
                reckon1.setSettleRecordId(patiTrade.getSettleRecordId());
                reckonList.add(reckon1);
                k++;
                i++;
            }
//            drugDictMapper.insertPatiTradeBatch(reckonList);
        }
        return "2";
    }

    public List<String> getIncrementId() {
        return personMapper.getincrementId();
    }

    public void insertPRK(String sql) {
        personMapper.insertPRK(sql);
    }


}


