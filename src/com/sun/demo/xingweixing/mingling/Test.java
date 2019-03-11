package com.sun.demo.xingweixing.mingling;

public class Test {
    public static void main(String[] args) {
        Jisuanqi j = new Jisuanqi(new AddCommand());
        j.add(10);
        j.add(5);
        j.add(4);
        j.add(6);
        j.revert();
    }
}


/**
 * Jisuanqi:计算器类，请求发送者
 */
class Jisuanqi {
    private Command command;

    public Jisuanqi(Command command) {
        this.command = command;
    }

    public void add(Integer value){
        command.add(value);
    }

    //回滚操作
    public void revert(){
        command.revert();
    }
}


/**
 * 抽象命令类
 */
abstract class Command {
    public abstract void add(Integer value);
    public abstract void revert();
}

/**
 * AddCommand：加法命令，具体命令类
 */
class AddCommand extends Command {
    private AddHelper addHelper = new AddHelper();
    private Integer value;
    private Integer num = 0;

    public void add(Integer value) {
        this.value = value;
        num = addHelper.add(num, value);
        System.out.println("结果是:"+num);
    }

    public void revert() {
        num = addHelper.add(num, -value);
        System.out.println("结果是:"+num);
    }
}

/**
 * AddHelper：接收者，对数据的操作
 */
class AddHelper{
    public int add(Integer num, Integer value){
        return num + value;
    }
}