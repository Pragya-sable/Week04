package com.pipedstream.interthreadcommunication;
import java.io.IOException;
import java.io.PipedInputStream;

class ReaderThread extends Thread {
    private PipedInputStream pipedInputStream;

    public ReaderThread(PipedInputStream pipedInputStream) {
        this.pipedInputStream = pipedInputStream;
    }

    @Override
    public void run() {
        try {
            int data;
            StringBuilder message = new StringBuilder();
            while ((data = pipedInputStream.read()) != -1) {
                if (data == '\n') {
                    System.out.println("Reader Thread: Read message - " + message.toString());
                    message.setLength(0); // Reset the StringBuilder for the next message
                } else {
                    message.append((char) data);
                }
                Thread.sleep(500); // Simulate time taken for reading
            }
            pipedInputStream.close();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
