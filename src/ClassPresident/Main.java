package ClassPresident;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        solution(n, str);
    }

    private static void solution(int n, String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        char answer = '-';

        for(int i=0; i<n; i++) {
            char c = str.charAt(i);
            if(!map.containsKey(str.charAt(i)))
                map.put(c, 1);
            else
                map.put(c, map.get(c)+1);

            if(max < map.get(c)) {
                max = map.get(c);
                answer = c;
            }
        }

        // 위와 동일.
        for(char x: str.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0)+1);
            if(max < map.get(x)) {
                max = map.get(x);
                answer = x;
            }
        }
        System.out.print(answer);
    }
}
