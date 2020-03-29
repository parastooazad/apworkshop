package VotingProject;

/**
 * this class represents a person with specific name and last name
 * we use objects of this class as voters
 */
public class Person {
    /**
     * the first name of this person
     */
    private String firstName;
    /**
     * the last name of this person
     */
    private String lastName;

    /**
     * this constructs a person with given name and last name
     * @param first is the person first name
     * @param last is the person last name
     */
    public Person (String first,String last){
        firstName=first;
        lastName=last;
    }

    /**
     * this gets the person first name
     * @return the person's first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * this gets the person last name
     * @return the person's last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * this method is an override of toString method
     * @return a string that is the person first name and last name
     */
    @Override
    public String toString(){
        return firstName+ " " + lastName;
    }
}
