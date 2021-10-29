package Password;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String str = sc.next();
        solution(number, str);
    }

    private static void solution(int number, String str) {
        String[] arr = new String[number];
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<number; i++) {
            String sub = str.substring(i*7, (i*7)+7);
            sub = sub.replace("*", "0");
            sub = sub.replace("#", "1");
            arr[i] = sub;
        }

        // 이런식으로 나누는것도 가능
        /*for(int i=0; i<number; i++) {
            String sub = str.substring(0 , 7);
            str = str.substring(7);
        }*/

        for(String s : arr) {
            char c = (char) Integer.parseInt(s, 2);
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}
