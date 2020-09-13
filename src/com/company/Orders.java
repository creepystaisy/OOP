package com.company;

import java.util.ArrayList;
import java.util.Date;


public class Orders {

    private int orderId;
    private Customers orderCustomer;
    private ArrayList <Goods> orderGood;
    private ArrayList<Integer> orderAmount;
    private Date orderDate;

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
    public static ArrayList<Goods> putGoodsList()
    {
        ArrayList <Goods> myList = new ArrayList<Goods>();
        GoodsFactory factory = new GoodsFactory();
        myList.add(factory.getGoods(GoodTypes.BOOK));
        myList.add(factory.getGoods(GoodTypes.BOOT));
        myList.add(factory.getGoods(GoodTypes.MUSICLICENSE));
        return myList;
    }
    public static ArrayList <Integer> putAmountList(Integer... orders)
    {
        ArrayList <Integer> myList = new ArrayList<Integer>();

        for(int i = 0; i < orders.length; i++) {
            myList.add(orders[i]);
        }
        return myList;
    }
}
