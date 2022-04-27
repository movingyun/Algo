package SWEA;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SWEA_1267_D6_작업순서 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; tc++) {
			int V = sc.nextInt();
			int E = sc.nextInt();
			int[] num = new int[V + 1];
			int[][] edge = new int[E][2];
			int[] visit = new int[V + 1];
			StringBuilder sb = new StringBuilder();
			sb.append("#" + tc + " ");
			for (int i = 0; i < E; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				edge[i][0] = a;
				edge[i][1] = b;
				num[b]++;
			}
			Queue<Integer> q = new LinkedList<Integer>();
			for (int i = 1; i < V + 1; i++) {
				if (num[i] == 0) {
					q.add(i);
					visit[i] = 1;
				}
			}

			while (!q.isEmpty()) {
				int curr = q.poll();
				sb.append(curr + " ");
				for (int i = 0; i < E; i++) {
					if (edge[i][0] == curr)
						num[edge[i][1]]--;
					if (visit[edge[i][1]] == 0 && num[edge[i][1]] == 0) {
						q.add(edge[i][1]);
						visit[edge[i][1]] = 1;
					}
				}
			}
			System.out.println(sb);
		}
	}
}
