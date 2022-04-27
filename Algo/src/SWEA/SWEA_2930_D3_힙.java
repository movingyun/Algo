package SWEA;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class SWEA_2930_D3_힙 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			PriorityQueue<Integer> arr = new PriorityQueue<Integer>(Collections.reverseOrder());
			StringBuilder sb = new StringBuilder();
			sb.append("#" + tc + " ");
			int a = sc.nextInt();
			for (int i = 0; i < a; i++) {
				int b = sc.nextInt();
				if (b == 1) {
					arr.add(sc.nextInt());
				} else {
					if (arr.isEmpty()) {
						sb.append(-1+" ");
						continue;
					}
					sb.append(arr.poll()+" ");
				}
			}
			System.out.println(sb);
		}
	}
}
