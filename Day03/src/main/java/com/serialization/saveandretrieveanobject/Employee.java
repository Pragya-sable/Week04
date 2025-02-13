package com.serialization.saveandretrieveanobject;

import java.io.Serializable;
// Program that allows a user to store a list of employees in a file using
// Object Serialization and later retrieve the data from the file
public class Employee implements Serializable {

    // Field
    private String name;
    private String department;
    private int id;
    private int salary;

    // Constructor
    public Employee(int id,String name, String department,  int salary) {
        this.name = name;
        this.department = department;
        this.id = id;
        this.salary = salary;
    }

    // Getter and Setter Method
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}