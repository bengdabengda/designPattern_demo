package com.sun.demo.chuangjianxing.danli;

/**
 * 懒汉模式，实现线程安全
 */
public class SafeEarth {

    private static SafeEarth safeEarth = null;

    private SafeEarth(){
        System.out.println("SafeEarth被创建");
    }

    /**
     * 该方法使用synchronized实现线程同步，但是效率较低
     * @return
     */
    public static synchronized SafeEarth getSafeEarth() {
        if(safeEarth == null){
            safeEarth = new SafeEarth();
            return safeEarth;
        }
        return safeEarth;
    }


    /**
     * 锁定代码块，同时使用双重判断，实现线程同步
     * @return
     */
    public static SafeEarth getSafeEarth2() {
        //第一重判断
        if (safeEarth == null) {
            //锁定代码块
            synchronized (SafeEarth.class) {
                //第二重判断
                if (safeEarth == null) {
                    safeEarth = new SafeEarth(); //创建单例实例
                }
            }
        }
        return safeEarth;
    }
}
