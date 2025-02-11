package com.resumescreeningsystem;

import java.util.ArrayList;
import java.util.List;

public class ResumeScreeningSystem {
    // List to hold screened resumes, which are of type Resume and may have any JobRole subtype
    private List<Resume<? extends JobRole>> screenedResumes = new ArrayList<>();

    // Method to add a resume to the system after evaluating if
    // it's suitable for the job role
    public void addResume(Resume<? extends JobRole> resume) {
        // If the resume is suitable, add it to the screened resumes list
        if (resume.isSuitable()) {
            screenedResumes.add(resume);
            System.out.println("Resume Approved: " + resume);
        } else {
            // Otherwise, print that the resume has been rejected
            System.out.println("Resume Rejected: " + resume);
        }
    }

    // Method to display all the resumes that have been approved
    public void displayScreenedResumes() {
        System.out.println("\nFinal Approved Resumes:");
        for (Resume<? extends JobRole> resume : screenedResumes) {
            System.out.println(resume);
        }
    }

    // Generic method to evaluate a resume dynamically
    public static <T extends JobRole> void evaluateResume(T jobRole, String resumeContent) {
        System.out.println("\nEvaluating resume for " + jobRole.getRoleName() + "...");
        if (jobRole.evaluateResume(resumeContent)) {
            System.out.println("Resume is suitable!");
        } else {
            System.out.println("Resume does not match the job role.");
        }
    }
}