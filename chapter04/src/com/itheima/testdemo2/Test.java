package com.itheima.testdemo2;

public class Test {
    public static void main(String[] args) {
        Feeder f=new Feeder("蔡徐坤");
        f.speak();
        Dog dog =new Dog("哈士奇");
        dog.shout();
        f.feeder(dog,new Bone());

        Cat cat =new Cat("波斯猫");
        cat.shout();
        f.feeder(cat,new Fish());
    }
}
