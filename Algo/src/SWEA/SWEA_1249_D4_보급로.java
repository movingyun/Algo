package SWEA;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class SWEA_1249_D4_보급로 {
	static class pos {
		int x, y;

		public pos(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	static int a;
	static char[][] map;
	static int[][] dist;
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			a = sc.nextInt();
			map = new char[a][a];
			dist = new int[a][a];
			for (int i = 0; i < a; i++) {
				map[i] = sc.next().toCharArray();
			}

			// 큰값으로 채워줌
			for (int i = 0; i < a; i++) {
				Arrays.fill(dist[i], Integer.MAX_VALUE);
			}
			bfs();
			System.out.println("#" + tc + " " + dist[a - 1][a - 1]);
		} // tc 끝
	}// main 끝

	public static void bfs() {
		Queue<pos> q = new LinkedList<>();
		q.add(new pos(0, 0));
		dist[0][0] = 0;
		while (!q.isEmpty()) {
			pos curr = q.poll();

			// 자식검증
			for (int k = 0; k < 4; k++) {
				int nr = curr.x + dr[k];
				int nc = curr.y + dc[k];

				// 범위 넘으면 continue
				if (nr < 0 || nr >= a || nc < 0 || nc >= a)
					continue;
				// 안갔거나 더 효율적이면 가보자~
				if (dist[nr][nc] > dist[curr.x][curr.y] + (map[nr][nc] - '0')) {
					q.add(new pos(nr, nc));
					dist[nr][nc] = dist[curr.x][curr.y] + (map[nr][nc] - '0');
				}
			}
		}
	}
}
