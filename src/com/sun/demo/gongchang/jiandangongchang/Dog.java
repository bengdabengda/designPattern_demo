/*
 * Copyright (C), 2015-2019, 壹永科技有限公司
 * FileName: Dog
 * Author:   sun
 * Date:     2019/3/1 16:32
 * History:
 * <author>          <time>                <version>
 *   sun         2019/3/1 16:32           v1.0.0
 */
package com.sun.demo.gongchang.jiandangongchang;

/**
 * 一句话功能简述
 *
 * @author sun
 * @create 2019/3/1
 * @since v1.0.0
 */
public class Dog implements Animal {

    public Dog() {
        System.out.println("生成一只狗");
    }

    @Override
    public void eat() {
        System.out.println("狗吃东西");
    }
}