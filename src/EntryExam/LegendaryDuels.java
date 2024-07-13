package EntryExam;

import java.util.Scanner;
import java.util.Stack;

public class LegendaryDuels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Stack<Character> stack = new Stack<>();

        if (input.length() % 2 != 0) {
            System.out.println("Not Legendary");
            return;
        }

        for (char c : input.toCharArray()) {
            switch (c) {
                case '(':
                case '{':
                    stack.push(c);
                    break;

                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') {
                        System.out.println("Not Legendary");
                        return;
                    }

                    break;

                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') {
                        System.out.println("Not Legendary");
                        return;
                    }

                    break;

                case '!':
                    if (stack.isEmpty() || stack.peek() != '!') {
                        stack.push(c);
                    } else {
                        stack.pop();
                    }

                    break;
            }
        }

        if (stack.isEmpty()) {
            System.out.println("Legendary");
        } else {
            System.out.println("Not Legendary");
        }

    }
}
