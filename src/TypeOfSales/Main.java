package TypeOfSales;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        solution(n, k, arr);
    }

    private static void solution(int n, int k, int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int lt = 0;

        for(int i=0; i<k-1; i++)
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);

        for(int rt=k-1; rt<n; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0)+1);
            System.out.print(map.size()+" ");

            int get = map.get(arr[lt]);
            if(get > 1)
                map.put(arr[lt], get-1);
            else
                map.remove(arr[lt]);
            lt++;
        }
    }
}
