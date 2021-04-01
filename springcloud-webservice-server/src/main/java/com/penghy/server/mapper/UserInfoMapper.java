package com.penghy.server.mapper;


import com.penghy.server.model.UserVo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserInfoMapper {

    @Select("select id,name from person")
    List<UserVo> select();

    @Insert("insert into test(name) values(#{name})")
    int insert(@Param("name") String name);
}
