import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String choice = "y";

        do
        {
            // Get input from the user
            System.out.print("Enter an integer: ");
            int integer = scanner.nextInt();

            // Create a header
            String header = "Number | " + "Squared | " + "Cubed   " + "\n"
                    +   "------ | " + "------- | " + "-----   " + "\n";
            System.out.format("%-6s", header);

            int square = 0;
            int cube = 0;

            String row = "";
            String leftAlign = " %-5d | %-7d | %-6d%n";

            for (int i = 1; i <= integer; i++)
            {

                square = i * i;
                cube = i * i * i;

                System.out.format(leftAlign, i, square, cube);
            }

            // See if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = scanner.next();
            System.out.println();

        }
        while (!choice.equalsIgnoreCase("n"));

    }
}


//    Convert given number grades into letter grades.
//
//        Prompt the user for a numerical grade from 0 to 100.
//        Display the corresponding letter grade.
//        Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.
//        Grade Ranges:
//
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0
//        Bonus
//
//        Edit your grade ranges to include pluses and minuses (ex: 99-100 = A+).