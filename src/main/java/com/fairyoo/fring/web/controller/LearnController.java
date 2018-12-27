package com.fairyoo.fring.web.controller;

import lombok.var;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

/**
 * learn
 *
 * @author MengYi at 2018-12-27 10:19
 */
@RestController
@RequestMapping(value = "/learn/v1", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class LearnController {

    /**
     * byte1
     *
     * @author by MengYi at 2018-12-26 14:47
     */
    @GetMapping("/byte1")
    public void byte1() {

        byte b1 = 3;
        byte b2 = 4;
        byte b = 3 + 4;

        //b = b1 + b2;
        //为什么byte c = a + b;就报错呢？
        //这是java的机制导致的，java在对byte这种类型进行“运算”时，会将其转换为int类型，两个int类型相加，赋值给byte类型肯定会报错的。

    }

    /**
     * instanceof 检查是否是类的对象
     *
     * @author by MengYi at 2018-12-27 10:22
     */
    public void instanceof1() {
        String str = "";

        if (str instanceof String) {
            //instanceof 检查是否是类的对象
        }
    }

    /**
     * “&”和“&&”的区别：
     *
     * @author by MengYi at 2018-12-27 10:24
     */
    public void fuHao() {
        //    “&”和“&&”的区别：
        //        单&时，左边无论真假，右边都进行运算；
        //        双&时，如果左边为真，右边参与运算，如果左边为假，那么右边不参与运算。
        //	      “|”和“||”的区别同理，双或时，左边为真，右边不参与运算。

    }

    /**
     * 位运算符
     *
     * @author by MengYi at 2018-12-27 10:27
     */
    public void 位运算符() {
        //位运算符:
        // https://github.com/DuGuQiuBai/Java/blob/master/day03/day03%E6%80%BB%E7%BB%93.txt
        // https://github.com/DuGuQiuBai/Java/blob/master/day01/%E7%AC%AC%E4%BA%8C%E7%AB%A0_Java%E5%9F%BA%E7%A1%80%E8%AF%AD%E6%B3%95%5B%E4%B8%8A%5D.ppt
    }


    public void 常量() {
        //    (3)字面值常量
        //        A:字符串常量 用""括起来的内容。举例："helloworld"
        //        B:整数常量 举例:1,200
        //        C:小数常量 举例:12.5
        //        D:字符常量 用''括起来的内容。举例：'a','A','0'
        //        E:布尔常量 比较特殊，只有两个值。举例：true,false
        //        F:空常量 null(数组部分讲)

        //    (4)Java中针对整数常量的表现形式
        //        A:二进制
        //        由0,1组成。以0b开头
        //        B:八进制
        //        由0,1,2,3,4,5,6,7组成。以0开头
        //        C:十进制
        //        由0,1,2,3,4,5,6,7,8,9组成。默认是十进制。
        //        D:十六进制
        //        由0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F组成。以0x开头。
        //        注意：字母不区分大小写。

    }


    public void 数据类型() {
        //    (1)数据类型分类
        //        A:基本类型：4类8种
        //        B:引用类型：类，接口，数组
        //    (2)基本类型
        //        A:整数			占用的内存空间
        //          byte		1
        //          short		2
        //          int		    4
        //          long		8
        //        B:浮点数
        //          float		4
        //          double		8
        //          C:字符
        //          char		2
        //          D:布尔
        //          boolean		1
        //     (3)注意事项：(特别注意)
        //        A:整数默认是int类型，浮点数默认是double类型(运算中一定要特别注意隐式转换)
        //        B:定义long类型数据的时候，建议加上L或者l。推荐L
        //        定义float类型数据的时候，建议加上F或者f。推荐F
        //                (不加f或F编译会报损失精度的错误)
    }


    public void 类型转换() {

    }


    public void 方法重载() {
        //在同一个类中，允许存在一个以上的同名方法，只要它们的参数个数或者参数类型不同即可。
        //		和返回值类型无关。

        //重载(Overload)
    }


    public void 继承() {
        //格式：class 子类名 extends 父类名 {}
        //A:java中只能单继承
        //B:java中可以多层继承。(继承体系)

        //(5)java中的继承的注意事项：
        //		A:私有成员不能被继承
        //		B:构造方法不能被继承，想访问，通过super关键字
        //		C:不能为了部分功能而去使用继承
    }


    public void override和overload() {
        //override和overload的区别?
        //overload可以改变返回值类型吗?


        //重写(Override) :
        //    声明为final的方法不能被重写。
        //    声明为static的方法不能被重写，但是能够被再次声明。
        //    重写的方法能够抛出任何非强制异常，无论被重写的方法是否抛出异常。
        //        但是，重写的方法不能抛出新的强制性异常，或者比被重写方法声明的更广泛的强制性异常，反之则可以。
        //    当需要在子类中调用父类的被重写方法时，要使用super关键字。
        //重载(Overload)
        //    重载(overloading) 是在一个类里面，方法名字相同，而参数不同。返回类型可以相同也可以不同。


    }


    public void final关键字() {

        //      A:修饰类 类不能被继承
        //		B:修饰成员变量 变量变成了常量
        //		C:修饰成员方法 方法不能被重写
    }


    public void 接口() {
        //格式是：interface 接口名 {}
        //格式是：class 类名 implements 接口名 {}
        //extends 继承类|接口；implements 实现接口

        //抽象类：被继承体现的是：”is a”的关系。在抽象类中定义的一般是共性功能
        //	接口：被实现体现的是：”like a”的关系。在接口中定义的一般是扩展功能
    }


    public Object myObejct() {
        var obj = new Object();

        //返回该对象的哈希码值。 哈希值不是地址值，可以理解为地址值。
        var hashcode = obj.hashCode();

        //返回此 Object 的运行时类。
        var getclass = obj.getClass();

        return obj;
    }


    public void 等于号和equals的区别()
    {
        //      A:==
        //			基本类型：比较的是基本类型的值是否相同
        //			引用类型：比较的是引用类型的地址值是否相同
        //		B:equals()
        //			只能比较引用类型，默认比较的是对象的地址值是否相同。
        //			但是，可能被重写，一定要根据实际的情况来看。
    }

    public void Scanner(){
        var scanner = new Scanner(System.in);
        scanner.hasNext();
        scanner.hasNextBigInteger();
        scanner.hasNext();
        scanner.next();
    }



    public void myString() {
        //https://raw.githubusercontent.com/DuGuQiuBai/Java/master/day12/String%E5%88%9B%E5%BB%BA%E5%AF%B9%E8%B1%A1%E5%92%8C%E7%9B%B4%E6%8E%A5%E8%B5%8B%E5%80%BC%E7%9A%84%E5%8C%BA%E5%88%AB.bmp
        //创建了2个对象
        String str1 = new String("hello");
        //创建了1个对象
        String str2 = "hello";

        // false
        System.out.println(str1 == str2);
        // true
        System.out.println(str1.equals(str2));


        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); // true

        String s3 = new String("hello");
        String s4 = "hello";
        System.out.println(s3 == s4); // false
        System.out.println(s3.equals(s4)); // true

        String s5 = "hello";
        String s6 = "hello";
        System.out.println(s5 == s6);// true
        System.out.println(s5.equals(s6));// true
    }



    public void stringBufferAndStringBuilder() {
        //StringBuffer是线程安全的可变字符串。
        //StringBuilder是线程不安全的可变字符串。和StringBuffer的功能一样。就是效率高一些，但是不安全。

    }



    public void myCollection() {
        //https://github.com/DuGuQiuBai/Java/blob/master/day15/day15%E6%80%BB%E7%BB%93.txt
        //https://github.com/DuGuQiuBai/Java/blob/master/day17/Collection%E9%9B%86%E5%90%88%E6%80%BB%E7%BB%93.txt
        //1：Collection集合体系结构
        //	Collection
        //		|--List(元素有序，可重复)
        //			|--ArrayList
        //				底层数据结构是数组，查询快,增删慢
        //				线程不安全,效率高
        //			|--Vector
        //				底层数据结构是数组，查询快,增删慢
        //				线程安全,效率低
        //			|--LinkedList
        //				底层数据结构是链表，查询慢,增删快
        //				线程不安全,效率高
        //		|--Set(元素无序，唯一)
        //			|--HashSet
        //				底层数据结构是哈希表。
        //				保证元素的唯一性?
        //					依赖两个方法hashCode()和equals()。
        //				|--LinkedHashSet
        //					底层数据结构是哈希表和链表
        //						由哈希表保证元素唯一
        //						由链表保证元素有序
        //			|--TreeSet
        //				底层数据结构是二叉树(红黑树)
        //				保证元素的唯一性?
        //					根据比较的返回值是否是0
        //				保证元素的排序?
        //					自然排序
        //					比较器排序
        //2：针对Collection，你准备使用谁?
        //	元素唯一吗?
        //		是：Set
        //			要排序吗?
        //				是：TreeSet
        //				否：HashSet
        //
        //			不知道，就用HashSet
        //		否：List
        //			要安全吗?
        //				要：Vector(其实也不用，有更好的方式，后面讲)
        //				不要：ArrayList或者LinkedList
        //					查询多：ArrayList
        //					增删多：LinkedList
        //
        //			不知道，就用ArrayList
        //
        //	不知道，就用ArrayList
        //3：集合中的数据结构问题
        //	ArrayXxx:底层数据结构是数组，查询快，增删慢
        //	LinkedXxx:底层数据结构是链表，查询慢，增删快
        //	HashXxx:底层数据结构是哈希表。依赖两个方法hashCode()和equals()，根据情况选择是否自动重写
        //	TreeXxx:底层数据结构是二叉树。有两种方案：自然排序，比较器排序。

        Collection c = new ArrayList<String>();
        c.add("ddd");

        Iterator it = c.iterator();
        while (it.hasNext()) {
            String s = (String) it.next();
            System.out.println(s);
        }


        //List
        // 元素有序(存储顺序和取出顺序一致),可重复。
    }


    public void 数据结构() {
        //数据结构:
        //		A:栈
        //			先进后出
        //		B:队列
        //			先进先出
        //		C:数组
        //			查询快，增删慢
        //		D:链表
        //			查询慢，增删快

        //3：List的三个实现类(掌握)
        //	(1)List的三个实现类特点
        //		A:ArrayList
        //			底层数据结构是数组，查询快，增删慢
        //			线程不安全，效率高
        //		B:Vector
        //			底层数据结构是数组，查询快，增删慢
        //			线程安全，效率低
        //		C:LinkedList
        //			底层数据结构是链表，查询慢，增删快
        //			线程不安全，效率高
        //	(2)你如何选择哪个儿子进行使用?
        //		看情况。
        //
        //		要安全吗?
        //			要：Vector(其实也不用这个有更好的方式，后面讲)
        //			不要：ArrayList和LinkedList
        //				查询多：ArrayList
        //				增删多：LinkedList
        //
        //		如果你什么都不知道，就用ArrayList。
        //	(3)ArrayList
        //		A:存储字符串并遍历
        //		B:存储自定义对象并遍历
        //	(4)Vector
        //		A:特有功能(了解)
        //			a:addElement(object obj)	--	add()
        //			b:elementAt(int index)		--	get()
        //			c:elements()			--	iterator()
        //		B:存储字符串并遍历
        //		C:存储自定义对象并遍历
        //	(5)LinkedList
        //		A:特有功能(了解)
        //			a:addFirst(),addLast()
        //			b:removeFirst(),removeLast()
        //			c:getFirst(),getLast()
        //		B:存储字符串并遍历
        //		C:存储自定义对象并遍历
        //	(6)案例：
        //		A:去除ArrayList集合中重复字符串
        //		B:去除ArrayList集合中重复自定义对象
        //			contains()方法的底层源码是equals()
        //		C:用LinkedList模拟栈数据结构的集合，并测试
    }


    public void myMap() {
        //https://github.com/DuGuQiuBai/Java/blob/master/day18/day18%E6%80%BB%E7%BB%93.txt
    }

    public void 多线程() {
        //https://github.com/DuGuQiuBai/Java/blob/master/day23/day23%E6%80%BB%E7%BB%93.txt
        //https://github.com/DuGuQiuBai/Java/blob/master/day24/day24%E6%80%BB%E7%BB%93.txt
    }


}
