package com.dynamiconlinemarketplace;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class MarketplaceTest {
    // objects for Marketplace and product categories
    private Marketplace catalog;
    private Books bookCategory;
    private Clothing clothingCategory;
    private Gadget gadgetCategory;

    // This method is executed before each test to initialize the test data
    @BeforeEach
    void setUp() {
        // Initializing the Marketplace catalog and product categories
        catalog = new Marketplace();
        bookCategory = new Books();
        clothingCategory = new Clothing();
        gadgetCategory = new Gadget();
    }
    // Test case to verify adding and retrieving products from the marketplace
    @Test
    void testAddAndRetrieveProducts() {
        // Creating new product instances with their respective categories
        Product<Books> book = new Product<>("Java Programming", 500, bookCategory);
        Product<Clothing> tshirt = new Product<>("Cotton T-shirt", 300, clothingCategory);
        Product<Gadget> phone = new Product<>("Smartphone", 20000, gadgetCategory);

        // Adding the products to the catalog
        catalog.addProduct(book);
        catalog.addProduct(tshirt);
        catalog.addProduct(phone);

        // Retrieving the products from the catalog and verifying the size
        List<Product<? extends ProductCategory>> products = catalog.getProducts();
        assertEquals(3, products.size());

        // Verifying the details of the first product (Java Programming Book)
        assertEquals("Java Programming", products.get(0).getName());
        assertEquals(500, products.get(0).getPrice());
        assertEquals("Books", products.get(0).getCategory().getCategoryName());

        // Verifying the details of the second product (Cotton T-shirt)
        assertEquals("Cotton T-shirt", products.get(1).getName());
        assertEquals(300, products.get(1).getPrice());
        assertEquals("Clothing", products.get(1).getCategory().getCategoryName());

        // Verifying the details of the third product (Smartphone)
        assertEquals("Smartphone", products.get(2).getName());
        assertEquals(20000, products.get(2).getPrice());
        assertEquals("Gadget", products.get(2).getCategory().getCategoryName());
    }

    // Test case to verify applying discounts to products
    @Test
    void testApplyDiscount() {
        // Creating new product instances with their respective categories
        Product<Books> book = new Product<>("Java Programming", 500, bookCategory);
        Product<Clothing> tshirt = new Product<>("Cotton T-shirt", 300, clothingCategory);

        // Adding the products to the catalog
        catalog.addProduct(book);
        catalog.addProduct(tshirt);

        // Applying discounts to the products
        catalog.applyDiscount(book, 10); // 10% discount
        catalog.applyDiscount(tshirt, 20); // 20% discount

        // Verifying that the prices were correctly updated after the discount
        assertEquals(450, book.getPrice());
        assertEquals(240, tshirt.getPrice());
    }


}
