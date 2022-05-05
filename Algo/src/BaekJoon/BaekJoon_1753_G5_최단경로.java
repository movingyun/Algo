package BaekJoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BaekJoon_1753_G5_최단경로 {
	static class Node implements Comparable<Node> {
		int v, weight;

		public Node(int v, int weight) {
			this.v = v;
			this.weight = weight;
		}

		@Override
		public int compareTo(Node o) {
			return Integer.compare(this.weight, o.weight);
		}
	}

	static final int INF = Integer.MAX_VALUE;
	static int V, E, target;
	static List<Node>[] adjList; 
	static int[] dist;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		V = sc.nextInt(); 
		E = sc.nextInt();
		target = sc.nextInt();

		adjList = new ArrayList[V + 1];

		for (int i = 0; i < V + 1; i++) {
			adjList[i] = new ArrayList<>();
		}

		dist = new int[V + 1];
		Arrays.fill(dist, INF);

		// 간선 입력
		for (int i = 0; i < E; i++) {
			int st = sc.nextInt();
			int ed = sc.nextInt();
			int w = sc.nextInt();
			adjList[st].add(new Node(ed, w));// 인접리스트 넣기. //유향 그래프이니까.
		}

		dijkstra(target);

		for(int i=1; i<V+1; i++) {
			if(dist[i]==Integer.MAX_VALUE) {
				System.out.println("INF");
				continue;
			}
			System.out.println(dist[i]);
		}
	}

	static void dijkstra(int st) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		// 박문철2
		boolean[] visited = new boolean[V+1];

		pq.add(new Node(st, 0));
		// 시작 노드까지의 거리는 0
		dist[st] = 0;

		while (!pq.isEmpty()) {
			Node curr = pq.poll(); // 하나꺼내.

			if (visited[curr.v])
				continue;
			visited[curr.v] = true; // 선택한걸로치고

			// 뽑은 curr으로 부터 출발해서 도착할 수 있는 모든 정점들에 대하여
			for (Node node : adjList[curr.v]) {
				// 이미 알고 있는 거리보다 더 가깝게 도달 할 수 있다면
				if (!visited[node.v] && dist[node.v] > dist[curr.v] + node.weight) {
					dist[node.v] = dist[curr.v] + node.weight;
					pq.add(new Node(node.v, dist[node.v]));
				}
			}

		}
	}

}
