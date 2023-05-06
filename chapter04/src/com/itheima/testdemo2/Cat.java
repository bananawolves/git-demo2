package com.itheima.testdemo2;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name) {

        super(name);
    }

    @Override
    public void shout() {

        System.out.println("喵喵......");
    }

    @Override
    public void eat(Food food) {

        System.out.println(getName() + "正在吃着香喷喷的" + food.getName());
    }
}
