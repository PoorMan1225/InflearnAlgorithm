package SelectionSort;

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
        for(int i=0; i<n; i++) {
            int min = i;
            for(int j=i+1; j<n; j++) {
                if(arr[min] > arr[j]) {
                    min = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }
        for(int e : arr) System.out.print(e + " ");
    }
}
