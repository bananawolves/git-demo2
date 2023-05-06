package com.itheima.demo3;

public class student01Test {
    public static void main(String[] args) {
        Student01 s1 =new Student01("张三",15);
        Student01 s2 =new Student01("张三",15);
        System.out.println(s1.toString());
        System.out.println(s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }

}
