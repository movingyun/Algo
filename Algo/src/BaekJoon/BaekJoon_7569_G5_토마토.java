package BaekJoon;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//전부다 -1일때 반례...
//cnt++을 어디서 해주느냐가 중요하다.
public class BaekJoon_7569_G5_토마토 {
	static int M, N, H, day, flag, all, no;
	static int[][][] map;
	static boolean[][][] visit;
	static int cnt;
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };
	static int[] dh = { -1, 1 };

	static class pos {
		int x, y, h;
		int situ;

		public pos(int x, int y, int h, int situ) {
			this.x = x;
			this.y = y;
			this.h = h;
			this.situ = situ;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		M = sc.nextInt();
		N = sc.nextInt();
		H = 1;
		map = new int[N][M][H];
		visit = new boolean[N * H][M][H];
		day = 1;
		cnt = 0;
		flag = 0;
		all = 0;
		for (int h = 0; h < H; h++) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					map[i][j][h] = sc.nextInt();
				}
			}
		}
		bfs();
		if (no == N * M * H) {
			System.out.println(-1);
			return;
		}
		if (flag == 0)
			day = -1;
		if (all == 1)
			day = 0;
		System.out.println(day);
	}// main끝

	static public void bfs() {
		Queue<pos> q = new LinkedList<pos>();

		for (int h = 0; h < H; h++) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (map[i][j][h] == 1) {
						pos pos = new pos(i, j, h, 1);
						visit[i][j][h] = true;
						q.add(pos);
						cnt++;
					} else if (map[i][j][h] == -1) {
						cnt++;
						no++;
					}
				}
			}
		}

		if (cnt == N * M * H) {
			all = 1;
			return;
		}

		while (!q.isEmpty()) {
			int size = q.size();
			for (int i = 0; i < size; i++) {
				// 뽑아
				pos curr = q.poll();

				// 검증해
				// 같은층
				for (int k = 0; k < 4; k++) {
					int nr = curr.x + dr[k];
					int nc = curr.y + dc[k];

					if (nr < 0 || nr >= N || nc < 0 || nc >= M)
						continue;
					if (visit[nr][nc][curr.h] == true || map[nr][nc][curr.h] != 0)
						continue;

					visit[nr][nc][curr.h] = true;
					q.add(new pos(nr, nc, curr.h, 1));
					cnt++;
				}

				// 다른층
				for (int k = 0; k < 2; k++) {
					int nh = curr.h + dh[k];

					if (nh < 0 || nh >= H)
						continue;
					if (map[curr.x][curr.y][nh] != 0 || visit[curr.x][curr.y][nh] == true)
						continue;

					visit[curr.x][curr.y][nh] = true;
					q.add(new pos(curr.x, curr.y, nh, 1));
					cnt++;
				}
				// 끝내
				if (cnt == N * M * H) {
					flag = 1;
					return;
				}
			}
			day++;
		}
		return;
	}
}
