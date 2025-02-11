package com.resumescreeningsystem;

public class Main {
    public static void main(String[] args) {
        // Create instances of JobRole subclasses
        SoftwareEngineer se = new SoftwareEngineer();
        DataScientist ds = new DataScientist();
        ProductManager pm = new ProductManager();

        // Create resume objects for different candidates with specific job roles
        Resume<SoftwareEngineer> resume1 = new Resume<>("Alice", "Experienced in Java and Python.", se);
        Resume<DataScientist> resume2 = new Resume<>("Bob", "Expert in Machine Learning and Data Analysis.", ds);
        Resume<ProductManager> resume3 = new Resume<>("Charlie", "Strong background in Product Strategy and Roadmap.", pm);
        Resume<SoftwareEngineer> resume4 = new Resume<>("Dave", "Worked on HTML and CSS only.", se);

        // Initialize the ResumeScreeningSystem
        ResumeScreeningSystem screeningSystem = new ResumeScreeningSystem();
        screeningSystem.addResume(resume1);
        screeningSystem.addResume(resume2);
        screeningSystem.addResume(resume3);
        screeningSystem.addResume(resume4);

        // Display all screened (approved) resumes
        screeningSystem.displayScreenedResumes();

        ResumeScreeningSystem.evaluateResume(se, "C++ and Python skills.");
        ResumeScreeningSystem.evaluateResume(ds, "Experienced in SQL but no ML background.");
    }
}
