import java.util.Scanner;

public class JavaPractice {

//    1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
//    Expected Output :
//    Hello
//    Alexandra Abramov

//    2. Write a Java program to print the sum of two numbers.
//    Test Data:
//            74 + 36
//    Expected Output :
//            110

    public static int getSum() {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Input the first number:");
        int num1 = scanner.nextInt();
        System.out.println("Input the second number:");
        int num2 = scanner.nextInt();
        return num1 + num2;
    };

//    3. Write a Java program to divide two numbers and print on the screen.
//    Test Data :
//            50/3
//    Expected Output :
//            16

    public static int divide() {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Input the first number:");
        int num1 = scanner.nextInt();
        System.out.println("Input the second number:");
        int num2 = scanner.nextInt();
        return num1 / num2;
    }

//    4. Write a Java program to print the result of the following operations.
//    Test Data:
//    a. -5 + 8 * 6
//            b. (55+9) % 9
//    c. 20 + -3*5 / 8
//    d. 5 + 15 / 3 * 2 - 8 % 3
//    Expected Output :
//            43
//            1
//            19
//            13

    public static int a = -5+8*6;
    public static int b = (55+9)%9;
    public static int c = 20+-3*5/8;
    public static int d = 5+15/3*2-8%3;

//    5. Write a Java program that takes two numbers as input and display the product of two numbers.
//    Test Data:
//    Input first number: 25
//    Input second number: 5
//    Expected Output :
//            25 x 5 = 125

    public static int getProduct() {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Input the first number:");
        int num1 = scanner.nextInt();
        System.out.println("Input the second number:");
        int num2 = scanner.nextInt();
        return num1 * num2;
    };

//    6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
//    Test Data:
//    Input first number: 125
//    Input second number: 24
//    Expected Output :
//            125 + 24 = 149
//            125 - 24 = 101
//            125 x 24 = 3000
//            125 / 24 = 5
//            125 mod 24 = 5

//    public static int getFormulaResults() {
//        int num1 = 125;
//        int num2 = 24;
//
//
//    }


    public static void main(String[] args) {
//        Scanner scanner = new Scanner (System.in);
//        //1.
//        System.out.print("Hello\nAlexandra Abramov!\n");
//        //2.
//        int sum = getSum();
//        System.out.println("The sum is: "+sum);
//        //3.
//        int divide = divide();
//        System.out.println("The result is: "+divide);
//        //4.
//        System.out.print(a+"\n"+b+"\n"+c+"\n"+d+"\n");
        //5.
        int product = getProduct();
        System.out.println("The result is: " +product);

    }
}
