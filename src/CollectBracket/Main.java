package CollectBracket;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bracket = sc.nextLine();
        solution(bracket);
    }
    private static void solution(String bracket) {
        Stack<Character> stack = new Stack<>();
        for(char c : bracket.toCharArray()) {
            if(c == '(') {
                stack.push(c);
            }else {
                if(stack.isEmpty()) {
                    System.out.print("NO");
                    return;
                }
                stack.pop();
            }
        }
        if(stack.size() > 0) {
            System.out.print("NO");
            return;
        }
        System.out.print("YES");
    }
}
