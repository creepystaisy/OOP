package com.company;

import java.util.ArrayList;
import java.util.Date;


public class Orders {

    public int orderId;
    public Customers orderCustomer;
    public ArrayList <Positions> orderGood;
    public Date orderDate;
    public int orderCount = 0;
    //Конструкторы



    public Orders( Customers orderCustomer, Date orderDate, int amount1, int amount2, int amount3) {
        this.orderId = orderCount;
        this.orderCustomer = orderCustomer;
        this.orderGood = putGoodsList(amount1, amount2, amount3);
        this.orderDate = orderDate;
        orderCount++;
    }
    //геттеры сеттеры
    public static ArrayList<Positions> putGoodsList(int ... amount)
    {
        ArrayList <Positions> myList = new ArrayList<Positions>();
        myList.add(new Positions(new Goods(0, 100, true, "boot"), amount[0]));
        myList.add(new Positions(new Goods(0, 100, true, "boot"), amount[1]));
        myList.add(new Positions(new Goods(0, 100, true, "boot"), amount[2]));
        return myList;
    }


    @Override
    public String toString() {
        return "Order: " +
                "#" + orderId + "\n" +
                "..............................."+"\n"+
                "Customer: " + orderCustomer +"\n"+
                "..............................."+"\n"+
                "Goods            Number            Price"+"\n"+ orderGood + "\n"+
                "..............................."+"\n"+
                "               Date: " + orderDate;
    }
}
