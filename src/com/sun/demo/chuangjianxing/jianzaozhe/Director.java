package com.sun.demo.chuangjianxing.jianzaozhe;

/**
 * 指挥者对象，控制对象的创建过程，顺序等等
 */
public class Director {
    private Build build;

    public Director(Build build){
        this.build = build;
    }

    public Person createPerson(){
        if(build.neadHead()){
            build.buildHead();
        }
        build.buildBody();
        build.buildHand();
        return build.buildPerson();
    }

    public Build getBuild() {
        return build;
    }

    public void setBuild(Build build) {
        this.build = build;
    }
}
