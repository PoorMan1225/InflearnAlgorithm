package Fibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        solution(count);
    }

    private static void solution(int count) {
        int first = 0;
        int second = 1;

        System.out.print(second+" ");
        while(count-1 > 0) {
            System.out.print(first + second+" ");
            int tmp = second;
            second = first + second;
            first = tmp;
            count--;
        }
    }
}
