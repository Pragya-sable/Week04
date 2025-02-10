package com.dynamiconlinemarketplace;
// Main Class
public class Main {
    public static void main(String[] args) {
        // Creating product categories
        Books bookCategory = new Books();
        Clothing clothingCategory = new Clothing();
        Gadget gadgetCategory = new Gadget();

        // Create products of different categories
        Product<Books> book = new Product<>("The Alchemist", 20.0, bookCategory);
        Product<Clothing> shirt = new Product<>("T-Shirt", 15.0, clothingCategory);
        Product<Gadget> phone = new Product<>("Smartphone", 500.0, gadgetCategory);


        Marketplace catalog = new Marketplace();
        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);
        System.out.println("Product Catalog:");
        for (Product<? extends ProductCategory> p : catalog.getProducts()) {
            System.out.println(p);
        }
        // Apply discounts
        System.out.println("Applying Discounts:");
        Marketplace.applyDiscount(book, 10);
        Marketplace.applyDiscount(shirt, 20);
        Marketplace.applyDiscount(phone, 5);
    }
}
