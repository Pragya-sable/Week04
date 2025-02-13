package com.pipedstream.interthreadcommunication;

import java.io.*;
// Program where one thread writes data into a PipedOutputStream
// and another thread reads data from a PipedInputStream
class WriterThread extends Thread {
    private PipedOutputStream pipedOutputStream;

    public WriterThread(PipedOutputStream pipedOutputStream) {
        this.pipedOutputStream = pipedOutputStream;
    }

    @Override
    public void run() {
        try {
            String[] messages = {"Hello", "from", "the", "writer", "thread!"};
            for (String message : messages) {
                pipedOutputStream.write(message.getBytes());
                pipedOutputStream.write('\n'); // To separate messages by newlines
                System.out.println("Writer Thread: Writing message - " + message);
                Thread.sleep(500); // Simulate time taken for writing
            }
            pipedOutputStream.close();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}