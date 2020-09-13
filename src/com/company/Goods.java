package com.company;

import java.util.ArrayList;

public class Goods {

    private int goodId;
    private double goodPrice;
    private boolean goodDelivery;
    private String goodDescription;


    //Конструкторы
    public Goods(int goodId) {
        this.goodId = goodId;
    }

    public Goods(double goodPrice, boolean goodDelivery, String goodDescription) {
        this.goodPrice = goodPrice;
        this.goodDelivery = goodDelivery;
        this.goodDescription = goodDescription;
    }

    public Goods(int goodId, double goodPrice, boolean goodDelivery, String goodDescription) {
        this.goodId = goodId;
        this.goodPrice = goodPrice;
        this.goodDelivery = goodDelivery;
        this.goodDescription = goodDescription;
    }
    //геттеры сеттеры

    public int getGoodId() {
        return goodId;
    }



    public double getGoodPrice() {
        return goodPrice;
    }



    public String getGoodDescription() {
        return goodDescription;
    }


    public void printGood()
    {
        System.out.print(this);
    }
    @Override
    public String toString()
    {
        return getGoodId()+", "+getGoodPrice()+", "+getGoodDescription();
    }

}
