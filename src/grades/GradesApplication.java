package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student student3 = new Student("Homer");
        student3.addGrade(50);
        student3.addGrade(60);
        student3.addGrade(55);
        Student student4 = new Student("Bart");
        student4.addGrade(70);
        student4.addGrade(80);
        student4.addGrade(72);
        Student student5 = new Student("Marge");
        student5.addGrade(93);
        student5.addGrade(89);
        student5.addGrade(91);
        Student student6 = new Student("Lisa");
        student6.addGrade(99);
        student6.addGrade(100);
        student6.addGrade(95);

        students.put("codeDuh-er1", student3);
        students.put("eatMyCode2", student4);
        students.put("homieGirl3", student5);
        students.put("straightACode", student6);

        while (true) {
            Input toContinue = new Input();

            System.out.println("Hello! Below is a list of the Github usernames of our students:");
            for (String key : students.keySet()) {
                System.out.println(key);
            }
            String userInput = new Input().getString("Which student would you like to see more information about?");
            if (students.containsKey(userInput)) {
                System.out.println("Student Name: " +students.get(userInput).getStudentNames());
                System.out.println("Github Username: "+userInput);
                System.out.println("Student Grade Avg: " +students.get(userInput).getGradeAverage());
            } else {
                System.out.println("Invalid Username. Please try again.");
            }
            if (!toContinue.yesNo("Would you like to continue?")) {
                break;
            }
        }
    }
}
