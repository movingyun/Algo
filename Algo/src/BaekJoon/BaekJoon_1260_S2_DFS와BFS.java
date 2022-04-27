package BaekJoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BaekJoon_1260_S2_DFS와BFS {
	static int N;
	static int M;
	static int V;
	static int[][] map;
	static int[] visit;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt(); // 노드의 수
		M = sc.nextInt(); // 간선의 수
		V = sc.nextInt(); // 정점
		map = new int[M][2];
		for (int i = 0; i < M; i++) {
			map[i][0] = sc.nextInt();
			map[i][1] = sc.nextInt();
		}
		visit = new int[N + 1];
		dfs(V);
		System.out.println();
		visit = new int[N + 1];
		bfs(V);
	}// main끝

	private static void dfs(int node) {
		Stack<Integer> stack = new Stack<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		stack.add(node);
		while (!stack.isEmpty()) {
			int curr = stack.pop();
			visit[curr]++;
			if (visit[curr] == 1)
				System.out.print(curr + " ");
			for (int i = 0; i < M; i++) {
				if (map[i][0] == curr && visit[map[i][1]] == 0) {
					list.add(map[i][1]);
				}
				if (map[i][1] == curr && visit[map[i][0]] == 0) {
					list.add(map[i][0]);
				}
			}
			Collections.sort(list, Collections.reverseOrder());
			for (int i = 0; i < list.size(); i++) {
				stack.add(list.get(i));
			}
			list.clear();
		}
	}// dfs끝

	private static void bfs(int node) {
		Queue<Integer> q = new LinkedList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		q.add(node);
		while (!q.isEmpty()) {
			int curr = q.poll();
			visit[curr]++;
			if (visit[curr] == 1)
				System.out.print(curr + " ");
			for (int i = 0; i < M; i++) {
				if (map[i][0] == curr && visit[map[i][1]] == 0) {
					list2.add(map[i][1]);
				}
				if (map[i][1] == curr && visit[map[i][0]] == 0) {
					list2.add(map[i][0]);
				}
			}
			Collections.sort(list2);
			for (int i = 0; i < list2.size(); i++) {
				q.add(list2.get(i));
			}
			list2.clear();
		}
	}// bfs끝
}
