package PuppetDraw;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] marr = new int[m];
        for(int i=0; i<m; i++) {
            marr[i] = sc.nextInt();
        }
        solution(n, arr, m, marr);
    }

    private static void solution(int n, int[][] arr, int m, int[] marr) {
        Stack<Integer> stk = new Stack<>();
        int dcnt = 0;

        for(int i=0; i<m; i++) {
            int idx = marr[i]-1;
            for(int j=0; j<n; j++) {
                int value = arr[j][idx];
                if(value != 0) {
                    arr[j][idx] = 0;
                    if(stk.isEmpty()) {
                        stk.push(value);
                    }else
                        if(stk.peek() == value) {
                            stk.pop();
                            dcnt += 2;
                        }else
                            stk.push(value);
                    break;
                }
            }
        }
        System.out.print(dcnt);
    }
}
