package CheckDuplicate;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        solution(n, arr);
    }

    private static void solution(int n, int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int e : arr) set.add(e);
        System.out.print(set.size() == n ? "U" : "D");
    }
}
