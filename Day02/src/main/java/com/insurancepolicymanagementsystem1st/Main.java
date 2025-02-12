package com.insurancepolicymanagementsystem1st;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        PolicyStorage storage = new PolicyStorage();

        storage.addPolicy(new Policy("P001", "John Doe", new Date(System.currentTimeMillis() + 1000000000), "Health", 500.0));
        storage.addPolicy(new Policy("P002", "Jane Doe", new Date(System.currentTimeMillis() + 500000000), "Auto", 600.0));
        storage.addPolicy(new Policy("P003", "Alice Brown", new Date(System.currentTimeMillis() + 200000000), "Home", 700.0));
        storage.addPolicy(new Policy("P001", "John Doe", new Date(System.currentTimeMillis() + 1000000000), "Health", 500.0));

        Set<Policy> policies = storage.getAllPolicies();
        PolicyService.displayAllPolicies(policies);
        System.out.println();
        PolicyService.displayExpiringSoon(storage.getSortedPolicies());
        System.out.println();
        PolicyService.displayByCoverageType(policies, "Health");
        PolicyService.findDuplicatePolicies(policies);
    }
}
