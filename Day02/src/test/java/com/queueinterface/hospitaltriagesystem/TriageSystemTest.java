package com.queueinterface.hospitaltriagesystem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.ArrayList;

public class TriageSystemTest {

    @Test
    public void testTreatPatients() {
        TriageSystem triageSystem = new TriageSystem();

        // Add patients with different severity levels
        triageSystem.addPatient(new Patient("John", 3));
        triageSystem.addPatient(new Patient("Alice", 5));
        triageSystem.addPatient(new Patient("Bob", 2));

        // Capture the treatment order by polling patients
        List<String> treatedPatients = new ArrayList<>();
        while (!triageSystem.triageQueue.isEmpty()) {
            treatedPatients.add(triageSystem.triageQueue.poll().getName());
        }

        // Expected order: Alice (severity 5), John (severity 3), Bob (severity 2)
        List<String> expectedOrder = List.of("Alice", "John", "Bob");

        // Verify if the patients are treated in correct order based on severity
        assertEquals(expectedOrder, treatedPatients);
    }
}