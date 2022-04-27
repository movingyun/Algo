package BaekJoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon_1389_s1_케빈베이컨의6단계법칙 {

	static int N, M, min, minIdx;
	static int[] visit, dist;
	static List<Integer>[] list;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		M = sc.nextInt(); // 사람 수
		N = sc.nextInt(); // 간선 수
		list = new ArrayList[M + 1];

		for (int i = 1; i <= M; i++) {
			list[i] = new ArrayList<Integer>();
		}

		for (int i = 0; i < N; i++) {
			int st = sc.nextInt();
			int ed = sc.nextInt();
			list[st].add(ed);
			list[ed].add(st);
		}

		min = Integer.MAX_VALUE;
		minIdx = -1;
		for (int i = 1; i <= M; i++) {
			visit = new int[M + 1];
			dist = new int[M + 1];
			dfs(i);
			int sum = 0;
			for(int j=1; j<=M; j++) {
				sum+=dist[j];
			}
			if(sum<min) {
				min = sum;
				minIdx = i;						
			}
		}
		System.out.println(minIdx);
	}// main

	static void dfs(int st) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.addAll(list[st]);
		visit[st] = 1;
		int cnt = 0;
		while (!q.isEmpty()) {
			int size = q.size();
			cnt++;
			for (int i = 0; i < size; i++) {
				int curr = q.poll();
				if (visit[curr] == 0) {
					visit[curr] = 1;
					dist[curr] = cnt;
					q.addAll(list[curr]);
				}
			}
		}
	}
}
