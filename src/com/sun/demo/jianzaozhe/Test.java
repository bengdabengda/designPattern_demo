package com.sun.demo.jianzaozhe;

public class Test {
    public static void main(String[] args) {
        Build build = new ManBuild();
        Director director = new Director(build);
        Person p = director.createPerson();
        System.out.println(p);

        System.out.println("--------");

        p = new Person();
        build = new WomanBuild();
        director = new Director(build);
        p = director.createPerson();
        System.out.println(p);
    }
}
