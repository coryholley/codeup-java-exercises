import java.util.Scanner;

import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;

//scanner.nextLine(); < when not commenting out previous

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f%n", pi);

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("#"); //Experimenting with #

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

//        System.out.println("Enter the length, width, and height of the classroom: ");
//
//        String userInput = scanner.nextLine();
//        String[] numbers = userInput.split(" ");
//        String stringLength = String.valueOf(numbers[0]);
//        String stringWidth = String.valueOf(numbers[1]);
//        String stringHeight = String.valueOf(numbers[2]);
//
//        int Length = parseInt(stringLength);
//        int Width = parseInt(stringWidth);
//        int Height = parseInt(stringHeight);
//
//        int area = Length * Width;
//        int perimeter = (2 * Length) + (2 * Width);
//        int volume = Length * Height * Width;
//
//
//        System.out.format("The area of the classroom is %d. The perimeter of the classroom is %d. The volume of the classroom is: %d%n", area, perimeter, volume);

//        System.out.println("Enter the length, width, and height of the classroom: ");
//
//        String userInput = scanner.nextLine();
//        String[] numbers = userInput.split(" ");
//        float Length = parseFloat(String.valueOf(numbers[0]));
//        float Width = parseFloat(String.valueOf(numbers[1]));
//        float Height = parseFloat(String.valueOf(numbers[2]));
//
//        float area = Length * Width;
//        float perimeter = (2 * Length) + (2 * Width);
//        float volume = Length * Height * Width;
//
//
//        System.out.format("The area of the classroom is %f. The perimeter of the classroom is %f. The volume of the classroom is: %f%n", area, perimeter, volume);

        System.out.println("Enter the length, width, and height of the classroom: ");

            int length = scanner.nextInt();
            int width = scanner.nextInt();
            int height = scanner.nextInt();

            int area = length * width;
            int perimeter = (2 * length) + (2 * width);
            int volume = length * height * width;

            System.out.println("The area of the classroom is "+area+".\n The perimeter of the classroom is "+perimeter+".\n The volume of the classroom is "+volume+".");
            //changed deliminator to a # to test and enter on one line. must add # at the end before entering. can now enter 34#23#23# enter. Does not work for array method because it is taking it in as one string.
            //have to change to different deliminator for array method.
    }
}
