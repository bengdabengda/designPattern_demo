package com.sun.demo.chuangjianxing.danli;

/**
 * 懒汉模式：线程不安全
 */
public class Earth {

    private static Earth earth;

    private Earth(){
        System.out.println("Earth对象被创建");
    }

    public static Earth getEarth() {
        if(earth == null){
            earth = new Earth();
        }
        return earth;
    }


}
