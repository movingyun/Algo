package BaekJoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon_11725_S2_트리의부모찾기 {

	static ArrayList[] list;
	static int[] result;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		list = new ArrayList[a+1];
		
		for(int i=0; i<list.length; i++) {
			list[i] = new ArrayList<>();
		}
		result = new int[a + 1];
		for (int i = 0; i < a-1; i++) {
			int node1 = sc.nextInt();
			int node2 = sc.nextInt();
			list[node1].add(node2);
			list[node2].add(node1);
		}
		find();
		for(int i=2; i<list.length; i++) {
			System.out.println(result[i]);
		}
	} // main함수

	public static void find() {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(1);
		result[1] = 1;

		while (!q.isEmpty()) {// 차있을때까지 돈다.
			int cur = q.poll(); // 현재 부모
			for (Object next : list[cur].toArray()) {
				if (result[(int) next] == 0) {
					q.add((Integer) next);
					result[(int) next] = cur;
				}
			}
		}
	}
}
