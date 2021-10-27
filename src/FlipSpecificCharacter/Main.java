package FlipSpecificCharacter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(solution(str));
    }

    private static String solution(String str) {
        char[] carr = str.toCharArray();

        int lt = 0;
        int rt = carr.length - 1;
        while (lt < rt) {
            if (65 <= carr[lt] && carr[lt] <= 122 &&
                65 <= carr[rt] && carr[rt] <= 122) {
                char tmp = carr[lt];
                carr[lt] = carr[rt];
                carr[rt] = tmp;
                lt++;
                rt--;
            }else if(65 > carr[lt] || carr[lt] > 122 &&
                    65 <= carr[rt] && carr[rt] <= 122) {
                lt++;
            }else if(65 <= carr[lt] && carr[lt] <= 122 &&
                    65 > carr[rt] || carr[rt] > 122) {
                rt--;
            }else {
                lt++; rt--;
            }
        }
        return String.valueOf(carr);
    }
}
