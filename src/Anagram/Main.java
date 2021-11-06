package Anagram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        solution(str1, str2);
    }

    private static void solution(String str1, String str2) {
        HashMap<Character, Integer> map = new HashMap<>();
        boolean flag = true;
        
        for(int i=0; i<str1.length(); i++) {
            char c1 = str1.charAt(i);
            map.put(c1, map.getOrDefault(c1, 0)+1);
            char c2 = str2.charAt(i);
            map.put(c2, map.getOrDefault(c2, 0)+1);
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() % 2 != 0) {
                flag = false;
                break;
            }
        }
        System.out.print(flag ? "YES" : "NO");
    }
}
