package com.reflection.intermediate.mathoperationreflection;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


import java.lang.reflect.Method;

class MathOperationReflection {

    @Test
    void testDynamicMethodInvocation() {
        try {

            MathOperation mathInstance = new MathOperation();
            Class<?> mathClass = MathOperation.class;

            Method addMethod = mathClass.getMethod("add", int.class, int.class);
            int addResult = (int) addMethod.invoke(mathInstance, 5, 3);
            assertEquals(8, addResult, "5 + 3 should be 8");

            Method subtractMethod = mathClass.getMethod("subtract", int.class, int.class);
            int subtractResult = (int) subtractMethod.invoke(mathInstance, 10, 4);
            assertEquals(6, subtractResult, "10 - 4 should be 6");

            Method multiplyMethod = mathClass.getMethod("multiply", int.class, int.class);
            int multiplyResult = (int) multiplyMethod.invoke(mathInstance, 6, 7);
            assertEquals(42, multiplyResult, "6 * 7 should be 42");

        } catch (Exception e) {
            fail("Exception occurred: " + e.getMessage());
        }
    }
}