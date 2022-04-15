package com.penghy.server.cotroller;

import com.google.common.collect.Maps;
import org.apache.commons.collections4.MapUtils;

import java.util.Map;

public class a {
    void aa() {
        Map<String,Object> outPutData = Maps.newHashMap();
        // 25 费用总额  费用总额-YBFYHJ-02
        String prmyka055 = MapUtils.getString(outPutData, "prm_yka055");
        // 26 全自费部分-QZFBF-31
        String prmyka056 = MapUtils.getString(outPutData, "prm_yka056");
        // 27 先行自付   先行自付-YBXXZF-04
        String prmyka057 = MapUtils.getString(outPutData, "prm_yka057");
        // 41 符合范围-YBFHFW-05
        String prmyka111 = MapUtils.getString(outPutData, "prm_yka111");
        // 28 本次起付线-BCQFX-06
        String prmyka058 = MapUtils.getString(outPutData, "prm_yka058");
        // 45 本次基本医疗报销金额-BCJBYLBXJE-08
        String prmyka248 = MapUtils.getString(outPutData, "prm_yka248");
        // 66 本次现金支付   个人现金支付-GRZFJE-03
        String psncashpay = MapUtils.getString(outPutData, "psn_cash_pay");
        // 30 本次个人账户可支付金额-BCGRZHKZFJE-11
        String prmyka065 = MapUtils.getString(outPutData, "prm_yka065");
        // 1 机构承担金额-JGCDJE-34
        String hosppartamt = MapUtils.getString(outPutData, "hosp_part_amt");
        // 29 本次大病医疗报销金额-BCDBYLBXJE-09
        String prmyka062 = MapUtils.getString(outPutData, "prm_yka062");
        // 31 大额补充保险报销金额-DEBCBXBXJE-15
        String prmyka082 = MapUtils.getString(outPutData, "prm_yka082");
        // 32 大病额外报销-DBEWBX-16
        String prmyka083 = MapUtils.getString(outPutData, "prm_yka083");
        // 33 公务员额外报销-GWYEWBX-17
        String prmyka084 = MapUtils.getString(outPutData, "prm_yka084");
        // 34 工会额外报销-GHEWBX-18
        String prmyka085 = MapUtils.getString(outPutData, "prm_yka085");
        // 35 进口自付金额-JKZFJE-19
        String prmyka086 = MapUtils.getString(outPutData, "prm_yka086");
        // 36 诊疗超标自付金额-ZLCBZFJE-20
        String prmyka087 = MapUtils.getString(outPutData, "prm_yka087");
        // 37 床位超标自付金额-CWCBZFJE-21
        String prmyka088 = MapUtils.getString(outPutData, "prm_yka088");
        // 38 单病种(结算)编码
        String prmyka089 = MapUtils.getString(outPutData, "prm_yka089");
        // 39 限价材料超标自付金额-XJCLCBZFJE-22
        String prmyka090 = MapUtils.getString(outPutData, "prm_yka090");
        // 40 结算编号
        String prmyka103 = MapUtils.getString(outPutData, "prm_yka103");
        // 42 基本统筹已累计金额-JBTCYLJJE-23
        String prmyka120 = MapUtils.getString(outPutData, "prm_yka120");
        // 43 大额统筹已累计金额-DETCYLJJE-24
        String prmyka122 = MapUtils.getString(outPutData, "prm_yka122");
        // 2 单位编码
        String prmaab001 = MapUtils.getString(outPutData, "prm_aab001");
        // 3 单位名称
        String prmaab004 = MapUtils.getString(outPutData, "prm_aab004");
        // 4 个人编号
        String prmaac001 = MapUtils.getString(outPutData, "prm_aac001");
        // 5 身份号码
        String prmaac002 = MapUtils.getString(outPutData, "prm_aac002");
        // 6 姓名
        String prmaac003 = MapUtils.getString(outPutData, "prm_aac003");
        // 7 性别
        String prmaac004 = MapUtils.getString(outPutData, "prm_aac004");
        // 8 出生日期
        String prmaac006 = MapUtils.getString(outPutData, "prm_aac006");
        // 9 年度
        String prmaae001 = MapUtils.getString(outPutData, "prm_aae001");
        // 10 经办时间
        String prmaae036 = MapUtils.getString(outPutData, "prm_aae036");
        // 11 医疗人员类别
        String prmakc021 = MapUtils.getString(outPutData, "prm_akc021");
        // 12 实足年龄
        String prmakc023 = MapUtils.getString(outPutData, "prm_akc023");
        // 13 本次个人账户支付后帐户余额    个人账户支付后余额-GRZHZFJE-01
        String prmakc087 = MapUtils.getString(outPutData, "prm_akc087");
        // 14 本年真实住院次数
        String prmakc090 = MapUtils.getString(outPutData, "prm_akc090");
        // 15 中途结算后新就诊编号
        String prmakc190_new = MapUtils.getString(outPutData, "prm_akc190_new");
        // 16 城乡居民卫计局补偿金额（卫计补偿）-CXJMWJJBCJE-12
        String prmake032 = MapUtils.getString(outPutData, "prm_ake032");
        // 17 其它基金
        String prmake173 = MapUtils.getString(outPutData, "prm_ake173");
        // 18 医疗救助补偿金额-CXJMSGJBCJE-13
        String prmake181 = MapUtils.getString(outPutData, "prm_ake181");
        // 19 优抚补偿金额-YFBCJE-33
        String prmake183 = MapUtils.getString(outPutData, "prm_ake183");
        // 20  所 属 医 保 机 构 编 码
        String prmyab139 = MapUtils.getString(outPutData, "prm_yab139");
        // 21 清算期号
        String prmyae366 = MapUtils.getString(outPutData, "prm_yae366");
        // 22 单病种(结算)病种名称
        String prmyka027 = MapUtils.getString(outPutData, "prm_yka027");
        // 23 单病种(结算)医疗机构自费费用-DBZYLJGZFFY-29
        String prmyka028 = MapUtils.getString(outPutData, "prm_yka028");
        // 24 清算方式
        String prmyka054 = MapUtils.getString(outPutData, "prm_yka054");
        // 44 超限额标志
        String prmyka194 = MapUtils.getString(outPutData, "prm_yka194");
        // 46 清算类别
        String prmyka316 = MapUtils.getString(outPutData, "prm_yka316");
        // 47 单病种包干标准-DBZBGBZ-38
        String prmyka345 = MapUtils.getString(outPutData, "prm_yka345");
        // 48 公务员补助普通门诊起付年度累计-GWYBZPTMZQFNDLJ-25
        String prmyka368 = MapUtils.getString(outPutData, "prm_yka368");
        // 49 限额/定额-XEDE-30
        String prmyka385 = MapUtils.getString(outPutData, "prm_yka385");
        // 50 门诊产前补助-MZCQBZ-28
        String prmyka501 = MapUtils.getString(outPutData, "prm_yka501");
        // 51 医保结算费用总额（贵阳市医保接口）
        String prmyka525 = MapUtils.getString(outPutData, "prm_yka525");
        // 52 规定病种起付线累计-GDBZQFXLJ-27
        String prmyka900 = MapUtils.getString(outPutData, "prm_yka900");
        // 53 清算分中心
        String prmykb037 = MapUtils.getString(outPutData, "prm_ykb037");
        // 54 医疗照顾人员类别
        String prmykc120 = MapUtils.getString(outPutData, "prm_ykc120");
        // 55 居民医疗人员类别
        String prmykc280 = MapUtils.getString(outPutData, "prm_ykc280");
        // 56 居民医疗人员身份
        String prmykc281 = MapUtils.getString(outPutData, "prm_ykc281");
        // 57 人员类别
        String prmykc296 = MapUtils.getString(outPutData, "prm_ykc296");
        // 58 城乡居民人员类别
        String prmykc299 = MapUtils.getString(outPutData, "prm_ykc299");
        // 59 未知1
        String prmykd135 = MapUtils.getString(outPutData, "prm_ykd135");
        // 60 单病种清算金额
        String prmykd523 = MapUtils.getString(outPutData, "prm_ykd523");
        // 61 精神病按日拨付金额
        String prmykd524 = MapUtils.getString(outPutData, "prm_ykd524");
        // 62 本年公务员门诊补助累计额-BNGWYMZBZLJE-26
        String prmyke025 = MapUtils.getString(outPutData, "prm_yke025");
        // 63 公务员报销金额-GWYBXJE-10
        String prmyke030 = MapUtils.getString(outPutData, "prm_yke030");
        // 64
        String prmzhkzf = MapUtils.getString(outPutData, "prm_zhkzf");
        // 65 账户预缴住院预缴金
        String prmzhyjyjj = MapUtils.getString(outPutData, "prm_zhyjyjj");
        // 67 医保统筹支付-YBTCZH-32
        String sitcapy = "";
        // 68 保险合计金额-BXHJJE-07

        // 69 自费费用总额-YBZFJE-36
        String YBZFJE = MapUtils.getString(outPutData, "prm_yka056");
        // 70 自理费用总额-YBZLJE-35
        String YBZLJE = MapUtils.getString(outPutData, "prm_yka057");
        // 71 个人自负支付-GRZFCD-37
        // 等于个人现金减去自理-自费
        // 72 现金尾差金额-XJWCJE-39
        // 73 超五万费用-CWWFY-40
        String prmcwwfy = MapUtils.getString(outPutData, "prm_cwwfy");
        // 73 甲类费用-JLFY-41
        String prmjlfy = MapUtils.getString(outPutData, "prm_jlfy");
        // 73 乙类费用-YLFY-42
        String prmylfy = MapUtils.getString(outPutData, "prm_ylfy");
        // 73 超限价费用-CXJFY-43
        String prmcxjfy = MapUtils.getString(outPutData, "prm_cxjfy");
        // 73 基本医疗报销比例-JBYLBXBL-44
        String prmjbylbxbl = MapUtils.getString(outPutData, "prm_jbylbxbl");
        // 73 基本医疗账户-JBYLZH-45
        String prmyka0651 = MapUtils.getString(outPutData, "prm_yka065_1");
        // 73 公务员账户-GWYZH-46
        String prmyka0652 = MapUtils.getString(outPutData, "prm_yka065_2");
    }

    void aa2() {
        System.out.println("aa2");
    }
}
