package com.annotation.practiceproblems.beginner.importantmethod;

public class TaskService {

    @ImportantMethod(level = "HIGH")
    public void processCriticalTask() {
        System.out.println("Processing critical task...");
    }

    @ImportantMethod(level = "MEDIUM")
    public void processRegularTask() {
        System.out.println("Processing regular task...");
    }

    public void helperMethod() {
        System.out.println("Helper method, not marked as important.");
    }
}
