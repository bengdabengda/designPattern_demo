package com.sun.demo.danli;

/**
 * 俄汉模式，线程安全
 */
public class People {

    private static People people = new People();

    private People(){
        System.out.println("people生成");
    }

    public static People getPeople() {
        return people;
    }
}
