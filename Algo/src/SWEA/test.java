package SWEA;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class test {
	static int[] inDegree;
	static int[][] adj;
	static int V, E;
	static Queue<Integer> queue = new LinkedList<Integer>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; tc++) {
			V = sc.nextInt();
			E = sc.nextInt();
			// 인접행렬을 만들고
			adj = new int[V + 1][V + 1];
			// 진입차수 저장 배열
			inDegree = new int[V + 1];
			// 인접행렬에 값 집어넣기
			for (int i = 0; i < E; i++) {
				int st = sc.nextInt();
				int ed = sc.nextInt();
				adj[st][ed] = 1;
				inDegree[ed]++;
			}
			System.out.print("#" + tc + " ");
			Topological_sort();
			System.out.println();
		}
	}

	// 위상정렬
	public static void Topological_sort() {
		// 진입차수 배열을 돌면서 0이면 큐에 집어넣는다.
		for (int i = 1; i < V + 1; i++) {
			if (inDegree[i] == 0)
				queue.add(i);
		}
		// 큐가 빌때까지 큐에서 값을 poll하고
		// 그 값을 일단 출력한다.
		while (!queue.isEmpty()) {
			int node = queue.poll();
			System.out.print(node + " ");
			// 다시 진입차수배열을 돌면서 1이면 --하고 0이면 다시 큐에 집어넣는다.
			for (int i = 1; i < V + 1; i++) {
				inDegree[i]--;
				if (inDegree[i] == 0)
					queue.add(i);
			}
		}
	}
}