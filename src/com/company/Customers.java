package com.company;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.management.ImmutableDescriptor;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.spi.ResourceBundleControlProvider;

public class Customers {

    public int customerId;
    public String customerName;
    public String customerAdress;
    public String customerPhone;
    public String customerContactPerson;

    //Конструкторы
    public Customers()
    {

    }

    public Customers(int customerId) {
        this.customerId = customerId;
    }

    public Customers(String customerName) {
        this.customerName = customerName;
    }

    public Customers(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
    }

    public Customers(int customerId, String customerName, String customerAdress) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAdress = customerAdress;
    }

    public Customers(int customerId, String customerName, String customerAdress, String customerPhone) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAdress = customerAdress;
        this.customerPhone = customerPhone;
    }

    public Customers(int customerId, String customerName, String customerAdress, String customerPhone, String customerContactPerson) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAdress = customerAdress;
        this.customerPhone = customerPhone;
        this.customerContactPerson = customerContactPerson;
    }

    //геттеры сеттеры

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerAdress() {
        return customerAdress;
    }

    public void setCustomerAdress(String customerAdress) {
        this.customerAdress = customerAdress;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerContactPerson() {
        return customerContactPerson;
    }

    public void setCustomerContactPerson(String customerContactPerson) {
        this.customerContactPerson = customerContactPerson;
    }
    @Override
    public String toString()
    {
        return getCustomerId()+", "+getCustomerName()+", "+getCustomerAdress()+", "+getCustomerPhone()+", "+getCustomerContactPerson();
    }

    public static ArrayList<Customers> readCustomersFromJsonFile(String file) throws IOException, ParseException {

        ArrayList<Customers> v = new ArrayList<Customers>();
        JSONArray a = (JSONArray) new JSONParser().parse(new FileReader("src/com/company/"+file));

        for (Object o : a)
        {
            JSONObject company = (JSONObject) o;

            int id = ((Number) company.get("customerId")).intValue();
//System.out.println(id);

            String name = (String) company.get("customerName");
//System.out.println(name);

            String adress = (String) company.get("customerAdress");
//System.out.println(adress);

            String tel = (String) company.get("customerPhone");
//System.out.println(tel);

            String person = (String) company.get("customerContactPerson");
            //System.out.println(person);
            v.add(new Customers(id, name, adress, tel, person));


        }
        return v;
    }


}
