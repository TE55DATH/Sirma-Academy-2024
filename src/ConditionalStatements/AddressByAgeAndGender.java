package ConditionalStatements;

import java.util.Scanner;

public class AddressByAgeAndGender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String gender = sc.nextLine();

        if(age >= 16){
           if(gender.equals("m")){
               System.out.println("Mr.");
           } else if(gender.equals("f")){
               System.out.println("Ms.");
            }

        } else {
            if(gender.equals("m")){
                System.out.println("Master");
            } else if(gender.equals("f")){
                System.out.println("Miss");
            }

        }

    }
}
