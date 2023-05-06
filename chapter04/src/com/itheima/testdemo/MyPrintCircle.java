package com.itheima.testdemo;

public class MyPrintCircle extends MyPrint {
    @Override
    public void show() {
        //打印圆形
        for (int y = 0; y <= 10; y += 2) {
            int x = (int) Math.round(5 - Math.sqrt(10 * y - y * y));
            int len = 2 * (5 - x);
            for (int i = 0; i <= x; i++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j <= len; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}
