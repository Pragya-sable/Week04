
package com.readalargefile.linebyline;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
// Program that efficiently reads a large text file (500MB+)
// line by line and prints only lines containing the word "error"
public class LargeFileReader {

    public static void main(String[] args) {

        // Use try-with-resources to ensure BufferedReader is closed after use
        try (BufferedReader br = new BufferedReader(new FileReader("C:/Users/ASUS/Downloads/Unit 4 - Data Structure - www.rgpvnotes.in.pdf"))) {
            String line;

            // Read the file line by line
            while ((line = br.readLine()) != null) {
                // Convert the line to lowercase and check if it contains "error"
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

