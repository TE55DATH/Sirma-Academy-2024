package ConditionalStatements;

import java.util.Scanner;

public class ClimateZoneIdentifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double latitude = sc.nextDouble();
        double absLatitude = Math.abs(latitude);

        String hemisphere = sc.next().toUpperCase();
        String climateZone;

        if (absLatitude == 0) {
            climateZone = "Equator";
        } else if (absLatitude > 66.5) {
            climateZone = "Arctic Zone";
        } else if (absLatitude > 23.5) {
            climateZone = "Temperate Zone";
        } else {
            climateZone = "Tropic Zone";
        }


        System.out.println(climateZone);
    }
}
