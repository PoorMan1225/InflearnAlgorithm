package DistanceWords;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char target = sc.next().charAt(0);
        solution(str, target);
    }

    private static void solution(String str, char target) {
        List<Integer> list  = new ArrayList<>();

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == target) {
                list.add(i);
            }
        }

        for(int i=0; i<str.length(); i++) {
            int min = 100;
            for (int k : list) {
                int abs = Math.abs(i - k);
                if (min > abs) {
                    min = abs;
                }
            }
            System.out.print(min+" ");
        }
    }
}
