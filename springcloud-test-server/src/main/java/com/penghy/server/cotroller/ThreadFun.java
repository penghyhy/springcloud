package com.penghy.server.cotroller;


import com.alibaba.fastjson.JSONArray;
import com.penghy.server.myThread.MultiThreadUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 多线程分段处理List集合
 * 场景:大数据List集合,需要对List集合中的数据进行处理
 * @author clove
 *
 */
public class ThreadFun {
    private static Logger logger = LoggerFactory.getLogger(ThreadFun.class);
    public static void main(String[] args) {

        int lll = 1434%1434;
        System.out.println(lll);
        // 开始时间（ms）
        long l = System.currentTimeMillis();
        List<String> list = new ArrayList<String>();

        for (int i = 1; i <= 3000; i++) {
            list.add(i + "");
        }
        // 每500条数据开启一条线程
        int threadSize = 500;
        // 总数据条数
        int dataSize = list.size();
        // 线程数
        int threadNum = 1;
        threadSize = dataSize/threadNum;
        // 定义标记,过滤threadNum为整数
        boolean special = dataSize % threadSize == 0;

        // 创建一个线程池
        ExecutorService exec = Executors.newFixedThreadPool(threadNum);
        // 定义一个任务集合
        List<Callable<Boolean>> tasks = new ArrayList<Callable<Boolean>>();
        Callable<Boolean> task = null;
        List<String> cutList = null;

        // 确定每条线程的数据
        for (int i = 0; i < threadNum; i++) {
            if (i == threadNum - 1) {
                if (special) {
                    break;
                }
                cutList = list.subList(threadSize * i, dataSize);
            } else {
                cutList = list.subList(threadSize * i, threadSize * (i + 1));
            }
            final List<String> listStr = cutList;
            task = new Callable<Boolean>() {
                @Override
                public Boolean call() throws Exception {
                    if (null != listStr && listStr.size() > 0) {
                            // 调用业务方法
                            downloadFile(listStr);
                    }
                    return true;
                }
            };
            tasks.add(task);
        }

        try {
            exec.invokeAll(tasks);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 关闭线程池
        exec.shutdown();
        long ll = System.currentTimeMillis();
        logger.info("总耗时:{}ms", (ll - l));
    }

    private static void downloadFile(List<String> listStr) {
        //执行多线程文件下载业务逻辑
        System.out.println(JSONArray.toJSON(listStr).toString());
    }

}