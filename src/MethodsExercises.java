import java.util.Scanner;

public class MethodsExercises {

//    public static long getPower(int base, int exponent) {
//        if (exponent == 0) {
//            return 1;
//        } else if (exponent == 1) {
//            return base;
//        } else if (exponent == 2) {
//            return base * base;
//        }
//        return base * getPower(base, exponent - 1);
//    }
//
//    public static long addition(long base, long add) {
//        return base + add;
//    }
//
//    public static long subtraction(long base, long sub) {
//        return base - sub;
//    }

//    public static long multiplication(long base, long mult) {
//        return base * mult;
//    }

//    public static long multiplication(long base, long mult) {
//        long result = 0;
//        for (long i = 1; i <= mult; i++) {
//            result = result + base;
//        }
//        return result;
//    }

//    public static long multiplication(long base, long mult) {
//            if (mult == 0) {
//                return 0;
//            } else if (mult == 1) {
//                return base;
//            } else if (mult == 2) {
//                return base + base;
//            }
//            return base + multiplication(base, mult - 1);
//    }
//
//    public static long division(long base, long divis) {
//        return base / divis;
//    }
//
//    public static long modulus(long base, long mod) {
//        return base % mod;
//    }

//    public static int getInteger(int min, int max) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number between 1 and 10: \n");
//        int userInput = scanner.nextInt();
//
//        if (userInput < min || userInput > max) {
//            return userInput = getInteger(1,10);
//        } else {
//            return userInput;
//        }
//    };

    public static long enterInteger () {

        String choice = "Y";
        long factorial = 0;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter an integer between 1-10.");
            int userInput = scanner.nextInt();

            if (userInput >= 1 && userInput <= 10) {
                factorial = 1;
                for (long i = 1; i <= userInput; i++) {
                    factorial = factorial * i;
                }
                System.out.println(factorial);
                System.out.print("Would you like to continue? (y/n): ");
                choice = scanner.next();
                System.out.println();
            } else {
               return enterInteger();
            }


        } while (!choice.equalsIgnoreCase("n"));
        return factorial;
    };


    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println(getPower(2,4));
//
//        System.out.println(addition(5,5));
//        System.out.println(subtraction(20, 10));
//        System.out.println(multiplication(20,6));
//        System.out.println(division(20,2));
//        System.out.println(modulus(3,2));

//        System.out.print(getInteger(1, 10));

//        int userInput = getInteger(1, 10);
//        System.out.println(userInput);

        long factorial = enterInteger();
        System.out.println(factorial);


    }
}
