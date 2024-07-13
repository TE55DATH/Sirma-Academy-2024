package Loops;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lostGames = Integer.parseInt(sc.nextLine());
        double headsetPrice = Double.parseDouble(sc.nextLine());
        double mousePrice = Double.parseDouble(sc.nextLine());
        double keyboardPrice = Double.parseDouble(sc.nextLine());
        double displayPrice = Double.parseDouble(sc.nextLine());

        int trashedHeadsets = 0;
        int trashedMice = 0;
        int trashedKeyboards = 0;
        int trashedDisplays = 0;

        for (int i = 1; i <= lostGames; i++) {
            if (i % 2 == 0) {
                trashedHeadsets++;
            }
            if (i % 3 == 0) {
                trashedMice++;
            }
            if (i % 2 == 0 && i % 3 == 0) {
                trashedKeyboards++;
            }
            if (i % 4 == 0 && i % 3 == 0) {
                trashedDisplays++;
            }
        }

        double totalExpenses = trashedHeadsets * headsetPrice +
                trashedMice * mousePrice +
                trashedKeyboards * keyboardPrice +
                trashedDisplays * displayPrice;

        System.out.printf("Rage expenses: %f lv.", totalExpenses);
    }
}
