package com.listinterface.rotateelements;
// Program to rotate the elements of a list by a given number of positions
import java.util.ArrayList;
public class Rotate {

    // Generic method for reverse elements between indices start and end
    public static <T> void reverse(ArrayList<T> list,int start,int end) {
        // Swap
        while(start<end){
           T temp = list.get(start);
           list.set(start, list.get(end));
            list.set(end,temp);
            start++;
            end--;
        }
    }

    // Generic method to rotate the list by d position
    public static <T> void rotate(ArrayList <T> list,int d) {
        int n = list.size();
        d=d%n;
        // Reverse first part
        reverse(list, 0, d-1);
        // Reverse second part
        reverse(list, d, n-1);
        // Reverse whole part
        reverse(list, 0, n-1);
    }

}
