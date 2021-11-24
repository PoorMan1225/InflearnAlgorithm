package TroubleMaker;

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
        int[] result = new int[2];
        int idx = 0;
        for(int i=1; i<n; i++) {
            if(arr[i-1] > arr[i])
                result[idx++] = i;
        }
        result[1] += 1;
        if(idx == 1) {
            int min = Integer.MAX_VALUE;
            result[1] = result[0] + 1;
            for(int i=0; i<n; i++) {
                if(arr[i] > arr[result[1]-1]) {
                    int c = arr[i] - arr[result[1]-1];
                    if(min > c) {
                        min = c;
                        result[0] = i+1;
                    }
                }
            }
        }
        for(int e : result) System.out.print(e+" ");
    }
}
