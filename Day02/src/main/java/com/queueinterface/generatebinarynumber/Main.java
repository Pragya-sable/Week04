package com.queueinterface.generatebinarynumber;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Generate first 5 binary numbers
        int N = 5;
        Queue<String> binaryNumbers = Binary.generateBinary(N);

        // Print the result
        System.out.println("First " + N + " Binary Numbers: " + binaryNumbers);
    }
}
