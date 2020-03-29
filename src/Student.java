package Project;

/**
 * this class holds information about the students
 */

public  class Student{
    /**
     * student's firstNAme
     */
    private String firstName;
    /**
     * student's lastName
     */
    private String lastName;
    /**
     * student's idNum
     */
    private String idNum;
    /**
     * student's grade
     */
    private int grade;

    /**
     * creates student with given name and id
     * @param fNAme student's firstName
     * @param lNAme student's lastName
     * @param sID  student's idNUm
     */
     public Student(String fNAme,String lNAme,String sID) {
         firstName=fNAme;
         lastName=lNAme;
         idNum=sID;
         grade=0;

    }

    /**
     *
     * @return returns student firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @return returns student lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *
     * @return returns student idNum
     */
    public String getIdNum() {
        return idNum;
    }

    /**
     *
     * @return returns student grade
     */
    public int getGrade() {
        return grade;
    }

    /**
     *
     * @param firstName student's firstName to be set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @param lastName student's lastName to be set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @param idNum student's idNUm to be set
     */
    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    /**
     *
     * @param grade student's grade to be set
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     *
     */
    public void print(){
        System.out.println(lastName + ",student ID:" + idNum + ",  grade:" + grade);
    }

}