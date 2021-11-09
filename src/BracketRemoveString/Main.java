package BracketRemoveString;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        solution(str);
    }

    private static void solution(String str) {
        Stack<Character> stk = new Stack<>();
        for(char c: str.toCharArray()) {
            if(c == '(') {
                stk.push(c);
            }else if(c == ')') {
                stk.pop();
            }else {
                if(stk.isEmpty())
                    System.out.print(c);
            }
        }
    }
}
