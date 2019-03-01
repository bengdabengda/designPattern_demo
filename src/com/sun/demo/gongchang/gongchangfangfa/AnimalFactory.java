/*
 * Copyright (C), 2015-2019, 壹永科技有限公司
 * FileName: Factory
 * Author:   sun
 * Date:     2019/3/1 16:56
 * History:
 * <author>          <time>                <version>
 *   sun         2019/3/1 16:56           v1.0.0
 */
package com.sun.demo.gongchang.gongchangfangfa;

/**
 * 动物工厂接口：抽象工厂
 *
 * @author sun
 * @create 2019/3/1
 * @since v1.0.0
 */
public interface AnimalFactory {
    Animal createAnimal();
}