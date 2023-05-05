package com.itheima.demo1;

public class cat extends animal{
    public String color;
    public cat(){
        this("花花",5,"white");//与super（）不可以一起用
        //super(); //可以忽略不写
    }
    public cat(String name,int age,String color){
        super();
        this.color=color;
    }//通过super将接收到的参数给父类的有参构造方法传递
    @Override
    public void eat(){
        //System.out.println(super.num);//通过super访问父类的成员变量
        //super.eat();通过super访问父类的成员方法
        System.out.println("我要吃鱼~"); //继承抽象类，里面的抽象方法必须要被重写
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
