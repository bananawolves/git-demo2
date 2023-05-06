package com.itheima.testdemo2;

public class Feeder {
    private String name;

    public Feeder() {
    }

    public Feeder(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void speak(){
        System.out.println("欢迎来到动物园");
        System.out.println("我是饲养员："+getName());
    }
    public void feeder(Animal a,Food food){
        a.eat(food);
    }
}
