package com.fairyoo.fring.learn.InterfaceInnerClass;

import lombok.var;

/**
 * @author MengYi at 2019-01-14 19:13
 */
public class OuterClass implements IOuterInterface {

    /**
     * "adMethod" 是IOuterInterface定义的方法，需要加"@Override"
     *
     * @author by MengYi at 2019-01-14 19:17
    */
    @Override
    public void adMethod() {
        System.out.println("实现类");
    }

    /**
     * "InnerClassA"能被自动识别
     *
     * @author by MengYi at 2019-01-14 19:16
    */
    public InnerClassA getInnerClassA() {
        var demo = new InnerClassA();
        return demo;

    }
}
