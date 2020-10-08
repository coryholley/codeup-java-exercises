import java.util.Random;

import util.Input;

public class ServerNameGenerator {

    private static String[] adjectives = {"beautiful", "adorable", "short", "tall", "round", "perfect", "tired", "lazy", "old", "young"};

    private static String[] nouns = {"brother", "sister", "plant", "building", "playground", "kitchen", "store", "street", "park", "home"};

    public static String randomReturn(String[] array) {
        return array[(int) (Math.random() * array.length)];
    }

    public static void main(String[] args) {
        boolean toContinue;

        do {
            System.out.println(randomReturn(adjectives) + "-" + randomReturn(nouns));
            toContinue = new Input().yesNo("Would you like to continue? [y/n]");
        } while (toContinue);
    }
}
