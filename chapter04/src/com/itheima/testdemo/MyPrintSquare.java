package com.itheima.testdemo;

public class MyPrintSquare extends MyPrint {
    @Override
    public void show() {
        //打印正方形
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0 || j == 4) {
                    System.out.print("*");
                } else if (i == 0 || i == 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
