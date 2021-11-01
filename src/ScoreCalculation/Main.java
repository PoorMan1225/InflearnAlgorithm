package ScoreCalculation;

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
        int count = 0;
        int sum = 0;

        for(int i=0; i<n; i++) {
            count = arr[i] == 1 ? count+1 : 0;
            sum += count;
        }
        System.out.print(sum);
    }
}
