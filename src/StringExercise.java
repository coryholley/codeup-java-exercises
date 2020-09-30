import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String noEducation = "We don't need no eduction \nWe don't need no thought control\n";
        System.out.println(noEducation);

        String quoteWork = "Check \"this\" out!, \"s inside of \"s!\n";
        System.out.println(quoteWork);

        String escapeBackslash = "In windows, the main drive is usually C:\\\n";
        System.out.println(escapeBackslash);

        String escapeBackslashes = "I can do backslashes \\, double backslashes \\\\,\nand the amazing triple backslash \\\\\\!\n";
        System.out.println(escapeBackslashes);
    }
}
