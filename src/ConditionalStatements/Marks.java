package ConditionalStatements;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mark = sc.nextDouble();

        if(mark >= 5.50){
            System.out.println("Excellent!");
        }

    }

}
