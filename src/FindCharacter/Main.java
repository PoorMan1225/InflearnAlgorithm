package FindCharacter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String c = sc.nextLine();

        System.out.println(solution(str, c));
    }

    private static int solution(String str, String c) {
        String str1 = str.toLowerCase();
        String str2 = c.toLowerCase();

        int count=0;
        /*for(int i=0; i<str1.length(); i++) {
            if(String.valueOf(str1.charAt(i)).equals(str2)) {
                count++;
            }
        }*/

        for(char x : str1.toCharArray()) {
            if(x == str2.charAt(0)) {
                count++;
            }
        }
        return count;
    }
}
