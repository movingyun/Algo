package BaekJoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

//연결해주고 젤 긴거 끊는다.
//62퍼에서 계속 fail...

public class BaekJoon_1647_도시분할계획 {
	static class edge implements Comparable<edge> {
		int st, ed, w;

		public edge(int st, int ed, int w) {
			super();
			this.st = st;
			this.ed = ed;
			this.w = w;
		}

		@Override
		public int compareTo(edge o) {
			return this.w - o.w;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int v = sc.nextInt();
		List<edge>[] list = new ArrayList[n + 1];
		for (int i = 0; i < n + 1; i++) {
			list[i] = new ArrayList<edge>();
		}

		// list에 넣기
		for (int i = 0; i < v; i++) {
			int st = sc.nextInt();
			int ed = sc.nextInt();
			int w = sc.nextInt();
			list[st].add(new edge(st, ed, w));
			list[ed].add(new edge(ed, st, w));
		}
		int[] visit = new int[n + 1];
		// pq생성
		PriorityQueue<edge> pq = new PriorityQueue<>();
		// 1에서 시작할꺼야
		pq.addAll(list[1]);
		visit[1] = 1;

		int cnt = 1;
		List<Integer> ansList = new ArrayList<Integer>();
		long ans = 0;
		while (cnt != n) {
			edge edge = pq.poll();
			if (visit[edge.ed] == 1)
				continue;
			ansList.add(edge.w);
			pq.addAll(list[edge.ed]);
			visit[edge.ed] = 1;
			cnt++;
		}
		Collections.sort(ansList);
		for(int i=0;i<n-2; i++) {
			ans+=ansList.get(i);
		}
		System.out.println(ans);

	}
}
