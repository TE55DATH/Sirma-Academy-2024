package ConditionalStatements;

import java.util.Scanner;

public class MovieClassification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        String movieCategory;

        if (age < 13) {
            movieCategory = "U-rated movies";
        } else if (age <= 17) {
            movieCategory = "U and PG-13 rated movies";
        } else {
            movieCategory = "All movies";
        }

        System.out.println(movieCategory);
    }
}
