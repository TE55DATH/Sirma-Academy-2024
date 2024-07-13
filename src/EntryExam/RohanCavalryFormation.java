package EntryExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RohanCavalryFormation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        List<String> cavalryFormation = new ArrayList<>(List.of(input.split(",")));

        for(int i = 0; i < cavalryFormation.size(); i++ ){
            cavalryFormation.set(i, cavalryFormation.get(i).trim());
        }

        while (true) {
            String command = sc.nextLine();
            String[] commandParts = command.split(" ");

            switch(commandParts[0]){
                case "destroy":
                    int destroying = Integer.parseInt(commandParts[1]);
                    if(destroying >= 0 && destroying < cavalryFormation.size()){
                        cavalryFormation.remove(destroying);
                        String newFormation = String.join(" ", cavalryFormation);
                        System.out.println(newFormation);
                    } else{
                        break;
                    }
                    break;

                case "swap":
                    int index1 = Integer.parseInt(commandParts[1]);
                    int index2 = Integer.parseInt(commandParts[2]);
                    if(index1 == index2) break;
                    if(index1 >= 0 && index1 < cavalryFormation.size() &&index2 >= 0 && index2 < cavalryFormation.size()) {
                        String temp = cavalryFormation.get(index1);
                        cavalryFormation.set(index1, cavalryFormation.get(index2));
                        cavalryFormation.set(index2, temp);
                        String newFormation = String.join(" ", cavalryFormation);
                        System.out.println(newFormation);
                    } else{
                        break;
                    }
                    break;

                case "add":
                    cavalryFormation.add(commandParts[1]);
                    String newFormation = String.join(" ", cavalryFormation);
                    System.out.println(newFormation);
                    break;

                case "insert":
                    int index = Integer.parseInt(commandParts[2]);
                    if(index >= 0 && index <= cavalryFormation.size()){
                        cavalryFormation.add("couldn'tThinkOfAName");
                        for(int i = cavalryFormation.size() - 2; i >= index; i--){
                            cavalryFormation.set(i + 1, cavalryFormation.get(i));
                        }
                        cavalryFormation.set(index, commandParts[1]);
                        newFormation = String.join(" ", cavalryFormation);
                        System.out.println(newFormation);
                    } else {
                        break;
                    }
                    break;
                case "center":
                    if(cavalryFormation.size() % 2 == 0){
                        for(int i = 0; i < cavalryFormation.size(); i++){
                            if(i == cavalryFormation.size() - 2 - i){
                                System.out.println(cavalryFormation.get(i) + " " + cavalryFormation.get(i + 1));
                                break;
                            }
                        }
                    } else{
                        for(int i = 0; i < cavalryFormation.size(); i++){
                            if(i == cavalryFormation.size() - 1 - i){
                                System.out.println(cavalryFormation.get(i));
                                break;
                            }
                        }
                    }
                    break;

                case "end": return;
            }


        }

    }
}
