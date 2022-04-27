package BaekJoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon_2468_S1_안전영역 {

	static class pos {
		int x, y;

		public pos(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	static int h;
	static int w;
	static int[][] map;
	static int[][] visit;
	static int result;
	static int[] dr = { -1, 1, 0, 0 }; // 상하좌우
	static int[] dc = { 0, 0, -1, 1 };
	static Queue<pos> q = new LinkedList<pos>();
	static int cnt1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		w = sc.nextInt();
		h = w;
		map = new int[h][w];
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		int max = 0;
		int ans = -1;
		for (int i = 0; i < 100; i++) {
			visit = new int[h][w];
			result = 0;
			bfs(i);
			System.out.printf("i : %d  result : %d\n", i, result);
//			if(max>result) break;
			if (max < result) {
				max = result;
			}
		}
		System.out.println(max);

	}// main함수 끝

	public static void bfs(int water) {
		// 시작점 넣기
		// 첫값 넣기
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (visit[i][j] == 1 || map[i][j] <= water)
					continue;
				q.add(new pos(i, j));
				visit[i][j] = 1;
				result++;

				// 큐가 공백일때까지 수행
				while (!q.isEmpty()) {
					// q앞에 꺼내
					pos curr = q.poll();

					// 자식들 담아
					for (int d = 0; d < 4; d++) {
						int nr = curr.x + dr[d];
						int nc = curr.y + dc[d];

						// 자식 검증
						if (nr < 0 || nr >= h || nc < 0 || nc >= w) {
							continue;
						}
						if (map[nr][nc] <= water || visit[nr][nc] == 1) {
							continue;
						}

						// 검증 통과했으면 q에 넣어
						visit[nr][nc] = 1;
						q.add(new pos(nr, nc));
					} // 4방향 탐색
				}
			}
		}
	}
}
