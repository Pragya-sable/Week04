package com.setinterface.convertasettosortedlist;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
public class Main {
    public static void main(String[] args) {
            // Input sets
            Set<Integer> set = new HashSet<>();
            // Add in set1
            set.add(11);
            set.add(2);
            set.add(3);
            set.add(0);

        // Convert to sorted list
        List<Integer> sortedList = ConversionOfSetToList.convertSetToList(set);
        System.out.println("Sorted List: " + sortedList);
        }
}
