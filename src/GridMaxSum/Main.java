package GridMaxSum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        solution(n, arr);
    }

    private static void solution(int n, int[][] arr) {
        int check = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i][i];
        }

        if(check < sum) check = sum;

        sum = 0;
        for (int i = n - 1; i >= 0; i--) {
            sum += arr[i][n-i-1];
        }

        if(check < sum) check = sum;

        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = 0; j < n; j++) {
                sum += arr[i][j];
            }
            if(check < sum) check = sum;

            sum = 0;
            for (int j = 0; j < n; j++) {
                sum += arr[j][i];
            }
            if(check < sum) check = sum;
        }
        System.out.print(check);
    }
}
