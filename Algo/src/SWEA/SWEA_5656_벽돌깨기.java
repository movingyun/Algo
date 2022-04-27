package SWEA;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SWEA_5656_벽돌깨기 {

	static int N, W, H;
	static int[][] map;
	static int[] loc;
	static int min;
	static int[][] mapClone;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			W = sc.nextInt();
			H = sc.nextInt();
			map = new int[H][W];
			loc = new int[N];
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			min = Integer.MAX_VALUE;
			selectLoc(0);
			System.out.println("#" + tc + " " + min);
		} // tc
	}// main

	// 중복가능 순열
	static public void selectLoc(int dept) {
		// 위치를 다 뽑았으면
		if (dept == N) {
			// 똑같이 생긴 map을 만들어서
			mapClone = new int[H][W];
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					mapClone[i][j] = map[i][j];
				}
			}
			// 고른 위치대로 돌을 떨궈보고
			for (int i = 0; i < N; i++) {
				dropBall(loc[i]);
			}
			// 남은돌을 세서
			int result = cntBlock();
			// 남은 돌이 min보다 작으면 min을 기록한다.
			if (result < min)
				min = result;
			return;
		}
		// 자리 고르기
		for (int i = 0; i < W; i++) {
			loc[dept] = i;
			selectLoc(dept + 1);
		}
	}// selectLoc

	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };

	public static void dropBall(int c) {
		// 돌을 떨궈
		for (int q = 0; q < H; q++) {
			// 떨궈서 처음 벽을 만나면 그 수만큼 벽을 뿌셔!
			if (mapClone[q][c] != 0) {
				bomb(q, c);
				break;
			}
		}
		// 내리자
		gravity();
		return;
	}// dropball

	public static void bomb(int r, int c) {
		if (r < 0 || r >= H || c < 0 || c >= W)
			return;
		// 더이상 꺨게 없어
		if (mapClone[r][c] == 0)
			return;

		int power = mapClone[r][c];
		mapClone[r][c] = 0;

		for (int k = 0; k < 4; k++) {
			// 벽돌의 파괴력 -1만큼 뿌실거야
			for (int p = 1; p < power; p++) {
				int nr = r + dr[k] * p;
				int nc = c + dc[k] * p;
				bomb(nr, nc);
			}
		}
	}

	public static void gravity() {
		for (int j = 0; j < W; j++) {
			for (int i = H - 1; i >= 0; i--) {
				if (mapClone[i][j] == 0) {
					// 올라가면서 0이 아닌애가 나올때까지
					for (int r = i - 1; r >= 0; r--) {
						if (mapClone[r][j] != 0) {
							mapClone[i][j] = mapClone[r][j];
							mapClone[r][j] = 0;
							break;
						}
					}
				}
			}
		}
		return;
	}

	// 남은 벽돌구하기
	public static int cntBlock() {
		// 남은 벽의 수 구하기
		int result = 0;
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (mapClone[i][j] != 0)
					result++;
			}
		}
		return result;
	}
}
