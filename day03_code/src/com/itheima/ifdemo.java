package com.itheima;

import java.util.Scanner;

public class ifdemo {
    public static void main(String[] args) {
        //需要:键盘录入女婿酒量,如果大于2斤,老丈人同意这门婚事
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的酒量");
        int wine = sc.nextInt();
        //判断酒量是否达到老丈人的要求
        if (wine > 2) {
            System.out.println("小伙子,我女儿就交给你了");
        }
        else
            System.out.println("你小子长得丑,想得美");
    }
}

