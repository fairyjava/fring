package com.fairyoo.fring.web.controller;

/**
 * 语法
 *
 * @author MengYi at 2018-12-27 11:25
 */
public class GrammarController {

    private interface Animal {
        public abstract void show();
    }

    private abstract class Dog implements Animal {
        @Override
        public void show() {

        }
    }

    private class Cat implements Animal {

        @Override
        public void show() {

            new MyClass().getMyInterface().show();
        }
    }


    //extends 继承类|接口；implements 实现接口



    private   class Outer {
        //private int num = 100;

        //      局部内部类访问局部变量为什么需要被final修饰?
        //        因为局部变量会随着方法的调用完毕而消失，
        //        这个时候，局部对象并没有立马从堆内存中消失，
        //        还要使用那个变量。为了让数据还能继续被使用，
        //        就用 fianl 修饰，这样，在堆内存里面存储的其实是一个常量值。


        public void method() {
            //局部内部类访问局部变量为什么需要被final修饰?
            final int num = 100;

            class Inner {
                public void show() {
                    System.out.println(num);
                }
            }

            Inner i = new Inner();
            i.show();
        }
    }



    private interface MyInterface { void show(); }

    private class MyClass {


        public MyInterface getMyInterface() {


            MyInterface i = new MyInterface() {
                @Override
                public void show() {
                    System.out.println("ddddd");
                }
            };
            return i;
        }


    }



}


