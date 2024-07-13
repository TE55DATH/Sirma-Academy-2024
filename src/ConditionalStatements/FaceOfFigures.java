package ConditionalStatements;

import java.util.Scanner;

public class FaceOfFigures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String figure = sc.nextLine();
        double area = 0;

        if(figure.equals("square")){
            double a = sc.nextDouble();
            area = a * a;
        } else
            if(figure.equals("rectangle")){
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                area = a * b;
        } else
            if(figure.equals("circle")){
                double r = sc.nextDouble();
                area = r * r * Math.PI;
        } else
            if(figure.equals("triangle")){
                double a = sc.nextDouble();
                double h = sc.nextDouble();
                area = a * h;
        }

        System.out.printf("%.2f\n", area);

    }
}
