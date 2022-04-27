package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_17472_G1_다리만들기2 {
	static int N, M;
	static int[][] map;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		map = new int[N][M];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++)
				map[i][j] = sc.nextInt();
		}
		// 입력에서.. 땅은 1 바다는 0
		// 새로운 맵을 만들어서 0은 섬이 아닌곳, 첫번째섬은 1번부터
		// 아니면,,,현재맵에서 첫번째 섬을 2번부터 시작...
		int idx = 2;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				// 육지야?
				if (map[i][j] == 1) {
					dfs(i, j, idx++);
				}
			}
		}
		// 두둥 하이라이트. 인접행렬 만들어내기.
		// idx크기로 만들어서 2번부터 쓰든가,, 처음부터 2를 빼서 인덱스를 활용하등가
		// 우리는 후자.
		idx -= 2;
		int[][] adj = new int[idx][idx];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				// 땅을 발견하면,
				if (map[i][j] != 0) {
					// 4방으로
					for (int d = 0; d < 4; d++) {
						int nr = i + dr[d];
						int nc = j + dc[d];
						int cnt = 0;
						// 출발점
						int start = map[i][j] - 2;
						int end = 0;
						while (true) {
							if (nr < 0 || nc < 0 || nr >= N || nc >= M)
								break;
							// 육지만나면..? 목적지 기억!
							if (map[nr][nc] != 0) {
								end = map[nr][nc] - 2;
								break;
							}
							// 가던길 ㄱㄱ
							nr += dr[d];
							nc += dc[d];
							cnt++;
						}
						// 도착지를 만났는지? 그리고 2칸 이상 갔는지 ?
						if (end != 0 && cnt > 1) {
							if (adj[start][end] > 0) {
								adj[start][end] = Math.min(adj[start][end], cnt);
								adj[end][start] = adj[start][end];
							} else {
								adj[start][end] = cnt;
								adj[end][start] = cnt;
							}
							// kruskal을 쓰고 싶으시면,
							// 준비한 PQ에 start,end,cnt를 경로로서 넣으세요
						}
					}
				}
			}
		}
//		for (int i = 0; i < idx; i++) {
//			System.out.println(Arrays.toString(adj[i]));
//		}
		// 여기부터 prim짜시오.
		boolean[] visited = new boolean[idx];
		int[] dist = new int[idx];
		int cnt2 = 0;
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[0] = 0;

		int min, idxM, ans = 0;
		for (int i = 0; i < idx; i++) {
			min = Integer.MAX_VALUE;
			idxM = -1;
			for (int j = 0; j < idx; j++) {
				if (!visited[j] && dist[j] < min) {
					min = dist[j];
					idxM = j;
				}
			}
			if(idxM == -1) {
				continue;
			}
			visited[idxM] = true;
			cnt2++;
			for (int j = 0; j < idx; j++) {
				if (!visited[j] && adj[idxM][j] != 0 && dist[j] > adj[idxM][j]) {
					dist[j] = adj[idxM][j];
				}
			}
		}
		for (int i = 0; i < idx; i++) {
			ans += dist[i];
		}
		if(cnt2==idx) System.out.println(ans);
		else System.out.println(-1);
	}

	static void dfs(int r, int c, int idx) {
		map[r][c] = idx;
		for (int d = 0; d < 4; d++) {
			int nr = r + dr[d];
			int nc = c + dc[d];
			if (nr < 0 || nc < 0 || nr >= N || nc >= M)
				continue;
			if (map[nr][nc] == 1)
				dfs(nr, nc, idx);
		}
	}

	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };
}