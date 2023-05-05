package com.itheima.test1;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Book[]books=new Book[3];
        //调用打印图书信息的方法
        printBooks(books);
        //调用购买图书的方法
        Order order=buy(books);
        //打印订单信息
        printInfo(order);
    }

    private static void printInfo(Order order) {
        System.out.println("订单编号："+order.getOrderID());
        System.out.println("图书名称\t\t图书单价\t购买数量");
        OrderItem[] items=order.getItems();
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i].getBook().getName()+"\t"+items[i].getBook().getPrice()+"\t"+items[i].getNum());
        }
        System.out.println("-------------------------------------------");
        System.out.println("总金额："+order.getTotalMoney());

    }

    private static Order buy(Book[] books) {
        Order order=new Order("001");
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < books.length; i++) {
            System.out.println("请输入图书编号：");
            int id = sc.nextInt();
            System.out.println("请输入购买数量：");
            int num = sc.nextInt();
            OrderItem item=new OrderItem(books[id-1],num);
            order.setItems(i,item);
        }
        return order;
    }

    private static void printBooks(Book[] books) {
        books[0]=new Book(1,"java教程",10,20);
        books[1]=new Book(2,"html教程",20,20);
        books[2]=new Book(3,"paython教程",30,20);
        System.out.println("------------------------------");
        System.out.println("图书编号\t图书名称\t\t图书单价\t\t图书库存");
        for (int i = 0; i < books.length; i++) {
            Book b = books[i];
            System.out.println(b.getId()+"\t\t"+b.getName()+"\t"+b.getPrice()+"\t\t"+b.getStock());
        }
        System.out.println("------------------------------");

    }
}
