package com.penghy.server.mapper;

import com.penghy.server.bean.ItemDict;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 医疗保险reckon参数表
 *
 * @author penghuaiyang11
 * @date 2021-03-08
 */
@Mapper
public interface DrugDictTempMapper {

    /**
     * 单个插入
     *
     * @param ItemDict
     * @return
     */
    Long insertItemDict(ItemDict ItemDict);

    /**
     * 批量新增
     *
     * @param ItemDictList
     * @return
     */
    Long insertBatch(@Param("list") List<ItemDict> ItemDictList);

    /**
     * 单个更新
     *
     * @param ItemDict
     * @return
     */
    Long updateItemDict(ItemDict ItemDict);

    /**
     * 删除
     *
     * @param ItemDict
     * @return
     */
    Long deleteItemDict(ItemDict ItemDict);

    /**
     * 查询所有
     *
     * @param ItemDict
     * @return
     */
    List<ItemDict> queryItemDictList(ItemDict ItemDict);


    List<ItemDict> queryDrugDictTempList(ItemDict ItemDict);


    /**
     * 单个查询
     *
     * @param ItemDict
     * @return
     */
    ItemDict getItemDict(ItemDict ItemDict);

    List<Map<String,Object>> getTradeLogs();
}