package com.sun.demo.chuangjianxing.yuanxing;

public class BlackPerson implements Person {
    @Override
    public Person clone(){
        Person person = null;
        try {
            person = (Person)super.clone();
        } catch (Exception e){
            System.out.println("clone失败");
        }
        return person;
    }

    @Override
    public String say() {
        return "这是个黑人";
    }
}
