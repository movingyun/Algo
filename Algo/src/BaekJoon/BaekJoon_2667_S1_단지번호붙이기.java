package BaekJoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon_2667_S1_단지번호붙이기 {

	static class pos {
		int x, y;

		public pos(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	static int h;
	static int w;
	static char[][] map;
	static int[][] visit;
	static int result;
	static int[] dr = { -1, 1, 0, 0 }; // 상하좌우
	static int[] dc = { 0, 0, -1, 1 };
	static Queue<pos> q = new LinkedList<pos>();
	static int cnt1;
	static int cntCity;
	static List<Integer> ans = new ArrayList<Integer>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		w = sc.nextInt();
		h = w;
		map = new char[h][w];
		visit = new int[h][w];
		result = 0;
		cnt1 = 0;
		cntCity = 1;
		for (int i = 0; i < h; i++) {
			map[i] = sc.next().toCharArray();
			for (int j = 0; j < h; j++) {
				if (map[i][j] == '1')
					cnt1++;
			}
		}
		bfs();
		System.out.println(result);
		Collections.sort(ans);
		for(int i=0; i<ans.size(); i++) {
			System.out.println(ans.get(i));			
		}

	}// main함수 끝

	public static void bfs() {
		// 큐 생성(위에서 함)

		// 시작점 넣기
		int cnt = 0;
		// 첫값 넣기
		while (cnt != cnt1) {
			outer: for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (visit[i][j] == 0 && map[i][j] == '1') {
						q.add(new pos(i, j));
						visit[i][j] = 1;
						cnt++;
						break outer;
					}
				}
			} // 첫 값 넣기끝

			// 큐가 공백일때까지 수행
			while (!q.isEmpty()) {
				int size = q.size();
				for (int i = 0; i < q.size(); i++) {
					// q앞에 꺼내
					pos curr = q.poll();

					// 자식들 담아
					for (int d = 0; d < 4; d++) {
						int nr = curr.x + dr[d];
						int nc = curr.y + dc[d];

						// 자식 검증
						if (nr < 0 || nr >= h || nc < 0 || nc >= w)
							continue;
						if (map[nr][nc] == '0' || visit[nr][nc] == 1)
							continue;

						// 검증 통과했으면 q에 넣어
						visit[nr][nc] = 1;
						cnt++;
						cntCity++;
						q.add(new pos(nr, nc));
					} // 4방향 탐색
				}
			}
			result++;
			ans.add(cntCity);
			cntCity=1;
		} // 계속 도는거
	}
}
