/*
 * Copyright (C), 2015-2019, 壹永科技有限公司
 * FileName: Test
 * Author:   sun
 * Date:     2019/3/1 18:01
 * History:
 * <author>          <time>                <version>
 *   sun         2019/3/1 18:01           v1.0.0
 */
package com.sun.demo.gongchang.chouixanggongchang;

/**
 * 一句话功能简述
 *
 * @author sun
 * @create 2019/3/1
 * @since v1.0.0
 */
public class Test {

    public static void main(String[] args) {
        Person person;
        Factory factory;

        factory = new ManFactory();
        person = factory.createWritePerson();
        person.speak();
        person = factory.createYellowPerson();
        person.speak();

        System.out.println("---------");

        factory = new WomanFactory();
        person = factory.createWritePerson();
        person.speak();
        person = factory.createYellowPerson();
        person.speak();



    }

}