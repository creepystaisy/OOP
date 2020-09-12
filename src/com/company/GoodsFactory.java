package com.company;

public class GoodsFactory {
    public Goods getGoods(GoodTypes type) {
        Goods toReturn = null;
        switch (type) {
            case BOOK:
                toReturn = new BookGoods(100, true, "book");
                break;
            case BOOT:
                toReturn = new BootGoods(1000, true, "boot");
                break;
            case MUSICLICENSE:
                toReturn = new MusicLicenseGoods(10000, false, "music");
                break;
            default:
                throw new IllegalArgumentException("Wrong good type:" + type);
        }
        return toReturn;
    }
}
