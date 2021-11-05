package Subsequence;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        solution(n, m, arr);
    }

    private static void solution(int n, int m, int[] arr) {
        int lt = 0;
        int sum = 0;
        int count = 0;

        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if (sum == m) count++;
            while (sum >= m) {
                sum = sum - arr[lt++];
                if (sum == m) count++;
            }
        }
        System.out.print(count);
    }
}
