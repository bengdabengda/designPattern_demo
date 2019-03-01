/*
 * Copyright (C), 2015-2019, 壹永科技有限公司
 * FileName: AnimalFactory
 * Author:   sun
 * Date:     2019/3/1 16:31
 * History:
 * <author>          <time>                <version>
 *   sun         2019/3/1 16:31           v1.0.0
 */
package com.sun.demo.gongchang.jiandangongchang;

/**
 * 一句话功能简述
 *
 * @author sun
 * @create 2019/3/1
 * @since v1.0.0
 */
public class AnimalFactory {

    public static Animal createAnimal(String type){
        if("dog".equals(type)){
            return new Dog();
        }else if("cat".equals(type)){
            return new Cat();
        }else{
            System.out.println("没有这种");
        }
        return null;
    }
}