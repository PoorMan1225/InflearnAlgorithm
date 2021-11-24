package ExplainLecture;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ex = sc.nextLine();
        String str = sc.nextLine();
        solution(ex, str);
    }

    private static void solution(String ex, String str) {
        Queue<Character> exq = new LinkedList<>();
        Queue<Character> stq = new LinkedList<>();
        for(char c : ex.toCharArray()) exq.offer(c);
        for(char c : str.toCharArray()) {
            if (exq.contains(c)) stq.offer(c);
        }
        System.out.print(exq.equals(stq) ? "YES" : "NO");
    }
}
