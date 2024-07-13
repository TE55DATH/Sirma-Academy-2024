package EntryExam;

import java.util.Scanner;

public class CountingOrcs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int h = sc.nextInt();

        int totalKills = n;

        for(int i = 1; i < h; i++){
            totalKills += n + i * m;
        }

        System.out.println(totalKills);

    }
}
