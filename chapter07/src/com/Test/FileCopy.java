package com.Test;

import java.io.*;

public class FileCopy {
    //需求：把项目根目录路径下的source目录下的a.jpg复制到根目录的target目录中。
    public static void main(String[] args) throws IOException {
        //创建一个FileInputStream对象
        InputStream in =new FileInputStream("source/a.jpg");
        //创建一个FileOutputStream对象
        OutputStream out =new FileOutputStream("target/a.jpg");
        //一次读取一个字节数组进行文件复制
        byte[] buff=new byte[1024];//一般以1024的倍数
        //读取数据
        //int len=in.read(buff); 返回的是读取到的有效字节个数，如果读取到了文件末尾则返回-1；
        int len;
        long beginTime=System.currentTimeMillis();
        while ((len=in.read(buff))!=-1){
            out.write(buff,0,len);//从0索引开始到len个写入到文件中
        }
        long endTime=System.currentTimeMillis();
        System.out.println("复制文件所消耗的时间是（ms）："+(endTime-beginTime));
        //资源的释放
        in.close();
        out.close();
    }
}
