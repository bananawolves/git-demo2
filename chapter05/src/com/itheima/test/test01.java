package com.itheima.test;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名");
        String username=sc.nextLine();
        String password=reverse(username);
        System.out.println("恭喜"+username+"注册成功，默认密码是："+password);
    }

    private static String reverse(String username) {
        String str="";
        for (int i = username.length()-1; i >=0 ; i--) {
            str+=username.charAt(i);
        }
        return str;
    }
}
