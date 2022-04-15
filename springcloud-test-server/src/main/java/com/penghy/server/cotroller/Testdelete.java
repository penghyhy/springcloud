package com.penghy.server.cotroller;

import org.apache.commons.collections4.MapUtils;

import java.util.Map;

public class Testdelete {




    private void settleInfo (Map<String,Object> outPutData){
        String businesssequence = MapUtils.getString(outPutData, "businesssequence");
        String businessvalidate = MapUtils.getString(outPutData, "businessvalidate");
        StringBuilder outSettle = new StringBuilder();
        // 1、费用总额(YBFYHJ)
        String prmyka055 = MapUtils.getString(outPutData, "prm_yka055");
        outSettle.append(prmyka055);
        outSettle.append("|");
        // 2、 医保结算费用总额（贵阳市医保接口）
        String prmyka525 = MapUtils.getString(outPutData, "prm_yka525");
        outSettle.append(prmyka525);
        outSettle.append("|");
        // 3、 符合范围金额(YBFHFW)
        String prmyka111 = MapUtils.getString(outPutData, "prm_yka111");
        outSettle.append(prmyka111);
        outSettle.append("|");
        // 4、全自费金额(QZFBF)
        String prmyka056 = MapUtils.getString(outPutData, "prm_yka056");
        outSettle.append(prmyka056);
        outSettle.append("|");
        // 5、 挂钩自付金额(YBXXZF)
        String prmyka057 = MapUtils.getString(outPutData, "prm_yka057");
        outSettle.append(prmyka057);
        outSettle.append("|");
        // 6、本次个人账户支付后帐户余额（GRZHYE）
        String prmakc087 = MapUtils.getString(outPutData, "prm_akc087");
        outSettle.append(prmakc087);
        outSettle.append("|");
        // 7、 本次现金支付（GRZFJE）
        String psnCashPay = MapUtils.getString(outPutData, "psn_cash_pay");
        outSettle.append(psnCashPay);
        outSettle.append("|");
        // 8、进入起付线金额(BCQFX)(QFBZJE)
        String prmyka058 = MapUtils.getString(outPutData, "prm_yka058");
        outSettle.append(prmyka058);
        outSettle.append("|");
        // 9、 大额医疗支付金额
        String prmyka062 = MapUtils.getString(outPutData, "prm_yka062");
        outSettle.append(prmyka062);
        outSettle.append("|");
        // 10、 个人账户支付部分(GRZHZFJE)待增加
        String prmyka065 = MapUtils.getString(outPutData, "prm_yka065");
        outSettle.append(prmyka065);
        outSettle.append("|");
        // 11、门诊产前补助(MZCQBZ)
        String prmyka501 = MapUtils.getString(outPutData, "prm_yka501");
        outSettle.append(prmyka501);
        outSettle.append("|");
        // 12、 公务员补助报销金额(GWYBXJE)
        String prmyke030 = MapUtils.getString(outPutData, "prm_yke030");
        outSettle.append(prmyke030);
        outSettle.append("|");
        // 13、医疗救助补偿金额(MZZFJE)
        String prmake181 = MapUtils.getString(outPutData, "prm_ake181");
        outSettle.append(prmake181);
        outSettle.append("|");
        // 14、优抚补偿金额(YFBCJE)
        String prmake183 = MapUtils.getString(outPutData, "prm_ake183");
        outSettle.append(prmake183);
        outSettle.append("|");
        // 15、其他基金支付(QTZCFY)(QTYBZF)(QTJJZC)
        String prmake173 = MapUtils.getString(outPutData, "prm_ake173");
        outSettle.append(prmake173);
        outSettle.append("|");
        // 16、医院承担（JGCDJE）
        String hospPartAmt = MapUtils.getString(outPutData, "hosp_part_amt");
        outSettle.append(hospPartAmt);
        outSettle.append("|");
        // 17、 大额补充保险报销金额(DEBCBXBXJE)
        String prmyka082 = MapUtils.getString(outPutData, "prm_yka082");
        outSettle.append(prmyka082);
        outSettle.append("|");
        // 18、 大病额外报销金额(DBEWBX)
        String prmyka083 = MapUtils.getString(outPutData, "prm_yka083");
        outSettle.append(prmyka083);
        outSettle.append("|");
        // 19、 公务员额外报销金额(GWYEWBX)
        String prmyka084 = MapUtils.getString(outPutData, "prm_yka084");
        outSettle.append(prmyka084);
        outSettle.append("|");
        // 20、 工会额外报销金额(GHEWBX)
        String prmyka085 = MapUtils.getString(outPutData, "prm_yka085");
        outSettle.append(prmyka085);
        outSettle.append("|");
// 21、城乡居民卫计局补偿金额（卫计补偿）(WJBCJE)
        String prmake032 = MapUtils.getString(outPutData, "prm_ake032");
        outSettle.append(prmake032);
        outSettle.append("|");
// 22、单病种(结算)医疗机构自费费用(BZZFJE)
        String prmyka028 = MapUtils.getString(outPutData, "prm_yka028");
        outSettle.append(prmyka028);
        outSettle.append("|");
        // 23、 进口自付金额(JKZFJE)
        String prmyka086 = MapUtils.getString(outPutData, "prm_yka086");
        outSettle.append(prmyka086);
        outSettle.append("|");
        // 24、 诊疗超标自付金额(ZLCBZFJE)
        String prmyka087 = MapUtils.getString(outPutData, "prm_yka087");
        outSettle.append(prmyka087);
        outSettle.append("|");
        // 25、 床位超标自付金额(CWCBZFJE)
        String prmyka088 = MapUtils.getString(outPutData, "prm_yka088");
        outSettle.append(prmyka088);
        outSettle.append("|");
        // 26、 已使用额度(YZSYED)
        String prmyka119 = MapUtils.getString(outPutData, "prm_yka119");
        outSettle.append(prmyka119);
        outSettle.append("|");
        // 27、 基本统筹已累计金额(TCLJJE)
        String prmyka120 = MapUtils.getString(outPutData, "prm_yka120");
        outSettle.append(prmyka120);
        outSettle.append("|");
        // 28、 大额统筹已累计金额(DELJJE)
        String prmyka122 = MapUtils.getString(outPutData, "prm_yka122");
        outSettle.append(prmyka122);
        outSettle.append("|");
        // 29、 公务员补助普通门诊起付年度累计(含慢性病)(GWMZQFJE)
        String prmyka368 = MapUtils.getString(outPutData, "prm_yka368");
        outSettle.append(prmyka368);
        outSettle.append("|");
        // 30、 规定病种起付线累计(TSQFJE)
        String prmyka900 = MapUtils.getString(outPutData, "prm_yka900");
        outSettle.append(prmyka900);
        outSettle.append("|");
        // 31、 慢性病门诊预设线累计(MBMZLJ)
        String prmyka902 = MapUtils.getString(outPutData, "prm_yka902");
        outSettle.append(prmyka902);
        outSettle.append("|");
        // 32、 慢性病门诊补助年度累计(MBMZNDLJ)
        String prmyka903 = MapUtils.getString(outPutData, "prm_yka903");
        outSettle.append(prmyka903);
        outSettle.append("|");
        // 33 本年公务员门诊补助累计额(含慢性病)(GWBZLJ)
        String prmyke025 = MapUtils.getString(outPutData, "prm_yke025");
        outSettle.append(prmyke025);
        outSettle.append("|");
        // 34、机构承担金额
        String JGCDJE = MapUtils.getString(outPutData, "JGCDJE");
        outSettle.append(JGCDJE);
        outSettle.append("|");
        // 35、收费费用合计
        String SFFYHJ = MapUtils.getString(outPutData, "SFFYHJ");
        outSettle.append(SFFYHJ);
        outSettle.append("|");
        // 36、HIS费用总额
        String hisAmount = MapUtils.getString(outPutData, "hisAmount");
        outSettle.append(hisAmount);
        outSettle.append("|");
        // 37、单位编号
        String prmaab001 = MapUtils.getString(outPutData, "prm_aab001");
        outSettle.append(prmaab001);
        outSettle.append("|");
        // 38、单位名称
        String prmaab004 = MapUtils.getString(outPutData, "prm_aab004");
        outSettle.append(prmaab004);
        outSettle.append("|");
        // 39、个人编号
        String prmaac001 = MapUtils.getString(outPutData, "prm_aac001");
        outSettle.append(prmaac001);
        outSettle.append("|");
        // 40、公民身份号码
        String prmaac002 = MapUtils.getString(outPutData, "prm_aac002");
        outSettle.append(prmaac002);
        outSettle.append("|");
        ///41、姓名
        String prmaac003 = MapUtils.getString(outPutData, "prm_aac003");
        outSettle.append(prmaac003);
        outSettle.append("|");
        // 42、性别
        String prmaac004 = MapUtils.getString(outPutData, "prm_aac004");
        outSettle.append(prmaac004);
        outSettle.append("|");
        // 43、出生日期
        String prmaac006 = MapUtils.getString(outPutData, "prm_aac006");
        outSettle.append(prmaac006);
        outSettle.append("|");
        // 44、年度
        String prmaae001 = MapUtils.getString(outPutData, "prm_aae001");
        outSettle.append(prmaae001);
        outSettle.append("|");
        // 45、经办时间
        String prmaae036 = MapUtils.getString(outPutData, "prm_aae036");
        outSettle.append(prmaae036);
        outSettle.append("|");
        // 46、支付类别
        String prmaka130 = MapUtils.getString(outPutData, "prm_aka130");
        outSettle.append(prmaka130);
        outSettle.append("|");
        // 47、医疗人员类别
        String prmakc021 = MapUtils.getString(outPutData, "prm_akc021");
        outSettle.append(prmakc021);
        outSettle.append("|");
        // 48、实足年龄
        String prmakc023 = MapUtils.getString(outPutData, "prm_akc023");
        outSettle.append(prmakc023);
        outSettle.append("|");
        // 49 本年真实住院次数
        String prmakc090 = MapUtils.getString(outPutData, "prm_akc090");
        outSettle.append(prmakc090);
        outSettle.append("|");
        // 50、就诊编号
        String prmakc190 = MapUtils.getString(outPutData, "prm_akc190");
        outSettle.append(prmakc190);
        outSettle.append("|");

        // 51、未知1
        String prmbzxj = MapUtils.getString(outPutData, "prm_bzxj");
        outSettle.append(prmbzxj);
        outSettle.append("|");
        // 52、未知2
        String prmsdxj = MapUtils.getString(outPutData, "prm_sdxj");
        outSettle.append(prmsdxj);
        outSettle.append("|");
        // 53、分中心编号
        String prmyab003 = MapUtils.getString(outPutData, "prm_yab003");
        outSettle.append(prmyab003);
        outSettle.append("|");
        // 54、参保所属分中心
        String prmyab139 = MapUtils.getString(outPutData, "prm_yab139");
        outSettle.append(prmyab139);
        outSettle.append("|");
        // 55、清算期号
        String prmyae366 = MapUtils.getString(outPutData, "prm_yae366");
        outSettle.append(prmyae366);
        outSettle.append("|");
        // 56、单病种(结算)病种名称
        String prmyka027 = MapUtils.getString(outPutData, "prm_yka027");
        outSettle.append(prmyka027);
        outSettle.append("|");

        // 57、清算方式
        String prmyka054 = MapUtils.getString(outPutData, "prm_yka054");
        outSettle.append(prmyka054);
        outSettle.append("|");
        // 58、 单病种(结算)编码
        String prmyka089 = MapUtils.getString(outPutData, "prm_yka089");
        outSettle.append(prmyka089);
        outSettle.append("|");
        // 59、 限价材料超标自付金额
        String prmyka090 = MapUtils.getString(outPutData, "prm_yka090");
        outSettle.append(prmyka090);
        outSettle.append("|");
        // 60、 结算编号
        String prmyka103 = MapUtils.getString(outPutData, "prm_yka103");
        outSettle.append(prmyka103);
        outSettle.append("|");
        // 61、超限额标志
        String prmyka194 = MapUtils.getString(outPutData, "prm_yka194");
        outSettle.append(prmyka194);
        outSettle.append("|");
        // 62、 基本医疗统筹支付金额(MZTCZFHJE)
        String prmyka248 = MapUtils.getString(outPutData, "prm_yka248");
        outSettle.append(prmyka248);
        outSettle.append("|");
        // 63、 清算类别
        String prmyka316 = MapUtils.getString(outPutData, "prm_yka316");
        outSettle.append(prmyka316);
        outSettle.append("|");
        // 64、 单病种(结算)包干标准
        String prmyka345 = MapUtils.getString(outPutData, "prm_yka345");
        outSettle.append(prmyka345);
        outSettle.append("|");
        // 65、清算分中心
        String prmykb037 = MapUtils.getString(outPutData, "prm_ykb037");
        outSettle.append(prmykb037);
        outSettle.append("|");
        // 66、 公务员级别
        String prmykc120 = MapUtils.getString(outPutData, "prm_ykc120");
        outSettle.append(prmykc120);
        outSettle.append("|");
        // 67、 居民医疗人员类别
        String prmykc280 = MapUtils.getString(outPutData, "prm_ykc280");
        outSettle.append(prmykc280);
        outSettle.append("|");
        // 68、 居民医疗人员身份
        String prmykc281 = MapUtils.getString(outPutData, "prm_ykc281");
        outSettle.append(prmykc281);
        outSettle.append("|");
        // 69、 城乡居民人员类别，目前 仅限贵安，六盘水
        String prmykc299 = MapUtils.getString(outPutData, "prm_ykc299");
        outSettle.append(prmykc299);
        outSettle.append("|");
        // 70、 重大疾病标识（1 为重大疾病）
        String prmykd092 = MapUtils.getString(outPutData, "prm_ykd092");
        outSettle.append(prmykd092);
        outSettle.append("|");

        // 71、未知3
        String prmysxj = MapUtils.getString(outPutData, "prm_ysxj");
        outSettle.append(prmysxj);
        outSettle.append("|");

        // 72、未知4
        String selfUnderFees = MapUtils.getString(outPutData, "selfUnderFees");
        outSettle.append(selfUnderFees);
        outSettle.append("|");
    }

    {
        System.out.println("123");
    }
}
