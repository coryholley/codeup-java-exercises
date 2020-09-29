import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %.2f%n", pi);

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

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

//        System.out.println("Enter a sentence: ");
//        String userSentence = scanner.nextLine();
//
//        System.out.println("You entered: \"" +userSentence+ "\"");

        System.out.println("Enter the length, width, and height of the classroom: ");

//        float length = scanner.nextFloat();
//        float width = scanner.nextFloat();
//        float height = scanner.nextFloat();
//
//        float area = length * width;
//        float perimeter = (2 * length) + (2 * width);
//
//        float volume = length * height * width;
//
//
//        System.out.format("The area of the classroom is %f. The perimeter of the classroom is %f. The volume of the classroom is: %f%n", area, perimeter, volume);

            int length = scanner.nextInt();
            int width = scanner.nextInt();
            int height = scanner.nextInt();

            int area = length * width;
            int perimeter = (2 * length) + (2 * width);
            int volume = length * height * width;

            System.out.println("The area of the classroom is "+area+".\n The perimeter of the classroom is "+perimeter+".\n The volume of the classroom is "+volume+".");


    }
}
