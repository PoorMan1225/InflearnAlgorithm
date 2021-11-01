package RockScissorsPaper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] p1 = new int[count];
        int[] p2 = new int[count];

        for(int i=0; i<count; i++) {
            p1[i] = sc.nextInt();
        }

        for(int i=0; i<count; i++) {
            p2[i] = sc.nextInt();
        }
        solution(count, p1, p2);
    }

    private static void solution(int count, int[] p1, int[] p2) {
        for(int i=0; i<count; i++) {
            int sub = p1[i] - p2[i];
            if(sub == 1 || sub == -2) {
                System.out.println("A");
            }else if(sub == 0) {
                System.out.println("D");
            }else {
                System.out.println("B");
            }
        }
    }
}
