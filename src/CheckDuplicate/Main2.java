package CheckDuplicate;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        solution(n, arr);
    }

    private static void solution(int n, int[] arr) {
        String answer = "U";
        E: for(int i=1; i<n-1; i++) {
            int j;
            int tmp = arr[i];

            for(j=i-1; j>=0; j--) {
                if(arr[j] > tmp) {
                    arr[j+1] = arr[j];
                }else if(arr[j] == tmp){
                    answer = "D";
                    break E;
                } else
                    break;
            }
            arr[j+1] = tmp;
        }
        System.out.print(answer);
    }
}
