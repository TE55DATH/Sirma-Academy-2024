package ConditionalStatements;

import java.util.Scanner;

public class UniversityAdmissions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();
        int extracurriculars = sc.nextInt();

        if (score >= 90) {
            System.out.println("Admitted");
        } else if (score >= 80 && extracurriculars >= 2) {
            System.out.println("Admitted");
        } else {
            System.out.println("Not admitted");
        }
    }
}
