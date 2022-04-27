package BaekJoon;

import java.util.Scanner;

public class BaekJoon_17070_G5_파이프옮기기3 {
	static int a, cnt;
	static int[][] map;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		map = new int[a][a];
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		cnt = 0;
		dfs(0, 1, 1);
		System.out.println(cnt);
	}// main

	// 가로 대각 세로
	public static void dfs(int r, int c, int situ) {
		if (r == a - 1 && c == a - 1) {
			cnt++;
			return;
		}

		if (situ != 3 && c + 1 < a && map[r][c + 1] == 0) {
			dfs(r, c + 1, 1);
		}

		if (c + 1 < a && r + 1 < a && map[r][c + 1] == 0 && map[r + 1][c] == 0 && map[r + 1][c + 1] == 0) {
			dfs(r + 1, c + 1, 2);
		}

		if (situ != 1 && r + 1 < a && map[r + 1][c] == 0) {
			dfs(r + 1, c, 3);
		}
	}// dfs

}
