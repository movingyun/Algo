package BaekJoon;

import java.util.Scanner;

public class BaekJoon_9663_G5_N_Queen {

	static int N;
	static int[][] map;
	static int cnt;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		map = new int[N][N];
		cnt = 0;
		dfs(0);
		System.out.println(cnt);
	}

	public static void dfs(int dept) {
		// 끝내
		if (dept == N) {
			cnt++;
			return;
		}

		// 재귀
		for (int i = 0; i < N; i++) {
			if (check(dept, i)) { //백트레킹
				if (map[dept][i] == 0) {
					map[dept][i] = 1;
					dfs(dept + 1);
					map[dept][i] = 0;
				}
			}
		}
	}

	static int[] dc = { -1, 0, 1 };

	// 3방향 확인
	public static boolean check(int r, int c) {
		for (int i = 0; i < 3; i++) {
			int nr = r;
			int nc = c;
			while (true) {
				nr -= 1;
				nc += dc[i];
				if(nr<0||nc<0||nc>=N) break;
				if(map[nr][nc]==1) return false;
			}
		}
		return true;
	}

}
