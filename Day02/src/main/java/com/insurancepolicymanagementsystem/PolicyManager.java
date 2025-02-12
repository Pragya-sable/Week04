package com.insurancepolicymanagementsystem;
import java.util.*;
import java.util.stream.Collectors;

public class PolicyManager {
     Set<Policy> hashSetPolicies;         // Set for fast lookups (HashSet)
     Set<Policy> linkedHashSetPolicies;  // Set that maintains insertion order (LinkedHashSet)
     Set<Policy> treeSetPolicies;        // Set that keeps policies sorted by expiry date (TreeSet)

    // Constructor initializes the sets
    public PolicyManager() {
        this.hashSetPolicies = new HashSet<>();           // For quick lookups
        this.linkedHashSetPolicies = new LinkedHashSet<>(); // Maintains insertion order
        this.treeSetPolicies = new TreeSet<>(Comparator.comparing(Policy::getExpiryDate)); // Sorts by expiry date
    }

    // Method to add a policy to all sets
    public void addPolicy(Policy policy) {
        hashSetPolicies.add(policy);              // Adds to HashSet (quick lookup)
        linkedHashSetPolicies.add(policy);       // Adds to LinkedHashSet (maintains insertion order)
        treeSetPolicies.add(policy);             // Adds to TreeSet (sorted by expiry date)
    }

    // Method to display all policies from each set
    public void displayAllPolicies() {
        System.out.println("HashSet Policies:");
        hashSetPolicies.forEach(System.out::println);  // Print policies from HashSet

        System.out.println("LinkedHashSet Policies:");
        linkedHashSetPolicies.forEach(System.out::println);  // Print policies from LinkedHashSet

        System.out.println("TreeSet Policies:");
        treeSetPolicies.forEach(System.out::println);  // Print policies from TreeSet
    }

    // Method to display policies that are expiring soon
    public void displayPoliciesExpiringSoon() {
        Date currentDate = new Date();  // Current date
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, 30);  // Add 30 days to the current date
        Date thirtyDaysFromNow = cal.getTime(); // Get the date 30 days from now

        System.out.println("Policies expiring soon:");
        treeSetPolicies.stream()
                .filter(policy -> policy.getExpiryDate().before(thirtyDaysFromNow))  // Filter policies expiring soon
                .forEach(System.out::println);  // Display matching policies
    }

    // Method to retrieve policies by their coverage type (e.g., Health, Auto, etc.)
    public void displayPoliciesByCoverageType(String coverageType) {
        System.out.println("Policies with coverage type: " + coverageType);
        hashSetPolicies.stream()
                .filter(policy -> policy.getCoverageType().equalsIgnoreCase(coverageType))  // Filter by coverage type
                .forEach(System.out::println);  // Display matching policies
    }

    // Method to find and display duplicate policies (based on policy number)
    public void displayDuplicatePolicies() {
        // Group policies by policy number and filter those that appear more than once
        Map<String, List<Policy>> policyGroups = hashSetPolicies.stream()
                .collect(Collectors.groupingBy(Policy::getPolicyNumber)); // Group by policy number

        System.out.println("Duplicate Policies:");
        policyGroups.entrySet().stream()
                .filter(entry -> entry.getValue().size() > 1)  // Find duplicates
                .flatMap(entry -> entry.getValue().stream())  // Flatten duplicate policies
                .forEach(System.out::println);  // Display duplicates
    }

    // Method to compare the performance of HashSet, LinkedHashSet, and TreeSet in terms of adding policies
    public void comparePerformance() {
        // Add 10000 policies to HashSet and measure the time taken
        long startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            Policy policy = new Policy("Policy" + i, "Name" + i, new Date(), "Health", 100.0);
            hashSetPolicies.add(policy);
        }
        long hashSetAddTime = System.nanoTime() - startTime; // Time taken to add to HashSet

        // Add 10000 policies to LinkedHashSet and measure the time taken
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            Policy policy = new Policy("Policy" + i, "Name" + i, new Date(), "Health", 100.0);
            linkedHashSetPolicies.add(policy);
        }
        long linkedHashSetAddTime = System.nanoTime() - startTime; // Time taken to add to LinkedHashSet

        // Add 10000 policies to TreeSet and measure the time taken
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            Policy policy = new Policy("Policy" + i, "Name" + i, new Date(), "Health", 100.0);
            treeSetPolicies.add(policy);
        }
        long treeSetAddTime = System.nanoTime() - startTime; // Time taken to add to TreeSet

        // Print performance comparison
        System.out.println("Time to add 10000 policies:");
        System.out.println("HashSet: " + hashSetAddTime + " ns");
        System.out.println("LinkedHashSet: " + linkedHashSetAddTime + " ns");
        System.out.println("TreeSet: " + treeSetAddTime + " ns");

        // Similar measurements can be done for removal and searching operations
    }
}
