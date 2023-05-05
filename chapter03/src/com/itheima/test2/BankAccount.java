package com.itheima.test2;
/*
(1)通过任务描述可知，需要定义一个银行账户类 BankAccount 实现银行账户的概念
(2)账户的属性包括账号和存款余额,所以还需要在 BankAccount 类中定义两个变量:“”(account number)和“存款余额”(leftmoney)。
(3)对账户的操作包括存款、取款、查询余额，所以再定义四个方法
:“存款”savemoney)“”(getmoney)、“查询余额”(getleftmoney)以及构造方法(BankAccount)。“
(4)最后，编写测试类，在 main0方法中创建一个 BankAccount 类的对象 ba，假设 ba的账号为:123456，初始的存款余额为 500 元。
首先向该账户存入 1000 元，再取出 500 元。
 */
public class BankAccount {
    private String number;//账号
    private double leftMoney;

    public BankAccount() {
    }

    public BankAccount(String number, double leftMoney) {
        this.number = number;
        this.leftMoney = leftMoney;
    }
    public double getLeftMoney(){
        return leftMoney;
    }
    public void saveMoney(double money){
        leftMoney+=money;
    }
    public void getMoney(double money){
        leftMoney-=money;
    }
}
