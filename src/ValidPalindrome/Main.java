package ValidPalindrome;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }

    private static String solution(String str) {
        str = str.replaceAll("[^a-zA-Z]", "");
        String str2 = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(str2) ? "YES" : "NO";
    }
}
