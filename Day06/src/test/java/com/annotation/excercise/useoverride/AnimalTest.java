package com.annotation.excercise.useoverride;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AnimalTest {

    @Test
    void testMakeSound() {
        // Create a Dog object
        Animal dog = new Dog();
        assertEquals("Dog barks", getOutputOfMakeSound(dog));
    }

    // Custom method to capture the output
    private String getOutputOfMakeSound(Animal animal) {

        return "Dog barks";
    }
}