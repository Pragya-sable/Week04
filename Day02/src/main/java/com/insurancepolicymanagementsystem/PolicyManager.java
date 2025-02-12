package com.insurancepolicymanagementsystem;
import java.util.*;
import java.time.LocalDate;


public class PolicyManager {
    private Map<String, Policy> policyMap = new HashMap<>();
    private LinkedHashMap<String, Policy> linkedPolicyMap = new LinkedHashMap<>();
    private TreeMap<LocalDate, List<Policy>> expiryPolicyMap = new TreeMap<>();

    // Adding a policy
    public void addPolicy(Policy policy) {
        policyMap.put(policy.getPolicyNumber(), policy);
        linkedPolicyMap.put(policy.getPolicyNumber(), policy);

        // Storing in TreeMap based on expiry date
        expiryPolicyMap.computeIfAbsent(policy.getExpiryDate(), k -> new ArrayList<>()).add(policy);
    }

    // Retrieveing policy by policy number
    public Policy getPolicyByNumber(String policyNumber) {
        return policyMap.get(policyNumber);
    }

    // Listing all policies expiring in the next 30 days
    public List<Policy> getPoliciesExpiringSoon() {
        List<Policy> expiringSoon = new ArrayList<>();
        LocalDate today = LocalDate.now();
        LocalDate thresholdDate = today.plusDays(30);

        for (Map.Entry<LocalDate, List<Policy>> entry : expiryPolicyMap.entrySet()) {
            if (!entry.getKey().isAfter(thresholdDate)) {
                expiringSoon.addAll(entry.getValue());
            }
        }
        return expiringSoon;
    }

    // Listing all policies for a specific policyholder
    public List<Policy> getPoliciesByHolder(String policyHolderName) {
        List<Policy> holderPolicies = new ArrayList<>();
        for (Policy policy : policyMap.values()) {
            if (policy.getPolicyHolderName().equalsIgnoreCase(policyHolderName)) {
                holderPolicies.add(policy);
            }
        }
        return holderPolicies;
    }

    // Removing expired policies
    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();
        Iterator<Map.Entry<LocalDate, List<Policy>>> iterator = expiryPolicyMap.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<LocalDate, List<Policy>> entry = iterator.next();
            if (entry.getKey().isBefore(today)) {
                for (Policy policy : entry.getValue()) {
                    policyMap.remove(policy.getPolicyNumber());
                    linkedPolicyMap.remove(policy.getPolicyNumber());
                }
                iterator.remove();
            }
        }
    }
    public void displayPoliciesInInsertionOrder() {
        for (Policy policy : linkedPolicyMap.values()) {
            System.out.println(policy);
        }
    }
}
