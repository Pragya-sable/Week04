package com.dynamiconlinemarketplace;
// Gadget class implement ProductCategory interface
public class Gadget implements ProductCategory {
    @Override
    public String getCategoryName() {
        return "Gadget";
    }
}