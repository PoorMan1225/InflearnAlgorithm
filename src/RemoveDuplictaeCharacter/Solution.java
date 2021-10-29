package RemoveDuplictaeCharacter;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println(solution(str));
    }

    private static String solution(String str) {
        char[] carr = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<carr.length; i++) {
            if(i == str.indexOf(carr[i])) {
                sb.append(carr[i]);
            }
        }
        return sb.toString();
    }
}
