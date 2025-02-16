package com.reflection.advance.jsonrepresentation;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class JsonSerializerTest {

    @Test
    void testToJson() {
        Person person = new Person("Pragya", 22, false);
        String expectedJson = "{\"name\": \"Pragya\", \"age\": 22, \"isEmployed\": false}";

        assertEquals(expectedJson, JsonSerializer.toJson(person));
    }
}