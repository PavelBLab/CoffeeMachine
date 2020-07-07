package Projects.CoffeeMachine;

import java.util.Scanner;

class CoffeeMachine {
    public static void main(String[] args) {
        CoffeeMachine wantCoffee = new CoffeeMachine();
        wantCoffee.RunCoffeeMachine();
//        System.out.println(Arrays.toString(CoffeeTypes.values()));
//        System.out.println(CoffeeTypes.valueOf("ESPRESSO").id);
//        wantCoffee.buy(CoffeeTypes.valueOf("ESPRESSO"));
//        System.out.println(CoffeeTypes.values()[0]);

    }


    private int waterTotal = 400;
    private int milkTotal = 540;
    private int coffeeBeansTotal = 120;
    private int cupsTotal = 9;
    private int moneyTotal = 550;


    enum CoffeeTypes {
        ESPRESSO(0, 250, 0, 16, 4),        // predefined instances of the enum class
        DOUBLE_ESPRESSO(1, 250, 0, 25, 6),        // predefined instances of the enum class
        LATTE(2,350, 75, 20, 7),          // predefined instances of the enum class
        CAPPUCCINO(3,200, 100, 12, 6);    // predefined instances of the enum class

        private int id;
        private final int water;
        private final int milk;
        private final int coffeeBeans;
        private final int price;

        CoffeeTypes(int id, int water, int milk, int coffeeBeans, int price) {
            this.id = id;
            this.water = water;
            this.milk = milk;
            this.coffeeBeans = coffeeBeans;
            this.price = price;
        }

    }


    public enum Actions {
        BUY,
        FILL,
        TAKE,
        REMAINING,
        EXIT
    }


    public String enterCommand() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }


    private void buy(CoffeeTypes coffeeTypes) {
        if (this.waterTotal < coffeeTypes.water) {
            System.out.println("Sorry, not enough water!\n");
        } else if (this.milkTotal < coffeeTypes.milk) {
            System.out.println("Sorry, not enough milk!\n");
        } else if (this.coffeeBeansTotal < coffeeTypes.coffeeBeans) {
            System.out.println("Sorry, not enough coffee beans!\n");
        } else if (this.cupsTotal == 0) {
            System.out.println("Sorry, not enough cups!\n");
        } else {
            System.out.println("I have enough resources, making you a coffee!\n" +
                    "Earned $" + coffeeTypes.price);
            this.waterTotal -= coffeeTypes.water;
            this.milkTotal -= coffeeTypes.milk;
            this.coffeeBeansTotal -= coffeeTypes.coffeeBeans;
            this.cupsTotal -= 1;
            this.moneyTotal += coffeeTypes.price;
        }
    }


    private String chooseYourCoffee() {
        String str1 = "\"What do you want to buy? ";
        String str2 = "";
        String str3 = "back - to main menu: ";

        for (int i = 0; i < CoffeeTypes.values().length; i++) {
            str2 += i + " - " + CoffeeTypes.values()[i] + ", ";
        }
        return str1 + str2 + str3;
    }


    private void fill() {
        System.out.println("Write how many ml of water do you want to add: ");
        this.waterTotal += Integer.parseInt(enterCommand());
        System.out.println("Write how many ml of milk do you want to add: ");
        this.milkTotal += Integer.parseInt(enterCommand());
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        this.coffeeBeansTotal += Integer.parseInt(enterCommand());
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        this.cupsTotal += Integer.parseInt(enterCommand());
    }


    private void take() {
        System.out.println("I gave you $" + this.moneyTotal + "\n");
        this.moneyTotal = 0;
    }


    private void remaining() {
        System.out.println("\nThe coffee machine has:\n" +
                waterTotal + " of water\n" +
                milkTotal + " of milk\n" +
                coffeeBeansTotal + " of coffee beans\n" +
                cupsTotal + " of disposable cups\n" +
                moneyTotal + " of money\n");
    }


    public void RunCoffeeMachine() {
        while (true) {
            try {
                System.out.println("Write action (buy, fill, take, remaining, exit): ");
                Actions actions = Actions.valueOf(enterCommand().toUpperCase());

                if (actions == Actions.EXIT) {
                    break;
                }

                switch (actions) {
                    case BUY:
                        System.out.println(chooseYourCoffee());
//                        CoffeeTypes coffeeType = (options.equals("1")) ?
//                                CoffeeTypes.ESPRESSO : (options.equals("2")) ?
//                                CoffeeTypes.LATTE : CoffeeTypes.CAPPUCCINO;
//                        System.out.println(coffeeType);
                        try {
                            buy(CoffeeTypes.values()[Integer.parseInt(enterCommand())]);
                        } catch (Exception e) {
                            System.out.println("Wrong choice.");
                        }
                        break;
                    case FILL:
                        fill();
                        break;
                    case TAKE:
                        take();
                        break;
                    case REMAINING:
                        remaining();
                        break;
                }
            } catch (Exception e) {
                System.out.println("Wrong input. Please try again!\n");
            }
        }
    }
}









