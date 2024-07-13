package EntryExam;

import java.util.Objects;
import java.util.Scanner;

public class OrthancArchivesSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] names = input.split(",");
        String search = sc.nextLine();
        int lastfound = 0;
        boolean found = false;

        for(int i = 0; i < names.length; i++){
            String name = names[i].trim();
            if(!found) {
                if (Objects.equals(search, name)) {
                    System.out.println("First Occurrence: " + i);
                    lastfound = i;
                    found = true;
                }
            } else{
                if (Objects.equals(search, name)) {
                    lastfound = i;
                }
            }
        }

        if(!found){
            System.out.println("Record not found");
        } else{
            System.out.println("Last Occurrence: " + lastfound);
        }

    }
}
