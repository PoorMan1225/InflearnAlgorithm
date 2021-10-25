package CaseConversion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(solution(str));
    }

    private static String solution(String str) {
        StringBuilder sb = new StringBuilder();

        for(char c : str.toCharArray()) {
            sb.append(c > 90 ? (char) (c-32) : (char) (c+32));
        }
        return sb.toString();
    }
}
