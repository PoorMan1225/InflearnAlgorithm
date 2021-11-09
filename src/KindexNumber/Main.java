package KindexNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        solution(n, k, arr);
    }

    private static void solution(int n, int k, int[] arr) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                for(int m=j+1; m<n; m++) {
                    int sum = arr[i] + arr[j] + arr[m];
                    set.add(sum);
                }
            }
        }

        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.reverse(list);
        int cnt = 0;
        for(int e: list) {
            cnt++;
            if(cnt == k) {
                System.out.print(e);
                break;
            }
        }
        if(cnt < k) System.out.print(-1);
    }
}
