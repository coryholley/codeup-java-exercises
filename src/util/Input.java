package util;
import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString(String prompt) {
        System.out.println(prompt);
//        System.out.println("Please enter a string");
        return this.scanner.nextLine();
    };

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
//        System.out.println("Please enter a yes or no.");
        String response = scanner.next();
        return response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yeah") || response.equalsIgnoreCase("yea");
    };

    public int getInt(String prompt) {
        try {
            return Integer.valueOf(getString(prompt));
        } catch (NumberFormatException nfe) {
             System.err.println(nfe);
             return getInt(prompt);
        }
    };

    public int getInt(int min, int max, String prompt) {
        System.out.println(prompt);
//        System.out.println("Please enter an integer between " +min+ " and the " +max+ ".");
        String answer = scanner.nextLine();
        int response = Integer.parseInt(answer);
            if (response < min || response > max) {
                System.out.println("You did not enter a valid number. Please try again.");
            return getInt(min, max, prompt);
        } else {
            return response;
            }
    };

    public double getDouble(String prompt) {
//        System.out.println(prompt);
        String response = getString(prompt);
        return Double.valueOf(response);
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

    public static void main(String[] args) {
        Input test = new Input();

        int response = test.getInt("Please enter an Integer");
        System.out.println(response);
    }


}
