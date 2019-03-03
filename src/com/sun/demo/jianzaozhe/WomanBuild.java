package com.sun.demo.jianzaozhe;

/**
 * 具体建造者，建造女性对象
 */
public class WomanBuild extends Build {
    @Override
    public void buildHead() {
        person.setHead("女性头");
        System.out.println("创建女性head");
    }

    @Override
    public void buildBody() {
        person.setBody("女性身体");
        System.out.println("创建女性body");
    }

    @Override
    public void buildHand() {
        person.setHand("女性手");
        System.out.println("创建女性hand");
    }
}
