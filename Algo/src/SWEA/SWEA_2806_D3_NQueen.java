package SWEA;

import java.util.Scanner;

public class SWEA_2806_D3_NQueen {
	static int N;
	static int[][] map;
	static int ans;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			ans = 0;
			map = new int[N][N];
			dropTheQueen(0);
			System.out.println("#" + tc + " " + ans);
		}
	}

	static void dropTheQueen(int r) {
		if (r == N) {
			// 끝까지 전부 놓았어

			// 이번에 놓은 퀸들이 잘 놓아졌는지 확인
			ans++;
			return;
		}

		// 해당 행에서 퀸을 놓아봐야댐

		for (int c = 0; c < N; c++) {
			// 놓을수 있는 애들만 놓자!!
			if (check2(r, c)) {
				map[r][c] = 1; // 퀸을 놓았다.
				dropTheQueen(r + 1);
				map[r][c] = 0;
			} // if문
		} // for문

	}

	static int[] dc = { -1, 0, 1 };

	private static boolean check(int r, int c) {
		for (int i = 0; i < 3; i++) {
			// 3방향 확인
			int nr = r;
			int nc = c;
			while (true) {
				nr -= 1;
				nc += dc[i];
				if (nr < 0 || nc < 0 || nc >= N)
					break;
				if (map[nr][nc] == 1)
					return false;
			}
		}
		// 끝까지 살았으면 넌 ok
		return true;
	}

	private static boolean check2(int r, int c) {
		int left = c;
		int right = c;
		for (int i = r - 1; i >= 0; i--) {
			left--;
			right++;

			if (map[i][c] == 1)
				return false;// 위쪽 확인
			if (left >= 0 && map[i][left] == 1)
				return false; // 왼대각 확인
			if (right < N && map[i][right] == 1)
				return false; // 오른대각 확인

		}
		return true;
	}

}
