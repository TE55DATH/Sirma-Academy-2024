package ConditionalStatements;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());

        switch(a % 2){
            case 0:
                System.out.println("even");
                break;
            case 1:
                System.out.println("odd");
                break;
        }

    }
}
