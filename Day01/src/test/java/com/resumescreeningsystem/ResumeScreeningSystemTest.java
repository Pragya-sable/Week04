package com.resumescreeningsystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class ResumeScreeningSystemTest {
    private ResumeScreeningSystem screeningSystem;
    private SoftwareEngineer softwareEngineer;
    private DataScientist dataScientist;
    private ProductManager productManager;
    private ByteArrayOutputStream outputStream;
    // Setup method that runs before each test
    @BeforeEach
    void setUp() {
        screeningSystem = new ResumeScreeningSystem();
        softwareEngineer = new SoftwareEngineer();
        dataScientist = new DataScientist();
        productManager = new ProductManager();

        // Capture console output for testing print statements
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    // Test case: Approving a resume for a valid Software Engineer candidate
    @Test
    void testAddResume_Approved() {
        Resume<SoftwareEngineer> resume = new Resume<>("Alice", "Java and Python Developer.", softwareEngineer);
        screeningSystem.addResume(resume);
        String output = outputStream.toString().trim();
        assertTrue(output.contains("Resume Approved: Candidate: Alice | Role: Software Engineer"));
    }
    // Test case: Rejecting a resume for an invalid Software Engineer candidate
    @Test
    void testAddResume_Rejected() {
        Resume<SoftwareEngineer> resume = new Resume<>("Bob", "Only knows HTML and CSS.", softwareEngineer);
        screeningSystem.addResume(resume);
        String output = outputStream.toString().trim();
        assertTrue(output.contains("Resume Rejected: Candidate: Bob | Role: Software Engineer"));
    }
    // Test case: Evaluating a resume and expecting it to be suitable for the Software Engineer role
    @Test
    void testEvaluateResume_Success() {
        ResumeScreeningSystem.evaluateResume(softwareEngineer, "Java Backend Developer");
        String output = outputStream.toString().trim();
        assertTrue(output.contains("Resume is suitable!"));
    }

    // Test case: Evaluating a resume and expecting it to not match the Data Scientist role
    @Test
    void testEvaluateResume_Failure() {
        ResumeScreeningSystem.evaluateResume(dataScientist, "Knows SQL but no ML skills.");
        String output = outputStream.toString().trim();
        assertTrue(output.contains("Resume does not match the job role."));
    }
    // Test case: Screening multiple resumes and checking if they're approved based on skills
    @Test
    void testScreenMultipleResumes() {
        screeningSystem.addResume(new Resume<>("Charlie", "Skilled in Java and Spring Boot.", softwareEngineer));
        screeningSystem.addResume(new Resume<>("David", "Expert in Machine Learning and AI.", dataScientist));
        screeningSystem.addResume(new Resume<>("Eve", "Agile and Product Strategy experience.", productManager));

        String output = outputStream.toString().trim();
        assertTrue(output.contains("Resume Approved: Candidate: Charlie | Role: Software Engineer"));
        assertTrue(output.contains("Resume Approved: Candidate: David | Role: Data Scientist"));
        assertTrue(output.contains("Resume Approved: Candidate: Eve | Role: Product Manager"));
    }
}