package ReverseDecimal;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        solution(n, arr);
    }

    private static void solution(int n, int[] arr) {

        for(int i=0; i<n; i++) {
            int tmp = arr[i];
            int res = 0; // res 에다가 누적 시키는 그림.
            while(tmp > 0) {
                int t = tmp % 10; // 3
                res = res * 10 + t;
                tmp = tmp / 10;
            }
            arr[i] = res;
        }

        for(Integer e: arr) {
            System.out.print(e+" ");
        }
    }
}
