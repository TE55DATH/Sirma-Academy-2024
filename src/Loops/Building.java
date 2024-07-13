package Loops;

import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 17. New Building
        int floors = sc.nextInt();
        int rooms = sc.nextInt();

        for (int i = floors; i >= 1; i--) {
            if (i == floors) {
                for (int j = 0; j < rooms; j++) {
                    System.out.print("L" + i + j + " ");
                }

                System.out.println();
            } else if (i % 2 == 0) {
                for (int j = 0; j < rooms; j++) {
                    System.out.print("O" + i + j + " ");
                }

                System.out.println();
            } else {
                for (int j = 0; j < rooms; j++) {
                    System.out.print("A" + i + j + " ");
                }

                System.out.println();
            }
        }

    }
}
