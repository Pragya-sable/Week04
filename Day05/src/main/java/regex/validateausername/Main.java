package com.validateausername;

public class Main {
    public static void main(String[] args) {
        // call the method and print
        System.out.println(ValidateUsernameExample.isValidate("user_123"));
        System.out.println(ValidateUsernameExample.isValidate("123user"));
        System.out.println(ValidateUsernameExample.isValidate("us"));
        System.out.println(ValidateUsernameExample.isValidate("username$"));

    }
}
