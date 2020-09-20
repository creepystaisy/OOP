package com.company;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Goods {

    public int goodId;
    public double goodPrice;
    public boolean goodDelivery;
    public String goodDescription;


    //Конструкторы


    public Goods(int goodId, double goodPrice, boolean goodDelivery, String goodDescription) {
        this.goodId = goodId;
        this.goodPrice = goodPrice;
        this.goodDelivery = goodDelivery;
        this.goodDescription = goodDescription;
    }
    //геттеры сеттеры

    public int getGoodId() {
        return goodId;
    }


    public double getGoodPrice() {
        return goodPrice;
    }


    public String getGoodDescription() {
        return goodDescription;
    }

    @Override
    public String toString()
    {
        return getGoodId()+", "+getGoodPrice()+", "+getGoodDescription();
    }



    public static ArrayList<Goods> readGoodsFromJsonFile(String file) throws IOException, ParseException {

        ArrayList<Goods> v = new ArrayList<Goods>();
        JSONArray a = (JSONArray) new JSONParser().parse(new FileReader("src/com/company/"+file));

        for (Object o : a)
        {
            JSONObject company = (JSONObject) o;

            int gid = ((Number) company.get("goodId")).intValue();


            double price = ((Number) company.get("goodPrice")).doubleValue();

            boolean delivery =(Boolean)company.get("goodDelivery");


            String description = (String) company.get("goodDescription");

            v.add(new Goods(gid, price, delivery, description));

        }
        return v;
    }



}

