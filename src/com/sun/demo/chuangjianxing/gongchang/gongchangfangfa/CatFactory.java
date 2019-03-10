/*
 * Copyright (C), 2015-2019, 壹永科技有限公司
 * FileName: CatFactory
 * Author:   sun
 * Date:     2019/3/1 17:03
 * History:
 * <author>          <time>                <version>
 *   sun         2019/3/1 17:03           v1.0.0
 */
package com.sun.demo.chuangjianxing.gongchang.gongchangfangfa;

/**
 * cat工厂类：具体工厂
 *
 * @author sun
 * @create 2019/3/1
 * @since v1.0.0
 */
public class CatFactory implements AnimalFactory {
    public Animal createAnimal() {
        //创建文件日志记录器对象
        Animal animal = new Cat();
        //创建文件，代码省略
        return animal;
    }
}