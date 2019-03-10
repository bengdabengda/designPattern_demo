package com.sun.demo.xingweixing.zhizelian;

public class Test {
    public static void main(String[] args) {
        //定义不同的处理者
        AbstractHandle handle1,handle2,handle3,handle4;
        handle1 = new HandleOne();
        handle2 = new HandleTwo();
        handle3 = new HandleThree();
        handle4 = new HandleMore();

        //处理者之间关系
        handle1.setHandle(handle2);
        handle2.setHandle(handle3);
        handle3.setHandle(handle4);

        handle1.handleRequest(8);
        handle1.handleRequest(18);
        handle1.handleRequest(28);
        handle1.handleRequest(38);
    }
}

/**
 * AbstractHandle：抽象处理着
 */
abstract class AbstractHandle{
    protected AbstractHandle handle;

    public void setHandle(AbstractHandle handle) {
        this.handle = handle;
    }

    public abstract void handleRequest(Integer num);
}

/**
 * 具体处理者一，处理小于10的数据
 */
class HandleOne extends AbstractHandle{
    @Override
    public void handleRequest(Integer num) {
        if(num < 10){
            System.out.println("小于10");
        }else{
            handle.handleRequest(num);
        }
    }
}

/**
 * 具体处理者二，处理大于等于10小于20的数据
 */
class HandleTwo extends AbstractHandle{
    @Override
    public void handleRequest(Integer num) {
        if(num < 20){
            System.out.println("大于等于10且小于20");
        }else{
            handle.handleRequest(num);
        }
    }
}

/**
 * 具体处理者三，处理大于等于20小于30的数据
 */
class HandleThree extends AbstractHandle{
    @Override
    public void handleRequest(Integer num) {
        if(num < 30){
            System.out.println("大于等于20且小于30");
        }else{
            handle.handleRequest(num);
        }
    }
}
class HandleMore extends AbstractHandle{
    @Override
    public void handleRequest(Integer num) {
        System.out.println("大于等于30");
    }
}
