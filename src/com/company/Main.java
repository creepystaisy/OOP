package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.simple.parser.ParseException;


import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import java.io.PrintWriter;
import java.util.Date;




public class Main {

    public static void main(String[] args) throws IOException, ParseException {
        Goods boots = new Goods(0, 11, true, "boots");
        Goods programLicense = new Goods(1, 1100, false, "programLicense");
        Goods books = new Goods(2, 500, true, "books");

        Customers nornikel = new Customers(0, "OOONornikel", "Saratov", "89959697846", "vova");
        Orders nornikel01 = new Orders(nornikel, new Date(), 3, 4, 5);
         nornikel01.putIntoJson();



    }


}
