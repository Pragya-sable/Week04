
package com.filehandling.readandwriteatextfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
// Program that reads the contents of a text file and writes it into a new file. If the source file does not exist, display an appropriate message
public class FileStreamExample {
    public static void main(String[] args) {
        // Create FileInputStream to read the source file
        // Create FileOutputStream to write to the destination file
        try(FileInputStream fis = new FileInputStream("D:/Capgemini Training/input.txt");
            FileOutputStream fos = new FileOutputStream("D:/Capgemini Training/output.txt")){
            int byteData;
            // Read from input file and write to the output file
            while((byteData = fis.read()) != -1){
                fos.write(byteData);
            }
            System.out.println("File copied successfully");
        }catch (FileNotFoundException e){
            e.printStackTrace();;
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

