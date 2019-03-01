/*
 * Copyright (C), 2015-2019, 壹永科技有限公司
 * FileName: fACTORY
 * Author:   sun
 * Date:     2019/3/1 18:03
 * History:
 * <author>          <time>                <version>
 *   sun         2019/3/1 18:03           v1.0.0
 */
package com.sun.demo.gongchang.chouixanggongchang;

/**
 * Factory:抽线工厂类
 *
 * @author sun
 * @create 2019/3/1
 * @since v1.0.0
 */
public interface Factory {
    Person createWritePerson();
    Person createYellowPerson();
}