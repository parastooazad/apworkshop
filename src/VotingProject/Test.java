package VotingProject;
import java.util.ArrayList;
import java.util.Random;

public class Test {
    public static void main(String [] args){
        /**
         * making instances of Person class for voting
         */
        Person voter1=new Person("parastoo","Azad");
        Person voter2=new Person("parastesh","emad");
        Person voter3=new Person("roholla","ahmadzade");
        Person voter4=new Person("kimia","azad");

        /**
         * making an instance of class votingSystem
         */
        VotingSystem votingSystem=new VotingSystem();

        /**
         * this array list holds the options that one voter can choose
         */
        ArrayList <String> firstVotingOptions=new ArrayList<String>();
        ArrayList <String> secondVotingOptios=new ArrayList<String>();
        /**
         * adding different answers to the list
         */
        firstVotingOptions.add("Harry potter");
        firstVotingOptions.add("Pride and prejudice");
        firstVotingOptions.add("Jane eyre");
        firstVotingOptions.add("Animal farm");

         secondVotingOptios.add("Reading");
         secondVotingOptios.add("Watching movie");
         secondVotingOptios.add("Sleeping");
         secondVotingOptios.add("Eating");


        /**
         * making  two voting with specific question and type and different answers one can choose
         */
        votingSystem.createVoting("Which one is your favorite book?", 0, firstVotingOptions);
        votingSystem.createVoting("What are your hobbies?",1,secondVotingOptios);
        /**
         * printing voting questions
         */
        votingSystem.printVotingQuestions();
        /**
         * printing voting1
         */
        votingSystem.printVoting(0);
        /**
         * this array list holds the choices of a voter,in this case one voter can choose only one option
         */
        ArrayList<String> firstVoterChoices=new ArrayList<String>();
        firstVoterChoices.add("Harry potter");

        ArrayList<String> secondVoterChoices=new ArrayList<String>();
        secondVoterChoices.add("Reading");
        secondVoterChoices.add("Watching movie");


        /**
         *finalizing votes
         */
        votingSystem.vote(0,voter1,firstVoterChoices);
        votingSystem.vote(1,voter2,secondVoterChoices);
        /**
         * generating a random integer for voting that can only have one choice
         */
        Random random=new Random();
        ArrayList <String> thirdVoterChoices=new ArrayList<String>();
        thirdVoterChoices.add(firstVotingOptions.get(random.nextInt(4)));
        votingSystem.vote(0,voter3,thirdVoterChoices);

        secondVoterChoices.add("Eating");
        /**
         * voting with a person that has voted before
         */
        votingSystem.vote(1,voter2,secondVoterChoices);
        /**
         *making a voting that is wrong,it is type 0 and should have only one choice but it has more than one choice
         */
        firstVoterChoices.add("Jane eyre");
        votingSystem.vote(0,voter4,firstVoterChoices);

        /**
         *  printing results of two votings
         */
        votingSystem.printResults(0);
        votingSystem.printResults(1);
    }
}
