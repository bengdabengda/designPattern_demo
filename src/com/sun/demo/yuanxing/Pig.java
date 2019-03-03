package com.sun.demo.yuanxing;


import java.io.*;
import java.util.Objects;

/**
* 具体原型类,通过流的方式克隆对象，必须实现Serializable接口
* 深克隆对象，通过流的方式进行克隆
*/
public class Pig implements Cloneable, Serializable{

    private String name;
    private Integer age;
    private String color;
    private Objs obj;

    public Pig clone(){
        Pig pig = null;
        try {
            pig = (Pig)super.clone();
        } catch (Exception e){
            System.out.println("clone失败");
        }
        return pig;
    }

    //使用序列化技术实现深克隆
    public Pig deepClone() throws IOException, ClassNotFoundException, OptionalDataException{
        //将对象写入流中
        ByteArrayOutputStream bao=new ByteArrayOutputStream();
        ObjectOutputStream oos=new ObjectOutputStream(bao);
        oos.writeObject(this);
        //将对象从流中取出
        ByteArrayInputStream bis=new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois=new ObjectInputStream(bis);
        return (Pig)ois.readObject();
    }

    public Pig() {
    }

    public Pig(String name, Integer age, String color, Objs obj) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.obj = obj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pig pig = (Pig) o;
        return Objects.equals(name, pig.name) &&
                Objects.equals(age, pig.age) &&
                Objects.equals(color, pig.color) &&
                Objects.equals(obj, pig.obj);
    }

    public String say() {
        return "这是一只名为" + name + "的年龄为" + age + "的" + color + "猪,obj对象为"+obj.toString();
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

    public Objs getObj() {
        return obj;
    }

    public void setObj(Objs obj) {
        this.obj = obj;
    }
}

class Objs implements Serializable{
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

    public Objs(String name) {
        this.name = name;
    }

    public Objs() {
    }
}
