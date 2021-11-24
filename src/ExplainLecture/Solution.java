package ExplainLecture;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ex = sc.nextLine();
        String str = sc.nextLine();
        solution(ex, str);
    }

    private static void solution(String ex, String str) {
        Queue<Character> que = new LinkedList<>();
        for(char c : ex.toCharArray()) que.offer(c);
       /* for(char c : str.toCharArray()) {
            if(que.contains(c) && que.peek() == c) que.poll();
            else if(que.contains(c) && que.peek() != c ) {
                System.out.print("NO");
                return;
            }
        }*/
        // 조건 중복 제거.
        for(char c: str.toCharArray()) {
            if(que.contains(c)) {
                if(que.poll() != c) {
                    System.out.print("NO");
                }
            }
        }
        System.out.print(que.isEmpty() ? "YES" : "NO");
    }
}
