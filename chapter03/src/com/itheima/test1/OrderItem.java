package com.itheima.test1;
//订单项类
public class OrderItem {
    private Book book;//哪一本书
    private int num;

    public OrderItem() {
    }

    public OrderItem(Book book, int num) {
        this.book = book;
        this.num = num;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
