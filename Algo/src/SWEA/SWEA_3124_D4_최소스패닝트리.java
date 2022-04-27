package SWEA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class SWEA_3124_D4_최소스패닝트리 {

	static class Edge implements Comparable<Edge> {
		int st, ed, cost;

		public Edge(int st, int ed, int cost) {
			this.st = st;
			this.ed = ed;
			this.cost = cost;
		}

		@Override
		public int compareTo(Edge o) {
			return this.cost - o.cost;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			
			int V = sc.nextInt();
			int E = sc.nextInt();
			
			List<Edge>[] adjList = new ArrayList[V+1];
			
			for (int i = 0; i < V+1; i++) {
				adjList[i] = new ArrayList<>();
			}
			
			for (int i = 0; i < E; i++) {
				int st = sc.nextInt();
				int ed = sc.nextInt();
				int w = sc.nextInt();
				
				adjList[st].add(new Edge(st, ed, w));
				adjList[ed].add(new Edge(ed, st, w));
			}
			
			boolean[] visit = new boolean[V+1];
			PriorityQueue<Edge> q = new PriorityQueue<>();
			visit[1] = true;
			
			q.addAll(adjList[1]);
			
			int cnt = 1;
			long ans = 0;
			while(cnt != V) {
				Edge edge = q.poll();
				//이미 꺼낸거면 넘어가
				if(visit[edge.ed]) continue;
				ans += edge.cost;
				q.addAll(adjList[edge.ed]);
				visit[edge.ed] = true;
				cnt++;
			}
			System.out.println("#"+tc+" "+ans);
		}
	}
}
