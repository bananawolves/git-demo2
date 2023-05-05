package com.itheima.demo1;
/*
    对象的引用传递：引用类型在相互赋值时，将该对象的内存地址赋值。
 */
public class studentdemo2 {
    public static void main(String[] args) {
        student stu1 = new student();
        stu1.age = 18;
        System.out.println(stu1.age);
        student stu2 = stu1;
        System.out.println(stu2.age);
        //打印内存地址
        System.out.println(stu1);
        System.out.println(stu2);
    }
}
