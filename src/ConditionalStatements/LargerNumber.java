package ConditionalStatements;

import java.util.Scanner;

public class LargerNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int one = Integer.parseInt(sc.nextLine());
        int two = Integer.parseInt(sc.nextLine());
        if(one > two){
            System.out.println(one);
        }
        if(two > one){
            System.out.println(two);
        }

    }

}

