package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.io.*;
import java.io.PrintWriter;

import static org.json.simple.JSONArray.toJSONString;


public class Orders {

    public int orderId;
    public Customers orderCustomer;
    public ArrayList <Positions> orderGood;
    public Date orderDate;
    public int orderCount = 0;
    //Конструкторы



    public Orders( Customers orderCustomer, Date orderDate, int amount1, int amount2, int amount3) throws IOException {
        this.orderId = orderCount;
        this.orderCustomer = orderCustomer;
        this.orderGood = putGoodsList(amount1, amount2, amount3);
        this.orderDate = orderDate;
        orderCount++;
    }
    //геттеры сеттеры
    public static ArrayList<Positions> putGoodsList(int ... amount)
    {
        ArrayList <Positions> myList = new ArrayList<Positions>();
        myList.add(new Positions(new Goods(0, 100, true, "boot"), amount[0]));
        myList.add(new Positions(new Goods(0, 100, true, "boot"), amount[1]));
        myList.add(new Positions(new Goods(0, 100, true, "boot"), amount[2]));
        return myList;
    }

    public void putIntoJson ()
    {
        try

        {
            PrintWriter writer = new PrintWriter("OrdersData.json", "UTF-8");
            GsonBuilder builder = new GsonBuilder();
            Gson gson = builder.create();
            String text = gson.toJson(this);
            writer.println(text);
            writer.close();
        }
        catch (FileNotFoundException | UnsupportedEncodingException exeption)
        {
            System.out.println("!!!");
        }
    }

    /*@Override
    public String toString() {
        return "{" +"\n"+
                "orderId: " + orderId +"," +"\n" +
                "orderCustomer: " + orderCustomer +","+"\n"+
                "orderGood: "+ orderGood +","+ "\n"+
                "Date: " + orderDate +","+ "\n"+"},"+"\n";
    }*/
}
