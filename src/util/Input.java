package util;
import java.util.Scanner;

public class Input {

    private final Scanner scanner = new Scanner(System.in);

    public String getString(String prompt) {
        System.out.println(prompt);
//        System.out.println("Please enter a string");
        return scanner.nextLine();
    };

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
//        System.out.println("Please enter a yes or no.");
        String response = scanner.next();
        if (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yeah") || response.equalsIgnoreCase("yea")) {
            return true;
        } else {
            return false;
        }
    };

    public int getInt(int min, int max, String prompt) {
        System.out.println(prompt);
//        System.out.println("Please enter an integer between " +min+ " and the " +max+ ".");
        int response = scanner.nextInt();
            if (response < min || response > max) {
                System.out.println("You did not enter a valid number. Please try again.");
            return getInt(min, max, prompt);
        } else {
            return response;
            }
    };

    public double getDouble(int min, int max, String prompt) {
        System.out.println(prompt);
//        System.out.println("Please enter an double between " +min+ " and the " +max+ ".");
        double response = scanner.nextDouble();
        if (response < min || response > max) {
            System.out.println("You did not enter a valid number. Please try again.");
            return getDouble(min, max, prompt);
        } else {
            return response;
        }
    };

}
