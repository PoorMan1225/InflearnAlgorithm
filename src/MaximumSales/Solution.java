package MaximumSales;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        solution(n, k, arr);
    }

    private static void solution(int n, int k, int[] arr) {
        int sum = 0;
        for(int i=0; i<k; i++) {
            sum += arr[i];
        }

        // 1 2 3 4 5 6 7 8 9 10 12 13
        int max = sum;
        for(int i=k; i<n; i++) {
            sum += arr[i] - arr[i-k];
            max = Math.max(sum, max);
        }
    }
}
