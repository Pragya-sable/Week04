package com.insurancepolicymanagementsystem;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the PolicyManager to manage insurance policies
        PolicyManager policyManager = new PolicyManager();

        // Add sample policies to the system
        policyManager.addPolicy(new Policy("P123", "John Doe", new Date(1679074800000L), "Health", 300.0));
        policyManager.addPolicy(new Policy("P124", "Jane Doe", new Date(1679407200000L), "Auto", 500.0));
        policyManager.addPolicy(new Policy("P125", "Alice Smith", new Date(1682002800000L), "Home", 400.0));

        // Display all policies stored in different sets
        policyManager.displayAllPolicies();

        // Display policies expiring soon (within the next 30 days)
        policyManager.displayPoliciesExpiringSoon();

        // Display policies filtered by a specific coverage type
        policyManager.displayPoliciesByCoverageType("Auto");

        // Display any duplicate policies based on policy number
        policyManager.displayDuplicatePolicies();

        // Perform a performance comparison for adding policies to different sets
        policyManager.comparePerformance();
    }
}
