package com.xinfu.threadpool;

/**
 * @Author: linxinfu
 * @Date: Created in 2018/1/10 18:38
 * @Description:
 * @Email: linxinfu2018@qq.com
 */
public class BWorker extends Worker {

    /**
     * 重写call方法,用于返回金钱
     * 注 : Callable 接口的入口是call方法，业务解耦时将业务代码抽象为方法，
     *      再在call方法里面调用并返回。
     */
    @Override
    public Integer call() {
        int money = showMyMoney();
        return money;
    }

    @Override
    public int showMyMoney() {
        int money = 200;
        System.out.println("我是业务B, 返回的金钱是：" + money);
        return money;
    }
}
