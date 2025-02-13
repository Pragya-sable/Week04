package com.bufferedstreams.efficientfilecopy;

public class Main {
    public static void main(String[] args) {
        // Measure Time for buffered file
        long durationOfBufferedFile = BufferedStreamExample.copyFileBuffered();
        System.out.println(" Duration of buffered file : " +durationOfBufferedFile+ " ns");

        // Measure Time for unbuffered file
        long durationOfUnBufferedFile = BufferedStreamExample.copyFileUnbuffered();
        System.out.println(" Duration of buffered file : " +durationOfUnBufferedFile+ " ns");

        // Compare
        if(durationOfBufferedFile < durationOfUnBufferedFile ) {
            System.out.println("Buffered file copy is fast");
        }
        else {
            System.out.println("Unbuffered file copy is fast");
        }
    }

}
