package com.itheima.test;

public class Test4 {
    public static void main(String[] args) {
        //1.定义变量记录三个和尚的身高
        int a = 150;
        int b = 210;
        int c = 165;
        //2.比较三着身高
        int taller = a > b ? a : b;
        int tallest = taller > c ? taller : c;
        //ctrl+alt+L 自动格式化代码(对齐代码)
        System.out.println(tallest);
    }
}
