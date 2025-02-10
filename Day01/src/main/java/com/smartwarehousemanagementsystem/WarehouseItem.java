package com.smartwarehousemanagementsystem;
// Create an abstract class WarehouseItem that all items extend (Electronics, Groceries, Furniture).
public abstract class WarehouseItem {
    private String name;
    private double price;

    // Constructor
    public WarehouseItem(String name, double price){
        this.name = name;
        this.price = price;
    }

    // Getter Methods
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    // Setter Methods
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Abstract method to display the details of the item
    public abstract void display();
}