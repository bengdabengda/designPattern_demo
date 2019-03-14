package com.sun.demo.xingweixing.zhongjiezhe;

public class Test {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        ColleagueOne colleagueOne = new ColleagueOne();
        ColleagueTwo colleagueTwo = new ColleagueTwo();
        ColleagueThree colleagueThree = new ColleagueThree();
        mediator.setColleagueOne(colleagueOne);
        mediator.setColleagueTwo(colleagueTwo);
        mediator.setColleagueThree(colleagueThree);

        colleagueOne.setAbstractMediator(mediator);
        colleagueTwo.setAbstractMediator(mediator);
        colleagueThree.setAbstractMediator(mediator);

        colleagueOne.update();
    }
}

/**
 * Mediator：抽象中介者类
 */
abstract class AbstractMediator{
    public abstract void doSomething(AbstractColleague colleague);
}

/**
 * Mediator：具体中介者对象
 */
class Mediator extends AbstractMediator{

    private ColleagueOne colleagueOne;
    private ColleagueTwo colleagueTwo;
    private ColleagueThree colleagueThree;

    public ColleagueOne getColleagueOne() {
        return colleagueOne;
    }

    public void setColleagueOne(ColleagueOne colleagueOne) {
        this.colleagueOne = colleagueOne;
    }

    public ColleagueTwo getColleagueTwo() {
        return colleagueTwo;
    }

    public void setColleagueTwo(ColleagueTwo colleagueTwo) {
        this.colleagueTwo = colleagueTwo;
    }

    public ColleagueThree getColleagueThree() {
        return colleagueThree;
    }

    public void setColleagueThree(ColleagueThree colleagueThree) {
        this.colleagueThree = colleagueThree;
    }

    public void doSomething(AbstractColleague colleague) {
        if(colleague == colleagueOne){
            colleagueTwo.beChanged();
            colleagueThree.beChanged();
        }else if(colleague == colleagueTwo){
            colleagueOne.beChanged();
            colleagueThree.beChanged();
        }else if(colleague == colleagueThree){
            colleagueOne.beChanged();
            colleagueTwo.beChanged();
        }
    }
}

/**
 * AbstractColleague：抽象同事类
 */
abstract class AbstractColleague{
    private AbstractMediator abstractMediator;

    public AbstractMediator getAbstractMediator() {
        return abstractMediator;
    }

    public void setAbstractMediator(AbstractMediator abstractMediator) {
        this.abstractMediator = abstractMediator;
    }

    //引起同事类改变的方法
    public void change(){
        abstractMediator.doSomething(this);
    }

    //自身改变的方法
    public abstract void update();

    //自身被改变的方法
    public abstract void beChanged();
}

/**
 * ColleagueOne：具体同事类
 */
class ColleagueOne extends AbstractColleague {
    @Override
    public void update() {
        System.out.println("同事一改变了");
        change();
    }

    @Override
    public void beChanged() {
        System.out.println("同事一被改变了");
    }
}

/**
 * ColleagueTwo：具体同事类
 */
class ColleagueTwo extends AbstractColleague {
    @Override
    public void update() {
        System.out.println("同事二改变了");
        change();
    }
    @Override
    public void beChanged() {
        System.out.println("同事二被改变了");
    }
}

/**
 * ColleagueThree：具体同事类
 */
class ColleagueThree extends AbstractColleague {
    @Override
    public void update() {
        System.out.println("同事三改变了");
        change();
    }
    @Override
    public void beChanged() {
        System.out.println("同事三被改变了");
    }
}