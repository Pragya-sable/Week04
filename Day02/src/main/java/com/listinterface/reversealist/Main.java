package com.listinterface.reversealist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        // Test for ArrayList
        ArrayList<String> input1 = new ArrayList<>();

        // Add into Arraylist
        input1.add("Pragya");
        input1.add("Muskan");
        input1.add("Riya");
        input1.add("Shubhi");

        // Display the ArrayList before and after
        System.out.println("Before reverse : " + input1);
        System.out.println("After reverse : " + Reverse.reverseArrayList(input1));

        // Test for LinkedList
        LinkedList<Integer> input2 = new LinkedList<>();

        // Add into Linkedlist
        input2.add(1);
        input2.add(2);
        input2.add(3);
        input2.add(4);
        // Display the LinkedList before and after
        System.out.println("Before reverse : " + input2);
        System.out.println("After reverse : " + Reverse.reverseLinkedList(input2));
    }
}
