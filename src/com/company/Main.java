package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Goods boots = new Goods(0, 11, true, "boots");
        Goods programLicense = new Goods(1, 1100, false, "programLicense");
        Goods books = new Goods(2, 500, true, "books");

        Customers nornikel = new Customers(0, "OOONornikel", "Saratov", "89959697846", "vova");
        Orders nornikel01 = new Orders(0, nornikel, Orders.putGoodsList(), Orders.putAmountList(3, 4, 1), new Date());
        System.out.println(boots);
        System.out.println(nornikel01);
        System.out.println(nornikel);
        System.out.println();

        GoodsFactory factory = new GoodsFactory();

        Goods book = factory.getGoods(GoodTypes.BOOK);
        Goods boot = factory.getGoods(GoodTypes.BOOT);
        Goods music = factory.getGoods(GoodTypes.MUSICLICENSE);
        book.printGood();
        boot.printGood();
        music.printGood();
    }



}
