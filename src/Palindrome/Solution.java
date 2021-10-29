package Palindrome;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }

    private static String solution(String str) {
        String reverse = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reverse) ? "YES" : "NO";
    }
}
