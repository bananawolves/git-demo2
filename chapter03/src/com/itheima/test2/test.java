package com.itheima.test2;

public class test {
    public static void main(String[] args) {
        BankAccount ba =new BankAccount("123456789",500);
        System.out.println("当前账户余额是："+ba.getLeftMoney());
        ba.saveMoney(1000);
        System.out.println("存款1000后，余额是："+ba.getLeftMoney());
        ba.getMoney(500);
        System.out.println("取款500后，余额是："+ba.getLeftMoney());

    }
}
