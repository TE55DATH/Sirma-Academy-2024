package Loops;

import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = Integer.parseInt(sc.nextLine());
        int end = Integer.parseInt(sc.nextLine());
        int magicNumber = Integer.parseInt(sc.nextLine());
        int combinations = 0;

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                combinations++;
                if (i + j == magicNumber) {
                    System.out.printf("Combination %d - (%d + %d = %d)\n", combinations, i, j, magicNumber);
                    return;
                }
            }
        }

        System.out.printf("%d combinations - neither equals %d\n", combinations, magicNumber);
    }
}
