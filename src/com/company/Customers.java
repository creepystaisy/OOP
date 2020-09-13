package com.company;

public class Customers {

    private int customerId;
    private String customerName;
    private String customerAdress;
    private String customerPhone;
    private String customerContactPerson;

    //Конструкторы

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

    public String getCustomerAdress() {
        return customerAdress;
    }


    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public String getCustomerContactPerson() {
        return customerContactPerson;
    }

    @Override
    public String toString()
    {
        return getCustomerId()+", "+getCustomerName()+", "+getCustomerAdress()+", "+getCustomerPhone()+", "+getCustomerContactPerson();
    }
}
