import java.util.Scanner;

public class Valentine {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] flowers = {"Ros", "Lilja", "Tulpan", "Orkide", "Svart Ros", "Grön Salladshuvud", "Gul Narciss", "Kompostblommor"};
        int[] price = {50, 40, 30, 60, 80, 10, 20, 10};
        int budget = 100;
        int cost = 0;
        while (cost < budget) {
            System.out.println("Välj en blomma att köpa:");
            for (int i = 0; i < flowers.length; i++) {
                System.out.println((i+1) + ". " + flowers[i] + " (" + price[i] + " kr)");
            }
            int userChoice = scanner.nextInt();
        }
    }
}
