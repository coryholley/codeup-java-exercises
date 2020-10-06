package util;

public class InputTest {
    public static void main(String[] args) {
        Input input1 = new Input();

        System.out.println(input1.getString("Please enter a String."));
        System.out.println(input1.yesNo("Please enter a yes or no."));
        System.out.println(input1.getInt("Enter an int"));
        System.out.println(input1.getInt(1,50, "Please enter an integer between 1 and 50."));
        System.out.println(input1.getDouble("Please enter a double"));
        System.out.println(input1.getDouble(1,50, "Please enter an double between 1 and 50."));
    }
}
