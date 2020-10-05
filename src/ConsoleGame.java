import java.util.Scanner;
import java.lang.Math;

public class ConsoleGame {


//public static int enemyHealthMeter() {
//
//};
//
//public static int healthMeter() {
//
//};
//    public static int ammoMeter() {
//
//    };

    public static void runGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you ready to start the game? [y/n]");
        String start = scanner.nextLine();
        String choice = "y";

        if (start.equalsIgnoreCase("n")) {
            System.out.println("Until the next adventure, goodbye!");
        } else {
            System.out.println("Please enter your name:");
            String name = scanner.nextLine();
            System.out.println("Hello, " + name + ". You have been chosen to save the world from an alien invasion.\nYour mission is to eliminate the mother ship and any alien that gets in your way.\nMake the right choices and keep your health high and it will lead you to the mother ship.\nMake the wrong choices or let your health get too low and you will be in trouble!\nChoose your weapon: Ray Gun, Flame Thrower, or Fists.");
            String weapon = scanner.nextLine();
            if (weapon.equalsIgnoreCase("Ray Gun")) {
                System.out.println("You have chosen the " + weapon + ". The "+weapon+" is fully charged with 10 power cartridges.\nBe on the lookout for more ammo along the way!\nHint: You might try looking under or behind certain objects.");
            } else if (weapon.equalsIgnoreCase("Flame Thrower")) {
                System.out.println("You have chosen the " + weapon + ". The "+weapon+" is fully charged with 10 fuel cartridges.\nBe on the lookout for more ammo along the way!\nHint: You might try looking under or behind certain objects.");
            } else if (weapon.equalsIgnoreCase("Grenade Launcher")) {
                System.out.println("You have chosen the " + weapon + ". ");
            }
        }
    }

    public static void main(String[] args) {
        runGame();

    }
}
