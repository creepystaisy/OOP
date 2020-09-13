package com.company;

public class GoodsFactory {

    private Integer musicGoodsCount = 0;
    private Integer bootGoodsCount = 0;
    private Integer bookGoodsCount = 0;
    private Integer total = 0;


    public Goods getGoods(GoodTypes type) {
        Goods toReturn = null;
        switch (type) {
            case BOOK:
                bookGoodsCount++;
                total++;
                toReturn = new BookGoods(100, true, "book");
                break;
            case BOOT:
                bootGoodsCount++;
                total++;
                toReturn = new BootGoods(1000, true, "boot");
                break;
            case MUSICLICENSE:
                musicGoodsCount++;
                total++;
                toReturn = new MusicLicenseGoods(10000, false, "music");
                break;
            default:
                throw new IllegalArgumentException("Wrong good type:" + type);
        }
        return toReturn;
    }
}
