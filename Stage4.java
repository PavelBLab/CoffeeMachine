package Projects.CoffeeMachine;

import java.util.Scanner;

public class Stage4 {
    public static void main(String[] args) {
        System.out.println("Starting to make a coffee\n" +
                "Grinding coffee beans\n" +
                "Boiling water\n" +
                "Mixing boiled water with crushed coffee beans\n" +
                "Pouring coffee into the cup\n" +
                "Pouring some milk into the cup\n" +
                "Coffee is ready!");

        Scanner scanner = new Scanner(System.in);

        int water = 400;
        int milk = 540;
        int coffeeBeans = 120;
        int cups = 9;
        int money = 550;

        System.out.println("The coffee machine has:\n" +
                + water + " of water\n" +
                + milk + " of milk\n" +
                + coffeeBeans + " of coffee beans\n" +
                + cups + " of disposable cups\n" +
                + money + " of money\n");

        int waterRequiredForEspresso = 250;
        int milkRequiredForEspresso = 0;
        int coffeeBeansRequiredForEspresso = 16;
        int espressoPrice = 4;

        int waterRequiredForLatte = 350;
        int milkRequiredForLatte = 75;
        int coffeeBeansRequiredForLatte = 20;
        int lattePrice = 7;

        int waterRequiredForCappuccino = 200;
        int milkRequiredForCappuccino = 100;
        int coffeeBeansRequiredForCappuccino = 12;
        int cappuccinoPrice = 6;

        System.out.println("Write action (buy, fill, take): ");
        String action = scanner.next();
        if (action.equals("buy")) {
            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
            String coffeeType = scanner.next();
            if (coffeeType.equals("1")) {
                System.out.println("\nThe coffee machine has:\n" +
                        +(water - waterRequiredForEspresso) + " of water\n" +
                        +(milk - milkRequiredForEspresso) + " of milk\n" +
                        +(coffeeBeans - coffeeBeansRequiredForEspresso) + " of coffee beans\n" +
                        +(cups - 1) + " of disposable cups\n" +
                        +(money + espressoPrice) + " of money");
            } else if (coffeeType.equals("2")) {
                System.out.println("\nThe coffee machine has:\n" +
                        +(water - waterRequiredForLatte) + " of water\n" +
                        +(milk - milkRequiredForLatte) + " of milk\n" +
                        +(coffeeBeans - coffeeBeansRequiredForLatte) + " of coffee beans\n" +
                        +(cups - 1) + " of disposable cups\n" +
                        +(money + lattePrice) + " of money");
            } else if (coffeeType.equals("3")) {
                System.out.println("\nThe coffee machine has:\n" +
                        +(water - waterRequiredForCappuccino) + " of water\n" +
                        +(milk - milkRequiredForCappuccino) + " of milk\n" +
                        +(coffeeBeans - coffeeBeansRequiredForCappuccino) + " of coffee beans\n" +
                        +(cups - 1) + " of disposable cups\n" +
                        +(money + cappuccinoPrice) + " of money");
            }
        } else if (action.equals("fill")) {
            System.out.println("Write how many ml of water do you want to add: ");
            int filledWater = scanner.nextInt();
            System.out.println("Write how many ml of milk do you want to add: ");
            int filledMilk = scanner.nextInt();
            System.out.println("Write how many grams of coffee beans do you want to add: ");
            int filledCoffeeBeans = scanner.nextInt();
            System.out.println("Write how many disposable cups of coffee do you want to add: ");
            int filledCups = scanner.nextInt();
            System.out.println("\nThe coffee machine has:\n" +
                    +(filledWater + water) + " of water\n" +
                    +(filledMilk + milk) + " of milk\n" +
                    +(filledCoffeeBeans + coffeeBeans) + " of coffee beans\n" +
                    +(filledCups + cups) + " of disposable cups\n" +
                    +money + " of money");
        } else if (action.equals("take")) {
            System.out.println("I gave you $" + money + "\n" +
                    " \n" +
                    "The coffee machine has:\n" +
                    +water + " of water\n" +
                    +milk + " of milk\n" +
                    +coffeeBeans + " of coffee beans\n" +
                    +cups + " of disposable cups\n" +
                    +0 + " of money\n");
        }
    }
}
