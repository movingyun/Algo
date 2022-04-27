package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _BaekJoon_1890_S2_점프2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] map = new int[N][N];
		long[][] dp = new long[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		dp[0][0] = 1;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i == N - 1 && j == N - 1)
					break;
				else {
					int right = j + map[i][j];
					int down = i + map[i][j];

					if (right < N)
						dp[i][right] += dp[i][j];
					if (down < N)
						dp[down][j] += dp[i][j];
				}
			}
		}
		System.out.println(dp[N - 1][N - 1]);
	}

}