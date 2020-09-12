package com.company;

public class BookGoods extends Goods{

    public BookGoods(int goodId) {
        super(goodId);
    }

    public BookGoods(double goodPrice, boolean goodDelivery, String goodDescription) {
        super(goodPrice,goodDelivery, goodDescription);
    }

    @Override
    public void printGood()
    {
        System.out.println(this);
    }
}
