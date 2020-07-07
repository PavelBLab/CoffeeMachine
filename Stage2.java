package Projects.CoffeeMachine;

import java.util.Scanner;

public class Stage2 {
    public static void main(String[] args) {
        System.out.println("Starting to make a coffee\n" +
                "Grinding coffee beans\n" +
                "Boiling water\n" +
                "Mixing boiled water with crushed coffee beans\n" +
                "Pouring coffee into the cup\n" +
                "Pouring some milk into the cup\n" +
                "Coffee is ready!");

        Scanner scanner = new Scanner(System.in);

        int cups = scanner.nextInt();
        int water = 200 * cups;
        int milk = 50 * cups;
        int coffeeBeans = 15 * cups;

        System.out.println("For " + cups + " cups of coffee you will need:\n" +
                water + " ml of water\n" +
                milk + " ml of milk\n" +
                coffeeBeans + " g of coffee beans");

    }
}
