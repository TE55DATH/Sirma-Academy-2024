package ConditionalStatements;

import java.util.Scanner;

public class Holiday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double budget = sc.nextDouble();
        String season = sc.next();

        System.out.print("Somewhere in ");
        if (budget <= 100) {
            System.out.println("Bulgaria");
            switch (season) {
                case "summer" -> System.out.printf("Camp - %.2f", budget * 0.3);
                case "winter" -> System.out.printf("Hotel - %.2f", budget * 0.7);
            }
        } else if (budget <= 1000) {
            System.out.println("Europe");
            switch (season) {
                case "summer" -> System.out.printf("Camp - %.2f", budget * 0.4);
                case "winter" -> System.out.printf("Hotel - %.2f", budget * 0.8);
            }
        } else {
            System.out.println("Asia");
            System.out.printf("Hotel - %.2f", budget * 0.9);
        }
    }

}



