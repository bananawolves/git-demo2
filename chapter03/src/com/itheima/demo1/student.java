package com.itheima.demo1;
//学生类：
//成员变量（属性）：这一类实物的描述信息
//成员方法（行为）：这一类实物的功能
//
public class student {
    //成员变量：书写在类中方法外（成员信息）
    //姓名
    String name;
    //年龄
    public int age;
    //性别
    String sex;
//成员方法：读书
    public void read() {
        System.out.println("姓名是："+name);
        System.out.println("年龄是："+age);
        System.out.println("性别是："+sex);
        System.out.println("好好读书");

    }
}
