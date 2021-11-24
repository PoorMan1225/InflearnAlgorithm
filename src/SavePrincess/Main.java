package SavePrincess;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        solution(n, k);
    }

    private static void solution(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int lt = k-1;
        for(int i=1; i<=n; i++) list.add(i);
        for(int i=0; i<n-1; i++) {
            if(lt >= list.size()) lt = lt % list.size();
            list.remove(lt % list.size());
            lt += k-1;
        }
        System.out.print(list.get(0));
    }
}
