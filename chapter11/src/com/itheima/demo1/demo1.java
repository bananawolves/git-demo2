package com.itheima.demo1;

import java.lang.reflect.Constructor;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
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

public class demo1 {
    public static void main(String[] args) throws Exception {
        //获取Person类所对应的字节码文件对象
        Class clazz=Class.forName("com.itheima.demo1.Person");
        //获取这个类中所有的构造方法对象
        Constructor[]cons=clazz.getConstructors();
        //从数组中获取构造方法对象
        //newInstance方法的参数就是构造方法所对应的实际参数
        Person per=(Person) cons[0].newInstance("张三",22);
        System.out.println(per);
    }
}
