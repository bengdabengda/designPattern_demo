/*
 * Copyright (C), 2015-2019, 壹永科技有限公司
 * FileName: WriteWomanPerson
 * Author:   sun
 * Date:     2019/3/1 17:59
 * History:
 * <author>          <time>                <version>
 *   sun         2019/3/1 17:59           v1.0.0
 */
package com.sun.demo.chuangjianxing.gongchang.chouixanggongchang;

/**
 * WriteWomanPerson：产品A2具体实现
 *
 * @author sun
 * @create 2019/3/1
 * @since v1.0.0
 */
public class WriteWomanPerson implements WritePerson {
    public WriteWomanPerson() {

        System.out.println("创建一个白种女性");
    }

    @Override
    public void speak() {
        System.out.println("我是白种女性");
    }
}