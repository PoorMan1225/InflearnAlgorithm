package SettingStall;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        solution(n, c, arr);
    }

    private static void solution(int n, int c, int[] arr) {
        Arrays.sort(arr);
        int lt = 1;
        int rt = arr[n-1];

        while(lt <= rt) {
            int mid = (lt+rt) / 2;
            if(check(arr,mid) < c) {
                lt = mid + 1;
            }else if(check(arr,mid) == c) {
                result(arr, mid, c);
                break;
            }else {
                rt = mid - 1;
            }
        }
    }

    private static void result(int[] arr, int mid, int c) {
        int sub = arr[0];
        int[] re = new int[c];
        int idx = 0;
        re[idx++] = 0;

        for(int i=1; i<arr.length; i++) {
            if(arr[i] - sub >= mid) {
                re[idx++] = i;
                sub = arr[i];
            }
        }

        int min = Integer.MAX_VALUE;
        for(int i=1; i<c; i++) {
            int check = re[i] - re[i - 1];
            if(check < min)
                min = check;
        }
        System.out.print(min);
    }

    private static int check(int[] arr, int mid) {
        int sub = arr[0];
        int cnt = 1;
        for(int i=1; i<arr.length; i++) {
            if(arr[i] - sub >= mid) {
                sub = arr[i];
                cnt++;
            }
        }
        return cnt;
    }
}
