package grades;


import java.util.ArrayList;

public class Student {

    private String studentNames;
    private ArrayList<Integer> studentGrades;

    public Student(String studentNames) {
        this.studentNames = studentNames;
        studentGrades = new ArrayList<>();
    }

    public String getStudentNames() {
        return studentNames;
    }

    public void setStudentNames(String studentNames) {
        this.studentNames = studentNames;
    }

    public ArrayList<Integer> getStudentGrades() {
        return studentGrades;
    }

    public void setStudentGrades(ArrayList<Integer> studentGrades) {
        this.studentGrades = studentGrades;
    }

    public void addGrade(int grade) {
        studentGrades.add(grade);
    }

    public static double getGradeAverage(Student student) {
        double grades = 0;
        double gradeAvg = 0;
        for (int grade : student.studentGrades) {
            grades += grade;
            gradeAvg = grades / student.studentGrades.size();
        }
        return gradeAvg;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Bob");
        student1.studentGrades.add(80);
        student1.studentGrades.add(85);
        System.out.println("Student1 Avg Grade: " +Student.getGradeAverage(student1));

        System.out.println("Student1 Grades: ");
        for (int student : student1.studentGrades) {
            System.out.println(student);
        }

        Student student2 = new Student("Cindy");
        student2.addGrade(90);
        student2.addGrade(95);
        System.out.println("Student2 Avg Grade: " +Student.getGradeAverage(student2));

        System.out.println("Student2 Grades: ");
        for (int student : student2.studentGrades) {
            System.out.println(student);
        }

    }

}
