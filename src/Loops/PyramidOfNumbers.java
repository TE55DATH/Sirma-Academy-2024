package Loops;

import java.util.Scanner;

public class PyramidOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int numberInRow = 0;

        for(int i = 1; i <= n; i++){
            System.out.print(i + " ");
            numberInRow ++;
            if(numberInRow == row){
                row++;
                numberInRow = 0;
                System.out.println("");
            }
        }

    }
}
