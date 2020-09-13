package com.company;

public class BootGoods extends Goods {


    public BootGoods(double goodPrice, boolean goodDelivery, String goodDescription) {
        super(goodPrice,goodDelivery, goodDescription);
    }
    @Override
    public void printGood()
    {
        System.out.println(this);
    }
}
