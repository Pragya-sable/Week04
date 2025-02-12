package com.insurancepolicymanagementsystem;
import java.util.Date;

public class Policy {
    private String policyNumber;      // Unique identifier for the policy
    private String policyholderName;  // Name of the policyholder
    private Date expiryDate;          // Expiry date of the policy
    private String coverageType;      // Type of coverage (Health, Auto, Home, etc.)
    private double premiumAmount;     // Premium amount for the policy

    // Constructor to initialize a new policy
    public Policy(String policyNumber, String policyholderName, Date expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    // Getters for each attribute
    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getPolicyholderName() {
        return policyholderName;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public String getCoverageType() {
        return coverageType;
    }

    public double getPremiumAmount() {
        return premiumAmount;
    }

    // Override equals and hashcode to ensure policies with the same policy number are treated as duplicates
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Policy policy = (Policy) obj;
        return policyNumber.equals(policy.policyNumber);  // Compare based on policy number
    }

    @Override
    public int hashCode() {
        return policyNumber.hashCode();  // Generate hashcode based on policy number
    }

    // Override toString to provide a user-friendly
    // output of the policy details
    @Override
    public String toString() {
        return "Policy{" +
                "policyNumber='" + policyNumber + '\'' +
                ", policyholderName='" + policyholderName + '\'' +
                ", expiryDate=" + expiryDate +
                ", coverageType='" + coverageType + '\'' +
                ", premiumAmount=" + premiumAmount +
                '}';
    }
}
