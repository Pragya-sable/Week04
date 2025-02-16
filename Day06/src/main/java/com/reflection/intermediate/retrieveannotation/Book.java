package com.reflection.intermediate.retrieveannotation;


@Author(name = "John Doe")
public class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public void displayTitle() {
        System.out.println("Book Title: " + title);
    }
}