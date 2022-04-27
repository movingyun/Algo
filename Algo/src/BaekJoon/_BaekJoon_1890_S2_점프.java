package BaekJoon;

import java.util.Scanner;

public class _BaekJoon_1890_S2_점프 {
	static int[][] map;
	static int cnt;
	static int a;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		map = new int[a][a];
		cnt = 0;
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		dfs(0, 0);
		System.out.println(cnt);
	}// main함수

	public static void dfs(int r, int c) {
		// 끝에 도달하면 끝내
		if (r == a - 1 && c == a - 1) {
			cnt++;
			return;
		}

		// 재귀
		int num = map[r][c];
		if (r + num < a)
			dfs(r + num, c);
		if (c + num < a)
			dfs(r, c + num);
	}
}
