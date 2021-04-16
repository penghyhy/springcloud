package com.penghy.server.cotroller;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import com.penghy.server.bean.DrugDict;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class testab {
    public static void main(String[] args) {


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


}

