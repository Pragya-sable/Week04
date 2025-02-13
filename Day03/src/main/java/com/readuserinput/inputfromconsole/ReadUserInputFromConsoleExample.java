package com.readuserinput.inputfromconsole;

import java.io.*;
// Program that asks the user for their name, age, and favorite
// programming language, then saves this information into a file
public class ReadUserInputFromConsoleExample {

    // Method for taking the user input from console
    public static String[] getUserInput(){
        // Create BufferedReader object for taking input
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // Initialize Variable
        String name = "";
        int age = 0;
        String favoriteLanguage = "";

        try{
            // Enter name
            System.out.println("Enter name : ");
            name = bufferedReader.readLine();

            // Enter age
            System.out.println("Enter age : ");
            age = Integer.parseInt(bufferedReader.readLine());

            // Enter language
            System.out.println("Enter favorite Language : ");
            favoriteLanguage = bufferedReader.readLine();
        }catch (IOException e){
            e.printStackTrace();
        }catch (NumberFormatException e){
            e.printStackTrace();
        }
        // return
        return new String[]{name, String.valueOf(age),favoriteLanguage};
    }

    // Method to save the input taken from user into a file
    public static void copyToFile(String name, int age, String favoriteLanguage){

        try(FileWriter writer = new FileWriter("D:/Capgemini Training/output2.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(writer)){

            // Write data to the file
            bufferedWriter.write("Name : "+name);
            bufferedWriter.newLine();
            bufferedWriter.write("Age : "+age);
            bufferedWriter.newLine();
            bufferedWriter.write("Language : "+favoriteLanguage);

            System.out.println("Information added successfully");

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

