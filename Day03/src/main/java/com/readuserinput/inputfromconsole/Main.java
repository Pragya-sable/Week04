
package com.readuserinput.inputfromconsole;

public class Main {
    public static void main(String[] args) {
        // Get the user info
        String[] userInformation = ReadUserInputFromConsoleExample.getUserInput();

        // Extract the information from the array
        String name = userInformation[0];
        int age = Integer.parseInt(userInformation[1]);
        String favoriteLanguage = userInformation[2];

        // Save to file
        ReadUserInputFromConsoleExample.copyToFile(name,age,favoriteLanguage);

    }
}

