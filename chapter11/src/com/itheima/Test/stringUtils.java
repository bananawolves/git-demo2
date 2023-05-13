package com.itheima.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class stringUtils {
    public String toString(Object obj){
        //获取这个对象所对应的类的字节码文件对象
        Class clazz=obj.getClass();
        //创建StringBuilder对象
        StringBuilder sb=new StringBuilder();
        //获取类所在的包
        Package packageName=clazz.getPackage();
        //获取包的相关信息
        sb.append("包名："+packageName.getName()+"\t");
        //获取类的简单名称
        String simpleName=clazz.getSimpleName();
        sb.append("类名："+simpleName+"\n");
        sb.append("公共的构造方法：\n");
        //获取类公共的构造方法
        Constructor[] constructors=clazz.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            final String modifier= Modifier.toString(constructor.getModifiers());
            if (modifier.contains("public")){
                sb.append(constructor.toGenericString()+"\n");
            }
        }
        sb.append("公共的Field:\n");
        //获取共有的成员变量
        Field[]fields=clazz.getDeclaredFields();
        for (Field field : fields) {
            String modifier=Modifier.toString(field.getModifiers());
            if (modifier.contains("public")){
                sb.append(field.toGenericString()+"\n");
            }
        }
        sb.append("共有方法:\n" );
        //获取共有的成员方法
        Method[]methods=clazz.getDeclaredMethods();
        for (Method method : methods) {
            String modifier=Modifier.toString(method.getModifiers());
            if (modifier.contains("public")){
                sb.append(method.toGenericString()+"\n");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new stringUtils().toString(new Object()));
    }
}
