package Emergency;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        solution(n, m, arr);
    }

    private static void solution(int n, int m, int[] arr) {
        Queue<Person> que = new LinkedList<>();
        int cnt = 0;

        for(int i=0; i<n; i++) que.offer(new Person(i, arr[i]));
        while(!que.isEmpty()) {
            Person p = que.poll();
            for(Person e : que) {
                if(p.priority < e.priority) {
                    que.offer(p);
                    p = null;
                    break;
                }
            }
            if(p != null) {
                cnt++;
                if(p.number == m) {
                    System.out.print(cnt);
                    break;
                }
            }
        }
    }
}

class Person {
    int number;
    int priority;

    Person(int number, int priority) {
        this.number = number;
        this.priority = priority;
    }
}
