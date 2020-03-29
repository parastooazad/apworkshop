package VotingProject;

/**
 * this class represents a vote.each vote has a field that is the date and an object of class person that is the voter
 */
public class Vote {
    /**
     * this is the person that has voted
     */
    private Person person;
    /**
     * this is a string that is the date of that vote.
     * we use the library Jalali Calender to generate a date in jalali and we use to string method to transform it to a string
     */
    private String date;

    /**
     * this constructs a vote with given person and date
     * @param person is the person who has voted
     * @param date is the date of vote
     */
    public Vote(Person person,String date){
        this.person=person;
        this.date=date;
    }

    /**
     * this gets the person who voted
     * @return the person
     */
    public Person getPerson() {
        return person;
    }

    /**
     * this gets the string date
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * this method checks if two votes are the same or not.because each person can vote once.
     * it checks if the secondPerson first and last name are the same with person first and last name
     * if yes it returns true if not false
     * @param secondPerson
     * @return
     */
    public boolean equals(Person secondPerson){
        if(secondPerson.getFirstName().equals(person.getFirstName()) && secondPerson.getLastName().equals(person.getLastName())){
            return true;
        }
        else
            return false;
    }
}
