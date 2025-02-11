package com.resumescreeningsystem;
// SoftwareEngineer inherit JobRole
public class SoftwareEngineer extends JobRole {
    public SoftwareEngineer() {
        super("Software Engineer");
    }

    @Override
    public boolean evaluateResume(String resumeContent) {
        return resumeContent.toLowerCase().contains("java") || resumeContent.toLowerCase().contains("python");
    }
}