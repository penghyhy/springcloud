package com.penghy.server.myThread;

import com.penghy.server.bean.TaskDataBean;

import java.util.Map;

public class MyTaskServiceImpl implements IMyTask<TaskDataBean, TaskDataBean> {

    @Override
    public TaskDataBean execute(TaskDataBean taskDataBean, Map<String, Object> params) {
        /**
         * 具体业务逻辑：将list中的元素加上辅助参数中的数据返回
         */
        int addNum = Integer.valueOf(String.valueOf(params.get("addNum")));
        Integer e = taskDataBean.getId();
        e = e + addNum;

        taskDataBean.setValue(e);
//        ResultBean<TaskDataBean> resultBean = ResultBean.newInstance();
        return taskDataBean;
    }
}
