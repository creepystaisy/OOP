package com.company;

public class Services extends Goods {
    public Services(int goodId) {
        super(goodId);
    }

    public Services(double goodPrice) {
        super((int) goodPrice);
    }

    public Services(int goodId, double goodPrice, String goodDescription) {
        super(goodId, goodPrice, goodDescription);
    }
}
