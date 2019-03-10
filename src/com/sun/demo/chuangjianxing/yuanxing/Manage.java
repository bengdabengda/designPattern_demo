package com.sun.demo.chuangjianxing.yuanxing;

import java.util.HashMap;

/**
 *原型管理器
 */
public class Manage {
    private HashMap ht = new HashMap();
    private static Manage manage =  new Manage();

    public Manage() {
        ht.put("write", new WritePerson());
        ht.put("black", new BlackPerson());
    }

    //增加新的动物对象
    public void addPerson(String key, Person person){
        ht.put(key,person);
    }
    //通过浅克隆获取新的动物对象
    public Person getPerson(String key){
        return ((Person)ht.get(key)).clone();
    }
    public static Manage getManage() {
        return manage;
    }
}
