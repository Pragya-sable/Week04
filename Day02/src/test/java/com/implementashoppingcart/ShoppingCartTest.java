package com.implementashoppingcart;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ShoppingCartTest {

    private ShoppingCart shoppingCart;

    @BeforeEach
    public void setUp() {
        shoppingCart = new ShoppingCart();
        shoppingCart.addProductToCatalog("Laptop", 899.99);
        shoppingCart.addProductToCatalog("Smartphone", 599.99);
        shoppingCart.addProductToCatalog("Headphones", 199.99);
        shoppingCart.addProductToCatalog("Keyboard", 49.99);
    }

    @Test
    public void testAddProductToCart() {
        shoppingCart.addProductToCart("Laptop");
        shoppingCart.addProductToCart("Smartphone");

        assertEquals(2, shoppingCart.cartItems.size(), "Cart should have 2 items.");
    }

    @Test
    public void testRemoveProductFromCart() {
        shoppingCart.addProductToCart("Laptop");
        shoppingCart.addProductToCart("Smartphone");

        shoppingCart.removeProductFromCart("Laptop");

        assertEquals(1, shoppingCart.cartItems.size(), "Cart should have 1 item after removal.");
    }

    @Test
    public void testDisplayCartInInsertionOrder() {
        shoppingCart.addProductToCart("Laptop");
        shoppingCart.addProductToCart("Smartphone");

        shoppingCart.displayCartInInsertionOrder();
    }

    @Test
    public void testDisplayCartSortedByPrice() {
        shoppingCart.addProductToCart("Laptop");
        shoppingCart.addProductToCart("Smartphone");
        shoppingCart.addProductToCart("Headphones");

        shoppingCart.displayCartSortedByPrice();
    }

    @Test
    public void testTotalPrice() {
        shoppingCart.addProductToCart("Laptop");
        shoppingCart.addProductToCart("Smartphone");

        assertEquals(1499.98, shoppingCart.getTotalPrice(), "Total price should be 1499.98.");
    }
}
