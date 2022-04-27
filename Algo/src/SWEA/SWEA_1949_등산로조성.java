package SWEA;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


//tmp로 visit을 복사 안하고 그냥 넣으면
//주소가 복사되서 각각의 visit을 들고다니는 의미가 없어짐...

public class SWEA_1949_등산로조성 {
	static int N, K, cnt;
	static int[][] map;
	static int startNum, startCnt;
	static int resultMax;
	static int startR, startC;
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };

	static class pos {
		int r, c, score, cut;
		int[][] visit;

		public pos(int r, int c, int score, int cut, int[][] visit) {
			this.r = r;
			this.c = c;
			this.score = score;
			this.cut = cut;
			this.visit = visit;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			K = sc.nextInt();
			map = new int[N][N];
			startNum = 0;
			resultMax = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					map[i][j] = sc.nextInt();
					if (startNum < map[i][j]) {
						startNum = map[i][j];
					}
				}
			}

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (map[i][j] == startNum) {
						cnt = 1;
						startR = i;
						startC = j;
						bfs();
					}
				}
			}
			System.out.printf("#%d %d\n", tc, resultMax);
		} // tc끝
	}// main끝

	public static void bfs() {
		Queue<pos> q = new LinkedList<pos>();
		pos pos = new pos(startR, startC, map[startR][startC], 0, new int[N][N]);
		pos.visit[startR][startC] = 1;
		q.add(pos);
		while (!q.isEmpty()) {
			int size = q.size();
			for (int i = 0; i < size; i++) {
				// 뽑아
				pos curr = q.poll();

				// 조건식
				if (cnt > resultMax)
					resultMax = cnt;

				// 담아
				for (int p = 0; p < 4; p++) {
					int nr = curr.r + dr[p];
					int nc = curr.c + dc[p];

					// 검증해
					// 벗어나거나
					if (nr < 0 || nr >= N || nc < 0 || nc >= N)
						continue;
					// 한번짜르고 왔는데 크거나 왔었거나
					if (curr.cut == 1 && (map[nr][nc] >= curr.score || curr.visit[nr][nc] == 1))
						continue;
					// 안자르고왔는데 K로 잘라도 못가거나 왔었거나 멈춰!
					if (curr.cut == 0 && (map[nr][nc] >= curr.score + K || curr.visit[nr][nc] == 1))
						continue;

					// 통과했으면 담아
					// 자르고 왔으면
					if (curr.cut == 1) {
                        int[][] tmp = new int[N][N];
                        for(int k=0;k<N;k++) {
                            tmp[k] = curr.visit[k].clone();
                        }
						pos = new pos(nr, nc, map[nr][nc], 1, tmp);
						pos.visit[nr][nc] = 1;
						q.add(pos);
					}
					// 자르고 가야되면
					else if (curr.cut == 0 && map[nr][nc] >= curr.score) {
                        int[][] tmp = new int[N][N];
                        for(int k=0;k<N;k++) {
                            tmp[k] = curr.visit[k].clone();
                        }
						pos = new pos(nr, nc, curr.score - 1, 1, tmp);
						pos.visit[nr][nc] = 1;
						q.add(pos);
					}
					// 그냥 갈수있음
					else {
                        int[][] tmp = new int[N][N];
                        for(int k=0;k<N;k++) {
                            tmp[k] = curr.visit[k].clone();
                        }
						pos = new pos(nr, nc, map[nr][nc], 0, tmp);
						pos.visit[nr][nc] = 1;
						q.add(pos);
					}
				} // 4방향
			} // size돌기
			cnt++;
		}
	}// bfs
}
