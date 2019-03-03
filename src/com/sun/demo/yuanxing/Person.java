package com.sun.demo.yuanxing;

/**
 * 抽象animal接口
 */
public interface Person extends Cloneable{
    Person clone();
    String say();
}
