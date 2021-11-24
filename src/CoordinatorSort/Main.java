package CoordinatorSort;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Coordinate> list = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            list.add(new Coordinate(
                    sc.nextInt(),
                    sc.nextInt()
            ));
        }
        solution(n, list);
    }

    private static void solution(int n, ArrayList<Coordinate> list) {
        list.sort((o1, o2) -> {
            if(o1.x > o2.x) return 1;
            else if(o1.x == o2.x) return Integer.compare(o1.y, o2.y);
            else return -1;
        });
        for(Coordinate c : list) System.out.println(c);
    }
}

class Coordinate {
    int x;
    int y;

    Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return x+" "+y;
    }
}
