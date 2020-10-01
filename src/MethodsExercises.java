import java.util.Scanner;

public class MethodsExercises {

    public static long getPower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return base;
        } else if (exponent == 2) {
            return base * base;
        }
        return base * getPower(base, exponent - 1);
    }

    public static long addition(long base, long add) {
        return base + add;
    }

    public static long subtraction(long base, long sub) {
        return base - sub;
    }

//    public static long multiplication(long base, long mult) {
//        return base * mult;
//    }

    public static long multiplication(long base, long mult) {
        long result = 0;
        for (long i = 1; i <= mult; i++) {
            result = result + base;
        }
        return result;
    }

    public static long division(long base, long divis) {
        return base / divis;
    }

    public static long modulus(long base, long mod) {
        return base % mod;
    }


    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(getPower(2,4));

        System.out.println(addition(5,5));
        System.out.println(subtraction(20, 10));
        System.out.println(multiplication(20,6));
        System.out.println(division(20,2));
        System.out.println(modulus(3,2));



    }
}
