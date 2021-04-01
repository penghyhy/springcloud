package com.penghy.server.service.impl;

import com.penghy.server.mapper.UserInfoMapper;
import com.penghy.server.model.UserVo;
import com.penghy.server.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper personMapper;  //这里会有报错，不用管

    public List<UserVo> select() {
        return personMapper.select();
    }

    public int insert(String name) {
        return personMapper.insert(name);
    }
}
