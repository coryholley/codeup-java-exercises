
import util.Input;

import java.lang.reflect.Array;
import java.util.*;

public class GroceryList {
    private final HashMap<String, Integer> groceryItems;
    private String category;
    private String nameOfItem;
    private int numberOfItems;


    public GroceryList(String category) {
        this.category = category;
        groceryItems = new HashMap<>();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getNameOfItem() {
        return nameOfItem;
    }

    public void setItemAndAmount(String nameOfItem, int numberOfItems) {
        this.nameOfItem = nameOfItem;
        this.numberOfItems = numberOfItems;
        this.groceryItems.put(nameOfItem, numberOfItems);
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }


    public static void main(String[] args) {
    String[] categories = {"1. Fruit", "2. Bread", "3. Meat", "4. Vegetables", "5. Pantry", "6. Sweet", "7. Snacks", "8. Frozen"};


        while (true) {
            Input toContinue = new Input();
            Input toCreateList = new Input();
            Input toFinalize = new Input();
            String categoryChoice;
            GroceryList currentGroceryList;
            Input newCategory = new Input();

            if (!toCreateList.yesNo("Hello! Would you like to create a grocery list?")) {
                break;
            } else {
                do {
                    for (String category : categories) {
                        System.out.println(category);
                    }
                    categoryChoice = new Input().getString("Please choose a category by name.");
                    currentGroceryList = new GroceryList(categoryChoice);

                    do {
                        String item = new Input().getString("Please enter the item you wish to add");
                        int howMany = new Input().getInt("Please enter the amount of the items you would like to add");
                        currentGroceryList.setItemAndAmount(item, howMany);

                    } while (!toFinalize.yesNo("Is this the final list for this category?"));

                } while (newCategory.yesNo("Would you like to pick a new category?"));

                System.out.println("Here is your grocery list: ");
                Map<String, Integer> treeMap = new TreeMap<>(currentGroceryList.groceryItems);
                System.out.println(currentGroceryList.getCategory());
                for (String key : treeMap.keySet()) {
                    System.out.println(key + " - " + treeMap.get(key));
                }
            }
                if (!toContinue.yesNo("Would you like to make a new list?")) {
                    break;
                }
            }

        }

    }

