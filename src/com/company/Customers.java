package com.company;

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
}
