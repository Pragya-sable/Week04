package com.checkedexception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
// Program that reads a file
// If the file does not exist,
// handle the IOException properly and display a user-friendly message
public class CheckedExceptionExample {


    public static void readFile() {
        // Create instance of buffered reader for reading the content of the file
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("D:/Capgemini Training/input.txt"))){
            String line;
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        }catch(IOException e){
            System.out.println("File not found");
        }
    }
}
