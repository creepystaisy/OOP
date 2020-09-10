package com.company;

public class Goods {

    public int goodId;
    public double goodPrice;
    public boolean goodDelivery;
    public String goodDescription;


    //Конструкторы
    public Goods(int goodId) {
        this.goodId = goodId;
    }

    public Goods(double goodPrice) {
        this.goodPrice = goodPrice;
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

    public void setGoodId(int goodId) {
        this.goodId = goodId;
    }

    public double getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(double goodPrice) {
        this.goodPrice = goodPrice;
    }

    public boolean isGoodDelivery() {
        return goodDelivery;
    }

    public void setGoodDelivery(boolean goodDelivery) {
        this.goodDelivery = goodDelivery;
    }

    public String getGoodDescription() {
        return goodDescription;
    }

    public void setGoodDescription(String goodDescription) {
        this.goodDescription = goodDescription;
    }
    @Override
    public String toString()
    {
        return getGoodId()+", "+getGoodPrice()+", "+getGoodDescription();
    }
}
