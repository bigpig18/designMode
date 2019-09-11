package com.design.singleton;

/**
 * 单例模式(懒汉模式)
 * @author li
 * @date 2019/9/11
 */
public class SingletonIdler {

    /**
     * 私有化构造模式
     */
    private SingletonIdler(){};

    /**
     * 声明类的唯一实例(只声明，并未实例化)
     */
    private static SingletonIdler instance;

    /**
     * 提供一个获取实例的方法
     * @return SingletonFull
     */
    public static SingletonIdler getInstance(){
        if (instance == null){
            instance = new SingletonIdler();
        }
        return instance;
    }
}
