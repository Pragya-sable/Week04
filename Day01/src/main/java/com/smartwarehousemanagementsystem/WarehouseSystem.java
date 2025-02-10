package com.smartwarehousemanagementsystem;
public class WarehouseSystem {

    public static void main(String[] args) {
        // Create Storage for Electronics, Groceries, and Furniture
        Storage<Electronics> electronicsStorage = new Storage<Electronics>();
        Storage<Groceries> groceriesStorage = new Storage<Groceries>();
        Storage<Furniture> furnitureStorage = new Storage<Furniture>();

        // Adding items to each storage
        electronicsStorage.addItem(new Electronics("Laptop", 1000, "Dell"));
        groceriesStorage.addItem(new Groceries("Apple", 2.5, "Fruits"));
        furnitureStorage.addItem(new Furniture("Chair", 50, "Wood"));

        // Displaying all items in the storage
        System.out.println("Electronics Storage:");
        electronicsStorage.displayAllItem(electronicsStorage.getItems());

        System.out.println("Groceries Storage:");
        groceriesStorage.displayAllItem(groceriesStorage.getItems());

        System.out.println("Furniture Storage:");
        furnitureStorage.displayAllItem(furnitureStorage.getItems());
}
}