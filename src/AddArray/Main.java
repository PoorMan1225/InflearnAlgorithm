package AddArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fs = sc.nextInt();
        int[] arr1 = new int[fs];

        for(int i=0; i<fs; i++) {
            arr1[i] = sc.nextInt();
        }

        int ss = sc.nextInt();
        int[] arr2 = new int[ss];

        for(int i=0; i<ss; i++) {
            arr2[i] = sc.nextInt();
        }

        solution(fs, arr1, ss, arr2);
    }

    private static void solution(int fs, int[] arr1, int ss, int[] arr2) {
        int idx1 = 0;
        int idx2 = 0;

        while(true) {
            if(idx1 == fs) {
                for(int i=idx2; i<ss; i++)
                    System.out.print(arr2[i]+" ");
                break;
            }

            if(idx2 == ss) {
                for(int i=idx1; i<fs; i++)
                    System.out.print(arr1[i]+" ");
                break;
            }

            if(arr1[idx1] <= arr2[idx2]) {
                System.out.print(arr1[idx1++]+" ");
            }else {
                System.out.print(arr2[idx2++]+" ");
            }
        }
    }
}
