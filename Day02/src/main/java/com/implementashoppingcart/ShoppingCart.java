package com.implementashoppingcart;
import java.util.*;

public class ShoppingCart {

    // HashMap to store product prices
     Map<String, Double> productPrices;

    // LinkedHashMap to maintain the order of items added
     Map<String, Double> cartItems;

    // Constructor to initialize the cart
    public ShoppingCart() {
        productPrices = new HashMap<>();
        cartItems = new LinkedHashMap<>();
    }

    // Add a product and its price to the catalog
    public void addProductToCatalog(String productName, double price) {
        productPrices.put(productName, price);
    }

    // Add product to the shopping cart
    public void addProductToCart(String productName) {
        if (productPrices.containsKey(productName)) {
            cartItems.put(productName, productPrices.get(productName));
        } else {
            System.out.println("Product not available in catalog.");
        }
    }

    // Remove product from the shopping cart
    public void removeProductFromCart(String productName) {
        if (cartItems.containsKey(productName)) {
            cartItems.remove(productName);
        } else {
            System.out.println("Product not found in the cart.");
        }
    }

    // Display items in the cart in insertion order
    public void displayCartInInsertionOrder() {
        System.out.println("Shopping Cart (Insertion Order):");
        cartItems.forEach((productName, price) -> System.out.println(productName + ": " + price));
    }

    // Display items sorted by price using TreeMap
    public void displayCartSortedByPrice() {
        // TreeMap to sort items by price
        TreeMap<String, Double> sortedItems = new TreeMap<>((p1, p2) -> cartItems.get(p1).compareTo(cartItems.get(p2)));
        sortedItems.putAll(cartItems);

        System.out.println("Shopping Cart (Sorted by Price):");
        sortedItems.forEach((productName, price) -> System.out.println(productName + ": " + price));
    }

    // Get the total price of the items in the cart
    public double getTotalPrice() {
        return cartItems.values().stream().mapToDouble(Double::doubleValue).sum();
    }
}
