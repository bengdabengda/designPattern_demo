/*
 * Copyright (C), 2015-2019, 壹永科技有限公司
 * FileName: Dog
 * Author:   sun
 * Date:     2019/3/1 16:59
 * History:
 * <author>          <time>                <version>
 *   sun         2019/3/1 16:59           v1.0.0
 */
package com.sun.demo.gongchang.gongchangfangfa;

/**
 * dog：具体产品
 *
 * @author sun
 * @create 2019/3/1
 * @since v1.0.0
 */
public class Dog implements Animal {

    public Dog() {
        System.out.println("创建一只狗");
    }

    public void eat() {
        System.out.println("狗吃东西。");
    }
}