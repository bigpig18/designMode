package com.design.singleton;

/**
 * @author li
 * @date 2019/9/11
 */
public class Test {

    public static void main(String[] args) {
        //这里无论我们获取了多少次，都是同一个实例

        //饿汉模式
        SingletonHungry s1 = SingletonHungry.getInstance();
        SingletonHungry s2 = SingletonHungry.getInstance();

        System.out.println(s1 == s2);

        //懒汉模式
        SingletonIdler s3 = SingletonIdler.getInstance();
        SingletonIdler s4 = SingletonIdler.getInstance();
        System.out.println(s3 == s4);
    }
}
