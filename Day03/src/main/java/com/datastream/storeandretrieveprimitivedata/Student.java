package com.datastream.storeandretrieveprimitivedata;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
// Program that reads a text file and writes its contents into another file,
// converting all uppercase letters to lowercase
public class Student {

    // Field
    private int rollNumber;
    private String name;
    private double GPA;

    // Constructor
    public Student(int rollNumber,String name, double GPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.GPA = GPA;
    }

    // Getter and Setter Method
    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Method to write data into a file
    public void writeStudentData(DataOutputStream dataOutputStream)throws IOException{
        // Write the rollNumber into the file
        dataOutputStream.writeInt(rollNumber);
        // Write the name into the file
        dataOutputStream.writeUTF(name);
        // Write the GPA into the file
        dataOutputStream.writeDouble(GPA);
    }

    // Method to read data from file
    public static Student readStudentData(DataInputStream dataInputStream)throws IOException{
        // Read roll number
        int rollNumber = dataInputStream.readInt();
        // Read name
        String name = dataInputStream.readUTF();
        // Read GPA
        double GPA = dataInputStream.readDouble();

        return new Student(rollNumber, name, GPA);
    }


}