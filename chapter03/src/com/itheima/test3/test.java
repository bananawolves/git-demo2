package com.itheima.test3;

public class test {
    public static void main(String[] args) {
        Phone p1=new Phone("苹果","iphone 14 pro max 1TB 远峰蓝",14000,"ios",16);
        p1.about();
        p1.call(2);
        p1.playGame();
        p1.downLoadMusic("lost river");
        p1.playMusic("lost river");
        System.out.println("--------------------------------------------------------------------------------");
        Phone p2=new Phone("苹果","iphone 13 pro max 1TB 远峰蓝",9000,"ios",8);
        p2.about();
        p2.call(3);
        p2.playGame();
        p2.downLoadMusic("新宝岛");
        p2.playMusic("新宝岛");
    }
}
