package ConditionalStatements;

import java.util.Scanner;

public class AlarmAfter15Minutes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hours = sc.nextInt();
        int minutes = sc.nextInt();
        minutes += 15;
        if(minutes >= 60){
            hours += 1;
            if (hours == 24) hours = 00;
            minutes -= 60;
        }
            System.out.printf("%d : %02d", hours, minutes);


    }
}
