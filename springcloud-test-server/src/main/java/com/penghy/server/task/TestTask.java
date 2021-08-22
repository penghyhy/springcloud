package com.penghy.server.task;

import com.alibaba.fastjson.JSONArray;
import com.penghy.server.bean.ResultBean;
import com.penghy.server.bean.TaskDataBean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * 具体执行业务任务 需要 实现ITask接口  在execute中重写业务逻辑
 * TestTask<BR>
 * @author HY-001
 * @date 2021-08-21
 * @version 2.0
 *
 */
public class TestTask implements ITask<ResultBean<String>, TaskDataBean> {

    @Override
    public ResultBean execute(TaskDataBean taskDataBean, Map<String, Object> params) {
        /**
         * 具体业务逻辑：将list中的元素加上辅助参数中的数据返回
         */
        int addNum = Integer.valueOf(String.valueOf(params.get("addNum")));
        Integer e = taskDataBean.getId();
        e = e + addNum;

        taskDataBean.setValue(e);
//        ResultBean<TaskDataBean> resultBean = ResultBean.newInstance();
        ResultBean<TaskDataBean> resultBean = new ResultBean<>();
        resultBean.setData(taskDataBean);
        return resultBean;
    }

    public static void main(String[] args) {
        // 需要多线程处理的大量数据list
        List<TaskDataBean> data = new ArrayList<TaskDataBean>(10000);
        TaskDataBean taskDataBean = null;
        for(int i = 0; i < 10000; i ++){
            taskDataBean = new TaskDataBean();
            taskDataBean.setDiseaseId(i+"ID");
            taskDataBean.setId(i+1);
            taskDataBean.setDictBookId("201");
            data.add(taskDataBean);
        }

        // 创建多线程处理任务
        MultiThreadUtils<TaskDataBean> threadUtils = MultiThreadUtils.newInstance(5);
        ITask<ResultBean<String>, TaskDataBean> task = new TestTask();
        // 辅助参数  加数
        Map<String, Object> params = new HashMap<>();
        params.put("addNum", 4);
        // 执行多线程处理，并返回处理结果
        ResultBean<List<ResultBean<String>>> resultBean = threadUtils.execute(data, params, task);
        System.out.println(JSONArray.toJSON(resultBean).toString());
    }


}