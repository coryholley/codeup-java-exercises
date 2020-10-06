package shapes;

import util.Input;

public class CircleApp {

    private static int counter = 0;

    public static int countGetter() {
        return counter;
    };

    public static void countSetter() {
        counter = counter+1;
    };

    public static void main(String[] args) {

        Input userRadius = new Input();

        while (true) {
            Circle newCircle = new Circle(userRadius.getDouble(1, 100, "Enter radius 1-100: "));
            countSetter();
            System.out.println("The area of the circle is: " + newCircle.getArea());
            System.out.println("The circumference of the circle is: " + newCircle.getCircumference());
            if (!userRadius.yesNo("Would you like to continue?")) {
                System.out.println("You made "+countGetter()+" circles.");
                break;
            }
        }

    }
}
