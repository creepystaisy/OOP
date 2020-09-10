package com.company;

import java.util.Date;

public class Orders {

    public int orderId;
    public Customers orderCustomer;
    public Goods orderGood;
    public int orderAmount;
    public Date orderDate;

    //Конструкторы

    public Orders(int orderId) {
        this.orderId = orderId;
    }

    public Orders(int orderId, Customers orderCustomer, Goods orderGood, int orderAmount, Date orderDate) {
        this.orderId = orderId;
        this.orderCustomer = orderCustomer;
        this.orderGood = orderGood;
        this.orderAmount = orderAmount;
        this.orderDate = orderDate;
    }
    //геттеры сеттеры

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Customers getOrderCustomer() {
        return orderCustomer;
    }

    public void setOrderCustomer(Customers orderCustomer) {
        this.orderCustomer = orderCustomer;
    }

    public Goods getOrderGood() {
        return orderGood;
    }

    public void setOrderGood(Goods orderGood) {
        this.orderGood = orderGood;
    }

    public int getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(int orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}
