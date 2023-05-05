package com.itheima.demo4;
/*
用标准格式写一个类
包含：成员变量
      构造方法
      成员方法
 */
public class student {
    public String name;
    public  int age;

    public student() {
    }

    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void show(){
        System.out.println("姓名是："+name+"，年龄是："+age);
    }
}
