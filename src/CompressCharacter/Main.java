package CompressCharacter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        solution(str);
    }

    private static void solution(String str) {
        int count = 1;
        char s = str.charAt(0);

        StringBuilder sb = new StringBuilder();

        for(int i=1; i<str.length(); i++) {
            if(s == str.charAt(i)) {
                count++;
            }else if(s != str.charAt(i) && count > 1) {
                sb.append(s);
                s = str.charAt(i);
                sb.append(count);
                count = 1;
            }else if(s != str.charAt(i) && count == 1) {
                sb.append(s);
                s = str.charAt(i);
            }
        }

        if(count > 1) {
            sb.append(s).append(count);
        }else {
            sb.append(s);
        }
        System.out.println(sb.toString());
    }
}
