package ConditionalStatements;

import java.util.Scanner;

public class AtSea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int days = Integer.parseInt(sc.nextLine());
        String room = sc.nextLine();
        String assessment = sc.nextLine();

        double pricePerNight = 0;
        double discount = 0;
        double totalPrice;

        switch (room) {
            case "single room":
                pricePerNight = 25.00;
                break;
            case "apartment":
                pricePerNight = 50.00;
                break;
            case "presidential":
                pricePerNight = 100.00;
                break;
        }

        if (days < 10) {
            switch (room) {
                case "apartment":
                    discount = 0.30;
                    break;
                case "presidential":
                    discount = 0.10;
                    break;
            }

        } else if (days >= 10 && days <= 15) {
            switch (room) {
                case "apartment":
                    discount = 0.35;
                    break;
                case "presidential":
                    discount = 0.15;
                    break;
            }

        } else {
            switch (room) {
                case "apartment":
                    discount = 0.50;
                    break;
                case "presidential":
                    discount = 0.20;
                    break;
            }

        }

        totalPrice = days * pricePerNight * (1 - discount);

        if (assessment.equals("positive")) {
            totalPrice *= 1.25;
        } else if (assessment.equals("negative")){
            totalPrice *= 0.90;
        }

        System.out.printf("%.2f", totalPrice);
    }
}
