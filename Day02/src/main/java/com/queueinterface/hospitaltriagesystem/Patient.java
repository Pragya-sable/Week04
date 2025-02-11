package com.queueinterface.hospitaltriagesystem;
// Program to Simulate a hospital triage system using a PriorityQueue where
// patients with higher severity are treated first
public class Patient {
    private String name;
    private int severity;

    // Constructor to initialize a new Patient object
    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    // Getter and Setter Methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }
}
