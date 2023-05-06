package com.itheima.demo3;
/*      多态:事物表现的不同形态
        前提:
        1。必须有继承或实现关系
        2。必须有方法重写
        3。必须有义类引用指向子类对象
        好处:提高方法的灵活性
        如果一个方法中使用父类或父接口作为形式参数，将来调用该方法时，可以传递任意的子类对象!

        多态的弊端:无法使用子类特有的成员
        如果想使用子类特有的成员，就需要向下转型
        子类 对象名 = (子类)父类对象;
 */
public class duoTai01 {
    public static void main(String[] args) {
        /*父类引用指向子类对象；
           Animal a=new Dog();
           a.shout();
        */
        Dog d =new Dog();
        useAnimal(d);
        Cat c =new Cat();
        useAnimal(c); //由于cat和dog时平级的类无法转型，因此会报错,可以通过instanceof来进行条件判断解决
    }

    public static void useAnimal(Animal a) {
        a.shout();
        if (a instanceof Dog) { //判断：左边是否是右边具体的类型 是：返回ture
            Dog dog=(Dog)a;
            dog.show();
        }
    }
}

abstract class Animal{
    public abstract void shout();
}
class Dog extends Animal{

    @Override
    public void shout() {
        System.out.println("汪汪叫...........");
    }
    public void show(){
        System.out.println("dog.....show");
    }
}
class Cat extends Animal{

    @Override
    public void shout() {
        System.out.println("喵喵叫.............");
    }
}