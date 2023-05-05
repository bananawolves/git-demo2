package com.itheima.demo3;

public class Student {
    private String name;
    private int age;

    //间接的访问方式
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAGE(){
        return age;
    }
    public void setAge(int age){
        if (age>=0&&age<=120){
            this.age=age;
        }else {
            System.out.println("输入有误");
        }
    }


    public void show(){
        System.out.println("姓名是："+name);
        System.out.println("年龄是："+age);
    }
}
