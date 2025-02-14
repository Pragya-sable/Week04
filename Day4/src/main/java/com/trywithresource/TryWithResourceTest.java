package com.trywithresource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
// Program that reads the first line of a file  using BufferedReader
public class TryWithResourceTest {

    public static void readFile() {
        // Create instance of buffered reader for reading the content of the file
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("D:/Capgemini Training/input.txt"))){

            // Read first line
            String firstLine = bufferedReader.readLine();

            if(firstLine!= null){
                System.out.println("First Line : " + firstLine);
            }
            else {
                System.out.println("File is empty");
            }

        }catch(IOException e){
            System.out.println("Error reading file");
        }
    }
}
