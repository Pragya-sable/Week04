package com.annotation.practiceproblems.intermediate.logexecutiontime;

public class Service implements IService {

    @LogExecutionTime
    @Override
    public void processData() {
        try {
            Thread.sleep(500); // Simulating time-consuming task
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Processed data");
    }

    @LogExecutionTime
    @Override
    public void fetchData() {
        try {
            Thread.sleep(300); // Simulating another task
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Fetched data");
    }

    @Override
    public void helperMethod() {
        System.out.println("This method is not logged.");
    }
}
