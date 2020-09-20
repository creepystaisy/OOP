package com.company;

public class Goods {

    public int goodId;
    public double goodPrice;
    public boolean goodDelivery;
    public String goodDescription;


    //Конструкторы


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

    @Override
    public String toString()
    {
        return getGoodId()+", "+getGoodPrice()+", "+getGoodDescription();
    }
}
