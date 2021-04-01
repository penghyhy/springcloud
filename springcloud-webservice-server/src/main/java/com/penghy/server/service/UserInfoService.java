package com.penghy.server.service;

import com.penghy.server.model.UserVo;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface UserInfoService {


     List<UserVo> select();

     int insert(String name);
}
