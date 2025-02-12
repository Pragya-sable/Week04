package com.designavotingsystem;
import java.util.*;

public class VotingSystem {

    // HashMap to store votes
    private Map<String, Integer> voteMap;

    // Constructor
    public VotingSystem() {
        // Initialize HashMap to store votes
        voteMap = new HashMap<>();
    }

    // Add vote for a candidate
    public void addVote(String candidate) {
        voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);
    }

    // Get the number of votes for a candidate
    public int getVotesForCandidate(String candidate) {
        return voteMap.getOrDefault(candidate, 0);
    }

    // Display results in sorted order using TreeMap
    public void displayResultsSortedByVotes() {
        TreeMap<String, Integer> sortedVotes = new TreeMap<>(
                (c1, c2) -> voteMap.get(c2).compareTo(voteMap.get(c1))  // Sort in descending order by votes
        );
        sortedVotes.putAll(voteMap);

        System.out.println("Voting Results (Sorted by Votes):");
        sortedVotes.forEach((candidate, votes) -> System.out.println(candidate + ": " + votes + " votes"));
    }

    // Display results in insertion order using LinkedHashMap
    public void displayResultsInInsertionOrder() {
        Map<String, Integer> linkedVoteMap = new LinkedHashMap<>(voteMap);

        System.out.println("Voting Results (Insertion Order):");
        linkedVoteMap.forEach((candidate, votes) -> System.out.println(candidate + ": " + votes + " votes"));
    }
}
