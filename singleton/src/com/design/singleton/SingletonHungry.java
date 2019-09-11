package com.design.singleton;

/**
 * 单例模式(饿汉模式)
 * @author li
 * @date 2019/9/11
 */
public class SingletonHungry {
    /**
     * 将构造方法私有化，不允许外部直接创建对象实例
     */
    private SingletonHungry(){}

    /**
     * 创建类的唯一实例
     */
    private static SingletonHungry instance = new SingletonHungry();

    /**
     * 提供一个获取实例的方法
     * @return Singleton
     */
    public static SingletonHungry getInstance(){
        return instance;
    }
}
