package BaekJoon;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//bfs로 최단길이 구하기
public class BaekJoon_2178_S1_미로탐색 {
	static class pos {
		int r;
		int c;

		public pos(int r, int c) {
			this.r = r;
			this.c = c;
		}
	}

	static boolean visit[][];
	static char[][] map;
	static int[] dr = { -1, 1, 0, 0 }; // 상하좌우
	static int[] dc = { 0, 0, -1, 1 };
	static int ansDist;
	static Queue<pos> queue = new LinkedList<pos>();
	static int r;
	static int c;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt();
		c = sc.nextInt();
		map = new char[r][c];
		visit = new boolean[r][c];
		ansDist = 0;

		for (int i = 0; i < r; i++) {
			map[i] = sc.next().toCharArray();
		}
		bfs();
		System.out.println(ansDist + 1);

	}// main함수

	public static void bfs() {
		// 1. 큐 생성(static으로 함)

		// 2. 시작점 넣기
		queue.add(new pos(0, 0));
		visit[0][0] = true;

		// 3. 큐가 공백일때까지 반복수행
		outer: while (!queue.isEmpty()) {
			int size = queue.size();
			// 사이즈 만큼 돌아야 최단길이 알수있음.
			for (int i = 0; i < size; i++) {

				// 3-1. 큐 제일앞에 하나 꺼내.
				pos curr = queue.poll();
				// 3-3. 끝내
				if (curr.r == r - 1 && curr.c == c - 1) {
					break outer;
				}

				// 3-2. 걔의 자식들 다 담아.
				for (int q = 0; q < 4; q++) {
					int nr = curr.r + dr[q];
					int nc = curr.c + dc[q];

					// 자식 검증
					if (nr < 0 || nr >= r || nc < 0 || nc >= c)
						continue;
					if (map[nr][nc] == '0' || visit[nr][nc] == true)
						continue;

					// 검증 통과했으면 가는목록에 추가!
					visit[nr][nc] = true;
					queue.add(new pos(nr, nc));
				} // 4방향 탐색
			}
			ansDist++;
		} // while문 종료

	}// bfs끝
}
