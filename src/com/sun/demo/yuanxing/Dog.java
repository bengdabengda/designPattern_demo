package com.sun.demo.yuanxing;

import java.util.Objects;

/**
 * 具体原型类,调用clone方法的对象，必须实现Cloneable接口
 * 浅克隆对象，clone方法进行克隆
 */
public class Dog implements Cloneable{
    private String name;
    private Integer age;
    private String color;
    private Obj obj;

    public Dog clone(){
        Dog dog = null;
        try {
            dog = (Dog)super.clone();
        } catch (Exception e){
            System.out.println("clone失败");
        }
        return dog;
    }

    public Dog() {
    }

    public Dog(String name, Integer age, String color, Obj obj) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.obj = obj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name) &&
                Objects.equals(age, dog.age) &&
                Objects.equals(color, dog.color) &&
                Objects.equals(obj, dog.obj);
    }

    public String say() {
        return "这是一只名为" + name + "的年龄为" + age + "的" + color + "狗,obj对象为"+obj.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Obj getObj() {
        return obj;
    }

    public void setObj(Obj obj) {
        this.obj = obj;
    }
}

class Obj{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Obj对象name属性为" + name ;
    }

    public Obj(String name) {
        this.name = name;
    }

    public Obj() {
    }
}
