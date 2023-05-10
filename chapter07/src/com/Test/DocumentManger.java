package com.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class DocumentManger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("--1:指定关键字检索文件  2.指定后缀名检索文件  3.删除文件/目录  4.退出--");
            System.out.println("请输入指令");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    //1:指定关键字检索文件
                    searchByKeyWord();
                    break;
                case 2:
                    //2.指定后缀名检索文件
                    searchBySuffix();
                    break;
                case 3:
                    //3.删除文件/目录
                    deleteDir();
                    break;
                case 4:
                    //4.退出--
                    System.out.println("感谢使用");
                    System.exit(0);
                    break;
            }
        }
    }

    private static void deleteDir() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的源目录：");
        String delPath=sc.next();
        File dir=new File(delPath);
        doDelete(dir);
    }

    private static void doDelete(File dir) {
        if (dir.exists()){
            File[] files=dir.listFiles();
            for (File file : files) {
                if (file.isDirectory()){
                    doDelete(file);     //进行递归调用进行目录的删除
                }else {
                    file.delete(); //进行文件的删除
                }
            }
            //删除完一个目录里面所有的文件后，就删除这个目录
            dir.delete();
        }
    }
    //2.指定后缀名检索文件

    private static void searchBySuffix() {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要检索的目录位置：");
        String path =sc.next();
        File file =new File(path);
        //判断目录是否存在，是否是目录
        if (!file.exists()||!file.isDirectory()){
            System.out.println(path+"不是有效目录");
            return;
        }
        //输入要搜索文件的后缀名
        System.out.println("请输入要搜索的文件后缀名");
        String suffix =sc.next();
        String[] suffixArray=suffix.split(",");
        //调用FileUtils中的方法，获取满足条件的文件所对应的绝对路径集合
        ArrayList<String>list=FileUtils.listFiles(file,suffixArray);
        for (String p : list) {
            System.out.println(p);
        }
    }
    //1:指定关键字检索文件
    private static void searchByKeyWord() {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要检索的目录位置：");
        String path =sc.next();
        File file =new File(path);
        //判断目录是否存在，是否是目录
        if (!file.exists()||!file.isDirectory()){
            System.out.println(path+"不是有效目录");
            return;
        }
        System.out.println("请输入检索的关键字：");
        String key=sc.next();
        ArrayList<String>list=FileUtils.listFiles(file,key);
        for (String p : list) {
            System.out.println(p);
        }
    }
}
