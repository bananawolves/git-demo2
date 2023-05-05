package com.itheima.demo1;

public class test2 {
    public static void main(String[] args) {
        cat cat=new cat();
        cat.setName("孙笑川");
        cat.setAge(120);
        cat.setColor("基佬紫");
        System.out.println(cat.getName()+"\t"+cat.getAge()+"\t"+cat.getColor());
        cat.eat();
        System.out.println();
    }


}
