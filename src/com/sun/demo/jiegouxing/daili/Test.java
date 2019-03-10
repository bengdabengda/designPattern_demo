package com.sun.demo.jiegouxing.daili;

public class Test {
    public static void main(String[] args) {
        Search search = new proxySearch();
        search.query();
    }
}

/**
 * 抽象主题类：查询类
 */
abstract class Search{
    abstract void query();
}

/**
 * 真实主题类：具体查询方法
 */
class RealSearch extends Search{
    @Override
    void query() {
        System.out.println("查询成功");
    }
}

/**
 * 代理查询类
 */
class proxySearch extends Search{
    private Search search = new RealSearch();

    @Override
    void query() {
        this.log();
        search.query();
    }

    void log(){
        System.out.println("记录一次日志");
    }
}

