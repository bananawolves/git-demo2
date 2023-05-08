package com.itheima.demo1;

/*
        String类初始化对象构造方法:
        String()                创建一个内容为空的字符串
        String (String str)     根据指定的字符串内容创建对象
        String(char[] arr)      根据指定的字符数组创建对象
        String(byte[] arr)      根据指定的字节数组创建对象
        直接赋值方式:
        String s =abc"
 */
public class string01 {
    public static void main(String[] args) {
      // String()                创建一个内容为空的字符串
        String s1=new String();
        System.out.println(s1);
        // String (String str)     根据指定的字符串内容创建对象
        String s2 =new String("abc");
        System.out.println(s2);
        // String(char[] arr)      根据指定的字符数组创建对象
        char[] Arr={'H','e','l','l','o'};
        String s3=new String(Arr);
        System.out.println(Arr);
       // String(byte[] arr)      根据指定的字节数组创建对象
        byte[] aRR={97,98,99,100};
        String s4 = new String(aRR);
        System.out.println(s4);


    }
}
