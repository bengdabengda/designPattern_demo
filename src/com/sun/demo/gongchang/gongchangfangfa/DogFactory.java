/*
 * Copyright (C), 2015-2019, 壹永科技有限公司
 * FileName: DogFactory
 * Author:   sun
 * Date:     2019/3/1 17:02
 * History:
 * <author>          <time>                <version>
 *   sun         2019/3/1 17:02           v1.0.0
 */
package com.sun.demo.gongchang.gongchangfangfa;

/**
 * dog工厂类：具体工厂
 *
 * @author sun
 * @create 2019/3/1
 * @since v1.0.0
 */
public class DogFactory implements AnimalFactory {
    public Animal createAnimal() {
        //连接数据库，代码省略
        //创建数据库日志记录器对象
        Animal animal = new Dog();
        //初始化数据库日志记录器，代码省略
        return animal;
    }
}