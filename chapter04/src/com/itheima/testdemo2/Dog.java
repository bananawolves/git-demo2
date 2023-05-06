package com.itheima.testdemo2;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void shout() {
        System.out.println("汪汪汪......");
    }

    @Override
    public void eat(Food food) {
        System.out.println(getName()+"正在吃着香喷喷的"+food.getName());
    }
}
