/*
 * Copyright (C), 2015-2019, 壹永科技有限公司
 * FileName: WomanFactory
 * Author:   sun
 * Date:     2019/3/1 18:06
 * History:
 * <author>          <time>                <version>
 *   sun         2019/3/1 18:06           v1.0.0
 */
package com.sun.demo.gongchang.chouixanggongchang;

/**
 * 一句话功能简述
 *
 * @author sun
 * @create 2019/3/1
 * @since v1.0.0
 */
public class WomanFactory implements Factory {

    @Override
    public Person createWritePerson() {
        return new WriteWomanPerson();
    }

    @Override
    public Person createYellowPerson() {
        return new YellowWomanPerson();
    }
}