package com.meishihome.photo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * User: lianghongbin
 * Date: 12-6-28
 * Time: 下午12:54
 * Function: 以本地线程池方式接受图片处理请求
 */
public class DefaultProcessorImpl implements Processor {

    private static final Logger logger = LoggerFactory.getLogger(DefaultProcessorImpl.class);
    private static ExecutorService executorService;
    private AbstractExecutorFactory executorFactory;
    private static AtomicInteger threadCount = new AtomicInteger(0);

    /**
     * 获取线程计数器
     * @return 线程数
     */
    public static int getThreadCount(){
        return threadCount.get();
    }

    static {
        int poolSize = 10;  //设置线程池默认值

        executorService = Executors.newFixedThreadPool(poolSize);
    }

    public void setExecutorFactory(AbstractExecutorFactory executorFactory) {
        this.executorFactory = executorFactory;
    }

    /**
     * 线程池实例化图片压缩类
     *
     * @param operation 操作数据
     * @return 返回byte数组
     */
    public byte[] process(Operation operation) {

        CallableWorker worker = new CallableWorker(operation, executorFactory);

        try {
            return executorService.submit(worker).get();
        } catch (Exception ex) {
            logger.error("concurrent thread run error!", ex);
        }

        return new byte[0];
    }



}
