package BaekJoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon_1922_네트워크연결 {

	static int n, m;

	static class edge implements Comparable<edge> {
		int st, ed, w;

		public edge(int st, int ed, int w) {
			this.st = st;
			this.ed = ed;
			this.w = w;
		}

		@Override
		public int compareTo(edge o) {
			// TODO Auto-generated method stub
			return this.w - o.w;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		List<edge>[] list = new ArrayList[n + 1];

		for (int i = 0; i < n + 1; i++) {
			list[i] = new ArrayList<edge>();
		}

		for (int i = 0; i < m; i++) {
			int st = sc.nextInt();
			int ed = sc.nextInt();
			int w = sc.nextInt();
			list[st].add(new edge(st, ed, w));
			list[ed].add(new edge(ed, st, w));
		}

		int[] visit = new int[n + 1];
		visit[1] = 1;

		PriorityQueue<edge> q = new PriorityQueue<>();
		q.addAll(list[1]);

		int cnt = 1;
		int ans = 0;

		while (cnt != n) {
			edge edge = q.poll();
			if (visit[edge.ed] == 1)
				continue;
			ans += edge.w;
			q.addAll(list[edge.ed]);
			visit[edge.ed] = 1;
			cnt++;
		}
		System.out.println(ans);

	}

}
