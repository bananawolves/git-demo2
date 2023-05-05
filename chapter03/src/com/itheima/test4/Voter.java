package com.itheima.test4;

import java.util.HashSet;

public class Voter {
    private static final int MAX_COUNT=100;
    private static int count;
    private static HashSet<Voter> voters=new HashSet<>();//HashSet 是 Java 中的一种集合类，它可以存储一组唯一的对象，而且不保证元素的顺序。
                                                            //定义了一个 HashSet 类型的变量 voters 来存储选民对象 Voter
    private String name;
    private String answer;

    public Voter(String name) {
        this.name = name;
    }
    //投票的方法：
    public void voterFor(String answer){
        if (count==MAX_COUNT){
            System.out.println("投票数量已达上限。");
            return;
        }
        if (voters.contains(this)){//contains(this) 是 HashSet 类中的一个方法调用，它的作用是判断当前 HashSet 中是否包含了当前对象 this
            System.out.println(name+"请勿重复投票");
        }else{
            this.answer=answer;
            count++;
            voters.add(this);
            System.out.println(name+"感谢您的投票");
        }
    }
    public void printResult(){
        System.out.println("参与投票的数量："+count);
        System.out.println("参与投票的结果如下：");
        for (Voter voter : voters) {                   //for (元素类型 元素变量 : 容器)
            System.out.println(voter.name+"意见："+voter.answer);
        }
    }
}
