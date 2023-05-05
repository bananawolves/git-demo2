package com.itheima.demo1;
/*
        继承:让类和类之间产生子类的关系
        格式:子类 extends 父类
        好处:子类可以继承父类中非私有的成员，提高代码的复用性和维护性
        当然，子类也可以定义自已特有的成员
 */
public class test {
    public static void main(String[] args) {
        dog a =new dog();
        a.setName("金毛");
        a.setAge(5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
        cat b =new cat();
        b.setName("英短");
        b.setAge(5);
        System.out.println(b.getName()+","+b.getAge());
        b.eat();

    }
}
