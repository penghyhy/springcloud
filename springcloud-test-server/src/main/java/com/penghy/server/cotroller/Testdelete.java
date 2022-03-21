package com.penghy.server.cotroller;

import org.apache.commons.collections4.MapUtils;

import java.util.Map;

public class Testdelete {




    private void settleInfo (Map<String,Object> jsonObject){
        // 机构承担金额（JGCDJE）
        String JGCDJE =  MapUtils.getString(jsonObject,"JGCDJE");
        String SFFYHJ =  MapUtils.getString(jsonObject,"SFFYHJ");
        String businesssequence =  MapUtils.getString(jsonObject,"businesssequence");
        String businessvalidate =  MapUtils.getString(jsonObject,"businessvalidate");
        String hisAmount =  MapUtils.getString(jsonObject,"hisAmount");
        // 医院承担
        String hosp_part_amt =  MapUtils.getString(jsonObject,"hosp_part_amt");
        // 单位编号
        String prm_aab001 =  MapUtils.getString(jsonObject,"prm_aab001");
        // 单位名称
        String prm_aab004 =  MapUtils.getString(jsonObject,"prm_aab004");
        // 个人编号
        String prm_aac001 =  MapUtils.getString(jsonObject,"prm_aac001");
        // 公民身份号码
        String prm_aac002 =  MapUtils.getString(jsonObject,"prm_aac002");
        // 姓名
        String prm_aac003 =  MapUtils.getString(jsonObject,"prm_aac003");
        // 性别
        String prm_aac004 =  MapUtils.getString(jsonObject,"prm_aac004");
        // 出生日期
        String prm_aac006 =  MapUtils.getString(jsonObject,"prm_aac006");
        // 年度
        String prm_aae001 =  MapUtils.getString(jsonObject,"prm_aae001");
        // 经办时间
        String prm_aae036 =  MapUtils.getString(jsonObject,"prm_aae036");
        // 支付类别
        String prm_aka130 =  MapUtils.getString(jsonObject,"prm_aka130");
        //  医疗人员类别
        String prm_akc021 =  MapUtils.getString(jsonObject,"prm_akc021");
        // 实足年龄
        String prm_akc023 =  MapUtils.getString(jsonObject,"prm_akc023");
        // 本次个人账户支付后帐户余额（GRZHYE）
        String prm_akc087 =  MapUtils.getString(jsonObject,"prm_akc087");
        // 本年真实住院次数
        String prm_akc090 =  MapUtils.getString(jsonObject,"prm_akc090");
        // 就诊编号
        String prm_akc190 =  MapUtils.getString(jsonObject,"prm_akc190");
        //  城乡居民卫计局补偿金额（卫计补偿）
        String prm_ake032 =  MapUtils.getString(jsonObject,"prm_ake032");
        // 其他基金支付(QTZCFY)(QTYBZF)
        String prm_ake173 =  MapUtils.getString(jsonObject,"prm_ake173");
        // 医疗救助补偿金额(MZZFJE)
        String prm_ake181 =  MapUtils.getString(jsonObject,"prm_ake181");
        // 优抚补偿金额(YFBCJE)
        String prm_ake183 =  MapUtils.getString(jsonObject,"prm_ake183");
        String prm_bzxj =  MapUtils.getString(jsonObject,"prm_bzxj");
        String prm_sdxj =  MapUtils.getString(jsonObject,"prm_sdxj");
        // 分中心编号
        String prm_yab003 =  MapUtils.getString(jsonObject,"prm_yab003");
        //  参保所属分中心
        String prm_yab139 =  MapUtils.getString(jsonObject,"prm_yab139");
        // 清算期号
        String prm_yae366 =  MapUtils.getString(jsonObject,"prm_yae366");
        // 单病种(结算)病种名称
        String prm_yka027 =  MapUtils.getString(jsonObject,"prm_yka027");
        // 单病种(结算)医疗机构自费费用
        String prm_yka028 =  MapUtils.getString(jsonObject,"prm_yka028");
        // 清算方式
        String prm_yka054 =  MapUtils.getString(jsonObject,"prm_yka054");
        // 费用总额(YBFYHJ)
        String prm_yka055 =  MapUtils.getString(jsonObject,"prm_yka055");
        // 全自费金额(QZFBF)
        String prm_yka056 =  MapUtils.getString(jsonObject,"prm_yka056");
        // 挂钩自付金额(YBXXZF)
        String prm_yka057 =  MapUtils.getString(jsonObject,"prm_yka057");
        //  进入起付线金额(BCQFX)(QFBZJE)
        String prm_yka058 =  MapUtils.getString(jsonObject,"prm_yka058");
        // 大额医疗支付金额
        String prm_yka062 =  MapUtils.getString(jsonObject,"prm_yka062");
        // 个人账户支付部分(GRZHZFJE)待增加
        String prm_yka065 =  MapUtils.getString(jsonObject,"prm_yka065");
        // 大额补充保险报销金额(DEBCBXBXJE)
        String prm_yka082 =  MapUtils.getString(jsonObject,"prm_yka082");
        // 大病额外报销金额(DBEWBX)
        String prm_yka083 =  MapUtils.getString(jsonObject,"prm_yka083");
        // 公务员额外报销金额(GWYEWBX)
        String prm_yka084 =  MapUtils.getString(jsonObject,"prm_yka084");
        // 工会额外报销金额(GHEWBX)
        String prm_yka085 =  MapUtils.getString(jsonObject,"prm_yka085");
        // 进口自付金额(JKZFJE)
        String prm_yka086 =  MapUtils.getString(jsonObject,"prm_yka086");
        // 诊疗超标自付金额(ZLCBZFJE)
        String prm_yka087 =  MapUtils.getString(jsonObject,"prm_yka087");
        // 床位超标自付金额(CWCBZFJE)
        String prm_yka088 =  MapUtils.getString(jsonObject,"prm_yka088");
        // 单病种(结算)编码
        String prm_yka089 =  MapUtils.getString(jsonObject,"prm_yka089");
        // 限价材料超标自付金额
        String prm_yka090 =  MapUtils.getString(jsonObject,"prm_yka090");
        // 结算编号
        String prm_yka103 =  MapUtils.getString(jsonObject,"prm_yka103");
        // 符合范围金额(YBFHFW)
        String prm_yka111 =  MapUtils.getString(jsonObject,"prm_yka111");
        // 已使用额度
        String prm_yka119 =  MapUtils.getString(jsonObject,"prm_yka119");
        // 基本统筹已累计金额
        String prm_yka120 =  MapUtils.getString(jsonObject,"prm_yka120");
        // 大额统筹已累计金额
        String prm_yka122 =  MapUtils.getString(jsonObject,"prm_yka122");
        // 超限额标志
        String prm_yka194 =  MapUtils.getString(jsonObject,"prm_yka194");
        // 基本医疗统筹支付金额(MZTCZFHJE)
        String prm_yka248 =  MapUtils.getString(jsonObject,"prm_yka248");
        // 清算类别
        String prm_yka316 =  MapUtils.getString(jsonObject,"prm_yka316");
        // 单病种(结算)包干标准
        String prm_yka345 =  MapUtils.getString(jsonObject,"prm_yka345");
        // 公务员补助普通门诊起付年度累计(含慢性病)
        String prm_yka368 =  MapUtils.getString(jsonObject,"prm_yka368");
        // 门诊产前补助(MZCQBZ)
        String prm_yka501 =  MapUtils.getString(jsonObject,"prm_yka501");
        // 医保结算费用总
        String prm_yka525 =  MapUtils.getString(jsonObject,"prm_yka525");
        // 规定病种起付线累计
        String prm_yka900 =  MapUtils.getString(jsonObject,"prm_yka900");
        // 慢性病门诊预设线累计
        String prm_yka902 =  MapUtils.getString(jsonObject,"prm_yka902");
        // 慢性病门诊补助年度累计
        String prm_yka903 =  MapUtils.getString(jsonObject,"prm_yka903");
        // 清算分中心
        String prm_ykb037 =  MapUtils.getString(jsonObject,"prm_ykb037");
        // 公务员级别
        String prm_ykc120 =  MapUtils.getString(jsonObject,"prm_ykc120");
        // 居民医疗人员类别
        String prm_ykc280 =  MapUtils.getString(jsonObject,"prm_ykc280");
        // 居民医疗人员身份
        String prm_ykc281 =  MapUtils.getString(jsonObject,"prm_ykc281");
        // 城乡居民人员类别，目前 仅限贵安，六盘水
        String prm_ykc299 =  MapUtils.getString(jsonObject,"prm_ykc299");
        // 重大疾病标识（1 为重大疾病）
        String prm_ykd092 =  MapUtils.getString(jsonObject,"prm_ykd092");
        // 本年公务员门诊补助累计额(含慢性病)
        String prm_yke025 =  MapUtils.getString(jsonObject,"prm_yke025");
        // 公务员补助报销金额(GWYBXJE)
        String prm_yke030 =  MapUtils.getString(jsonObject,"prm_yke030");
        String prm_ysxj =  MapUtils.getString(jsonObject,"prm_ysxj");
        // 本次现金支付（GRZFJE）
        String psn_cash_pay =  MapUtils.getString(jsonObject,"psn_cash_pay");
        String selfUnderFees =  MapUtils.getString(jsonObject,"selfUnderFees");
    }

    {
        System.out.println("123");
    }
}
