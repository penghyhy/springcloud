package com.penghy.server.myThread;


import com.penghy.server.bean.ResultBean;
import com.penghy.server.bean.TaskDataBean;
import com.penghy.server.task.ITask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;


/**
 *
 *
 * HandleCallable<BR>
 * @author HY-001
 * @date 2021-08-21
 *
 * @version 2.0
 *
 */
@SuppressWarnings("rawtypes")
public class HandleCallable<E> implements Callable<TaskDataBean> {
    private static Logger logger = LoggerFactory.getLogger(HandleCallable.class);
    // 线程名称
    private String threadName = "";
    // 需要处理的数据
    private List<E> data;
    // 辅助参数
    private Map<String, Object> params;
    // 具体执行任务
    private IMyTask<TaskDataBean, E> task;

    public HandleCallable(String threadName, List<E> data, Map<String, Object> params,
                          IMyTask<TaskDataBean, E> task) {
        this.threadName = threadName;
        this.data = data;
        this.params = params;
        this.task = task;
    }

    @Override
    public TaskDataBean call() throws Exception {
        // 该线程中所有数据处理返回结果
        TaskDataBean resultBean = new TaskDataBean();
        if (data != null && data.size() > 0) {
            logger.info("线程：{},共处理:{}个数据，开始处理......", threadName, data.size());
            // 返回结果集
            List<TaskDataBean> resultList = new ArrayList<>();
            // 循环处理每个数据
            for (int i = 0; i < data.size(); i++) {
                // 需要执行的数据
                E e = data.get(i);
                // 将数据执行结果加入到结果集中
                resultList.add(task.execute(e, params));
                logger.info("线程：{},第{}个数据，处理完成", threadName, (i + 1));
            }
            logger.info("线程：{},共处理:{}个数据，处理完成......", threadName, data.size());
            resultBean.setTaskDataBeanList(resultList);
        }
        return resultBean;
    }

}