package com.fairyoo.fring.learn.InterfaceInnerClass;

/**
 * @author MengYi at 2019-01-14 19:26
 */
public class OuterClassAbstract implements IOuterInterface {

    /**
     * 【IOuterInterface ：void adMethod();】
     *
     * @author by MengYi at 2019-01-14 19:29
     */
    @Override
    public void adMethod() {

    }


    /**
     * 继承接口IOuterInterface中的抽象类InnerClassAbstract
     *
     * @author by MengYi at 2019-01-14 19:34
     */
    public class InnerClassAbstractDemo extends IOuterInterface.InnerClassAbstract {

        @Override
        public void abInfo() {

        }
    }
}
