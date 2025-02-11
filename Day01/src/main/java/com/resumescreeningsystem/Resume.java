package com.resumescreeningsystem;

// Generic class Resume that accepts any type of JobRole
public class Resume<T extends JobRole> {
    // Instance variables for candidate's name, resume content, and the job role
    private String candidateName;
    private String resumeContent;
    private T jobRole;

    // Constructor to initialize the Resume object with candidate name,
    // resume content, and job role
    public Resume(String candidateName, String resumeContent, T jobRole) {
        this.candidateName = candidateName;
        this.resumeContent = resumeContent;
        this.jobRole = jobRole;
    }

    // Method to check if the resume is suitable for the given job role
    // It evaluates the resume content against the criteria
    // defined in the specific job role
    public boolean isSuitable() {
        return jobRole.evaluateResume(resumeContent);
    }

    // Override toString method to provide a custom string
    // representation of the Resume object
    @Override
    public String toString() {
        return "Candidate: " + candidateName + " | Role: " + jobRole.getRoleName();
    }
}