package com.sun.demo.danli;

public class Test {

    public static void main(String[] args) {
        Earth earth = Earth.getEarth();
        Earth earth2 = Earth.getEarth();
        System.out.println(earth == earth2);

        People p1 = People.getPeople();
        People p2 = People.getPeople();
        System.out.println(p1==p2);

        SafeEarth safeEarth1 = SafeEarth.getSafeEarth();
        SafeEarth safeEarth2 = SafeEarth.getSafeEarth();
        System.out.println(safeEarth1 == safeEarth2);

        SafeEarth safeEarth3 = SafeEarth.getSafeEarth2();
        SafeEarth safeEarth4 = SafeEarth.getSafeEarth2();
        System.out.println(safeEarth3 == safeEarth4);
    }
}
