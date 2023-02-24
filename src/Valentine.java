import java.util.Scanner;

public class Valentine {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] flowers = {"Ros", "Lilja", "Tulpan", "Orkide", "Svart Ros", "Grön Salladshuvud", "Gul Narciss", "Kompostblommor"};
        int[] price = {50, 40, 30, 60, 80, 10, 20, 10};
        int budget = 100;
        int totalCost = 0;
        while (totalCost < budget) {
            System.out.println("Välj en blomma att köpa:");
            for (int i = 0; i < flowers.length; i++) {
                System.out.println((i+1) + ". " + flowers[i] + " (" + price[i] + " kr)");
            }
            int userChoice = scanner.nextInt();
            int flowerPrice = price[userChoice-1];
            totalCost += flowerPrice;

            // Visa den totala kostnaden efter varje val
            System.out.println("Den totala kostnaden är nu " + totalCost + " kr.");
        }

// När loopen bryts, erbjud kompostblommor för resten av budgeten
        int remainingBudget = budget - totalCost;
        if (remainingBudget > 0) {
            System.out.println("Du har " + remainingBudget + " kr kvar i din budget.");
            System.out.println("Du kan köpa Kompostblommor för " + remainingBudget + " kr.");
        }

// Visa det slutliga valet av blommor och den totala kostnaden
        System.out.println("Du har köpt följande blommor:");
        for (int i = 0; i < flowers.length; i++) {
            if (price[i] <= totalCost) {
                System.out.println(flowers[i]);
            }
        }
        System.out.println("Den totala kostnaden är " + totalCost + " kr.");

// Avsluta programmet
        System.exit(0);
        }
    }


