package com.itheima.test;

import java.util.Scanner;

public class Tset2 {
    public static void main(String[] args) {
        //键盘录入两个整数,表示两人的衣服时髦度
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入你的衣服时髦度:");
        int myfashion = sc.nextInt();
        System.out.println("请输入相亲对象的衣服时髦度:");
        int herfashion =sc.nextInt();
        //比较你们的时髦度,如果你赢了就相亲成功
        boolean result= myfashion >herfashion;
        System.out.println(result);
    }
}
