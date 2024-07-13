package EntryExam;

import java.util.Scanner;

public class ElvishCodeCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();
        int n = sc.nextInt();
        String decipheredMessage = "";

        for (int i = 0; i < message.length(); i++) {
            decipheredMessage += (char) (message.charAt(i) - n);
        }

        System.out.print(decipheredMessage);
    }
}
