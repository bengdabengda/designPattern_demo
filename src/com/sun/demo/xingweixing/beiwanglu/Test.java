package com.sun.demo.xingweixing.beiwanglu;

import java.util.ArrayList;
import java.util.List;

/**
 * 备忘录模式，记录对象的轨迹，便于回滚操作
 * 以棋子悔棋为例
 */
public class Test {
    private static Manager manager = new Manager();
    private static Integer num = -1; //当前位置的计数器

    public static void main(String[] args) {
        Chessman chessman = new Chessman("马",1,1);
        play(chessman);
        chessman.setY(3);
        play(chessman);
        chessman.setX(3);
        play(chessman);
        back(chessman);
        chessman.display();
        back(chessman);
        chessman.display();

        forward(chessman);
        chessman.display();
        forward(chessman);
        chessman.display();
    }

    //下棋操作
    static void play(Chessman chessman){
        System.out.println("下棋");
        manager.getList().add(chessman.createMemorandum());
        num ++;
        chessman.display();
    }

    static void back(Chessman chessman){
        System.out.println("悔棋");
        num--;
        chessman.revert(manager.getList().get(num));
    }

    static void forward(Chessman chessman){
        System.out.println("取消悔棋");
        num ++;
        chessman.revert(manager.getList().get(num));
    }

}

/**
 * 棋子类，原发器类
 */
class Chessman{
    private String name;
    private Integer x;
    private Integer y;

    public Chessman(String name, Integer x, Integer y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    void display(){
        System.out.println("棋子"+name+"位置为:"+x+","+y);
    }

    //创建一个原发器(保存当前轨迹操作)
    Memorandum createMemorandum(){
        return new Memorandum(name,x,y);
    }

    //回滚操作
    void revert(Memorandum memorandum){
        this.name = memorandum.getName();
        this.x = memorandum.getX();
        this.y = memorandum.getY();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }
}

/**
 * 备忘录类
 * 属性为原发器的全部或一部分
 */
class Memorandum{
    private String name;
    private Integer x;
    private Integer y;

    public Memorandum(String name, Integer x, Integer y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }
}

/**
 * 管理者类，拥有轨迹的记录
 */
class Manager{
    private List<Memorandum> list = new ArrayList<>();

    public List<Memorandum> getList() {
        return list;
    }

    public void setList(List<Memorandum> list) {
        this.list = list;
    }
}


