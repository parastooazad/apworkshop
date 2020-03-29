package VotingProject;
import java.util.ArrayList;

/**
 * this class manages whole program.it has an ArrayList of all the voting
 */
public class VotingSystem {
    /**
     * this is an ArrayList that holds all the voting in this system
     */
    private ArrayList<Voting> votingList;

    /**
     * this constructs a VotingSystem
     */
    public VotingSystem() {
        votingList = new ArrayList<Voting>();
    }

    /**
     * this method creates a voting with given question ,the type of the voting and an ArrayList of options you can vote
     * @param questionToVote the question to vi=ote
     * @param state the type of the voting.it can be multiple voting or single voting
     * @param optionsToVote this is an ArrayList of all the choices in this voting
     */
    public void createVoting(String questionToVote, int state, ArrayList<String> optionsToVote) {
        Voting votingToCreate = new Voting(state, questionToVote);
        votingList.add(votingToCreate);
        for (String s : optionsToVote) {
            votingToCreate.createChoice(s);
        }
    }

    /**
     * this method prints all the questions that are on vote
     */
    public void printVotingQuestions() {
        for (Voting voting : votingList) {
            System.out.println("\n" + voting.getQuestion());
        }
    }

    /**
     * this method gets an index that is the index of voting in the list and it prints the question of that vote and the choices
     * @param voteIndex index of the vote
     */
    public void printVoting(int voteIndex) {
        System.out.println("\nthe question of this voting is :" + votingList.get(voteIndex).getQuestion());
        System.out.println("\nthe choices: ");
        for (String s : votingList.get(voteIndex).getChoices()) {
            System.out.println("\n" + s);

        }
    }

    /**
     * this method finalize a voting.it gets an index that shows which voting is it and a person who wants to vote and a list of choices this person made
     * it first check the type of the voting .if its single voting the list shouldn't have more than one choice
     * @param index the index of the voting in the votingList
     * @param voter the person who votes
     * @param choices the choices this person made
     */

    public void vote(int index, Person voter, ArrayList<String> choices) {
        Voting finalVote = votingList.get(index);
        if (finalVote.getType() == 0 && choices.size() > 1) {
            System.out.println("\nyou can't choose more than one option ");
            return;
        }
        else
            finalVote.vote(voter, choices);
    }

    /**
     * this prints the result of the voting
     * @param index the index of the voting in votingList
     */
    public void printResults(int index) {
        votingList.get(index).printVotes();
    }
}
