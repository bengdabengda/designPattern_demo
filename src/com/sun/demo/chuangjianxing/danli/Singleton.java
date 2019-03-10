package com.sun.demo.chuangjianxing.danli;

/**
 * 使用静态内部类，实现懒汉模式中的懒加载，同时实现饿汉模式中的线程安全
 */
public class Singleton {
    private Singleton() {
    }

    private static class HolderClass {
        private final static Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return HolderClass.instance;
    }
}
