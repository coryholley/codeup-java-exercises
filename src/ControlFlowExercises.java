import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String choice = "y";

        do
        {
            // Get input from the user
            System.out.print("Enter a numerical grade from 0-100.\n");
            int userInt = scanner.nextInt();

            //Grade Ranges

            String APlus = "A+: 100-95";
            String AMinus = "A-: 94-88";
            String BPlus = "B+: 87-85";
            String BMinus = "B-: 84-80";
            String CPlus = "C+: 79-75";
            String CMinus = "C-: 74-67";
            String DPlus = "D+: 66-63";
            String DMinus = "D-: 62-60";
            String FPlus = "F+: 59-30";
            String FMinus = "F-: 29-0";

            if (userInt <= 100 && userInt >= 95) {
                System.out.print(APlus+ "\n");
            } else if (userInt <= 94 && userInt >= 88) {
                System.out.print(AMinus + "\n");
            } else if (userInt <= 87 && userInt >= 85) {
                System.out.print(BPlus + "\n");
            } else if (userInt <= 84 && userInt >= 80) {
                System.out.print(BMinus + "\n");
            } else if (userInt <= 79 && userInt >= 75){
                System.out.print(CPlus + "\n");
            } else if (userInt <= 74 && userInt >= 67){
                System.out.print(CMinus + "\n");
            } else if (userInt <= 66 && userInt >= 63){
                System.out.print(DPlus + "\n");
            } else if (userInt <= 62 && userInt >= 60){
                System.out.print(DMinus + "\n");
            } else if (userInt <= 59 && userInt >= 30){
                System.out.print(FPlus + "\n");
            } else {
                System.out.print(FMinus + "\n");
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