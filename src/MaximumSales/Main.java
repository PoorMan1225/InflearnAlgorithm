package MaximumSales;

import java.util.Scanner;

public class Main {
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
        int max = sum;

        for(int i=1; i<n && i+k<n; i++) {
            sum = sum - arr[i-1] + arr[i+k-1];
            if(max < sum) {
                max = sum;
            }
        }
        System.out.print(max);
    }
}
