package EntryExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class CouncilOfElrondVotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int YCount = 0;
        int NCount = 0;
        String input = sc.nextLine();
        String[] votes = input.split(",");

        for(String vote : votes){
            vote = vote.trim();
            if(Objects.equals(vote, "Yes")){
                YCount++;
            }
            if(Objects.equals(vote, "No")){
                NCount++;
            }
        }
        if(NCount == 0 && YCount == 0){
            System.out.println("Abstain");
            return;
        }

        if(YCount == NCount){
            System.out.println("Tie");
        } else if(YCount > NCount){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
