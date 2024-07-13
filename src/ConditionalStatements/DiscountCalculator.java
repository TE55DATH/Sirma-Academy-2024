package ConditionalStatements;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        String membership = sc.next();

        int discount = 0;

        if (age < 18) {
            discount = 10;
        } else if (age <= 64) {
            if (membership.equals("Yes")) {
                discount = 20;
            } else {
                discount = 10;
            }
        } else {
            discount = 30;
        }

        System.out.println(discount + "% discount");
    }
}

