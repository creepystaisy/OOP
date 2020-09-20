package com.company;

import java.util.ArrayList;
import java.util.Date;
import com.google.gson.*;
public class Main {

    public static void main(String[] args) {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        Goods boots = new Goods(0,11,true,"boots");
        Goods programLicense = new Goods(1,1100,false,"programLicense");
        Goods books = new Goods(2,500,true,"books");
        String jsonText ="{ \"goodId\": 0, \"goodPrice\": 111.9 , \"goodDelivery\": true, \"goodDescription\": \"boot\"}";
        Goods b = gson.fromJson(jsonText, Goods.class);
        Customers nornikel = new Customers(0,"OOONornikel","Saratov","89959697846","vova");
        Orders nornikel01 = new Orders( nornikel, new Date(), 3, 4, 5);
        System.out.println(b);
        System.out.println(nornikel);
        System.out.println();
        System.out.println(nornikel01 );

    }



}
