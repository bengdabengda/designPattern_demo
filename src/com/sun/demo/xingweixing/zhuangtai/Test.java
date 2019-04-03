package com.sun.demo.xingweixing.zhuangtai;

public class Test {
}

/**
 * 对象类，环境类
 */
class Obj{
    private Status status;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}

/**
 * 抽象状态类
 */
abstract class Status{
    protected Obj obj;
    abstract void open();
    abstract void close();
}

/**
 * 实际状态类：开启
 */
class Open extends Status{

    public Open(Obj o) {
        obj = o;
    }

    void open() {
        System.out.println("已经打开了");
    }

    void close() {
//        obj.setStatus(new Close(this));
    }
}

/**
 * 实际状态类：关闭
 */
class Close extends Status{

    public Close(Obj o) {
        obj = o;
    }

    void open() {

    }

    @Override
    void close() {
        System.out.println("已经关闭了");
    }
}