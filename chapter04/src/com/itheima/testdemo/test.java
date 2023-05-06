package com.itheima.testdemo;

public class test {
    public static void main(String[] args) {
        userMyPrint(new MyPrintSquare());
        userMyPrint(new MyPrintCircle());
    }
    public static void userMyPrint(MyPrint my){
        my.show();
    }
}
