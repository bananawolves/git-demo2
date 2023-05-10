package com.itheima;

import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) throws IOException {
        File file =new File("d:/hello/demo.txt");
        if (file.exists()){
            file.delete();
        }else {
            System.out.println(file.createNewFile());
        }
        File file2=new File("d:/hello1/demo.txt");
        if (!(file2.getParentFile().exists())){
            file2.getParentFile().mkdir(); //mkdir()  创建目录
        }
        if (file2.exists()){
            file2.delete();
        }else {
            System.out.println(file2.createNewFile());
        }
    }
}
