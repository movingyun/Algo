package BaekJoon;

import java.util.Scanner;

public class BaekJoon_17070_G5_파이프옮기기2 {

	static int a, cnt;
	static int[][] map;

	static class pos {
		int x, y, situ;

		public pos(int x, int y, int situ) {
			this.x = x;
			this.y = y;
			this.situ = situ;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		map = new int[a][a];
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		dfs(new pos(0, 1, 1));
		System.out.println(cnt);
	}// main함수

	// 1: 가로 2: 대각 3: 세로
	public static void dfs(pos pos) {
		// 끝내
		if (pos.x == a - 1 && pos.y == a - 1 && map[pos.x][pos.y] == 0) {
			cnt++;
			return;
		}

		// 재귀
		if (pos.situ == 1) {// 가로면
			if (pos.x < a && pos.y + 1 < a && map[pos.x][pos.y + 1] == 0)
				dfs(new pos(pos.x, pos.y + 1, 1)); // 가로
			if (pos.x + 1 < a && pos.y + 1 < a && map[pos.x + 1][pos.y + 1] == 0 && map[pos.x][pos.y + 1] == 0
					&& map[pos.x + 1][pos.y] == 0)
				dfs(new pos(pos.x + 1, pos.y + 1, 2)); // 대각
		}

		if (pos.situ == 2) {// 대각이면
			if (pos.x < a && pos.y + 1 < a && map[pos.x][pos.y + 1] == 0)
				dfs(new pos(pos.x, pos.y + 1, 1)); // 가로
			if (pos.x + 1 < a && pos.y + 1 < a && map[pos.x + 1][pos.y + 1] == 0 && map[pos.x][pos.y + 1] == 0
					&& map[pos.x + 1][pos.y] == 0)
				dfs(new pos(pos.x + 1, pos.y + 1, 2)); // 대각
			if (pos.x + 1 < a && pos.y < a && map[pos.x + 1][pos.y] == 0)
				dfs(new pos(pos.x + 1, pos.y, 3)); // 세로
		}

		if (pos.situ == 3) {// 세로면
			if (pos.x + 1 < a && pos.y < a && map[pos.x + 1][pos.y] == 0)
				dfs(new pos(pos.x + 1, pos.y, 3)); // 세로
			if (pos.x + 1 < a && pos.y + 1 < a && map[pos.x + 1][pos.y + 1] == 0 && map[pos.x][pos.y + 1] == 0
					&& map[pos.x + 1][pos.y] == 0)
				dfs(new pos(pos.x + 1, pos.y + 1, 2)); // 대각
		}
	}
}
