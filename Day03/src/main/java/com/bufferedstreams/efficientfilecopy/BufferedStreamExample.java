
package com.bufferedstreams.efficientfilecopy;

import java.io.*;
// Program that copies a large file (e.g., 100MB) from one location to another using Buffered Streams (BufferedInputStream and BufferedOutputStream).
// Compare the performance with normal file streams
public class BufferedStreamExample {
    // Method to copy a file using unbuffered streams
    public static long copyFileUnbuffered() {
        // calculate startTime
        long startTime = System.nanoTime();
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
        // calculate endTime
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
    // Method to copy a file using buffered streams
    public static long copyFileBuffered(){
        // calculate startTime
        long startTime = System.nanoTime();
        // Create BufferedInputStream to read the source file
        // Create BufferedOutputStream to write to the destination file
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:/Capgemini Training/input.txt"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:/Capgemini Training/destination.txt"))) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            // Read from input file and write to the destination file
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            System.out.println("File copied successfully with buffering.");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // calculate endTime
        long endTime = System.nanoTime();
        return endTime - startTime;
    }


}

