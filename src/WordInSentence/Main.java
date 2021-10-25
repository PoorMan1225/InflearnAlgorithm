package WordInSentence;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(solution(str));
    }

    private static String solution(String str) {
        String[] split = str.split(" ");
        Arrays.sort(split, (o1, o2) -> Integer.compare(o2.length(), o1.length()));
        return split[0];
    }
}
