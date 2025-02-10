package com.dynamiconlinemarketplace;
// Generic class Product<T> where T is restricted to a category (BookCategory, ClothingCategory, etc.)
public class Product <T> {

    private String name;
    private double price;
    private T category;

    // Constructor
    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public T getCategory() {
        return category;
    }

    // Setter method for price to apply discounts
    public void setPrice(double price) {
        this.price = price;
    }

    // Method to display product details
    public void displayProduct() {
        System.out.println("Product [Name: " + name + ", Price: " + price + ", Category: " + category.getClass().getSimpleName() + "]");
    }

}
