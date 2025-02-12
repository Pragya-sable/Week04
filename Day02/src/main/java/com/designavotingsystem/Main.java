package com.designavotingsystem;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Create an instance of VotingSystem
        VotingSystem votingSystem = new VotingSystem();

        // Add some votes
        votingSystem.addVote("Alice");
        votingSystem.addVote("Bob");
        votingSystem.addVote("Alice");
        votingSystem.addVote("Charlie");
        votingSystem.addVote("Bob");
        votingSystem.addVote("Alice");

        // Display voting results sorted by votes in descending order using TreeMap
        votingSystem.displayResultsSortedByVotes();

        // Display voting results in the order they were inserted using LinkedHashMap
        votingSystem.displayResultsInInsertionOrder();

        // Get and print the number of votes for a specific candidate
        System.out.println("Votes for Alice: " + votingSystem.getVotesForCandidate("Alice"));
        System.out.println("Votes for Bob: " + votingSystem.getVotesForCandidate("Bob"));
        System.out.println("Votes for Charlie: " + votingSystem.getVotesForCandidate("Charlie"));
    }
}
