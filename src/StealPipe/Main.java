package StealPipe;

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
        int answer = 0;

        for(int i=0; i<str.length(); i++) {
            if (str.charAt(i) == ')') {
                if(str.charAt(i-1) == '(') {
                    stk.pop();
                    answer += stk.size();
                }else {
                    stk.pop();
                    answer += 1;
                }
            }else stk.push(str.charAt(i));
        }
        System.out.print(answer);
    }
}
