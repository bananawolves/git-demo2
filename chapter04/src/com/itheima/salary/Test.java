package com.itheima.salary;

public class Test {
    public static void main(String[] args) {
        Graduate g=new Graduate("蕉太狼","沃尔玛购物袋",18,1000,999);
        System.out.println("学生姓名："+g.getName()+",年龄："+g.getAge()+",性别："+ g.getSex()+",月收入："+g.getPay()+",月支出："+g.getFee());
        if (g.getPay()*12-g.getFee()*12<2000){
            System.out.println("余额："+(g.getPay()*12-g.getFee()*12));
            System.out.println("需要贷款");
        }else{
            System.out.println("余额："+(g.getPay()*12-g.getFee()*12));
            System.out.println("不需要贷款");
        }
    }
}
