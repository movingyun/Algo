package BaekJoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class BaekJoon_2206_G4_벽부수고이동하기2 {
	static int r, c;
	static char[][] map;
	static int[][] visitN,visitY;
	static int min, cnt;
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };
	static int k;
	static int flag = 0;

	static class pos {
		int r, c;
		int br;

		public pos(int r, int c, int br) {
			this.r = r;
			this.c = c;
			this.br = br;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt();
		c = sc.nextInt();
		k =sc.nextInt();
		min = 0;
		cnt = 0;
		map = new char[r][c];
		visitN = new int[r][c];
		visitY = new int[r][c];

		for (int i = 0; i < r; i++) {
			map[i] = sc.next().toCharArray();
		}
		pos pos = new pos(0, 0, 0);
		bfs(pos);
		if (r == 1 && c == 1) {
			cnt = 1;
		}
		if (flag == 0) {
			cnt = -1;
		}
		System.out.println(cnt);
	}// main함수

	public static void bfs(pos pos) {
		// 큐 생성
		Queue<pos> q = new LinkedList<pos>();
		// 시작점 넣기
		q.add(pos);
		visitN[0][0] = 1;

		// 큐가 공백일때까지 수행
		outer: while (!q.isEmpty()) {
			int size = q.size();
			for (int i = 0; i < size; i++) {
				// 꺼내
				pos curr = q.poll();

				// 끝내
				if (curr.r == r - 1 && curr.c == c - 1) {
					flag = 1;
					cnt++;
					break outer;
				}

				// 더해
				for (int k = 0; k < 4; k++) {
					int nr = curr.r + dr[k];
					int nc = curr.c + dc[k];

					// 자식 검증
					if (nr < 0 || nr >= r || nc < 0 || nc >= c)
						continue;
					
					//뚫고 왔는데 (또 벽이야?? or 뚫고온곳중에 왔던길?) 안돼
					if (curr.br == k && (map[nr][nc] == '1' || visitY[nr][nc] == 1))
						continue;
					//그냥 왔는데 (그냥 왔던길이야) 안돼
					if(curr.br == 0 &&visitN[nr][nc] == 1)
						continue;
					
					// 이거 깨거나 한번이라도 깼으면 깨고간걸 기억
					if (map[nr][nc] == '1' || curr.br >= 1) {
						q.add(new pos(nr, nc, curr.br+1));
						// 검증 통과했으면 가는목록에 추가!
						visitY[nr][nc] = 1;
					} else {
						q.add(new pos(nr, nc, 0));
						// 검증 통과했으면 가는목록에 추가!
						visitN[nr][nc] = 1;
					}
				} // 4방향 탐색
			}
			cnt++;
		}
	}
}

