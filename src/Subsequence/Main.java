package Subsequence;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 수열 길이
        int m = sc.nextInt(); // 특정 숫자
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        solution(n, m, arr);
    }

    private static void solution(int n, int m, int[] arr) {
        int sum = 0;
        int i=0; int j=0;
        int count = 0;

        while (i<n && j<n) {
            sum += arr[j];
            if(sum > m) {
                sum = 0;
                j=i++;
            }else if(sum == m) {
                sum = 0;
                count++;
                j=i++;
            }
            j++;
        }
        System.out.print(count);
    }
}
