package com.sun.demo.jiegouxing.qiaojie;

public class Test {
    public static void main(String[] args) {
        Shape shape = new Round();
        Color color = new Write();
        color.setShape(shape);
        color.printColor("小明");

        shape = new Square();
        color = new Red();
        color.setShape(shape);
        color.printColor("小张");
    }
}

/**
 * 维度一：颜色，作为抽象类，内有维度二的抽象类作为属性
 */
abstract class Color{
    protected Shape shape;

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public abstract void printColor(String name);
}

/**
 * 维度二：形状
 */
interface Shape{
    void printShape();
}

/**
 * 维度一的实现类：白色
 */
class Write extends Color{
    public void printColor(String name) {
        System.out.println(name + "是白色的");
        shape.printShape();
    }
}

/**
 * 维度一的实现类：红色
 */
class Red extends Color{
    public void printColor(String name) {
        System.out.println(name + "是红色的");
        shape.printShape();
    }
}

/**
 * 维度二的实现类
 */
class Round implements Shape{
    public void printShape() {
        System.out.println("这是圆的");
    }
}

/**
 * 正方形
 */
class Square implements Shape{
    public void printShape() {
        System.out.println("这是正方形的");
    }
}





