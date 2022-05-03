package BaekJoon;

import java.util.Scanner;

//5.03. 틀림 -> 아래에서 위로 올라가는걸로 다시 풀어보자!!
public class BaekJoon_1932_정수삼각형 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int[][] map = new int[h][h];
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < i + 1; j++) {
				map[i][j] = sc.nextInt();
			}
		}

		int[] dp = new int[h];
		dp[0] = map[0][0];
		int idx = 0;

		for (int i = 1; i < h; i++) {
			int num1 = map[i][idx];
			int num2 = map[i][idx];
			int num3 = map[i][idx + 1];
			int num4 = map[i][idx + 1];
			if (i != h - 1) {
				num1 += map[i + 1][idx];
				num2 += map[i + 1][idx + 1];
				num3 += map[i + 1][idx + 1];
				num4 += map[i + 1][idx + 2];
			}
			int max = Math.max(Math.max(num1, num2), Math.max(num3, num4));
			if (max == num1 || max == num2) {
				dp[i] = dp[i - 1] + map[i][idx];
			} else if (max == num3 || max == num4) {
				dp[i] = dp[i - 1] + map[i][idx + 1];
				idx = idx + 1;
			}
		}
		System.out.println(dp[h - 1]);
	}
}
