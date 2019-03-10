/*
 * Copyright (C), 2015-2019, 壹永科技有限公司
 * FileName: Test
 * Author:   sun
 * Date:     2019/3/6 14:38
 * History:
 * <author>          <time>                <version>
 *   sun         2019/3/6 14:38           v1.0.0
 */
package com.sun.demo.jiegouxing.zuhe;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合模式
 *
 * @author sun
 * @create 2019/3/6
 * @since v1.0.0
 */
public class Test {
    public static void main(String[] args) {
        AbstractFile folder1 = new Folder("文件夹一");
        AbstractFile folder2 = new Folder("文件夹二");
        AbstractFile folder3 = new Folder("文件夹三");

        AbstractFile image1 = new ImageFile("图片一");
        AbstractFile image2 = new ImageFile("图片二");
        AbstractFile image3 = new ImageFile("图片三");

        AbstractFile text1 = new TextFile("文本一");
        AbstractFile text2 = new TextFile("文本二");
        AbstractFile text3 = new TextFile("文本三");

        folder3.add(text1);
        folder3.add(text2);
        folder3.add(text3);

        folder2.add(image1);
        folder2.add(image2);
        folder2.add(image3);

        folder1.add(folder2);
        folder1.add(folder3);

        folder1.print();
    }


}

/**
 * 文件夹（非叶子节点）和图片/文件（叶子节点）的抽象父类
 */
abstract class AbstractFile{
    //添加文件
    abstract void add(AbstractFile file);
    //移除文件
    abstract void remove(AbstractFile file);
    //查找子文件
    abstract AbstractFile getchild(Integer i);
    //打印
    abstract void print();
}

/**
 * 文件夹（非叶子节点）
 */
class Folder extends AbstractFile{
    private List<AbstractFile> list = new ArrayList<>();
    private String name;

    public Folder(String name) {
        this.name = name;
    }

    void add(AbstractFile file) {
        list.add(file);
    }

    void remove(AbstractFile file) {
        list.remove(file);
    }

    AbstractFile getchild(Integer i) {
        return list.get(i);
    }

    void print() {
        System.out.println("这是一个名为" + name + "的文件夹");
        for(AbstractFile file: list){
            file.print();
        }
    }
}

/**
 * 图片文件（叶子节点的一种）
 */
class ImageFile extends AbstractFile{
    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    void add(AbstractFile file) {
        System.out.println("不能添加");
    }

    void remove(AbstractFile file) {
        System.out.println("不能移除");
    }

    AbstractFile getchild(Integer i) {
        System.out.println("没有子文件");
        return null;
    }

    void print() {
        System.out.println("这是一个名为" + name + "的图片文件");
    }
}

/**
 * 文本文件（叶子节点的一种）
 */
class TextFile extends AbstractFile{
    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    void add(AbstractFile file) {
        System.out.println("不能添加");
    }

    void remove(AbstractFile file) {
        System.out.println("不能移除");
    }

    AbstractFile getchild(Integer i) {
        System.out.println("没有子文件");
        return null;
    }

    void print() {
        System.out.println("这是一个名为" + name + "的文本文件");
    }
}