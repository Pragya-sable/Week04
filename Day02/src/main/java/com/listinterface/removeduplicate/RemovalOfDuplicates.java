package com.listinterface.removeduplicate;
// Program to remove duplicate elements from a list while maintaining the original order of elements
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemovalOfDuplicates {

    // Generic method for counting the frequency of element in list
    public static <T> List<T> remove(List<T> input){
        // Create set for remove duplicate
        Set<T> set = new HashSet<>();
        // Create list for storing the result
        List<T> result = new ArrayList<>();
        for(T element : input ){
            if(!set.contains(element)){
                // first add in set
                set.add(element);
                // then add this element into the list
                result.add(element);
            }
        }
        return result;
    }
}
