package Loops;

import java.util.Scanner;

public class LettersInWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 5. Each Letter on a new line
        String word = sc.nextLine();
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }

        // 6. Sum of vowels
        word = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < word.length(); i++) {
            switch (word.charAt(i)) {
                case 'a' -> sum += 1;
                case 'e' -> sum += 2;
                case 'i' -> sum += 3;
                case 'o' -> sum += 4;
                case 'u' -> sum += 5;
            }
        }
        System.out.println(sum);

        // 13. Palindrome?
        String str = sc.nextLine();
        int left = 0;
        int right = str.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println(isPalindrome);


        sc.close();
    }
}
