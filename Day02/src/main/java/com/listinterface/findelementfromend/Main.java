package com.listinterface.findelementfromend;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        // Create a LinkedList with sample data
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        int n = 2;

        // Find the Nth element from the end
        String result = SearchElement.findNthFromEnd(list, n);

        // Output the result
        System.out.println("The " + n + "th element from the end is: " + result);
    }
}

