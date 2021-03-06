package com.penghy.server.mapper;

import com.penghy.server.bean.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

@Mapper
public interface PersonMapper {

    @Select("select id,name from person")
    List<Person> select();

    @Select("select settle_record_id,insure_settle_info from si_pati_trade where delete_flag=0")
    List<Person> select12();

    @Select("select trade_result_info from si_trade_logs where trade_type_code like '%0509%' and trade_param_info like '%20211129105452673521%'")
    List<String> selecttest();


    @Select("select increment_id, disease_Chinese_name,search_code1 from si_disease_copy1")
    List<Map<String, Object>> selectwowjoyOtherdict();

    //    @Insert("insert into person (id, name) values (#{id}, #{name})")
    int insert(ItemDict itemDict);

    @Update("update si_drug_dict_phy set search_code1 = #{searchCode1} where increment_id = #{incrementId}")
    void update(@Param("incrementId") int incrementId, @Param("searchCode1") String searchCode1);


    @Update("update si_drug_dict set search_code1 = #{searchCode1} where increment_id = #{incrementId}")
    void updatetwowjoydrugdict(@Param("incrementId") int incrementId, @Param("searchCode1") String searchCode1);


    @Update("update si_order_dict set search_code1 = #{searchCode1} where increment_id = #{incrementId}")
    void updatetwowjoyorderdict(@Param("incrementId") int incrementId, @Param("searchCode1") String searchCode1);

    @Update("update si_operation set search_code1 = #{searchCode1} where increment_id = #{incrementId}")
    void updatetwowjoyoperationdict(@Param("incrementId") int incrementId, @Param("searchCode1") String searchCode1);


    @Update("update si_pub_dict set search_code1 = #{searchCode1} where increment_id = #{incrementId}")
    void updatetwowjoypubdict(@Param("incrementId") int incrementId, @Param("searchCode1") String searchCode1);


    @Update("update si_disease_copy1 set search_code1 = #{search_code1} where increment_id = #{increment_id}")
    void updatewowjoyOtherdict(@Param("increment_id") int incrementId, @Param("search_code1") String searchCode1);

    List<ItemDict> queryaaaaaList();

    int insertDrugDict(DrugDict1 drugDict);

    int insertOrderDict(OrderDict1 orderDict);

    int insertBatch(List<DrugDictSub> drugDictSubs);

    int insertorderBatch(List<OrderDictSub> orderDictSubs);

    List<DrugDict1> selectDrugDict();

    List<DrugDict1> selectwowjoydrugdict();

    List<OrderDict1> selectwowjoyorderdict();

    List<Opeartion> selectwowjoyopearationdict();

    List<PubDict> selectwowjoypubdict();

    List<Disease1> selectwowjoydisease();

    int insertDisease(ItemDict itemDict);

//    @Select("select * from si_disease")
//    List<Disease1> selectDisease();

    List<String> getincrementId();

    void insertPRK(@Param("updateField") String updateField);
}
