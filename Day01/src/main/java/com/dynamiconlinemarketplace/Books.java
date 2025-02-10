package com.dynamiconlinemarketplace;
// Books class implement ProductCategory interface
public class Books implements ProductCategory {
    @Override
    public String getCategoryName() {
        return "Books";
    }
}
