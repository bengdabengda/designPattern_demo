/*
 * Copyright (C), 2015-2019, 壹永科技有限公司
 * FileName: Test
 * Author:   sun
 * Date:     2019/3/1 16:55
 * History:
 * <author>          <time>                <version>
 *   sun         2019/3/1 16:55           v1.0.0
 */
package com.sun.demo.chuangjianxing.gongchang.gongchangfangfa;

/**
 * 一句话功能简述
 *
 * @author sun
 * @create 2019/3/1
 * @since v1.0.0
 */
public class Test {
    public static void main(String[] args) {

        AnimalFactory animalFactory;
        Animal animal;

        animalFactory = new DogFactory();
        animal = animalFactory.createAnimal();
        animal.eat();


        animalFactory = new CatFactory();
        animal = animalFactory.createAnimal();
        animal.eat();
    }
}