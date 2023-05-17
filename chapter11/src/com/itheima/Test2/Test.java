package com.itheima.Test2;

import java.lang.reflect.Method;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws Exception {
        //加载test.properties中的内容，将其存储再一个properties集合中
        Properties properties=new Properties();
        properties.load(Test.class.getResourceAsStream("/com/itheima/Test2/test.properties"));
        //从集合中获取对应的数据
        String className=properties.getProperty("ClassName");
        String methodName=properties.getProperty("methodName");
        //获取该类所对应的字节码文件对象
        Class clazz=Class.forName(className);
        //创建该类的对象
        Object obj=clazz.newInstance();
        //获取指定的方法对象
        Method method=clazz.getMethod(methodName);
        //执行该成员方法
        method.invoke(obj);
    }
}
