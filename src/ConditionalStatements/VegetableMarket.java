package ConditionalStatements;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vegetable = sc.nextLine();
        String day = sc.nextLine();
        double quantity = sc.nextDouble();

        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {
            switch (vegetable) {
                case "tomato" -> System.out.printf("%.2f", quantity * 2.5);
                case "onion" -> System.out.printf("%.2f", quantity * 1.2);
                case "lettuce" -> System.out.printf("%.2f", quantity * 0.85);
                case "cucumber" -> System.out.printf("%.2f", quantity * 1.45);
                case "pepper" -> System.out.printf("%.2f", quantity * 5.50);
                default -> System.out.println("Error");
            }
        } else if ("Plovdiv".equals(day)) {
            switch (vegetable) {
                case "tomato" -> System.out.printf("%.2f", quantity * 2.8);
                case "onion" -> System.out.printf("%.2f", quantity * 1.3);
                case "lettuce" -> System.out.printf("%.2f", quantity * 0.85);
                case "cucumber" -> System.out.printf("%.2f", quantity * 1.75);
                case "pepper" -> System.out.printf("%.2f", quantity * 3.50); // that's how it is in the table, maybe it's supposed to be 13.5?
                default -> System.out.println("Error");
            }
        } else
            System.out.println("Error");
        }

    }

