package com.annotation.excercise.useoverride;

public class Dog extends Animal {
    // Override it in Dog class with @Override
   @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}
