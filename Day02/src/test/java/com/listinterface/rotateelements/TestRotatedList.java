package com.listinterface.rotateelements;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRotatedList {

    @Test
    void testRotate(){
        // Test
        ArrayList<Integer> input = new ArrayList<>();

        // Add into list
        input.add(10);
        input.add(20);
        input.add(30);
        input.add(40);
        input.add(50);

        // Add in expected list
        List<Integer> expected = new ArrayList<>();
        expected.add(30);
        expected.add(40);
        expected.add(50);
        expected.add(10);
        expected.add(20);

        // Test if the rotated list is correct or not
        Rotate.rotate(input,2);
        assertEquals(expected, input, "Rotate Failed");
    }
}

