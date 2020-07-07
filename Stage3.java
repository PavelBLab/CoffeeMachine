package Projects.CoffeeMachine;

import java.util.Scanner;

public class Stage3 {
    public static void main(String[] args) {
        System.out.println("Starting to make a coffee\n" +
                "Grinding coffee beans\n" +
                "Boiling water\n" +
                "Mixing boiled water with crushed coffee beans\n" +
                "Pouring coffee into the cup\n" +
                "Pouring some milk into the cup\n" +
                "Coffee is ready!");

        Scanner scanner = new Scanner(System.in);


        System.out.println("Write how many ml of water the coffee machine has: ");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        int coffeeBeans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int cups = scanner.nextInt();

        // 1 cup = 200 ml of water, 50 ml of milk and 15 g of coffee beans

        int waterRequired = 200;
        int milkRequired = 50;
        int coffeeBeansRequired = 15;


        System.out.println(water / waterRequired + " " + milk / milkRequired + " " + coffeeBeans / coffeeBeansRequired);
        Integer[] ingredients = {water / waterRequired, milk / milkRequired, coffeeBeans / coffeeBeansRequired};
        int maxValue = 0;
        for (int i = 0; i < ingredients.length; i++) {
            if (maxValue < ingredients[i]) {
                maxValue = ingredients[i];
            }
        }
        System.out.println(maxValue);


        int minValue = maxValue;
        for (int i = 0; i < ingredients.length; i++) {
            if (minValue > ingredients[i]) {
                minValue = ingredients[i];
            }
        }
        System.out.println(minValue);

        // Alternative way to find minimum value
        int min = Math.min(ingredients[0], ingredients[1]);
        min = Math.min(ingredients[2], min);
        System.out.println(min);

        // configuration
        if (cups < minValue) {
            System.out.println("Yes, I can make that amount of coffee (and even " + (minValue - cups) + " more than that)");
        } else if (cups > minValue) {
            System.out.println("No, I can make only " + minValue + " cup(s) of coffee");
        } else {
            System.out.println("Yes, I can make that amount of coffee");
        }

    }
}
