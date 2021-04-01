package com.penghy.client.cotroller;


import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


@RestController
public class JobController {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();

        int jobs = 10;//假设一个任务需要10个job

        //固定个数的线程池
        ExecutorService service = Executors.newFixedThreadPool(jobs);

        //每个job结束时，则报告一下结束，所有job都结束时，则任务结束
        CountDownLatch latch = new CountDownLatch(jobs);

        for (int i = 0; i < jobs; i++) {//准备执行
            Job job = new Job("job" + i, latch);
            service.submit(job);
        }

        //等待所有job结束
        latch.await();

        //注意：此时main线程已经要结束了，但是service线程如果不关闭是不会结束的
        service.shutdown();

        long end = System.currentTimeMillis();
        System.out.println(">>>>>>>>任务总耗时" + (end - start) + "ms");
    }

}


/**
 * job类
 */
class Job implements Runnable {
    /**
     * job名称
     */
    private String jobName;

    /**
     * 同步计数器(倒数计数锁:当倒数到0时触发事件，也就是开锁，其他人就可以进入了。)
     */
    private CountDownLatch latch;

    /**
     * 构造函数
     * @param jobName job名称
     * @param latch   同步计数器
     */
    public Job(String jobName,CountDownLatch latch){
        this.jobName =  jobName;
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            System.out.println(jobName+" has start...");
            long useTime  = (long)(Math.random()*1000);
            Thread.sleep(useTime);//模拟job需要的时间
            System.out.println(jobName+" has finished,useTime="+useTime);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            latch.countDown();//报告job结束了
        }
    }

}
