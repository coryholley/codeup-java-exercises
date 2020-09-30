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


//    What number would you like to go up to? 5
//
//        Here is your table!
//
//        number | squared | cubed
//        ------ | ------- | -----
//        1      | 1       | 1
//        2      | 4       | 8
//        3      | 9       | 27
//        4      | 16      | 64
//        5      | 25      | 125