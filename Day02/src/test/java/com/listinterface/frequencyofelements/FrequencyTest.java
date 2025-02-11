package com.listinterface.frequencyofelements;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FrequencyTest {

    @Test
    void testFrequency(){
        // Test for ArrayList
        List<String> input1 = new ArrayList<>();

        // Add into Arraylist
        input1.add("Pragya");
        input1.add("Muskan");
        input1.add("Pragya");
        input1.add("Shubhi");


        Map<String,Integer> result = Frequency.countFrequency(input1);
        // Expected frequency
        Map<String, Integer> expected = Map.of("Pragya",2,"Muskan",1,"Shubhi", 1);
        // Check the result is right or not;
        assertEquals(expected, result," Failed");

    }
}
