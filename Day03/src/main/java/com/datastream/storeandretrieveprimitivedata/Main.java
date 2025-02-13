package com.datastream.storeandretrieveprimitivedata;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        // Store details in binary file
        try(DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("D:/Capgemini Training/Source.txt"))) {
            Student student1 = new Student(101,"Pragya", 9.17);
            Student student2 = new Student(102, "Riya",9.5);

            // Write student data to the file
            student1.writeStudentData(dataOutputStream);
            student2.writeStudentData(dataOutputStream);

            System.out.println("Details written in the files");
        }catch(IOException e){
            e.printStackTrace();
        }

        // Read details from binary file
        try(DataInputStream dataInputStream = new DataInputStream(new FileInputStream("D:/Capgemini Training/Source.txt"))){
            // Reading two students from the file
            Student student1 = Student.readStudentData(dataInputStream);
            Student student2 = Student.readStudentData(dataInputStream);

            // Print retrieved student details
            System.out.println("Retrieved Student 1: " + student1.getRollNumber() + ", " + student1.getName() + ", " + student1.getGPA());
            System.out.println("Retrieved Student 2: " + student2.getRollNumber() + ", " + student2.getName() + ", " + student2.getGPA());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}