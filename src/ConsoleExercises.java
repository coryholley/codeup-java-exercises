import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %.2f%n", pi);

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter an integer: ");
//        int userInput = scanner.nextInt();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");

//        System.out.print("Enter three words: ");
//        String wordOne = scanner.next();
//        String wordTwo = scanner.next();
//        String wordThree = scanner.next();
//
//        System.out.println("You entered: --> \"" + wordOne + "\", \"" + wordTwo + "\", \"" + wordThree + "\" <--");

        System.out.println("Enter a sentence: ");
        String userSentence = scanner.nextLine();

        System.out.println("You entered: \"" +userSentence+ "\"");

    }
}
