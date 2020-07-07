package Projects.CoffeeMachine;

import java.util.Scanner;

public class Stage5 {
    public static void main(String[] args) {
//        System.out.println("Starting to make a coffee\n" +
//                "Grinding coffee beans\n" +
//                "Boiling water\n" +
//                "Mixing boiled water with crushed coffee beans\n" +
//                "Pouring coffee into the cup\n" +
//                "Pouring some milk into the cup\n" +
//                "Coffee is ready!");

        Scanner scanner = new Scanner(System.in);

        int waterTotal = 400;
        int milkTotal = 540;
        int coffeeBeansTotal = 120;
        int cupsTotal = 9;
        int moneyTotal = 550;

//        System.out.println("\nThe coffee machine has:\n" +
//                waterTotal + " of water\n" +
//                milkTotal + " of milk\n" +
//                coffeeBeansTotal + " of coffee beans\n" +
//                cupsTotal + " of disposable cups\n" +
//                "$" + moneyTotal + " of money\n");

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

        label:
        while(true) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            String action = scanner.next();
            switch (action) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                    String coffeeType = scanner.next();
                    switch (coffeeType) {
                        case "1":
                            if (waterTotal < waterRequiredForEspresso) {
                                System.out.println("Sorry, not enough water!\n");
                            } else if (coffeeBeansTotal < coffeeBeansRequiredForEspresso) {
                                System.out.println("Sorry, not enough coffee beans!\n");
                            } else if (cupsTotal == 0) {
                                System.out.println("Sorry, not enough cups!\n");
                            } else {
                                waterTotal -= waterRequiredForEspresso;
                                milkTotal -= milkRequiredForEspresso;
                                coffeeBeansTotal -= coffeeBeansRequiredForEspresso;
                                cupsTotal -= 1;
                                moneyTotal += espressoPrice;

                                System.out.println("I have enough resources, making you a coffee!\n");
                            }
                            break;
                        case "2":
                            if (waterTotal < waterRequiredForLatte) {
                                System.out.println("Sorry, not enough water!\n");
                            } else if (milkTotal < milkRequiredForLatte) {
                                System.out.println("Sorry, not enough milk!\n");
                            } else if (coffeeBeansTotal < coffeeBeansRequiredForLatte) {
                                System.out.println("Sorry, not enough coffee beans!\n");
                            } else if (cupsTotal == 0) {
                                System.out.println("Sorry, not enough cups!\n");
                            } else {
                                waterTotal -= waterRequiredForLatte;
                                milkTotal -= milkRequiredForLatte;
                                coffeeBeansTotal -= coffeeBeansRequiredForLatte;
                                cupsTotal -= 1;
                                moneyTotal += lattePrice;

                                System.out.println("I have enough resources, making you a coffee!\n");
                            }
                            break;
                        case "3":
                            if (waterTotal < waterRequiredForCappuccino) {
                                System.out.println("Sorry, not enough water!\n");
                            } else if (milkTotal < milkRequiredForCappuccino) {
                                System.out.println("Sorry, not enough milk!\n");
                            } else if (coffeeBeansTotal < coffeeBeansRequiredForCappuccino) {
                                System.out.println("Sorry, not enough coffee beans!\n");
                            } else if (cupsTotal == 0) {
                                System.out.println("Sorry, not enough cups!\n");
                            } else {
                                waterTotal -= waterRequiredForCappuccino;
                                milkTotal -= milkRequiredForCappuccino;
                                coffeeBeansTotal -= coffeeBeansRequiredForCappuccino;
                                cupsTotal -= 1;
                                moneyTotal += cappuccinoPrice;

                                System.out.println("I have enough resources, making you a coffee!\n");
                            }
                            break;
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water do you want to add: ");
                    int filledWater = scanner.nextInt();
                    waterTotal += filledWater;

                    System.out.println("Write how many ml of milk do you want to add: ");
                    int filledMilk = scanner.nextInt();
                    milkTotal += filledMilk;

                    System.out.println("Write how many grams of coffee beans do you want to add: ");
                    int filledCoffeeBeans = scanner.nextInt();
                    coffeeBeansTotal += filledCoffeeBeans;

                    System.out.println("Write how many disposable cups of coffee do you want to add: ");
                    int filledCups = scanner.nextInt();
                    cupsTotal += filledCups;

                    break;
                case "take":
                    System.out.println("I gave you $" + moneyTotal + "\n");
                    moneyTotal = 0;
                    break;
                case "remaining":
                    System.out.println("\nThe coffee machine has:\n" +
                            waterTotal + " of water\n" +
                            milkTotal + " of milk\n" +
                            coffeeBeansTotal + " of coffee beans\n" +
                            cupsTotal + " of disposable cups\n" +
                            moneyTotal + " of money\n");
                    break;
                case "exit":
                    break label;
            }
        }
    }
}
