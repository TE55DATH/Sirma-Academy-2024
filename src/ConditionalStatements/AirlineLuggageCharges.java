package ConditionalStatements;

import java.util.Scanner;

public class AirlineLuggageCharges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int weight = sc.nextInt();
        int dimensionsSum = sc.nextInt();

        int totalFee = 0;

        if (weight > 50) {
            totalFee += 100;
        }

        if (dimensionsSum > 158) {
            int oversizeExcess = dimensionsSum - 158;
            if (oversizeExcess <= 20) {
                totalFee += 50;
            } else if (oversizeExcess <= 50) {
                totalFee += 100;
            } else {
                totalFee += 200;
            }
        }

        if (weight > 50 && dimensionsSum > 158) {
            totalFee += 50;
        }

        System.out.println("$" + totalFee);
    }
}
