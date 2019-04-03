package com.sun.demo.xingweixing.guanchazhe;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Observer observer1 = new Observer("观察者一");
        Observer observer2 = new Observer("观察者二");
        Observer observer3 = new Observer("观察者三");
        Observer observer4 = new Observer("观察者四");
        AbstractSubject abstractSubject = new Subject("目标");
        abstractSubject.addObserver(observer1);
        abstractSubject.addObserver(observer2);
        abstractSubject.addObserver(observer3);
        abstractSubject.addObserver(observer4);

        abstractSubject.change(observer1);
    }
}

/**
 * 抽象目标类，目标类的改变影响到所有该目标观察者
 */
abstract class AbstractSubject{
    protected List<AbstrctObserver> list = new ArrayList<>();

    //添加观察者
    public void addObserver(AbstrctObserver observer){
        list.add(observer);
    }

    //移除观察者
    public void removeObserver(AbstrctObserver observer){
        list.remove(observer);
    }

    //目标类的改变
    public abstract void change(AbstrctObserver observer);
}

/**
 * 具体目标类
 */
class Subject extends AbstractSubject{

    private String name;

    public Subject(String name) {
        System.out.println(name + "创建了");
    }

    //目标类的改变,例如引起其他观察者的改变
    public void change(AbstrctObserver observer) {
        for(AbstrctObserver o : list){
            if(o != observer){
                o.update();
            }
        }
    }
}

/**
 * 抽象观察者类，通常为一个接口
 */
interface AbstrctObserver {
    void update();
}

/**
 * 具体观察者类
 */
class Observer implements AbstrctObserver{
    private String name;

    public void update() {
        System.out.println(name + "改变了");
    }

    public Observer(String name) {
        this.name = name;
    }
}
