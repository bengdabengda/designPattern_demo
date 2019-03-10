/*
 * Copyright (C), 2015-2019, 壹永科技有限公司
 * FileName: Test
 * Author:   sun
 * Date:     2019/3/6 18:10
 * History:
 * <author>          <time>                <version>
 *   sun         2019/3/6 18:10           v1.0.0
 */
package com.sun.demo.jiegouxing.waiguan;

/**
 * 一句话功能简述
 *
 * @author sun
 * @create 2019/3/6
 * @since v1.0.0
 */
public class Test {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDao();
        TeacherDao teacherDao = new TeacherDao();
        PersonFaced personFaced = new PersonFaced(studentDao,teacherDao);
        personFaced.query();
    }
}

/**
 * 外观类，供客户端调用，防止直接操作dao
 */
class PersonFaced{
    private StudentDao studentDao;
    private TeacherDao teacherDao;

    public PersonFaced(StudentDao studentDao, TeacherDao teacherDao) {
        this.studentDao = studentDao;
        this.teacherDao = teacherDao;
    }

    public void query(){
        studentDao.query();
        teacherDao.query();
    }
}

/**
 * 学生的数据操作类
 */
class StudentDao{
    public void query(){
        System.out.println("查询学生");
    }
}

/**
 * 教师的数据操作类
 */
class TeacherDao{
    public void query(){
        System.out.println("查询教师");
    }
}
