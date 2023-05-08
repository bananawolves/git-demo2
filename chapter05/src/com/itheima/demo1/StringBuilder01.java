package com.itheima.demo1;
/*
    StringBuilder类:字符串缓冲区
    和StringBuffer类区别:线程不同步
    相同点:内容可变的字符串缓冲区，提高操作数据的效率
 */
public class StringBuilder01 {
    public static void main(String[] args) {
        testString();//3734ms
        //testStringBuffer();//31ms
        //testStringBuilder();//25ms
    }

    private static void testStringBuilder() {
        long start =System.currentTimeMillis(); //获取当先系统的时间，以long进行返回单位为ms
        StringBuilder sb=new StringBuilder();
        for (int i = 1; i <=100000 ; i++) {
            sb.append(i);
        }
        System.out.println(sb);
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }

    private static void testStringBuffer() {
        long start =System.currentTimeMillis();
        StringBuffer sb=new StringBuffer();
        for (int i = 1; i <=100000 ; i++) {
            sb.append(i);
        }
        System.out.println(sb);
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }

    private static void testString() {
        long start =System.currentTimeMillis();
        String str="";
        for (int i = 1; i <=100000 ; i++) {
            str+=i;
        }
        System.out.println(str);
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
}
