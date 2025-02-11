package com.listinterface.removeduplicate;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDuplicates {
    @Test
    void testRemove(){
        // Test
        List<Integer> input = new ArrayList<>();

        // Add into ist
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(2);

        // Add in expected list
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);


        // Test if the removal of element into  list is correct or not
        List<Integer> result = RemovalOfDuplicates.remove(input);
        assertEquals(expected, result, " Failed");
    }
}

