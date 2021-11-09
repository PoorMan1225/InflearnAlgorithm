package AllOfAnagram;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = sc.nextLine();
        solution(str, s);
    }

    private static void solution(String str, String s) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        int lt = 0;
        int cnt = 0;

        for(char c : s.toCharArray())
            map1.put(c, map1.getOrDefault(c, 0)+1);

        for(int i=0; i<s.length()-1; i++) {
            char c = str.charAt(i);
            map2.put(c, map2.getOrDefault(c, 0)+1);
        }

        for(int rt=s.length()-1; rt<str.length(); rt++) {
            char c = str.charAt(rt);
            map2.put(c, map2.getOrDefault(c, 0)+1);
            if(map2.equals(map1))
                cnt++;
            int ct = map2.get(str.charAt(lt));
            if(ct > 1)
                map2.put(str.charAt(lt), map2.get(str.charAt(lt))-1);
            else
                map2.remove(str.charAt(lt));
            lt++;
        }
        System.out.print(cnt);
    }
}
