/*
 * Copyright (C), 2015-2019, 壹永科技有限公司
 * FileName: Cat
 * Author:   sun
 * Date:     2019/3/1 17:00
 * History:
 * <author>          <time>                <version>
 *   sun         2019/3/1 17:00           v1.0.0
 */
package com.sun.demo.gongchang.gongchangfangfa;

/**
 * cat：具体产品
 *
 * @author sun
 * @create 2019/3/1
 * @since v1.0.0
 */

public class Cat implements Animal {
    public Cat() {
        System.out.println("创建一只猫");
    }

    public void eat() {
        System.out.println("猫吃东西。");
    }
}