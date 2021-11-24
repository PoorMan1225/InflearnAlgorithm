package PostFix;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String post = sc.nextLine();
        solution(post);
    }

    private static void solution(String post) {
        Stack<Integer> stk = new Stack<>();

        // 조건의 if else 를 반대로 해서 줄일 수 있는 반복
        // 코드도 존재한다.
        /*for(char c : post.toCharArray()) {
            if(c == '+') {
                int a = stk.pop();
                int b = stk.pop();
                stk.push(b + a);
            }else if(c == '-') {
                int a = stk.pop();
                int b = stk.pop();
                stk.push(b - a);
            }else if(c == '*') {
                int a = stk.pop();
                int b = stk.pop();
                stk.push(b * a);
            }else if(c == '/') {
                int a = stk.pop();
                int b = stk.pop();
                stk.push(b / a);
            }else {
                stk.push(c - 48);
            }
        }*/
        for(char c : post.toCharArray()) {
            if(Character.isDigit(c)) {
                stk.push(c - 48);
            }else {
                int a = stk.pop();
                int b = stk.pop();
                if(c=='+') stk.push(b + a);
                else if(c=='-') stk.push(b - a);
                else if(c=='*') stk.push(b * a);
                else stk.push((b / a));
            }
        }
        if(!stk.isEmpty()) System.out.print(stk.pop());
    }
}
