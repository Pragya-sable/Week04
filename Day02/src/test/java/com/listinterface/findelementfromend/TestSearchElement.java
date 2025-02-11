package com.listinterface.findelementfromend;

import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSearchElement {
    // Test case 1: Standard case where N is within the list bounds
    @Test
    void testfindNthFromEnd(){
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        String result = SearchElement.findNthFromEnd(list, 2);
        assertEquals("D", result, "The 2nd element from the end should be D.");
    }

    // Test case 2: N is 0, should return null (invalid case)
    @Test
    public void testFindNthFromEnd_zero() {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        String result = SearchElement.findNthFromEnd(list, 0);
        assertNull(result, "The result should be null when N is 0.");
    }


}
