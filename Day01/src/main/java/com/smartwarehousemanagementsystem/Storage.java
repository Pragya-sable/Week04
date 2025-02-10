package com.smartwarehousemanagementsystem;
// Implement a generic class Storage<T extends WarehouseItem>
// to store items safely
// Implement a wildcard method to display all items in
// storage regardless of their type (List<? extends WarehouseItem>)

import java.util.List;
import java.util.ArrayList;

public class Storage <T extends WarehouseItem>{
    private List<T> items;

    // Constructor
    public Storage(){
        // This ensures type safety
        items = new ArrayList<T>();
    }

    // Method to add the items to storage
    public void addItem(T item){
        items.add(item);
    }

    // Method to retrieve the item from storage
    public List<T> getItems(){
        return items;
    }

    // Using wildcard we can display all the item
    public void displayAllItem(List<? extends WarehouseItem> itemList){
        for(WarehouseItem item : itemList){
            item.display();
 }
}
}