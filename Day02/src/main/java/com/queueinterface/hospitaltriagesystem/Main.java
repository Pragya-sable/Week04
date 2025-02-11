package com.queueinterface.hospitaltriagesystem;

public class Main {
    public static void main(String[] args) {
        // Create a TriageSystem object
        TriageSystem triageSystem = new TriageSystem();

        // Add some patients to the system
        triageSystem.addPatient(new Patient("John", 3));  // Severity 3
        triageSystem.addPatient(new Patient("Alice", 5)); // Severity 5
        triageSystem.addPatient(new Patient("Bob", 2));   // Severity 2

        // Treat patients based on severity
        triageSystem.treatPatients();
    }
}
