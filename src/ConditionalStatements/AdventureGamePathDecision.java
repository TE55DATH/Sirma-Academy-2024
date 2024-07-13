package ConditionalStatements;

import java.util.Scanner;

public class AdventureGamePathDecision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String rightHandTool = sc.nextLine();
        String leftHandTool = sc.nextLine();

        String path;

        if (rightHandTool.equals("sword")) {
            if (leftHandTool.equals("shield")) {
                path = "Path to the castle";
            } else {
                path = "Path to the forest";
            }
        } else if (rightHandTool.equals("map")) {
            if (leftHandTool.equals("coins")) {
                path = "Go to the town";
            } else {
                path = "Camp";
            }
        } else {
            path = "Wander aimlessly";
        }

        System.out.println(path);
    }
}