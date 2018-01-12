package com.xinfu.threadpool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @Author: linxinfu
 * @Date: Created in 2018/1/10 18:38
 * @Description:
 * @Email: linxinfu2018@qq.com
 */
public class Test {
    public static void main(String[] args) {
        int allMoney = 0;
        //利用EexcutorService建立容量为5的线程池
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(20);
        //建立list容器用于存储业务任务
        List<Worker> list = new ArrayList<>();
        //invokeAll方法运行后将结果存储在Future里面，创建集合来接收结果
        List<Future<Integer>> future = new ArrayList<>();
        list.add(new AWorker());
        list.add(new AWorker());
        list.add(new AWorker());
        list.add(new AWorker());
        list.add(new AWorker());
        list.add(new AWorker());
        list.add(new BWorker());
        list.add(new BWorker());
        list.add(new BWorker());
        list.add(new BWorker());
        list.add(new BWorker());
        list.add(new BWorker());
        list.add(new BWorker());
        list.add(new BWorker());
        list.add(new BWorker());
        list.add(new BWorker());
        list.add(new BWorker());
        list.add(new BWorker());
        list.add(new BWorker());
        try {
            future = fixedThreadPool.invokeAll(list);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //遍历结果，将金钱数加起来
        for (Future f : future) {
            try {
                allMoney += (int) f.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        System.out.println("总的金钱数为：" + allMoney);
    }
}
