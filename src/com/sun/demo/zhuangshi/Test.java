/*
 * Copyright (C), 2015-2019, 壹永科技有限公司
 * FileName: Test
 * Author:   sun
 * Date:     2019/3/6 17:02
 * History:
 * <author>          <time>                <version>
 *   sun         2019/3/6 17:02           v1.0.0
 */
package com.sun.demo.zhuangshi;

/**
 * 装饰模式
 *
 * @author sun
 * @create 2019/3/6
 * @since v1.0.0
 */
public class Test {
    public static void main(String[] args) {
        //透明装饰模式
        System.out.println("-----透明装饰模式-----");
        Phone p1,p2,p3;
        p1 = new IPhone();
        p1.display();

        System.out.println("---- ----");

        //在原来的基础上，新增加发短信的方法
        p2 = new Message(p1);
        p2.display();

        System.out.println("---- ----");

        //在原来发短信的基础上，新增加玩游戏的方法
        p3 = new Game(p2);        //第二次装饰
        p3.display();

        //。。。。。可以一直扩展下去


        //半透明装饰模式
        System.out.println("-----半透明装饰模式-----");

        Phone p4;
        Message p5;
        p4 = new IPhone();
        p4.display();

        System.out.println("---- ----");

        //在原来的基础上，新增加发短信的方法
        p5 = new Message(p1);           //与透明装饰模式，这里不同
        p5.display();
        p5.sendMessage();               //可以单独发送短信
    }
}

/**
 * 抽象构件类：抽象构件类
 */
abstract class Phone{
    public abstract void display();//展示方法
}

/**
 * 具体构件类
 */
class IPhone extends Phone{
    public void display() {
        System.out.println("苹果手机可以打电话");
    }
}

/**
 * 构件装饰类：抽象装饰类
 */
class AbstractDecorate extends IPhone{
    private Phone phone;

    public AbstractDecorate(Phone phone) {
        this.phone = phone;
    }

    public void display() {
        phone.display();
    }
}

/**
 * 抽象构件装饰类下具体的装饰类
 */
class Message extends AbstractDecorate{

    public Message(Phone phone) {
        super(phone);
    }

    public void display() {
        super.display();
        System.out.println("可以发短信");
    }

    public void sendMessage(){
        System.out.println("可以只发短信");
    }
}

/**
 * 抽象构件装饰类下具体的装饰类
 */
class Game extends AbstractDecorate{

    public Game(Phone phone) {
        super(phone);
    }

    public void display() {
        super.display();
        System.out.println("可以玩游戏");
    }

    public void plagGame(){
        System.out.println("可以只玩游戏");
    }
}


