package LeastLecentlyUsed;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        solution(s, n, arr);
    }

    private static void solution(int s, int n, int[] arr) {
        int[] carr = new int[s];

        for(int i=0; i<n; i++) {
            int idx = -1;
            for(int j=0; j<s; j++) {
                if(arr[i] == carr[j]) {
                    idx = j;
                    break;
                }
            }
            int k = idx != -1 ? idx : i >= s ? s-1 : i;
            // 같은 값이 없을 경우에는 그냥 i 값을 넣어주면 된다.
            int tmp = idx != -1 ? carr[idx] : arr[i];
            for(; k>0; k--)
                carr[k] = carr[k-1];
            carr[k] = tmp;
        }
        for(int e : carr) System.out.print(e+ " ");
    }
}
