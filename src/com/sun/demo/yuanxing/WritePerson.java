package com.sun.demo.yuanxing;

public class WritePerson implements Person {

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
        return "这是个白人";
    }
}
