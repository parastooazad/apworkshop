package Project;

public class Run {
    public static void main(String[] args){
        Student std1=new Student("ehsan","edalat","9031066");
        Student std2 = new Student("Seyed", "Ahmadpanah", "9031806");
        Student std3 = new Student("Ahmad", "Asadi", "9031054");
        std1.setGrade(15);

        std2.setGrade(11);

        std3.setFirstName("HamidReza");
        Student[] students = {std1, std2, std3};
        Lab lab = new Lab(3, "MON");
        lab.setStudents(students);
        lab.print();
    }
}
