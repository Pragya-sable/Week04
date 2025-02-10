package com.smartwarehousemanagementsystem;

public class Electronics extends WarehouseItem{
    private String brand;

    // Constructor
    public Electronics(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    @Override
    public void display() {
        System.out.println("Electronics [Name: " + getName() + ", Price: " + getPrice() + ", Brand: " + brand+"]");
}
}