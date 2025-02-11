package com.setinterface.convertasettosortedlist;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
public class ConversionOfSetToListTest {
    @Test
    public void testConvertSetToList() {
        // Input Set
        Set<Integer> inputSet = new HashSet<>();
        inputSet.add(11);
        inputSet.add(2);
        inputSet.add(3);
        inputSet.add(0);

        // Convert set to sorted list
        List<Integer> resultList = ConversionOfSetToList.convertSetToList(inputSet);

        // Expected sorted list
        List<Integer> expectedList = Arrays.asList(0, 2, 3, 11);

        // Assert the result is equal to the expected sorted list
        assertEquals(expectedList, resultList);
    }

}
