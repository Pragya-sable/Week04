
package com.serialization.saveandretrieveanobject;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class SerializeDeserialize {

    // Method to serialize the list of employee to a list
    public static void serialize(List<Employee> employees) {
        try{

            // write data to file
            FileOutputStream fos = new FileOutputStream("D:/Capgemini Training/output2.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // how to serialize
            oos.writeObject(employees);

            oos.close();
            fos.close();
            System.out.println("Object state is transfer to file ");
        }catch(IOException exception){
            exception.printStackTrace();
        }
    }

    // Method to deserialize the list of employee to a list
    public static List<Employee> deserialize(){
        List<Employee> employee = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:/Capgemini Training/output2.txt"))) {
            employee = (List<Employee>) in.readObject();
            System.out.println("Deserialized");


        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException exception){
            exception.printStackTrace();
        }
        return employee;
    }
}

