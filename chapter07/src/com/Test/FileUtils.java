package com.Test;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;

public class FileUtils {
    public static ArrayList<String> listFiles(File file, String key) {
        //创建一个文件名称过滤器对象
        FilenameFilter filter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                //把dir和name封装成一个File对象
                File currFile = new File(dir, name);
                //判断currFile是否是一个文件，并且这个文件的名称包含key
                if (currFile.isFile() && name.contains(key)) {
                    return true;
                }
                return false;
            }
            //调用fileDir方法
        };
        ArrayList<String> arrayList = fileDir(file, filter);
        return arrayList;
    }

    public static ArrayList<String> fileDir(File dir, FilenameFilter filter) {
        ArrayList<String> arrayList = new ArrayList<>();
        File[] lists = dir.listFiles(filter);
        for (File list : lists) {
            //获取文件的绝对路径，然后将其存储到arrayList集合中
            arrayList.add(list.getAbsolutePath());
        }
        //获取当前目录下所有文件的数组
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                ArrayList<String> every = fileDir(file, filter);
                arrayList.addAll(every);
            }
        }
        return arrayList;
    }

    public static ArrayList<String> listFiles(File file, String[] suffixArray) {
        FilenameFilter filter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                //把dir和name封装成一个File对象
                File currFile = new File(dir, name);
                //判断currFile是否是一个文件，并且这个文件的名称包含key
                if (currFile.isFile()) {
                    for (String suffix : suffixArray) {
                        if (name.endsWith("." + suffix)) {
                            return true;

                        }
                    }
                }
                return false;
            }

        };
        //调用fileDir方法,获取满足条件的文件绝对路径
        ArrayList<String> arrayList= fileDir(file, filter);
        return arrayList;
    }
}
