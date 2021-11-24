package SavePrincess;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        solution(n, k);
    }

    private static void solution(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i=1; i<=n; i++) queue.offer(i);
        for(int i=0; i<n-1; i++) {
            for(int j=1; j<=k; j++) {
                if(j == k) queue.poll();
                else queue.offer(queue.poll());
            }
        }
        System.out.print(queue.poll());
    }
}
