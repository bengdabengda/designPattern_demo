package com.sun.demo.danli;

/**
 * 俄汉模式，线程安全
 */
public class People {

    private final static People people = new People();//final修饰，因为是唯一对象，且不会改变

    private People(){
        System.out.println("people生成");
    }

    public static People getPeople() {
        return people;
    }
}
