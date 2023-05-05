package com.itheima.test1;

//订单类
public class Order {
    private String orderID;
    private OrderItem[] items = new OrderItem[3];
    private double totalMoney;

    public Order() {
    }

    public Order(String orderID) {
        this.orderID = orderID;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public OrderItem[] getItems() {
        return items;
    }

    public void setItems(int i, OrderItem item) {
        items[i] = item;
    }

    public double getTotalMoney() {
        for (int i = 0; i < items.length; i++) {
            totalMoney += items[i].getNum() * items[i].getBook().getPrice();
        }
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }
}
