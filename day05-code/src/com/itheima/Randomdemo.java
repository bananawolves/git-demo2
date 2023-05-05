package com.itheima;

import java.util.Random;

public class Randomdemo {
    public static void main(String[] args) {
        //创建对象
        Random r=new Random();
        //生成随机数 小括号里的范围是从0开始到99(包头不包尾)
        int num= r.nextInt(100);
        System.out.println(num);
    }
}
