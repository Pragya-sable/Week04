package com.listinterface.reversealist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;


//  Program to reverse the elements of a given List without using built-in reverse methods.
//  Implement it for both ArrayList and LinkedList
public class Reverse {

    // Generic Method for reverse arraylist
    public static <T> ArrayList<T> reverseArrayList(ArrayList<T> list){
        // Iterate the Array list
        int left = 0, right = list.size() - 1;
        while (left < right) {
            // Swap elements
            T temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }

        return list;
    }


    // Generic Method for reverse arraylist
    public static <T> LinkedList<T> reverseLinkedList(LinkedList<T> list){
        ListIterator<T> leftItr = list.listIterator();
        ListIterator<T> rightItr = list.listIterator(list.size());

        int mid = list.size() / 2;
        while (mid-- > 0) {
            T leftValue = leftItr.next();
            T rightValue = rightItr.previous();

            // Swap elements
            leftItr.set(rightValue);
            rightItr.set(leftValue);
        }

        return list;
    }
}
