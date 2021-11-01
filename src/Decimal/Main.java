package Decimal;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solution(n);
    }

    private static void solution(int n) {
        int[] arr = new int[n];
        int ptr = 0;
        int count = 2;

        arr[ptr++] = 2;
        arr[ptr++] = 3;
        boolean flag = true;

        for(int i=5; i<=n; i+=2) {
            flag = true;
            for(int j=0; arr[j] * arr[j] <= i; j++) {
                if(i % arr[j] == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                ++count;
                arr[ptr++] = i;
            }
        }
        System.out.print(count);
    }
}
