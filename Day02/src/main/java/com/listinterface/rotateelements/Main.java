package com.listinterface.rotateelements;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Input
        ArrayList<Integer> input = new ArrayList<>();
        input.add(10);
        input.add(20);
        input.add(30);
        input.add(40);
        input.add(50);

        // Rotate the list
        Rotate.rotate(input, 2);
        System.out.println("Rotated list : " +input);
    }

}
