package com.smartwarehousemanagementsystem;

public class Furniture extends WarehouseItem {
    private String material;

    // Constructor
    public Furniture(String name, double price, String material) {
        super(name, price);
        this.material = material;
    }

    @Override
    public void display() {
        System.out.println("Furniture [Name: " + getName() + ", Price: " + getPrice() + ", Material: " + material+"]");
}
}