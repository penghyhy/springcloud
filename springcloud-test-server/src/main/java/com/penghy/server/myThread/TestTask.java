package com.penghy.server.myThread;

import com.alibaba.fastjson.JSONArray;
import com.penghy.server.bean.TaskDataBean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 具体执行业务任务 需要 实现ITask接口  在execute中重写业务逻辑
 * TestTask<BR>
 *
 * @author HY-001
 * @version 2.0
 * @date 2021-08-21
 */
public class TestTask {
    public static void main(String[] args) {
        // 需要多线程处理的大量数据list
        List<TaskDataBean> data = new ArrayList<TaskDataBean>(100000);
        TaskDataBean taskDataBean = null;
        for (int i = 0; i < 100000; i++) {
            taskDataBean = new TaskDataBean();
            taskDataBean.setDiseaseId(i + "PHY");
            taskDataBean.setId(i + 1);
            taskDataBean.setDictBookId("201");
            data.add(taskDataBean);
        }

        // 创建多线程处理任务
        MultiThreadUtils<TaskDataBean> threadUtils = MultiThreadUtils.newInstance(5);
        IMyTask<TaskDataBean, TaskDataBean> task = new MyTaskServiceImpl();
        // 辅助参数  加数
        Map<String, Object> params = new HashMap<>();
        params.put("addNum", 4);
        // 执行多线程处理，并返回处理结果
        TaskDataBean resultBean = threadUtils.execute(data, params, task);
//        System.out.println(JSONArray.toJSON(resultBean).toString());
    }


}