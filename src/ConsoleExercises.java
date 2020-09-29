import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f%n", pi);

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

//        System.out.print("Enter an integer: ");
//        int userInput = scanner.nextInt();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");

//        System.out.println("Enter three words: ");
//        String wordOne = scanner.next();
//        String wordTwo = scanner.next();
//        String wordThree = scanner.next();
//
//        System.out.printf("The first word entered: %s.%n The second word entered: %s.%n The third word entered: %s.%n", wordOne, wordTwo, wordThree);

//        System.out.println("Enter a sentence: ");
//        String userSentence = scanner.nextLine();
//
//        System.out.println("You entered: \"" +userSentence+ "\"");

        System.out.println("Enter the length, width, and height of the classroom: ");

        String length = scanner.next();
        String width = scanner.next();
        int newLength = parseInt(length);
        int newWidth = parseInt(width);

        float height = scanner.nextFloat();

        float area = newLength * newWidth;
        float perimeter = (2 * newLength) + (2 * newWidth);

        float volume = newLength * height * newWidth;


        System.out.format("The area of the classroom is %f. The perimeter of the classroom is %f. The volume of the classroom is: %f%n", area, perimeter, volume);

//            int length = scanner.nextInt();
//            int width = scanner.nextInt();
//            int height = scanner.nextInt();
//
//            int area = length * width;
//            int perimeter = (2 * length) + (2 * width);
//            int volume = length * height * width;
//
//            System.out.println("The area of the classroom is "+area+".\n The perimeter of the classroom is "+perimeter+".\n The volume of the classroom is "+volume+".");


    }
}
