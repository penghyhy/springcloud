package com.penghy.server.mapper;

import com.penghy.server.bean.DrugDict;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * DrugDict 保险药品目录
 *
 * @author tianshuai
 * @date 2019-03-26
 */
@Mapper
public interface DrugDictMapper {

    /**
     * 单个插入
     *
     * @param entity
     * @return
     */
    Long insertDrugDict(DrugDict entity);

    /**
     * 批量新增
     *
     * @param list
     * @return
     */
    Long insertBatch(@Param("list") List<DrugDict> list);

    /**
     * 批量更新
     *
     * @param list
     * @return
     */
    Long updateDrugDictBatch(@Param("list") List<DrugDict> list);

    Long updateDrugDict(DrugDict drugDict);

    /**
     * 删除
     *
     * @param drugDict
     * @return
     */
    Long deleteDrugDict(DrugDict drugDict);

    /**
     * 查询列表
     *
     * @param drugDict
     * @return
     */
    List<DrugDict> queryDrugDictList(DrugDict drugDict);


    /**
     * 单个查询
     *
     * @param entity
     * @return
     */
    DrugDict getDrugDict(DrugDict entity);

    /**
     * queryDrugDictByInsureDrugCodes
     *
     * @param dictBookId
     * @param insureDrugCodeList
     * @return
     */
    List<DrugDict> queryDrugDictByInsureDrugCodes(@Param("dictBookId") String dictBookId, @Param("insureDrugCodeList") ArrayList insureDrugCodeList);

    /**
     * 查询列表ByDictBookId 不区分是否删除
     *
     * @param drugDict
     * @return
     */
    List<DrugDict> queryDrugDictListByDictBookId(DrugDict drugDict);

    /**
     * 获取保险药品目录
     *
     * @param param
     * @return
     */
    Map<String, Object> selectDrugDict(Map<String, Object> param);

    /**
     * 查询保险药品目录信息
     *
     * @param mediInsureId
     * @param orgCode
     * @param drugSpecId
     * @param execTime
     * @param personStyleCode
     * @param drugFactoryId
     * @return
     * @date 2019-11-14
     */
    DrugDict getDrugDictInfo(@Param("mediInsureId") String mediInsureId, @Param("orgCode") String orgCode, @Param("drugSpecId") String drugSpecId, @Param("execTime") String execTime, @Param("personStyleCode") String personStyleCode, @Param("drugFactoryId") String drugFactoryId);

    /**
     * 单个查询,于2020-12-21 phy创建，以后为医保相关统一使用
     *
     * @param params
     * @return
     */
    Map<String, Object> getSiDrugDict(Map<String, Object> params);
}