package Loops;

import java.util.Scanner;

public class Rhombus {
//Important: I used this file to test programs before putting them all in NumbersPrinting back when we could put only 10 files in the homework
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int width = 5 * n;
        int lensWidth = (width - (n + 4)) / 2;

        // Top frame
        for (int i = 0; i < n * 2; i++) {
            System.out.print("*");
        }

        for (int i = 0; i < n; i++) {
            System.out.print(" ");
        }

        for (int i = 0; i < n * 2; i++) {
            System.out.print("*");
        }

        System.out.println();

        // Middle part
        for (int i = 0; i < n - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < lensWidth; j++) {
                System.out.print("/");
            }

            System.out.print("*");
            if(n % 2 == 0) {
                if (i + 1 == (n - 2) / 2) {
                    for (int j = 0; j < n; j++) {
                        System.out.print("|");
                    }
                } else {
                    for (int j = 0; j < n; j++) {
                        System.out.print(" ");
                    }
                }
            } else {
                if (i == (n - 2) / 2) {
                    for (int j = 0; j < n; j++) {
                        System.out.print("|");
                    }
                } else {
                    for (int j = 0; j < n; j++) {
                        System.out.print(" ");
                    }
                }
            }
            System.out.print("*");
            for (int j = 0; j < lensWidth; j++) {
                System.out.print("/");
            }
            System.out.print("*");

            System.out.println();
        }

        // Bottom frame
        for (int i = 0; i < n * 2; i++) {
            System.out.print("*");
        }

        for (int i = 0; i < n; i++) {
            System.out.print(" ");
        }

        for (int i = 0; i < n * 2; i++) {
            System.out.print("*");
        }

        System.out.println();

        sc.close();
    }
}
