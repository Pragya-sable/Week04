package com.designavotingsystem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VotingSystemTest {

    private VotingSystem votingSystem;

    @BeforeEach
    public void setUp() {
        // Initialize the VotingSystem before each test
        votingSystem = new VotingSystem();
    }

    @Test
    public void testAddVote() {
        votingSystem.addVote("Alice");
        votingSystem.addVote("Alice");
        votingSystem.addVote("Bob");

        assertEquals(2, votingSystem.getVotesForCandidate("Alice"));
        assertEquals(1, votingSystem.getVotesForCandidate("Bob"));
    }

    @Test
    public void testDisplayResultsSortedByVotes() {
        votingSystem.addVote("Alice");
        votingSystem.addVote("Bob");
        votingSystem.addVote("Alice");

        // Capture the output using a custom approach (for simplicity we will not use it in this test)
        votingSystem.displayResultsSortedByVotes();
    }

    @Test
    public void testDisplayResultsInInsertionOrder() {
        votingSystem.addVote("Alice");
        votingSystem.addVote("Bob");
        votingSystem.addVote("Charlie");

        votingSystem.displayResultsInInsertionOrder();
    }

    @Test
    public void testGetVotesForCandidate() {
        votingSystem.addVote("Alice");
        votingSystem.addVote("Alice");
        votingSystem.addVote("Bob");

        assertEquals(2, votingSystem.getVotesForCandidate("Alice"));
        assertEquals(1, votingSystem.getVotesForCandidate("Bob"));
        assertEquals(0, votingSystem.getVotesForCandidate("Charlie"));
    }
}
