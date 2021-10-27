package ReverseWords;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        String[] arr = new String[c];

        int i = c;
        while (i > 0) {
            arr[c-i] = sc.next();
            i--;
        }
        solution(arr);
    }

    private static void solution(String[] arr) {
        for(String w : arr) {
            for(int i=w.length()-1; i>=0; i--) {
                System.out.print(w.charAt(i));
            }
            System.out.println();
        }
    }
}
