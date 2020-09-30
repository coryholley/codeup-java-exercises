import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //PROBLEM ONE
        String noEducation = "We don't need no eduction \nWe don't need no thought control\n";
        System.out.println(noEducation);

        String quoteWork = "Check \"this\" out!, \"s inside of \"s!\n";
        System.out.println(quoteWork);

        String escapeBackslash = "In windows, the main drive is usually C:\\\n";
        System.out.println(escapeBackslash);

        String escapeBackslashes = "I can do backslashes \\, double backslashes \\\\,\nand the amazing triple backslash \\\\\\!\n";
        System.out.println(escapeBackslashes);

        //PROBLEM TWO

        String choice = "Y";

        do
        {
            System.out.println("Say something to Bob.");
            // Get input from the user
            String userToBob = scanner.nextLine();

            String forQuestion = "Sure.";
            String forExclamation = "Whoa, chill out!";
            String forEmpty = "Fine. Be that way!";
            String everythingElse = "Whatever.";


            if (userToBob.endsWith("?")) {
                System.out.print(forQuestion+ "\n");
            } else if (userToBob.endsWith("!")) {
                System.out.print(forExclamation + "\n");
            } else if (userToBob.equals("")) {
                System.out.print(forEmpty + "\n");
            } else {
                System.out.print(everythingElse + "\n");
            }

            // See if the user wants to continue
            System.out.print("Continue talking with Bob? (y/n): ");
            choice = scanner.next();
            System.out.println();
            scanner.nextLine();

        }
        while (!choice.equalsIgnoreCase("n"));
    }
}
