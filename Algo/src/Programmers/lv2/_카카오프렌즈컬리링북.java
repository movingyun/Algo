package Programmers.lv2;

import java.util.LinkedList;
import java.util.Queue;

//단지 수 구하기랑 똑같
public class _카카오프렌즈컬리링북 {
	static int[][] picture = { { 1, 1, 1, 0 }, { 1, 2, 2, 0 }, { 1, 0, 0, 1 }, { 0, 0, 0, 1 }, { 0, 0, 0, 3 },
			{ 0, 0, 0, 3 } };
	static int m = 6;
	static int n = 4;
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };
	static int[][] visit;
	static int max;
	static int result_cnt, result_size;

	static class pos {
		int r, c, val;

		public pos(int r, int c, int val) {
			this.r = r;
			this.c = c;
			this.val = val;
		}

	}

	public static void main(String[] args) {
		max = 0;
		result_cnt = 0;
		visit = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (picture[i][j] != 0 && visit[i][j] == 0) {
					result_cnt++;
					result_size = 0;
					bfs(new pos(i, j, picture[i][j]));
					if (result_size > max) {
						max = result_size;
					}
				}
			}
		}
		System.out.println(result_cnt);
		System.out.println(max);
	}// main

	static void bfs(pos pos) {
		Queue<pos> q = new LinkedList<>();
		q.add(pos);
		result_size++;
		visit[pos.r][pos.c] = 1;
		while (!q.isEmpty()) {
			pos cur = q.poll();

			for (int p = 0; p < 4; p++) {
				int nr = cur.r + dr[p];
				int nc = cur.c + dc[p];

				if (nr < 0 || nr >= m || nc < 0 || nc >= n)
					continue;
				if (visit[nr][nc] == 1 || picture[nr][nc] != pos.val)
					continue;

				visit[nr][nc] = 1;
				q.add(new pos(nr, nc, picture[nr][nc]));
				result_size++;
			}
		} // while
	}

}
