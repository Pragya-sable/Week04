package com.insurancepolicymanagementsystem;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        PolicyManager manager = new PolicyManager();

        // Adding policies
        manager.addPolicy(new Policy("P101", "pratham", LocalDate.of(2024, 5, 20)));
        manager.addPolicy(new Policy("P102", "Ajay", LocalDate.of(2024, 6, 10)));
        manager.addPolicy(new Policy("P103", "suraj", LocalDate.of(2024, 4, 15))); // Expired
        manager.addPolicy(new Policy("P104", "vivek", LocalDate.of(2024, 5, 25)));

        // fetching a policy
        System.out.println("\nPolicy P101 details: " + manager.getPolicyByNumber("P101"));

        // Listing policies expiring in the next 30 days
        System.out.println("\nPolicies expiring in the next 30 days:");
        for (Policy policy : manager.getPoliciesExpiringSoon()) {
            System.out.println(policy);
        }

        // Listing policies for a specific policyholder
        System.out.println("\nPolicies for John Doe:");
        for (Policy policy : manager.getPoliciesByHolder("John Doe")) {
            System.out.println(policy);
        }

        // Removing expired policies
        System.out.println("\nRemoving expired policies...");
        manager.removeExpiredPolicies();

        // Displaying all policies in insertion order
        System.out.println("\nPolicies after removing expired ones (in insertion order):");
        manager.displayPoliciesInInsertionOrder();
    }
}
