package com.penghy.server.uploadtest.service;

import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

public interface Importservice {
    Map<String,Object> importTprkxx(MultipartFile file);
}
