package com.insurancepolicymanagementsystem1st;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class PolicyServiceTest {

    private PolicyStorage policyStorage;

    @BeforeEach
    public void setup() {
        policyStorage = new PolicyStorage();
        policyStorage.addPolicy(new Policy("P001", "John Doe", new Date(System.currentTimeMillis() + 1000000000), "Health", 500.0));
        policyStorage.addPolicy(new Policy("P002", "Jane Doe", new Date(System.currentTimeMillis() + 500000000), "Auto", 600.0));
        policyStorage.addPolicy(new Policy("P003", "Alice Brown", new Date(System.currentTimeMillis() + 200000000), "Home", 700.0));
        policyStorage.addPolicy(new Policy("P001", "John Doe", new Date(System.currentTimeMillis() + 1000000000), "Health", 500.0));  // Duplicate policy
    }

    @Test
    public void testAddPolicy() {
        Set<Policy> policies = policyStorage.getAllPolicies();
        assertNotNull(policies);
        assertEquals(3, policies.size());  // One duplicate policy should not be counted
    }

    @Test
    public void testDisplayAllPolicies() {
        Set<Policy> policies = policyStorage.getAllPolicies();
        assertNotNull(policies);
        assertTrue(policies.size() > 0);
        // You could capture the output here to validate it more effectively, if needed.
        PolicyService.displayAllPolicies(policies); // This should print all the policies to console.
    }

    @Test
    public void testDisplayExpiringSoon() {
        Set<Policy> policies = policyStorage.getSortedPolicies();
        assertNotNull(policies);
        // This test will print all policies expiring soon (within 30 days)
        PolicyService.displayExpiringSoon(policies);
    }

    @Test
    public void testDisplayByCoverageType() {
        Set<Policy> policies = policyStorage.getAllPolicies();
        PolicyService.displayByCoverageType(policies, "Health");

        // This test will print the policies of type "Health" to the console.
        // You could capture the output here to verify the correct policies are being displayed.
    }

    @Test
    public void testFindDuplicatePolicies() {
        Set<Policy> policies = policyStorage.getAllPolicies();
        // This test will print duplicate policies to the console.
        PolicyService.findDuplicatePolicies(policies);
    }
}
