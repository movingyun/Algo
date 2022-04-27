package BaekJoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon_2161_B1_카드1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		Queue<Integer> q = new LinkedList<Integer>();
		for (int i = 1; i <= a; i++) {
			q.add(i);
		}
		StringBuilder sb = new StringBuilder();
		while(!q.isEmpty()) {
			sb.append(q.poll()+" ");
			if(!q.isEmpty()) {
				int num1 = q.poll();
				q.add(num1);
			}
		}
		System.out.println(sb);
		
	}
}
