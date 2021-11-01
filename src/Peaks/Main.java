package Peaks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+2][n+2];
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        solution(n, arr);
    }

    private static void solution(int n, int[][] arr) {
        int count = 0;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                if(arr[i][j] > arr[i][j-1]
                        && arr[i][j] > arr[i-1][j]
                        && arr[i][j] > arr[i][j+1]
                        && arr[i][j] > arr[i+1][j]) {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}
