package com.sun.demo.chuangjianxing.jianzaozhe;

/**
 * 具体建造者，建造男性对象
 */
public class ManBuild extends Build {
    @Override
    public void buildHead() {
        person.setHead("男性头");
        System.out.println("创建男性head");
    }

    @Override
    public void buildBody() {
        person.setBody("男性身体");
        System.out.println("创建男性body");
    }

    @Override
    public void buildHand() {
        person.setHand("男性手");
        System.out.println("创建男性hand");
    }

    //钩子函数，子类控制自己的对象是否需要头参数
    @Override
    public boolean neadHead() {
        return false;
    }
}
