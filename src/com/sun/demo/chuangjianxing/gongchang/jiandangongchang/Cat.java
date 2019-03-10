/*
 * Copyright (C), 2015-2019, 壹永科技有限公司
 * FileName: Cat
 * Author:   sun
 * Date:     2019/3/1 16:32
 * History:
 * <author>          <time>                <version>
 *   sun         2019/3/1 16:32           v1.0.0
 */
package com.sun.demo.chuangjianxing.gongchang.jiandangongchang;

/**
 * 一句话功能简述
 *
 * @author sun
 * @create 2019/3/1
 * @since v1.0.0
 */
public class Cat implements Animal {
    public Cat() {
        System.out.println("生成一只猫");
    }

    @Override
    public void eat() {
        System.out.println("猫吃东西");
    }
}