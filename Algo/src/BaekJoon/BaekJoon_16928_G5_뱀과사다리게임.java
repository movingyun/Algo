package BaekJoon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon_16928_G5_뱀과사다리게임 {

	static int N, M, cnt;
	static List<Integer>[] list;
	static int[] visit;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		list = new ArrayList[101];
		visit = new int[101];
		for (int i = 1; i < 101; i++) {
			list[i] = new ArrayList<Integer>();
		}

		// 사다리
		for (int i = 0; i < N; i++) {
			int st = sc.nextInt();
			int ed = sc.nextInt();
			list[st].add(ed);
		}
		// 뱀
		for (int i = 0; i < M; i++) {
			int st = sc.nextInt();
			int ed = sc.nextInt();
			list[st].add(ed);
		}
		cnt = 0;
		bfs(1);
		System.out.println(cnt);
	}

	static int[] move = { 1, 2, 3, 4, 5, 6 };

	static void bfs(int st) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(st);
		visit[st] = 1;
		while (!q.isEmpty()) {
			int size = q.size();
			for (int i = 0; i < size; i++) {
				int curr = q.poll();
				if (!list[curr].isEmpty()) {
					curr = list[curr].get(0);
				}
				//끝내
				if (curr == 100) {
					return;
				}
				//1~6 보내봐
				for (int j = 0; j < 6; j++) {
					int nn = curr + move[j];
					if (nn > 100 || visit[nn] == 1)
						continue;
					q.add(nn);
					visit[nn] = 1;
				}
			}
			cnt++;
		}
	}
}