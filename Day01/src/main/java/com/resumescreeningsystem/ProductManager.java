package com.resumescreeningsystem;
// ProductManager inherit thr JobRole class
public class ProductManager extends JobRole {
    public ProductManager() {
        super("Product Manager");
    }

    @Override
    public boolean evaluateResume(String resumeContent) {
        return resumeContent.toLowerCase().contains("product strategy") || resumeContent.toLowerCase().contains("roadmap");
    }
}