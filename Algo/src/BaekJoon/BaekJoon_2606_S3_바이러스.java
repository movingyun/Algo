package BaekJoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon_2606_S3_바이러스 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nodeCnt = sc.nextInt();
		int v = sc.nextInt();
		int[] visit = new int[nodeCnt + 1];
		int[][] map = new int[v][2];
		int cnt = 0;

		for (int i = 0; i < v; i++) {
			map[i][0] = sc.nextInt();
			map[i][1] = sc.nextInt();
		}

		visit[1] = 1;

		Queue<Integer> q = new LinkedList<Integer>();
		for (int i = 0; i < v; i++) {
			for (int j = 0; j < v; j++) {
				if (map[i][0] == 1 || map[i][1] == 1) {
					if (visit[map[i][0]] == 0) {
						q.add(map[i][0]);
						visit[map[i][0]] = 1;
						cnt++;
					}
					if (visit[map[i][1]] == 0) {
						q.add(map[i][1]);
						visit[map[i][1]] = 1;		
						cnt++;
					}
				}
			}
		}
		while(!q.isEmpty()) {
			int curr = q.poll();
			for (int i = 0; i < v; i++) {
				for (int j = 0; j < v; j++) {
					if (map[i][0] == curr || map[i][1] == curr) {
						if (visit[map[i][0]] == 0) {
							q.add(map[i][0]);
							visit[map[i][0]] = 1;
							cnt++;
						}
						if (visit[map[i][1]] == 0) {
							q.add(map[i][1]);
							visit[map[i][1]] = 1;		
							cnt++;
						}
					}
				}
			}
		}
		System.out.println(cnt);

	}
}
