package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Goods boots = new Goods(0,11,true,"boots");
        Goods programLicense = new Goods(1,1100,false,"programLicense");
        Goods books = new Goods(2,500,true,"books");

        Customers nornikel = new Customers(0,"OOONornikel","Saratov","89959697846","vova");
        Orders nornikel01 = new Orders( 0, nornikel, putGoodsList(books, boots, programLicense), putAmountList(3, 4, 1), new Date());
        System.out.println(boots);
        System.out.println(nornikel01 );
        System.out.println(nornikel);
    }
    public static ArrayList<Goods> putGoodsList(Goods... orders)
    {
        ArrayList <Goods> myList = new ArrayList<Goods>();

        for(int i = 0; i < orders.length; i++) {
            myList.add(orders[i]);
        }
        return myList;
    }
    public static ArrayList <Integer> putAmountList(Integer... orders)
    {
        ArrayList <Integer> myList = new ArrayList<Integer>();

        for(int i = 0; i < orders.length; i++) {
            myList.add(orders[i]);
        }
        return myList;
    }


}
