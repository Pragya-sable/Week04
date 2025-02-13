package com.pipedstream.interthreadcommunication;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Main {
    public static void main(String[] args) {
        // Create PipedOutputStream and PipedInputStream objects
        PipedOutputStream pipedOutputStream = new PipedOutputStream();
        PipedInputStream pipedInputStream = new PipedInputStream();

        try {
            // Connect the piped output stream to the piped input stream
            pipedInputStream.connect(pipedOutputStream);

            // Create writer and reader threads
            Thread writerThread = new WriterThread(pipedOutputStream);
            Thread readerThread = new ReaderThread(pipedInputStream);

            // Start the threads
            writerThread.start();
            readerThread.start();

            // Wait for both threads to finish
            writerThread.join();
            readerThread.join();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}



