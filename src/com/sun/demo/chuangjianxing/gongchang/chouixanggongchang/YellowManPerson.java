/*
 * Copyright (C), 2015-2019, 壹永科技有限公司
 * FileName: YellowManPerson
 * Author:   sun
 * Date:     2019/3/1 17:57
 * History:
 * <author>          <time>                <version>
 *   sun         2019/3/1 17:57           v1.0.0
 */
package com.sun.demo.chuangjianxing.gongchang.chouixanggongchang;

/**
 * YellowManPerson：产品B1具体实现
 *
 * @author sun
 * @create 2019/3/1
 * @since v1.0.0
 */
public class YellowManPerson implements YellowPerson {
    public YellowManPerson() {

        System.out.println("创建一个黄种男性");
    }

    @Override
    public void speak() {
        System.out.println("我是黄种男性");
    }
}