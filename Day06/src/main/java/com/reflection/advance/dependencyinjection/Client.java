package com.reflection.advance.dependencyinjection;

public class Client {
    @Inject
    public Service service;

    public void run() {
        service.execute();
    }
}