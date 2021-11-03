package SameElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int[] arr1 = new int[f];
        for(int i=0; i<f; i++) {
            arr1[i] = sc.nextInt();
        }

        int s = sc.nextInt();
        int[] arr2 = new int[s];
        for(int i=0; i<s; i++) {
            arr2[i] = sc.nextInt();
        }
        solution(f, arr1, s, arr2);
    }

    private static void solution(int f, int[] arr1, int s, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        ArrayList<Integer> list = new ArrayList<>();

        int p1 = 0;
        int p2 = 0;
        while(p1 < f && p2 < s) {
            if(arr1[p1] < arr2[p2]) {
                p1++;
            }else if(arr1[p1] == arr2[p2]) {
                list.add(arr1[p1++]);
                p2++;
            }else {
                p2++;
            }
        }

        for(Integer e : list) {
            System.out.print(e+" ");
        }
    }
}
