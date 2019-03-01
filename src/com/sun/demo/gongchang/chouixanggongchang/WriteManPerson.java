/*
 * Copyright (C), 2015-2019, 壹永科技有限公司
 * FileName: WriteManPerson
 * Author:   sun
 * Date:     2019/3/1 17:59
 * History:
 * <author>          <time>                <version>
 *   sun         2019/3/1 17:59           v1.0.0
 */
package com.sun.demo.gongchang.chouixanggongchang;

/**
 * WriteManPerson：产品A1具体实现
 *
 * @author sun
 * @create 2019/3/1
 * @since v1.0.0
 */
public class WriteManPerson implements WritePerson {
    public WriteManPerson() {

        System.out.println("创建一个白种男性");
    }

    @Override
    public void speak() {
        System.out.println("我是白种男性");
    }
}