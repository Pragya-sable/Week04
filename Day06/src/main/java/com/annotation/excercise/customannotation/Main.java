package com.annotation.excercise.customannotation;


import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        try {
            Method method = TaskManager.class.getMethod("completeTask");

            if (method.isAnnotationPresent(TaskInformation.class)) {
                TaskInformation taskInfo = method.getAnnotation(TaskInformation.class);
                System.out.println("Task Priority: " + taskInfo.priority());
                System.out.println("Assigned To: " + taskInfo.assignedTo());
            }

            // Call the annotated method
            new TaskManager().completeTask();

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
