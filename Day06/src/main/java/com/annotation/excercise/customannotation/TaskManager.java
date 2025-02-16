package com.annotation.excercise.customannotation;

public class TaskManager {
    @TaskInformation(priority = "High", assignedTo = "John Doe")
    public void completeTask() {
        System.out.println("Task completed!");
    }
}
