package com.queueinterface.hospitaltriagesystem;
import java.util.*;
public class TriageSystem {
    private PriorityQueue<Patient> triageQueue;

    // Constructor to initialize the PriorityQueue with a custom comparator
    public TriageSystem() {
        triageQueue = new PriorityQueue<>(new Comparator<Patient>() {
            @Override
            public int compare(Patient p1, Patient p2) {
                // Compare severity (higher severity comes first)
                return Integer.compare(p2.getSeverity(), p1.getSeverity());
            }
        });
    }

    // Method to add a patient to the queue
    public void addPatient(Patient patient) {
        triageQueue.add(patient);
    }

    // Method to treat patients in order of severity (poll the queue)
    public void treatPatients() {
        System.out.println("Treatment Order:");
        while (!triageQueue.isEmpty()) {
            // Poll the patient with the highest severity
            Patient patient = triageQueue.poll();
            System.out.println(patient.getName());  // Print the name of the patient being treated
        }
    }
}
