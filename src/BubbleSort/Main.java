package BubbleSort;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        solution(n, arr);
    }

    private static void solution(int n, int[] arr) {
        for(int i=0; i<n-1; i++) {
            for(int j=1; j<n-i; j++) {
                if(arr[n-j] < arr[n-1-j]) {
                    int tmp = arr[n-j];
                    arr[n-j] = arr[n-1-j];
                    arr[n-1-j] = tmp;
                }
            }
        }
        for(int e : arr) System.out.print(e+" ");
    }
}
