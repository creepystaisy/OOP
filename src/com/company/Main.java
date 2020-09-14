package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Goods boots = new Goods(0,11,true,"boots");
        Goods programLicense = new Goods(1,1100,false,"programLicense");
        Goods books = new Goods(2,500,true,"books");

        Customers nornikel = new Customers(0,"OOONornikel","Saratov","89959697846","vova");
        Orders nornikel01 = new Orders( nornikel, new Date(), 3, 4, 5);
        System.out.println(boots);
        System.out.println(nornikel);
        System.out.println();
        System.out.println(nornikel01 );
    }



}
