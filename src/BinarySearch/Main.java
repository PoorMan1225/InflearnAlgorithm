package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        solution(n, k, arr);
    }

    private static void solution(int n, int k, int[] arr) {
        Arrays.sort(arr);
        int lt = 0; int rt = n;

        while(lt <= rt) {
            int idx = (lt+rt) / 2;
            if(arr[idx] > k)
                rt = idx - 1;
            else if(arr[idx] < k)
                lt = idx + 1;
            else {
                System.out.println(idx+1);
                break;
            }
        }
    }
}
