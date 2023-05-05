package com.itheima.demo6;

public class student {
    public String name;
    public int age;
    static String school;

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

    public static String getSchool() {
        return school;
    }

    public static void setSchool(String school) {
        student.school = school;
    }
    public void show(){
        System.out.println("姓名是："+name+"，年龄是："+age+"，学校是："+school);
    }
}
