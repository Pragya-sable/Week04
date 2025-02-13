
package com.filterstream.convertuppercasetolowercase;

import java.io.*;
// Program that reads a text file and writes its contents into another file,
// converting all uppercase letters to lowercase
public class ConvertToLowercase {
    public static void main(String[] args) {

        // Create object of BufferedReader and BufferedWriter
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("D:/Capgemini Training/input.txt"));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:/Capgemini Training/output.txt"))){

            String line;

            // Read the file line by line
            while((line = bufferedReader.readLine()) != null){

                // Convert the line to lowercase
                String lowerCase = line.toLowerCase();

                // Write the lowercase line to output file
                bufferedWriter.write(lowerCase);

                bufferedWriter.newLine();
            }
            System.out.println("File successfully converted into lowercase");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

