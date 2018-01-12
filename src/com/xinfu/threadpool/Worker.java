package com.xinfu.threadpool;

import java.util.concurrent.Callable;
/**
 * @Author: linxinfu
 * @Date: Created in 2018/1/10 18:38
 * @Description:
 * @Email: linxinfu2018@qq.com
 */

/**
 * 建立Worker抽象类，代表抽象业务，实现Callable接口
 */
    public abstract class Worker implements Callable<Integer> {
    //获取业务金钱
    public abstract int showMyMoney();
}
