package com.itheima;

import java.io.File;
import java.io.IOException;

public class TempFile {
    public static void main(String[] args) throws IOException {
        //创建一个临时文件，第一个参数是临时文件的前缀，第二个是后缀
        File f=File.createTempFile("itcast-",".txt");
        f.deleteOnExit();//JVM退出时，自动删除文件
        System.out.println(f.isFile());
        System.out.println(f.getPath());
    }
}
