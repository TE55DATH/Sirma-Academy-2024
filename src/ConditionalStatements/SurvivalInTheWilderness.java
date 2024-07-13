package ConditionalStatements;

import java.util.Scanner;

public class SurvivalInTheWilderness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String timeOfDay = sc.nextLine();
        String environment = sc.nextLine();
        String item = sc.nextLine();

        String action = "";

        if (timeOfDay.equals("day")) {
            if (environment.equals("forest")) {
                if (item.equals("knife")) {
                    action = "Hunt for food";
                } else if (item.equals("container")) {
                    action = "Collect berries";
                } else {
                    action = "Explore";
                }
            } else if (environment.equals("desert")) {
                if (item.equals("hat")) {
                    action = "Search for water";
                } else {
                    action = "Find shade";
                }
            }
        } else if (timeOfDay.equals("night")) {
            if (environment.equals("forest")) {
                if (item.equals("firestarter")) {
                    action = "Make a campfire";
                } else {
                    action = "Climb a tree for safety";
                }
            } else if (environment.equals("desert")) {
                if (item.equals("blanket")) {
                    action = "Sleep";
                } else {
                    action = "Keep moving to stay warm";
                }
            }
        }

        System.out.println(action);
    }
}