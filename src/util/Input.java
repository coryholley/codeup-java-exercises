package util;
import java.util.Scanner;
import java.util.function.BinaryOperator;

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
//        System.out.println(prompt);
//        return scanner.nextInt();
    try {
        return Integer.valueOf(getString(prompt));
    } catch (NumberFormatException nfe) {
        System.out.println(nfe);
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
//        return scanner.nextDouble();

        try {
            return Double.valueOf(getString(prompt));
        } catch (NumberFormatException nfe) {
            System.out.println(nfe);
            return getDouble(prompt);
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

    public static String toBinaryString(int i){
        return Integer.toBinaryString(i);
    }

    public static String toHexString(int i) {
        return Integer.toHexString(i);
    }

    public static int getBinary(String biString){
        return Integer.valueOf(biString, 2);
    }

    public static int getHex(String hexString){
        return Integer.valueOf(hexString, 16);
    }

    public static void main(String[] args) {
        Input test = new Input();

        int response = test.getInt("Please enter an Integer");
        System.out.println(response);

        double userDouble = test.getDouble("Please enter a double");
        System.out.println(userDouble);

        int l = 10;
        System.out.println("Binary is " + Integer.toBinaryString(l));
        System.out.println("Binary is " + getBinary("111"));

        int x = 12;
        System.out.println("Hexadecimal is " + Integer.toHexString(x));
        System.out.println("Hexadecimal is " + getHex("10"));


    }

}
