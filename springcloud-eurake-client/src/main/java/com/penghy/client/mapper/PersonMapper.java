package com.penghy.client.mapper;

import com.penghy.client.bean.Disease;
import com.penghy.client.bean.Person;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PersonMapper {

    @Select("select id,name from person")
    List<Person> select();

//    @Insert("insert into person (id, name) values (#{id}, #{name})")
    int insert(Person person);

    @Update("update si_pub_dict set search_code1 = #{searchCode1} where increment_id = #{incrementId}")
    void update(@Param("incrementId") int incrementId, @Param("searchCode1") String searchCode1);


//    @Select("select * from si_disease")
//    List<Disease> selectDisease();


    //    @Select("select drug_Chinese_name disease_Chinese_name,increment_id,search_code1 from si_drug_dict")
    @Select("select insure_dict_name disease_Chinese_name, increment_id, search_code1 from si_pub_dict where dict_book_id in ('97','1011','1000','1012')")
    List<Disease> selectDisease();
}
