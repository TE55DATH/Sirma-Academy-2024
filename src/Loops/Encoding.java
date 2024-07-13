package Loops;

import java.util.Scanner;

public class Encoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        while (number > 0) {
            int digit = number % 10;
            int asciiCode = digit + 33;

            if (digit == 0) {
                System.out.println("ZERO");
            } else {
                char symbol = (char) asciiCode;
                for (int j = 0; j < digit; j++) {
                    System.out.print(symbol);
                }
                System.out.println();
            }

            number /= 10;
        }
    }
}

