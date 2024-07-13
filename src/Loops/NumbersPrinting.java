package Loops;

import java.util.Scanner;

public class NumbersPrinting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1. Numbers from 1 to 100
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        // 2. Numbers N to 0 in reverse order
        int n = sc.nextInt();
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }

        // 3. Numbers 1 to N through 2
        n = sc.nextInt();
        for (int i = 1; i <= n; i += 2) {
            System.out.println(i);
        }

        // 4. Numbers 1 to N through M
        int n2 = sc.nextInt();
        int m2 = sc.nextInt();
        for (int i = 1; i <= n2; i += m2) {
            System.out.println(i);
        }

        // 8. Multiplication table
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }

        // 9. Sum of even numbers
        n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += 2 * i;
        }

        System.out.println(sum);

        // 10. Factorial
        n = sc.nextInt();
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println(factorial);

        // 11. Reverse number
        n = sc.nextInt();
        int reversedN = 0;

        while (n != 0) {
            reversedN = reversedN * 10 + (n % 10);
            n /= 10;
        }

        System.out.println(reversedN);

        // 12. Fibonacci Sequence Sum
        n = sc.nextInt();

        int fib1 = 0, fib2 = 1, sumf = 1;

        for (int i = 2; i <= n; i++) {
            int currentfib = fib1 + fib2;
            fib1 = fib2;
            fib2 = currentfib;
            sumf += currentfib;
        }

        System.out.println(sumf);

        // 14. Armstrong number?
        n = sc.nextInt();
        int originalNumber = n;
        int numDigits = String.valueOf(n).length();
        sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, numDigits);
            n /= 10;
        }

        System.out.println(sum == originalNumber);

        // 15. CollatzConjecture
        n = sc.nextInt();

        while (n != 1) {
            System.out.print(n + " ");
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
        }
        System.out.println(n);

        // 16. Hollow rectangle pattern
        n = sc.nextInt(); // Number of rows
        int m = sc.nextInt(); // Number of columns

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // 21. Refactor Sum of Odd Numbers
        n = Integer.parseInt(sc.nextLine());
        sum = 0; // Initialize sum to 0
        for (int i = 0; i < n; i++) { // Change condition to i < n
            int oddNumber = 2 * i + 1;
            System.out.println(oddNumber);
            sum += oddNumber;
        }
        System.out.println("Sum: " + sum);

        // 22. 7 - 997
        for (int i = 7; i <= 1000; i += 10) {
            System.out.println(i);
        }

        // 23. n - 99n
        n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= 1000; i++) {
            if (i % 10 == n) {
                System.out.println(i);
            }
        }

        // 25. Coins and notes
        int oneLvCount = sc.nextInt();
        int twoLvCount = sc.nextInt();
        int fiveLvCount = sc.nextInt();
        int targetSum = sc.nextInt();

        for (int i = 0; i <= oneLvCount; i++) {
            for (int j = 0; j <= twoLvCount; j++) {
                for (int k = 0; k <= fiveLvCount; k++) {
                    sum = i + j * 2 + k * 5;
                    if (sum == targetSum) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n", i, j, k, targetSum);
                    }
                }
            }
        }

        // 26. Even Pairs
        int initialFirstPair = sc.nextInt();
        int initialSecondPair = sc.nextInt();
        int diffFirstPair = sc.nextInt();
        int diffSecondPair = sc.nextInt();
        int finalFirstPair = initialFirstPair + diffFirstPair;
        int finalSecondPair = initialSecondPair + diffSecondPair;

        for (int firstPair = initialFirstPair; firstPair <= finalFirstPair; firstPair++) {
            boolean isFirstPairPrime = true;
            if (firstPair < 2) {
                isFirstPairPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(firstPair); i++) {
                    if (firstPair % i == 0) {
                        isFirstPairPrime = false;
                        break;
                    }
                }
            }

            if (isFirstPairPrime) {
                for (int secondPair = initialSecondPair; secondPair <= finalSecondPair; secondPair++) {
                    boolean isSecondPairPrime = true;
                    if (secondPair < 2) {
                        isSecondPairPrime = false;
                    } else {
                        for (int i = 2; i <= Math.sqrt(secondPair); i++) {
                            if (secondPair % i == 0) {
                                isSecondPairPrime = false;
                                break;
                            }
                        }
                    }

                    if (isSecondPairPrime) {
                        System.out.printf("%d%d\n", firstPair, secondPair);
                    }
                }
            }
        }

        // 29. Unique codes
        int n1 = sc.nextInt();
        n2 = sc.nextInt();
        int n3 = sc.nextInt();

        for(int i = 1; i <= n1; i++){
            if(i % 2 == 0) {
                for (int j = 1; j <= n2; j++) {
                    if (j == 2 || j == 3 ||j == 5 || j ==7){
                        for (int k = 1; k <= n3; k++) {
                            if (k % 2 == 0) {
                                System.out.println(i + " " + j + " " + k);
                            }
                        }
                    }
                }
            }
        }

        // 30. Square of Asterisks
        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j ++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // 31. Half-Rhombus from asterisks
        n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for (int j = 0; j < i; j ++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = n; i >= 1; i--){
            for (int j = i - 1; j > 0; j --){
                System.out.print("* ");
            }
            System.out.println();
        }

        // 32. Rhombus from asterisks
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 33. Tree Pattern
         n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int j = 0; j < n - 1; j++) {
            System.out.print(" ");
        }
        System.out.println("*");

        // 34. Square frame
        n = sc.nextInt();

        System.out.print("+");
        for (int i = 0; i < n - 2; i++) {
            System.out.print(" -");
        }
        System.out.println(" +");

        for (int i = 0; i < n - 2; i++) {
            System.out.print("|");
            for (int j = 0; j < n - 2; j++) {
                System.out.print(" -");
            }
            System.out.println(" |");
        }

        System.out.print("+");
        for (int i = 0; i < n - 2; i++) {
            System.out.print(" -");
        }
        System.out.println(" +");

        // 35. Christmas Tree
        n = sc.nextInt();

        for (int i = 0; i < n + 1; i++) {
            System.out.print(" ");
        }
        System.out.println("|");

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print(" | ");
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 36. Sunglasses
        n = sc.nextInt();

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

    }
}
