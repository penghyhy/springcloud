package com.penghy.server.uploadtest.service.impl;

import com.penghy.server.uploadtest.ImportExcelUtil;
import com.penghy.server.uploadtest.TbZbzs;
import com.penghy.server.uploadtest.service.Importservice;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.text.SimpleDateFormat;
import java.util.*;


@Service
public class ImportserviceImpl implements Importservice {

    public Map<String,Object> importTprkxx(MultipartFile file){
        Map<String,Object> resultMap = new HashMap<>();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        List<TbZbzs> tbZbzsList = new ArrayList<>();

        try {

            //验证文件类型
            if (!file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".")).equals(".xls")&&!file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".")).equals(".xlsx")){
                resultMap.put("mete", "文件类型有误！请上传Excle文件");
                throw new Exception("文件类型有误！请上传Excle文件");
            }

            //获取数据
            List<List<Object>> olist = ImportExcelUtil.getListByExcel(file.getInputStream(), file.getOriginalFilename());

            resultMap.put("导入成功",200);
            //封装数据
            for (int i = 0; i < olist.size(); i++) {
                List<Object> list = olist.get(i);
                if (list.get(0) == "" || ("序号").equals(list.get(0))) {
                    continue;
                }
                TbZbzs tbZbzs = new TbZbzs();
                tbZbzs.setId(UUID.randomUUID().toString().replace("-", "").substring(0, 20));
                //根据下标获取每一行的每一条数据
                if (String.valueOf(list.get(0))==null||String.valueOf(list.get(0)).equals("")) {
                    resultMap.put("mete", "部门不能为空");
                    throw new Exception("部门不能为空");
                }

                tbZbzs.setBm(String.valueOf(list.get(0)));

                if (String.valueOf(list.get(1))==null||String.valueOf(list.get(1)).equals("")) {
                    resultMap.put("mete", "值班上报不能为空");
                    throw new Exception("值班上报不能为空");
                }
                tbZbzs.setZbsb(String.valueOf(list.get(1)));

                if (String.valueOf(list.get(2))==null||String.valueOf(list.get(2)).equals("")) {
                    resultMap.put("mete", "值班人员不能为空");
                    throw new Exception("值班人员不能为空");
                }
                tbZbzs.setZbry(String.valueOf(list.get(2)));

                if (String.valueOf(list.get(3))==null||String.valueOf(list.get(3)).equals("")) {
                    resultMap.put("mete", "导入失败,上报时间不能为空");
                    throw new Exception("导入失败,上报时间不能为空");
                }

//                try {
//                    tbZbzs.setSbsj(simpleDateFormat.parse(String.valueOf(list.get(3))));
//                }catch (ParseException e){
//                    resultMap.put("mete","请填写正确的时间格式！");
//                    throw new Exception("请填写正确的时间格式！");
//                }


                if (String.valueOf(list.get(4))==null||String.valueOf(list.get(4)).equals("")) {
                    resultMap.put("mete", "导入失败,结束时间不能为空");
                    throw new Exception("导入失败,结束时间不能为空");
                }

//                try {
//                    tbZbzs.setJssj(simpleDateFormat.parse(String.valueOf(list.get(4))));
//                }catch (ParseException e){
//                    resultMap.put("mete","请填写正确的时间格式！");
//                    throw new Exception("请填写正确的时间格式！");
//                }

                if (String.valueOf(list.get(5))==null||String.valueOf(list.get(5)).equals("")) {
                    resultMap.put("mete", "联系方式不能为空");
                    throw new Exception("导入失败,联系方式不能为空");
                }
                tbZbzs.setLxfs(String.valueOf(list.get(5)));

                if (String.valueOf(list.get(6))==null||String.valueOf(list.get(6)).equals("")) {
                    resultMap.put("mete", "状态不能为空");
                    throw new Exception("导入失败,状态不能为空");
                }
                tbZbzs.setZt(String.valueOf(list.get(6)));

                if (String.valueOf(list.get(7))==null||String.valueOf(list.get(7)).equals("")) {
                    resultMap.put("mete", "逻辑删除不能为空");
                    continue;
                }
//                tbZbzs.setDelFlag(String.valueOf(list.get(7)));

                if (String.valueOf(list.get(8))==null||String.valueOf(list.get(8)).equals("")) {
                    resultMap.put("mete", "导入失败,创建时间不能为空");
                    throw new Exception("导入失败,创建时间不能为空");

                }
//                try {
//                    tbZbzs.setCreateDate(simpleDateFormat.parse(String.valueOf(list.get(8))));
//                }catch (ParseException e){
//                    resultMap.put("mete","请填写正确的时间格式！");
//                    throw new Exception("请填写正确的时间格式！");
//                }
                tbZbzsList.add(tbZbzs);
            }

//            int i = tbZbzsDao.insertTbZbzsList(tbZbzsList);
//            if (i != 0) {
//                resultMap.put("state", 200);
//            }else {
//                resultMap.put("mete","文档内无数据，请重新导入");
//                resultMap.put("state", 500);
//            }

        } catch (Exception e) {
            e.printStackTrace();

        }finally {
            return resultMap;
        }
    }
}
