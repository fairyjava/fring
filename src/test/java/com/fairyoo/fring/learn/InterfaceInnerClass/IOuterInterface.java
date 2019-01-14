package com.fairyoo.fring.learn.InterfaceInnerClass;

/**
 * @author MengYi at 2019-01-14 19:01
 */
public interface IOuterInterface {


    int TEMP = 100;
    void adMethod();


    /**
     * 接口中默认的方法（jdk1.8后可添加）（可以被重写）
     *
     * @author by MengYi at 2019-01-14 19:07
    */
    public default void deMethod() {
        System.out.println("接口中默认的方法 ");
    }


    /**
     * 接口中静态的方法（jdk1.8后可添加）
     *
     * @author by MengYi at 2019-01-14 19:09
    */
    public static void staticMethod(){
        System.out.println("接口中静态的方法 ");
    }


    /**
     * 接口中的内部类
     *
     * @author by MengYi at 2019-01-14 19:10
    */
    public class InnerClassA {

        public void show() {
            System.out.println("接口中的内部类InnerClassA的show方法 ");
        }

    }

    /**
     * 接口中的内部抽象类
     *
     * @author by MengYi at 2019-01-14 19:12
    */
    public abstract class InnerClassAbstract {

        public abstract void abInfo();

        public void info() {
            System.out.println("接口中可定义抽象成员内部类");
        }
    }



}
