package com.fairyoo.fring.learn.InterfaceInnerClass;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.fairyoo.fring.learn.InterfaceInnerClass.IOuterInterface.InnerClassA;

/**
 * @author MengYi at 2019-01-14 18:57
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class InterfaceInnerClassTest {





    /**
     * 测试：接口内部类：普通类InnerClassA
     *
     * @author by MengYi at 2019-01-14 19:43
    */
    @Test
    public void testInterfaceInnerClass() throws Exception {

        //【方式1】直接通过 接口.类名 进行实例化
        IOuterInterface.InnerClassA inner = new IOuterInterface.InnerClassA();
        inner.show();


        //【方式2】实例化对象方式
        OuterClass demo = new OuterClass();
        IOuterInterface.InnerClassA demoInner = demo.getInnerClassA();
        demoInner.show();

        //【方式3】import com.fairyoo.fring.learn.InterfaceInnerClass.IOuterInterface.InnerClassA;
        InnerClassA innerImport = new InnerClassA();
        innerImport.show();

    }

    /**
     * 测试：接口内部类：抽象类InnerClassAbstract
     *
     * @author by MengYi at 2019-01-14 19:43
     */
    @Test
    public void testInterfaceInnerClassAbstract() throws Exception {

        //【方式1】直接通过 接口.类名 进行实例化:new IOuterInterface.InnerClassAbstract(){} //这里使用匿名内部类的方式
        //【方式1】直接通过 接口.类名 进行实例化:new IOuterInterface.InnerClassAbstract(); //这样会报错[抽象类不能直接实例化]
        IOuterInterface.InnerClassAbstract innerInterface = new IOuterInterface.InnerClassAbstract(){

            @Override
            public void abInfo() {
                System.out.println("重写抽象类中的抽象方法");
            }

        };
        innerInterface.abInfo();
        innerInterface.info();


        //【方式2】实例化方法： 在实现类中定义内部类继承接口中的抽象内部类
        IOuterInterface.InnerClassAbstract abstractOne = (new OuterClassAbstract()).new InnerClassAbstractDemo();
        abstractOne.abInfo();
        abstractOne.info();
    }












}
