package com.annotation.excercise.suppressuncheckedwarning;

import java.util.ArrayList;

public class SuppressExample {

    @SuppressWarnings("unchecked")
    public void createRawArrayList() {
        // Create an ArrayList without generics
        ArrayList list = new ArrayList();

        // Add some elements to the list
        list.add("Hello");
        list.add(123);
        list.add(45.67);

        // Cast to a specific type and print the list
        for (Object item : list) {
            System.out.println(item);
        }
    }
}
