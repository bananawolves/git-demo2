package com.itheima.test4;

public class test {
    public static void main(String[] args) {
        Voter v1=new Voter("tom");
        Voter v2=new Voter("mike");
        Voter v3=new Voter("jack");
        v1.voterFor("是");
        v1.voterFor("否");
        v2.voterFor("是");
        v3.voterFor("是");

        v1.printResult();
    }
}
