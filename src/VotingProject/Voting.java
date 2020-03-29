package VotingProject;
import ir.huri.jcal.JalaliCalendar;//importing Jalali calender library
import java.util.ArrayList;//importing ArrayList class for keeping the voters and choices
import java.util.HashMap;//importing HashMap class for keeping the list of choices to votes
import java.util.HashSet;//for keeping votes as the value of our HashMap

/**
 * this class represents a voting.each voting has a question ,am ArrayLIst that hold the people who participated in this voting
 *  a type ,an ArrayList of choices one can make
 *  and a HashMap of choices to votes
 *  each person can only take part in each voting once .
*/

public class Voting {
    /**
     * this shows the type of this voting.
     * if it's 0 you can only choose one answer if it's 1 you can make more than one choice
     */
    private int type;
    /**
     * the question of this voting
     */
    private String question;
    /**
     * list of people who participated in this voting
     */
    private ArrayList <Person> voters;
    /**
     * list of choices one can make
     */
    private ArrayList<String> choices;
    /**
     * this holds the choices as keys and a set of votes as value
     */
    private HashMap <String,HashSet<Vote>> listOfVotesToChoices;

    /**
     * this constructs a voting with given question and type
     * @param type the type of the voting
     * @param question the question of the voting
     */
    public Voting(int type,String question){
        this.type=type;
        this.question=question;
        voters=new ArrayList<Person>();
        choices = new ArrayList<String>();
        listOfVotesToChoices=new HashMap<String , HashSet<Vote>>();

    }

    /**
     * this gets the question of voting
     * @return the question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * this gets the ArrayList of people who voted
     * @return the voters
     */
    public ArrayList<Person> getVoters() {
        return voters;
    }

    /**
     * this method gets a string as choices and adds it to the list of choices and puts it in the hash map
     * @param stringChoice the choice that we want to add to the voting
     */
    public void createChoice(String stringChoice){
        listOfVotesToChoices.put(stringChoice,new HashSet<Vote>());
        choices.add(stringChoice);

    }

    /**
     * this gets the HashMap of votes to choices
     * @return the listOfVotesToChoices
     */

    public HashMap<String, HashSet<Vote>> getListOfVotesToChoices() {
        return listOfVotesToChoices;
    }

    /**
     * this gets the ArrayList of choices
     * @return the choices
     */
    public ArrayList<String> getChoices() {
        return choices;
    }

    /**
     * this gets the type of voting
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * this method makes voting with specific voter and an ArrayLIst of string that is the choices this person made .
     * first it makes sure that this person hasn't participated in this voting before then it makes an instance of jalali class for the date .
     * and adds the voting to the HashSet .if the person has votted before it prints a message
     * @param votePerson the person who wants to vote
     * @param choicesToAdd the choices this person made
     */
    public void vote(Person votePerson , ArrayList <String> choicesToAdd) {
        if (!voters.contains(votePerson)) {
            JalaliCalendar jalaliCalendar = new JalaliCalendar();
            Vote voteToAdd = new Vote(votePerson, jalaliCalendar.toString());
            voters.add(votePerson);

            for (String s : choicesToAdd) {
                if(choices.contains(s))
                    listOfVotesToChoices.get(s).add(voteToAdd);
            }
        }
        else
        System.out.println("\nthis person has voted before");
            return;
    }

    /**
     * this method prints the result of a voting .it prints the question of voting and the result
     */
    public void printVotes(){
        System.out.println("\nthe question to vote is:" + getQuestion());
        int size=listOfVotesToChoices.size();
        for(HashMap.Entry <String,HashSet<Vote>> entry :listOfVotesToChoices.entrySet()){
            System.out.println("\nnumber of votes on choice " + entry.getKey() + " is: " +  entry.getValue().size());
        }
    }
}
