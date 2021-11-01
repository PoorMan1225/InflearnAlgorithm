package RankCalculation;

import java.util.Scanner;

public class Main {
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
            int count = 1;
            for(int j=0; j<n; j++) {
                if(arr[i] < arr[j]) {
                    count++;
                }
            }
            System.out.print(count+" ");
        }
    }
}
