import java.util.Scanner;
import java.lang.Math;


public class HighLow {

    public static int randomNumber() {
        //Defining method for a random number generator
        int numMin = 1;
        int numMax = 100;
        int range = (numMax - numMin) + 1;
        return (int) (Math.random() * range) + numMin;
    };

    public static void checkNumber (int userNum, int randNum) {
        Scanner scanner = new Scanner(System.in);

        String lessThan = "HIGHER";
        String moreThan = "LOWER";
        String exactNum = "GOOD GUESS!!";

            if (userNum < randNum) {
                System.out.println(lessThan);
                System.out.println("Please guess a number between 1 and 100");
                userNum = scanner.nextInt();
                checkNumber(userNum, randNum);
            } else if (userNum > randNum) {
                System.out.println(moreThan);
                System.out.println("Please guess a number between 1 and 100");
                userNum = scanner.nextInt();
                checkNumber(userNum, randNum);
            } else {
                System.out.println(exactNum);
                System.out.println("Would you like to play again? [y/n]");
                String playAgain = scanner.next();
                if (playAgain.equalsIgnoreCase("y")) {
                    guessNumber();
                }
            }
    }


        public static void guessNumber() {
            int randomNum = randomNumber();
//            System.out.println(randomNum);
            Scanner scanner = new Scanner(System.in);

            System.out.println("Please guess a number between 1 and 100");
//            int userNum = scanner.nextInt();
            String userNum = scanner.nextLine();
//            int intNum = Integer.parseInt(userNum);

            if (userNum.trim().equals("")) {
                System.out.println("Not a valid entry.");
                guessNumber();
            } else if (Integer.parseInt(userNum) <= 100 && Integer.parseInt(userNum) >= 1) {
                checkNumber(Integer.parseInt(userNum), randomNum);
            } else {
                guessNumber();
            }
        }


    public static void main(String[] args) {
        guessNumber();
    }
}
