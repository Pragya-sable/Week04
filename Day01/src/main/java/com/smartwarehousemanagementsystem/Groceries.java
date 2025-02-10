package com.smartwarehousemanagementsystem;

public class Groceries extends WarehouseItem{
    private String category;

    // Constructor
    public Groceries(String name, double price, String category) {
        super(name, price);
        this.category = category;
    }

    @Override
    public void display() {
        System.out.println("Groceries [Name: " + getName() + ", Price: " + getPrice() + ", Category: " + category+"]");}
}
