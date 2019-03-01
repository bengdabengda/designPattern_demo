/*
 * Copyright (C), 2015-2019, 壹永科技有限公司
 * FileName: Test
 * Author:   sun
 * Date:     2019/3/1 16:37
 * History:
 * <author>          <time>                <version>
 *   sun         2019/3/1 16:37           v1.0.0
 */
package com.sun.demo.gongchang.jiandangongchang;

/**
 * 一句话功能简述
 *
 * @author sun
 * @create 2019/3/1
 * @since v1.0.0
 */
public class Test {
    public static void main(String[] args) {
        Animal animal = AnimalFactory.createAnimal("dog");
        animal.eat();

        animal = AnimalFactory.createAnimal("cat");
        animal.eat();
    }
}