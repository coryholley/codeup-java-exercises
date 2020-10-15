public class ExceptionsPractice {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};

        try {
            System.out.println(numbers[4]);
        } catch (Exception ex) {
            System.out.println(ex);
        }


//        if (numbers.length < 2 == false) {
//            throw new IllegalArgumentException("Error");
//        }

        try {
            int sum1 = 4+3;
            System.out.println(sum1);
            int sum2 = 2 / 0;
        } catch (ArithmeticException are) {
            System.out.println(are.getMessage());
            System.out.println(are);
        }
        System.out.println("Reached end successfully");

        }
    }

