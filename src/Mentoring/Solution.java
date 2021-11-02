package Mentoring;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int t = sc.nextInt();
        int[][] arr = new int[t][s];
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < s; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        solution(s, t, arr);
    }

    private static void solution(int s, int t, int[][] arr) {
        int answer = 0;

        for (int i = 1; i <= s; i++) {  // 멘토.
            for (int j = 1; j <= s; j++) { // 멘티.
                int count = 0;
                for (int k = 0; k < t; k++) { // 횟수
                    int pi = 0;
                    int pj = 0;
                    for (int n = 0; n < s; n++) {
                        if (arr[k][n] == i)
                            pi = n;
                        if (arr[k][n] == j)
                            pj = n;
                    }
                    if (pi < pj) {
                        count++;
                    }
                }
                if(count == t) {
                    answer++;
                }
            }
        }
        System.out.print(answer);
    }
}
