package VisibleStudent;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] arr = new int[number];

        for(int i=0; i<number; i++) {
            arr[i] = sc.nextInt();
        }
        solution(arr);
    }

    private static void solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);

        int idx = 0;
        for(int i=1; i<arr.length; i++) {
            if(list.get(idx) < arr[i]) {
                list.add(arr[i]);
                idx++;
            }
        }
        System.out.print(list.size());
    }
}
