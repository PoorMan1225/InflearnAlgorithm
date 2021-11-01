package ReverseDecimal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.next();
        }
        solution(n, arr);
    }

    private static void solution(int n, String[] arr) {
        int[] rvArr = new int[n];
        for(int i=0; i<arr.length; i++) {
            String rev = new StringBuilder(arr[i]).reverse().toString();
            rvArr[i] = Integer.parseInt(rev);
        }

        boolean flag = true;
        for(Integer c : rvArr) {
            flag = true;
            for(int i=2; i<=Math.sqrt(c); i++) {
                if(c % i == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag && c != 1) {
                System.out.print(c+" ");
            }
        }
    }
}
