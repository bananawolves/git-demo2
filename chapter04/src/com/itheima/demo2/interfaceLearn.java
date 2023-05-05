package com.itheima.demo2;

public class interfaceLearn {
    public static void main(String[] args) {
        InterImpl ii=new InterImpl();
        System.out.println(ii.NUM);
        ii.method();
        ii.fun();
        //ii.show();
        InertA.show();
        System.out.println(InertA.NUM);
    }
}
interface InertA{
    //常量
    public static final int NUM=10;
    //抽象方法
    public abstract void method();
    //静态方法
    public static void show(){
        System.out.println("static.........show......");
    }
    //默认方法
    public default void fun(){
        System.out.println("default...........fun");
    }
}
class InterImpl implements InertA{/*定义了一个类名为 InterImpl 的类，并使用了关键字 implements
                                 来表明该类实现了接口 InertA。这意味着 InterImpl 类必须实现 InertA 接口中定义的所有方法。*/

    @Override
    public void method() {
        System.out.println("重写后的method........");
    }
}
