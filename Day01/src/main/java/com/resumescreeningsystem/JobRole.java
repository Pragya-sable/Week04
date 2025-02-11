package com.resumescreeningsystem;
// Create an abstract class
public abstract class JobRole {
    private String roleName;

    // Constructor
    public JobRole(String roleName) {
        this.roleName = roleName;
    }
    // Getter Method
    public String getRoleName() {
        return roleName;
    }

    public abstract boolean evaluateResume(String resumeContent);
}