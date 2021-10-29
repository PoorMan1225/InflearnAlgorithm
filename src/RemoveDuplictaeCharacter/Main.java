package RemoveDuplictaeCharacter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println(solution(str));
    }

    private static String solution(String str) {
        char[] carr = str.toCharArray();

        for(int i=0; i<carr.length; i++) {
            char checkChar = carr[i];
            for(int j=i+1; j<carr.length; j++) {
                if(checkChar == carr[j]) {
                    carr[j] = '*';
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char c : carr) {
            if(c != '*') {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
