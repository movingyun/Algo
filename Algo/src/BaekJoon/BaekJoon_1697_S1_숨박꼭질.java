package BaekJoon;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon_1697_S1_숨박꼭질 {

	static int N, K;
	static boolean[] visit;
	static int cnt;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		cnt = 0;
		if (N == K) {
			System.out.println(0);
			return;
		}
		visit = new boolean[100001];
		bfs(N);
		System.out.println(cnt);
	}// main 끝

	static public void bfs(int start) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(start);
		visit[start] = true;
		while (!q.isEmpty()) {
			int size = q.size();
			for (int i = 0; i < size; i++) {
				// 꺼내
				int curr = q.poll();
				// 끝내
				if (curr == K)
					return;
				// 검증
				if(curr-1>=0&&visit[curr-1]==false) {
					q.add(curr-1);
					visit[curr-1] = true;
				}
				if(curr+1<=100000&&visit[curr+1]==false) {
					q.add(curr+1);
					visit[curr+1] = true;
				}
				if(curr*2<=100000&&visit[curr*2]==false) {
					q.add(curr*2);
					visit[curr*2] = true;
				}
			}
			cnt++;
		}
		return;
	}
}
