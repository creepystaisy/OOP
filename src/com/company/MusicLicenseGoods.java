package com.company;

public class MusicLicenseGoods extends Goods {
    public MusicLicenseGoods(int goodId) {
        super(goodId);
    }

    public MusicLicenseGoods(double goodPrice, boolean goodDelivery, String goodDescription) {
        super(goodPrice,goodDelivery, goodDescription);
    }
}
