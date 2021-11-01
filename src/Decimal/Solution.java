package Decimal;

import java.util.Scanner;

/**
 * 에라토스테네스 의 체
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        solution(count);
    }

    private static void solution(int n) {
        int[] arr = new int[n+1];
        int count = 0;

        // 2 -> 0 -> 소수다.
        // n이 100일때 100 까지의 2의 배수는 1로 처리한다.
        // 3 -> 0 -> 소수다.
        // n이 100일때 100 까지의 3의 배수는 1로 처리한다.
        for(int i=2; i<=n; i++) {
            if(arr[i] == 0) {
                count++;
                for(int j=i; j<=n; j+=i) {
                    arr[i] = 1;
                }
            }
        }
    }
}
