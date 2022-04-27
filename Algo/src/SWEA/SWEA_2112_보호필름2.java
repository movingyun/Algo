package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SWEA_2112_보호필름2 {
	static int[][] map;
	static int[] visit;
	static int D, W, K;
	static int min;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			D = sc.nextInt(); // map 세로크기
			W = sc.nextInt(); // map 가로크기
			K = sc.nextInt();
			map = new int[D][W];
			for (int i = 0; i < D; i++) {
				for (int j = 0; j < W; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			min = 9999;
			dfs(0, 0);
			System.out.printf("#%d %d\n", tc, min);
		} // tc끝
	}// main 끝

	private static void dfs(int idx, int cnt) {
		// 끝내
		if (idx == D) {
			if (check()) {
				if (cnt < min) {
					min = cnt;
				}
			}
			return;
		}
		
		int[] backup = new int[W];
		for(int i=0; i<W; i++) {
			backup[i] = map[idx][i];
		}

		// 재귀
		// 약품 x
		dfs(idx + 1, cnt); 
		
		// 약품 a
		Arrays.fill(map[idx], 0);
		dfs(idx + 1, cnt + 1);
		
		// 약품 b
		Arrays.fill(map[idx], 1);
		dfs(idx + 1, cnt + 1);
		map[idx] = backup;
	}

	private static boolean check() {// 보호필름 성능검사
		// 열을 고정 행을 탐색
		// 연속된 셀의 같은 특성이 K개 이상인지 검사
		for (int c = 0; c < W; c++) { // 열 고정
			int count = 1;
			int before = map[0][c];

			for (int r = 1; r < D; r++) {
				int current = map[r][c];
				if (before == current) {
					if (++count == K)
						break;
				} else {
					before = current;
					count = 1;
				}
			}
			if (count < K)
				return false;
		}
		return true;
	}

}