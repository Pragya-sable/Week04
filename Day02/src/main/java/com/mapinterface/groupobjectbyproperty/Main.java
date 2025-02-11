package com.mapinterface.groupobjectbyproperty;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Create departments
        Department hr = new Department("HR");
        Department it = new Department("IT");

        // Create a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", hr));
        employees.add(new Employee("Bob", it));
        employees.add(new Employee("Carol", hr));

        // Group employees by department
        Map<Department, List<Employee>> groupedByDepartment = new GroupByDepartment().groupByDepartment(employees);

        // Check the groupings for HR
        List<Employee> hrEmployees = groupedByDepartment.get(hr);
        System.out.println("HR Department: " + hrEmployees);

        // Check the groupings for IT
        List<Employee> itEmployees = groupedByDepartment.get(it);
        System.out.println("IT Department: " + itEmployees);
    }

}
