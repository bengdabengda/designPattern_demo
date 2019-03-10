/*
 * Copyright (C), 2015-2019, 壹永科技有限公司
 * FileName: ManFactory
 * Author:   sun
 * Date:     2019/3/1 18:04
 * History:
 * <author>          <time>                <version>
 *   sun         2019/3/1 18:04           v1.0.0
 */
package com.sun.demo.chuangjianxing.gongchang.chouixanggongchang;

/**
 * 一句话功能简述
 *
 * @author sun
 * @create 2019/3/1
 * @since v1.0.0
 */
public class ManFactory implements Factory {
    @Override
    public Person createWritePerson() {
        return new WriteManPerson();
    }

    @Override
    public Person createYellowPerson() {
        return new YellowManPerson();
    }
}