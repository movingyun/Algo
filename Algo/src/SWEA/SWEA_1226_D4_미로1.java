package SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_1226_D4_미로1 {

	static int result;
	static char[][] map;
	static int srow;
	static int scol;
	static int erow;
	static int ecol;
	static int visit[][];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = 10;
		for (int tc = 1; tc <= T; tc++) {
			sc.next(); // 테케버림
			map = new char[16][16];
			result = 0;
			visit = new int[16][16];
			String[] s = new String[16];

			// map입력, 시작 끝 기억
			for (int i = 0; i < 16; i++) {
				map[i] = sc.next().toCharArray();
				for (int j = 0; j < 16; j++) {
					if (map[i][j] == '2') {
						srow = i;
						scol = j;
					}
					if (map[i][j] == '3') {
						erow = i;
						ecol = j;
					}
				}
			}

			dfs(srow, scol);
			System.out.printf("#%d %d\n", tc, result);
		} // tc 끝
	}// main 끝

	static public void dfs(int r, int c) {
		if (r == erow && c == ecol) {
			result = 1;
			return;
		}

		// 상
		if (r - 1 > 0 && map[r - 1][c] != '1' && visit[r - 1][c] == 0) {
			visit[r - 1][c] = 1;
			dfs(r - 1, c);
		}

		// 하
		if (r + 1 < 16 && map[r + 1][c] != '1' && visit[r + 1][c] == 0) {
			visit[r + 1][c] = 1;
			dfs(r + 1, c);
		}

		// 좌
		if (c - 1 > 0 && c < 15 && map[r][c - 1] != '1' && visit[r][c - 1] == 0) {
			visit[r][c - 1] = 1;
			dfs(r, c - 1);
		}

		// 우
		if (c + 1 < 16 && map[r][c + 1] != '1' && visit[r][c + 1] == 0) {
			visit[r][c + 1] = 1;
			dfs(r, c + 1);
		}

	}

}
