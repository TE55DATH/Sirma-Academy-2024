package ConditionalStatements;

import java.util.Scanner;

public class MakeupShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double renovation = sc.nextDouble();
        int powder = sc.nextInt();
        int lipstick = sc.nextInt();
        int spiral = sc.nextInt();
        int shadows = sc.nextInt();
        int concealer = sc.nextInt();
        double price = (powder * 2.6) + (lipstick * 3) + (spiral * 4.1) + (shadows * 8.2) + (concealer * 2);
        double rent;

        if (powder + lipstick + spiral + shadows+ concealer >= 50) {
            double discount = price / 4;
            price -= discount;
        }

        rent = price / 10;
        price -= rent;

        if(price >= renovation){
            System.out.printf("Yes! %.2f lv left.", price - renovation);
        } else{
            System.out.printf("Not enough money! %.2f lv needed.", renovation - price);
        }
    }

}



