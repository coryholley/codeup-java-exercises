package OOP;

public class DishTools {

    public static final int AVERAGE_COST_OF_DISH_IN_CENTS = 13000;

    public static void shoutDishName(Dish dishOne) {
        System.out.println(dishOne.nameOfDish.toUpperCase());
    };

    public static void analyzeDishCost(Dish dishOne) {
        if (dishOne.costInCents < AVERAGE_COST_OF_DISH_IN_CENTS) {
            System.out.println("Less expensive than average.");
        } else {
            System.out.println("More expensive than average.");
        }
    };

    public static void flipRecommendation(Dish dishOne) {
        dishOne.wouldRecommend = !dishOne.wouldRecommend;
    };

//        Create a class of static fields (properties and methods) called DishTools
//      - AVERAGE_COST_OF_DISH_IN_CENTS - an integer constant set to 13000 (use the final keyword to make it a constant)
//      - shoutDishName() - that takes in a Dish object and prints out the name in all caps
//      - analyzeDishCost() - that takes in a Dish object and will print out either “More expensive than average” or “Less expensive than average”, depending on the value of the dish costInCents compared to AVERAGE_COST_OF_DISH_IN_CENTS
//      - flipRecommendation() - that takes in a Dish object and reverses the wouldRecommend boolean value
//        Try out the DishTools methods with Dish objects in the DishTest main method (edited)


}
