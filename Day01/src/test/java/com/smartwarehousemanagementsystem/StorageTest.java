package com.smartwarehousemanagementsystem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class StorageTest {

        // Storage object for different types of items
        private Storage<Electronics> electronicsStorage;
        private Storage<Groceries> groceriesStorage;
        private Storage<Furniture> furnitureStorage;


        // This method is run before each test case to set up the test environment
        @BeforeEach
        void setUp() {
            electronicsStorage = new Storage<>();
            groceriesStorage = new Storage<>();
            furnitureStorage = new Storage<>();
        }

        // Test case to check adding and retrieving Electronics items
        @Test
        void testAddAndRetrieveElectronics() {
            // Creating a new Electronics item and adding it to the electronicsStorage
            Electronics laptop = new Electronics("Laptop",1000,"Dell");
            electronicsStorage.addItem(laptop);
            // Retrieving the items from the storage and verifying if the size is 1
            List<Electronics> items = electronicsStorage.getItems();
            // Verify that one item is in the storage
            assertEquals(1, items.size());
            // Verifying the name of the first item in the storage
            assertEquals("Laptop", items.get(0).getName());
        }

        // Test case to check adding and retrieving Groceries items
        @Test
        void testAddAndRetrieveGroceries() {
            Groceries apple = new Groceries("Apple",500, "Fruit");
            groceriesStorage.addItem(apple);

            List<Groceries> items = groceriesStorage.getItems();
            assertEquals(1, items.size());
            assertEquals("Apple", items.get(0).getName());
        }
        // Test case to check adding and retrieving Furniture items
        @Test
        void testAddAndRetrieveFurniture() {
            Furniture chair = new Furniture("Chair",250,"Wood");
            furnitureStorage.addItem(chair);

            List<Furniture> items = furnitureStorage.getItems();
            assertEquals(1, items.size());
            assertEquals("Chair", items.get(0).getName());
        }
        // Test case to check displaying items from the storage using wildcard
        @Test
        void testDisplayItems() {
            electronicsStorage.addItem(new Electronics("Smartphone",1000,"MI"));
            electronicsStorage.addItem(new Electronics("Tablet",1000,"Samsung"));

            List<? extends WarehouseItem> items = electronicsStorage.getItems();
            assertEquals(2, items.size());
            assertTrue(items.stream().anyMatch(item -> item.getName().equals("Smartphone")));
            assertTrue(items.stream().anyMatch(item -> item.getName().equals("Tablet")));
        }
}

