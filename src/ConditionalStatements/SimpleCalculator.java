package ConditionalStatements;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double one = Double.parseDouble(sc.nextLine());
        double two = Double.parseDouble(sc.nextLine());
        String operation = sc.nextLine();

        if(operation.equals("add")){
            System.out.println(one + two);
        }
        if(operation.equals("subtract")){
            System.out.println(one - two);
        }
        if(operation.equals("multiply")){
            System.out.println(one * two);
        }
        if(operation.equals("divide")){
            System.out.println(one / two);
        }

    }

}
