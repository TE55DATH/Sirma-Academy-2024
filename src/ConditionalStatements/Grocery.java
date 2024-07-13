package ConditionalStatements;

import java.util.Scanner;

public class Grocery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String product = sc.nextLine();
        String city = sc.nextLine();
        double quantity = sc.nextDouble();

        switch (city) {
            case "Sofia":
                switch (product) {
                    case "tea" -> System.out.println(quantity * 0.5);
                    case "water" -> System.out.println(quantity * 0.8);
                    case "juice" -> System.out.println(quantity * 1.20);
                    case "sweets" -> System.out.println(quantity * 1.45);
                    case "chips" -> System.out.println(quantity * 1.60);
                }
                break;

            case "Plovdiv":
                switch (product) {
                    case "tea" -> System.out.println(quantity * 0.4);
                    case "water" -> System.out.println(quantity * 0.7);
                    case "juice" -> System.out.println(quantity * 1.15);
                    case "sweets" -> System.out.println(quantity * 1.3);
                    case "chips" -> System.out.println(quantity * 1.5);
                }
                break;

            case "Varna":
                switch (product) {
                    case "tea" -> System.out.println(quantity * 0.45);
                    case "water" -> System.out.println(quantity * 0.7);
                    case "juice" -> System.out.println(quantity * 1.10);
                    case "sweets" -> System.out.println(quantity * 1.35);
                    case "chips" -> System.out.println(quantity * 1.55);
                }
                break;
        }

    }
}
