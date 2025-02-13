
package com.serialization.saveandretrieveanobject;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(101,"Pragya","HR",5000000));
        employeeList.add(new Employee(101,"Riya","Finance",5110000));
        employeeList.add(new Employee(101,"Shubhi","Engineering",5100000));

        // Serialize
        SerializeDeserialize.serialize(employeeList);

        // Deserialize
        List<Employee> deserializedEmployees = SerializeDeserialize.deserialize();

        // Display
        if(deserializedEmployees != null){
            System.out.println("Deserialized Employee : ");
            for (Employee employee : deserializedEmployees){
                System.out.println(employee);
            }
        }

    }
}

