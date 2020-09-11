package com.company;

import java.util.ArrayList;
import java.util.Date;


public class Orders {

    public int orderId;
    public Customers orderCustomer;
    public ArrayList <Goods> orderGood;
    public ArrayList<Integer> orderAmount;
    public Date orderDate;

    //Конструкторы

    public Orders(int orderId) {
        this.orderId = orderId;
    }

    public Orders(int orderId, Customers orderCustomer, ArrayList <Goods> orderGood, ArrayList <Integer> orderAmount, Date orderDate) {
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

    public ArrayList <Goods> getOrderGood() {
        return orderGood;
    }

    public void setOrderGood(ArrayList <Goods> orderGood) {
        this.orderGood = orderGood;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public ArrayList<Integer> getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(ArrayList<Integer> orderAmount) {
        this.orderAmount = orderAmount;
    }


    @Override
    public String toString() {
        return "Orders{" +
                "orderId=" + orderId +
                ", orderCustomer=" + orderCustomer +
                ", orderGood=" + orderGood +
                ", orderAmount=" + orderAmount +
                ", orderDate=" + orderDate +
                '}';
    }
}
