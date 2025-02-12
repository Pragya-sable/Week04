package com.implementashoppingcart;
public class Main {

    public static void main(String[] args) {
        // Create an instance of ShoppingCart
        ShoppingCart shoppingCart = new ShoppingCart();

        // Add products to the catalog with prices
        shoppingCart.addProductToCatalog("Laptop", 899.99);
        shoppingCart.addProductToCatalog("Smartphone", 599.99);
        shoppingCart.addProductToCatalog("Headphones", 199.99);
        shoppingCart.addProductToCatalog("Keyboard", 49.99);

        // Add products to the shopping cart
        shoppingCart.addProductToCart("Laptop");
        shoppingCart.addProductToCart("Smartphone");
        shoppingCart.addProductToCart("Headphones");

        // Display cart items in insertion order
        shoppingCart.displayCartInInsertionOrder();

        // Display cart items sorted by price
        shoppingCart.displayCartSortedByPrice();

        // Get and display the total price of the items in the cart
        double totalPrice = shoppingCart.getTotalPrice();
        System.out.println("Total Price: " + totalPrice);

        // Remove a product from the cart
        shoppingCart.removeProductFromCart("Headphones");

        // Display updated cart after removal
        System.out.println("Updated Cart:");
        shoppingCart.displayCartInInsertionOrder();
    }
}
