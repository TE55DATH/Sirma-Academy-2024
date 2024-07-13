package Loops;

import java.util.Scanner;

public class StarWarsThing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double money = Double.parseDouble(sc.nextLine());
        int studentsCount = Integer.parseInt(sc.nextLine());
        double sabresPrice = Double.parseDouble(sc.nextLine());
        double robesPrice = Double.parseDouble(sc.nextLine());
        double beltsPrice = Double.parseDouble(sc.nextLine());
        double totalSabresPrice = 0;
        double totalRobesPrice = 0;
        double totalBeltsPrice = 0;
        int freeBelts = studentsCount / 6;

        for (int i = 0; i < studentsCount + studentsCount / 10; i++) {
            totalSabresPrice += sabresPrice;
        }

        for (int i = 0; i < studentsCount; i++) {
            totalRobesPrice += robesPrice;
        }

        for (int i = 0; i < studentsCount - freeBelts; i++) {
            totalBeltsPrice += beltsPrice;
        }

        double totalCost = totalSabresPrice + totalRobesPrice + totalBeltsPrice;
        if (totalCost <= money) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalCost);
        } else {
            double neededMoney = totalCost - money;
            System.out.printf("George Lucas will need %.2flv more.", neededMoney);
        }
    }
}
