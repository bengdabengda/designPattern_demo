package com.sun.demo.chuangjianxing.jianzaozhe;

/**
 * 抽象建造者对象
 */
public abstract class Build {
    protected static Person person = new Person();

    public abstract void buildHead();
    public abstract void buildBody();
    public abstract void buildHand();

    public Person buildPerson(){
        return person;
    }

    //钩子函数，控制对象是否要有头
    public boolean neadHead(){
        return true;
    }
}
