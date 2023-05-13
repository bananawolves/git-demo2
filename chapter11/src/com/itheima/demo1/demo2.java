package com.itheima.demo1;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class Human {
    private String name;
    private int age;

    public Human() {
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class demo2 {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("com.itheima.demo1.Human");
        //调用class类中的方法获取这个类中的属性
        Field[] fields = clazz.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            Class r=fields[i].getType();
            int mo=fields[i].getModifiers();
            String priv= Modifier.toString(mo);
            System.out.println("属性修饰符："+priv+",属性的类型"+r.getName()+",属性的名字"+fields[i].getName());
            
        }
    }
}
