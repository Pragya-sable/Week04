package com.mapinterface.groupobjectbyproperty;
import java.util.*;
public class GroupByDepartment {
    public Map<Department, List<Employee>> groupByDepartment(List<Employee> employees) {
        // Create a map to store the grouped employees by department
        Map<Department, List<Employee>> groupedByDepartment = new HashMap<>();

        // Iterate through the employees list and group them by their department
        for (Employee employee : employees) {
            // If the department is not in the map, add it with an empty list
            groupedByDepartment.putIfAbsent(employee.getDepartment(), new ArrayList<>());
            // Add the employee to the corresponding department list
            groupedByDepartment.get(employee.getDepartment()).add(employee);
        }

        return groupedByDepartment;
    }
}
