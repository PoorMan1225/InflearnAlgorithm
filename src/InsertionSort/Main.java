package InsertionSort;

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
        for(int i=1; i<n-1; i++) {
            int tmp = arr[i];
            int j;

            for(j=i-1; j>=0; j--) {
                if(arr[j] > tmp) {
                   arr[j+1] = arr[j];
                }else
                    break;
            }
            arr[j+1] = tmp;
        }
        for(int e : arr) System.out.print(e + " ");
    }
}
