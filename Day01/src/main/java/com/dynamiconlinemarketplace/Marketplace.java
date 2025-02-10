package com.dynamiconlinemarketplace;

import java.util.ArrayList;
import java.util.List;
// Marketplace class used for applying discount
public class Marketplace {
    private List<Product<? extends  ProductCategory>> products = new ArrayList<>();


    public void addProduct(Product<? extends ProductCategory> product) {
        products.add(product);
    }

    public List<Product<? extends ProductCategory>> getProducts() {
        return products;
    }

    // Generic method to apply a discount to a product
    public static <T extends Product <?>> void applyDiscount(T product, double percentage){
        double currentPrice = product.getPrice();
        // calculate discount
        double discountAmount = currentPrice * (percentage / 100);
        double newPrice = currentPrice - discountAmount;
        // set new price
        product.setPrice(newPrice);
        System.out.println("After Discount New Price : "+ newPrice);
    }
}
