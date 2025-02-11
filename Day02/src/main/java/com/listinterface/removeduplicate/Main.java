package com.listinterface.removeduplicate;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // input list
        List<Integer> inputList = new ArrayList<>();
        inputList.add(3);
        inputList.add(1);
        inputList.add(2);
        inputList.add(2);
        inputList.add(3);
        inputList.add(4);

        // Remove duplicates from the list
        List<Integer> result = RemovalOfDuplicates.remove(inputList);

        // Output the list without duplicates
        System.out.println("List without duplicates: " + result);
    }
}

