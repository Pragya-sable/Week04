package com.insurancepolicymanagementsystem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

public class InsurancePolicyManagerTest {
    private PolicyManager policyManager;

    @BeforeEach
    public void setUp() {
        // Initialize the PolicyManager before each test
        policyManager = new PolicyManager();
    }

    @Test
    public void testAddPolicy() {
        // Add a new policy
        Policy policy = new Policy("P123", "John Doe", new Date(), "Health", 300.0);
        policyManager.addPolicy(policy);

        // Assert that the policy is stored in the HashSet
        assertTrue(policyManager.hashSetPolicies.contains(policy));
    }

    @Test
    public void testDisplayAllPolicies() {
        // Add policies to the system
        Policy policy1 = new Policy("P124", "Jane Doe", new Date(), "Auto", 500.0);
        Policy policy2 = new Policy("P125", "Alice Smith", new Date(), "Home", 400.0);
        policyManager.addPolicy(policy1);
        policyManager.addPolicy(policy2);

        // Check if policies are displayed
        assertEquals(2, policyManager.hashSetPolicies.size());
    }

    @Test
    public void testDisplayPoliciesByCoverageType() {
        // Add policies to the system
        Policy healthPolicy = new Policy("P126", "Bob Johnson", new Date(), "Health", 600.0);
        Policy autoPolicy = new Policy("P127", "Charlie Brown", new Date(), "Auto", 700.0);
        policyManager.addPolicy(healthPolicy);
        policyManager.addPolicy(autoPolicy);

        // Check if policies with "Auto" coverage are correctly retrieved
        // Capture the output (this will require you to mock the `System.out` for testing)
        policyManager.displayPoliciesByCoverageType("Auto");
    }

    @Test
    public void testDisplayDuplicatePolicies() {
        // Add duplicate policies
        Policy duplicatePolicy = new Policy("P128", "David Lee", new Date(), "Health", 350.0);
        policyManager.addPolicy(duplicatePolicy);
        policyManager.addPolicy(duplicatePolicy); // Duplicate based on policy number

        // Check if duplicates are found
        policyManager.displayDuplicatePolicies();  // This should output the duplicate policy
    }

    @Test
    public void testPerformanceComparison() {
        // Compare performance by adding 10,000 policies
        long startTime = System.nanoTime();
        policyManager.comparePerformance();
        long endTime = System.nanoTime();

        long duration = endTime - startTime;
        System.out.println("Time to add 10,000 policies: " + duration + " nanoseconds");
    }

    @Test
    public void testPoliciesExpiringSoon() {
        // Add a policy that expires soon (within 30 days)
        Policy expiringPolicy = new Policy("P130", "Eve Adams", new Date(System.currentTimeMillis() + 86400000L * 15), "Health", 350.0);
        policyManager.addPolicy(expiringPolicy);

        // Retrieve policies expiring soon
        policyManager.displayPoliciesExpiringSoon();
    }
}
