package SumOfNaturalNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solution(n);
    }

    private static void solution(int n) {
        int add = n % 2 == 0 ? 0 : 1;
        int[] arr = new int[(n/2)+add];
        for(int i=0; i<arr.length; i++) {
            arr[i] = i+1;
        }
        int sum = 0;
        int lt = 0;
        int count = 0;

        for(int rt=0; rt<arr.length; rt++) {
            sum += arr[rt];
            if(sum == n) count++;
            while(sum >= n) {
                sum -= arr[lt++];
                if(sum == n) count++;
            }
        }
        System.out.print(count);
    }
}
