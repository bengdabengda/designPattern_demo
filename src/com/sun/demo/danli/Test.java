package com.sun.demo.danli;

public class Test {

    public static void main(String[] args) {

        System.out.println("--------");
        Earth earth = Earth.getEarth();
        Earth earth2 = Earth.getEarth();
        System.out.println(earth == earth2);

        System.out.println("--------");
        People p1 = People.getPeople();
        People p2 = People.getPeople();
        System.out.println(p1==p2);

        System.out.println("--------");
        SafeEarth safeEarth1 = SafeEarth.getSafeEarth();
        SafeEarth safeEarth2 = SafeEarth.getSafeEarth();
        System.out.println(safeEarth1 == safeEarth2);

        System.out.println("--------");
        SafeEarth safeEarth3 = SafeEarth.getSafeEarth2();
        SafeEarth safeEarth4 = SafeEarth.getSafeEarth2();
        System.out.println(safeEarth3 == safeEarth4);

        System.out.println("----使用静态内部类----");
        Singleton s1, s2;
        s1 = Singleton.getInstance();
        s2 = Singleton.getInstance();
        System.out.println(s1==s2);


    }
}
