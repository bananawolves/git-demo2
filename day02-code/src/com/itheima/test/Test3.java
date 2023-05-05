package com.itheima.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //录入两个整数
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数");
        int b = sc.nextInt();
        //使用||逻辑判断结果
        boolean result=a==6||(a+b)%6==0||b==6;
        System.out.println(result);
    }
}
