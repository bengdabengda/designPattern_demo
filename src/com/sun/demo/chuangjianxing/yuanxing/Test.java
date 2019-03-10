package com.sun.demo.chuangjianxing.yuanxing;

public class Test {

    public static void main(String[] args) {

        //浅克隆
        Dog dog1 = new Dog("小狗",1,"白色",new Obj("1"));
        System.out.println(dog1.say());
        Dog dog2 = dog1.clone();
        System.out.println(dog2.say());
        System.out.println(dog1 == dog2);                                       //false
        System.out.println(dog1.getObj() == dog2.getObj());                     //true
        System.out.println("equals=="+(dog1.equals(dog2)));                     //true
        System.out.println("class=="+(dog1.getClass() == dog2.getClass()));     //true

        //clone方法克隆的对象，属性中的对象类是同一个对象，其中一个改变，另一个也会改变
        System.out.println(dog1.getObj() == dog2.getObj());     //true
        dog1.getObj().setName("2");
        System.out.println(dog2.getObj().getName());           //2
        System.out.println(dog1.getObj() == dog2.getObj());    //true

        dog1.setAge(2);
        System.out.println(dog2.getAge());                      //1
        System.out.println(dog1.getAge() == dog2.getAge());     //false

        System.out.println("----深克隆----");
        //深克隆
        Pig pig = new Pig("肥肥",3,"黑色",new Objs("ooo"));
        System.out.println(pig.say());
        Pig copyPig = null;
        try {
            copyPig = pig.deepClone();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(pig == copyPig);                                       //false
        System.out.println(pig.getObj() == copyPig.getObj());                     //false
        System.out.println(copyPig.say());
        System.out.println("equals=="+(pig.equals(copyPig)));                     //false
        System.out.println("class=="+(pig.getClass() == copyPig.getClass()));     //true

        System.out.println(pig.getObj() == copyPig.getObj());     //false
        pig.getObj().setName("2");
        System.out.println(copyPig.getObj().getName());           //ooo
        System.out.println(pig.getObj() == copyPig.getObj());    //false

        pig.setAge(2);
        System.out.println(copyPig.getAge());                      //3
        System.out.println(pig.getAge() == copyPig.getAge());     //false

        //模型管理器
        System.out.println("----模型管理器----");
        Person p1,p2,p3,p4;
        Manage manage = Manage.getManage();
        p1 = manage.getPerson("write");
        p2 = manage.getPerson("write");
        System.out.println(p1==p2);             //false

        p3 = manage.getPerson("black");
        p4 = manage.getPerson("black");
        System.out.println(p3==p4);             //false
    }
}
