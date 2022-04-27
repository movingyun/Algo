package BaekJoon;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon_17472_G1_다리만들기 {

	static int N, M, num;
	static int[][] map, visit, map2;
	static int[] p;
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };
	

	static class pos {
		int r, c;

		public pos(int r, int c) {
			this.r = r;
			this.c = c;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		map = new int[N][M];
		visit = new int[N][M];
		num = 1;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		bfs(); // 단지번호 붙이기
		num--;
		map2 = new int[num][num];
		int[][] map2Test = { {0, 4, 1, 4 }, {4, 0, 3, 2 }, { 1, 3, 0, 1 },
				{4, 2, 1, 0 } };
		
		for(int i=0; i<map2Test.length; i++) {
			System.out.println(Arrays.toString(map2Test[i]));
		}
		
		boolean[] visited = new boolean[num];// 박문철2 용도
		int[] dist = new int[num]; // key 라고 불렸던 친구들
		int[] p = new int[num]; // 부모도 저장을 하자.
		
		// dist 라는 배열을 임의의 아주 큰값으로 채워 놓자.
		Arrays.fill(dist, Integer.MAX_VALUE);
		// 시작정점을 골라야하는데 1번 부터 하께용
		dist[1] = 0;
		p[1] = -1;
		
		int min, idx, ans = 0; // 최소값, 최솟값 인덱스, 비용의 총합
		for (int i = 0; i < num-1; i++) {
			min = Integer.MAX_VALUE;
			idx = -1;
			// 아직 안고른 친구들 중에서 제일 거리가 작은 값을 뽑아보장.
			for (int j = 0; j < num; j++) {
				if (!visited[j] && dist[j] < min && dist[j] !=1) {
					min = dist[j];
					idx = j;
				}
			}
			visited[idx] = true;// 제일 작은값을 가지고 있는 친구 쳌
			for (int j = 0; j < num; j++) {
				// 갱신을 하자. 방문하지 않았아고, 간선이 있고오,
				if (!visited[j] && map2Test[idx][j] != 0 && dist[j] > map2Test[idx][j]) {
					p[j] = idx;
					dist[j] = map2Test[idx][j];
				}
			}
		}
		
		for (int i = 0; i < num; i++) {
			ans += dist[i];
		}
		System.out.println(ans);
		

	}// main 끝

	static public void bfs() {
		Queue<pos> q = new LinkedList<pos>();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (map[i][j] == 1 && visit[i][j] == 0) {
					map[i][j] = num;
					visit[i][j] = 1;
					q.add(new pos(i, j));

					while (!q.isEmpty()) {
						// 뽑아
						pos curr = q.poll();

						// 자식검증
						for (int u = 0; u < 4; u++) {
							int nr = curr.r + dr[u];
							int nc = curr.c + dc[u];

							if (nr < 0 || nr >= N || nc < 0 || nc >= M)
								continue;
							if (map[nr][nc] == 0 || visit[nr][nc] == 1)
								continue;

							visit[nr][nc] = 1;
							q.add(new pos(nr, nc));
							map[nr][nc] = num;
						}
					} // while문
					num++;
				} // if문 끝
			}
		} // 1넣기 for문 끝
	}// bfs 끝
}
