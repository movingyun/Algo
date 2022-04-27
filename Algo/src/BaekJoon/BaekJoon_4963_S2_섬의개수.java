package BaekJoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon_4963_S2_섬의개수 {

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
	static int[] dr = { -1, -1, 0, 1, 1, 1, 0, -1 }; // 상에서시작해서 시계방향
	static int[] dc = { 0, 1, 1, 1, 0, -1, -1, -1 };
	static Queue<pos> q = new LinkedList<pos>();
	static int cnt1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			w = sc.nextInt();
			h = sc.nextInt();
			if (h == 0 && w == 0)
				break;
			map = new int[h][w];
			visit = new int[h][w];
			result = 0;
			cnt1=0;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					map[i][j] = sc.nextInt();
					if(map[i][j]==1) cnt1++;
				}
			}
			bfs();
			System.out.println(result);
			
			
		} // 무한for문 끝
	}// main함수 끝

	public static void bfs() {
		// 큐 생성(위에서 함)

		// 시작점 넣기
		int cnt =0;
		//첫값 넣기
		while(cnt!=cnt1) {
			outer : for(int i=0; i<h; i++) {
				for(int j=0; j<w; j++) {
					if(visit[i][j]==0&&map[i][j]==1) {
						q.add(new pos(i, j));
						visit[i][j] = 1;
						cnt++;
						break outer;
					}
				}
			}//첫 값 넣기끝
	
			// 큐가 공백일때까지 수행
			while (!q.isEmpty()) {
				int size = q.size();
				for (int i = 0; i < q.size(); i++) {
					// q앞에 꺼내
					pos curr = q.poll();
					
					// 자식들 담아
					for (int d = 0; d < 8; d++) {
						int nr = curr.x + dr[d];
						int nc = curr.y + dc[d];
						
						// 자식 검증
						if (nr < 0 || nr >= h || nc < 0 || nc >= w)
							continue;
						if (map[nr][nc] == 0 || visit[nr][nc] == 1)
							continue;
						
						// 검증 통과했으면 q에 넣어
						visit[nr][nc] = 1;
						cnt++;
						q.add(new pos(nr, nc));
					} // 8방향 탐색
				}
			}
			result++;
		}//계속 도는거
	}
}
