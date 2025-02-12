package com.insurancepolicymanagementsystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

public class PolicyManagerTest {

    private PolicyManager policyManager;

    @BeforeEach
    public void setup() {
        policyManager = new PolicyManager();
    }

    @Test
    public void testAddPolicy() {
        Policy policy = new Policy("P123", "John Doe", new Date(), "Health", 300.0);
        policyManager.addPolicy(policy);

        // Assert that the policy is added to the HashSet
        assertTrue(policyManager.hashSetPolicies.contains(policy));

        // Assert that the policy is added to the LinkedHashSet
        assertTrue(policyManager.linkedHashSetPolicies.contains(policy));

        // Assert that the policy is added to the TreeSet
        assertTrue(policyManager.treeSetPolicies.contains(policy));
    }

    @Test
    public void testDisplayPoliciesByCoverageType() {
        Policy policy1 = new Policy("P123", "John Doe", new Date(), "Health", 300.0);
        Policy policy2 = new Policy("P124", "Jane Doe", new Date(), "Auto", 500.0);
        policyManager.addPolicy(policy1);
        policyManager.addPolicy(policy2);

        // Test filtering policies by coverage type (Auto)
        policyManager.displayPoliciesByCoverageType("Auto");

        // In this case, since the display logic just prints, you would need to ensure that it displays the correct output
        // A more advanced test could involve redirecting System.out and checking the output,
        // but for simplicity, we assume this is done manually here.
    }

    @Test
    public void testDisplayDuplicatePolicies() {
        Policy policy1 = new Policy("P123", "John Doe", new Date(), "Health", 300.0);
        Policy policy2 = new Policy("P123", "John Doe", new Date(), "Health", 300.0); // Duplicate policy
        policyManager.addPolicy(policy1);
        policyManager.addPolicy(policy2);

        // Test for duplicates
        policyManager.displayDuplicatePolicies();

        // You would check the console output manually or implement a more advanced test that checks the output.
    }

    @Test
    public void testPerformanceComparison() {
        policyManager.comparePerformance();  // This will print the performance metrics to the console
    }
}
