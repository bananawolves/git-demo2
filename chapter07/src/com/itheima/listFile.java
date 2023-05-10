package com.itheima;

import java.io.File;

public class listFile {
    public static void main(String[] args) {
        File f=new File("D:\\Java学习\\idea工程文件");
        if (f.isDirectory()){
            String[] names=f.list();
            for (String name : names) {
                System.out.println(name);
            }
        }
    }
}
