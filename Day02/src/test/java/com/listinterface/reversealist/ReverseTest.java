package com.listinterface.reversealist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.LinkedList;

public class ReverseTest {

    @Test
    void testReverseArrayList(){
        // Test for ArrayList
        ArrayList<String> input1 = new ArrayList<>();

        // Add into Arraylist
        input1.add("Pragya");
        input1.add("Muskan");
        input1.add("Riya");
        input1.add("Shubhi");

        // Add in expected arraylist
        ArrayList<String> expected = new ArrayList<>();
        expected.add("Shubhi");
        expected.add("Riya");
        expected.add("Muskan");
        expected.add("Pragya");

        // Test if the reverse arraylist is correct or not
        ArrayList<String > reverse = Reverse.reverseArrayList(input1);
        assertEquals(expected, reverse, "Reversal Failed");
    }

    @Test
    void testReverseLinkedList(){
        // Test for LinkedList
        LinkedList<Integer> input2 = new LinkedList<>();

        // Add into Linkedlist
        input2.add(1);
        input2.add(2);
        input2.add(3);
        input2.add(4);

        // Add in expected Linkedlist
        LinkedList<Integer> expected = new LinkedList<>();
        expected.add(4);
        expected.add(3);
        expected.add(2);
        expected.add(1);

        // Test if the reverse Linkedlist is correct or not
        LinkedList<Integer> reverse = Reverse.reverseLinkedList(input2);
        assertEquals(expected, reverse, "Reversal Failed");
    }


}
