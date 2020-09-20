package com.company;

import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {
        Goods boots = new Goods(0,11,true,"boots");
        Goods programLicense = new Goods(1,1100,false,"programLicense");
        Goods books = new Goods(2,500,true,"books");

        Customers nornikel = new Customers(0,"OOONornikel","Saratov","89959697846","vova");
        Orders nornikel01 = new Orders( nornikel, new Date(), 3, 4, 5);
        System.out.println(boots);
        System.out.println(nornikel);
        System.out.println();
        System.out.println(nornikel01 );

        ArrayList<Customers> n = Customers.readCustomersFromJsonFile("CustomerData.json");
        for(Customers o: n)
        {
            System.out.println(o);
        }

        ArrayList<Goods> m = Goods.readGoodsFromJsonFile("GoodData.json");
        for(Goods p: m)
        {
            System.out.println(p);
        }

    }


}
