package Project;

public class Lab{
    /**
     * array of students
     */
    private Student[] students;
    /**
     * the average of student grades
     */
    private int average;
    /**
     * the day of the week that lab is held
     */
    private String day;
    /**
     * the capacity of the lab
     */
    private int capacity;
    /**
     * the current size of the lab
     */
    private int currentSize;

    /**
     *
     * @param capacity the capacity of the lab
     * @param day the day lab is held
     */
    public Lab(int capacity,String day){
        students=new Student[capacity];
        this.capacity=capacity;
        this.day=day;
        currentSize=0;
        average=0;
    }

    /**
     * adds new student to the lab
     * @param std new student
     */
    public void enrollStudent(Student std) {
        if (currentSize < capacity)
            students[currentSize++] = std;
        else
            System.out.println("Lab is full!!!");
    }

    /**
     * prints student info
     */
    public void print() {
        for (int i = 0; i < currentSize; i++) {
            System.out.print((i + 1) + ". ");
            students[i].print();
        }

    }
    /**
     * @return the students array
     */
    public Student[] getStudents() {
        return students;
    }

    /**
     * set the students one by one
     * @param students an array of students
     */
    public void setStudents(Student[] students) {
        for(Student si: students)
            enrollStudent(si);
    }
    /**
     * @return the average of student's grades
     */
    public int getAvg() {
        return average;
    }

    /**
     *this method calculates the average
     */
    public void calculateAvg() {
        int sum = 0;
        for(int i = 0; i < currentSize; i++)
            sum += students[i].getGrade();
        average = sum / currentSize;
    }
    /**
     * @return the day of the week on which each lab session is held
     */
    public String getDay() {
        return day;
    }

    /**
     * sets the value of day field
     * @param day the new day of the week on which each lab session is held
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * @return the capacity of the lab
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @param capacity the new capacity
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}