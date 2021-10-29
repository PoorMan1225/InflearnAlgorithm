package PrintBignumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int[] arr = new int[number];
        for(int i=0; i<number; i++) {
            arr[i] = sc.nextInt();
        }
        solution(arr);
    }

    private static void solution(int[] arr) {
        int n = arr[0];
        System.out.print(n+" ");

        for(int i=1; i<arr.length; i++) {
            if(n < arr[i]) {
                System.out.print(arr[i]+ " ");
            }
            n = arr[i];
        }
    }
}
