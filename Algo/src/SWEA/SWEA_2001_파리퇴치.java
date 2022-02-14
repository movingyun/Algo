package SWEA;

import java.util.Scanner;

public class SWEA_2001_파리퇴치 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] arr = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			int max = 0;
			for (int num = 0; num <= n - m; num++) {
				for (int num2 = 0; num2 <= n - m; num2++) {
					int sum = 0;
					for (int i = num; i < m + num; i++) {
						for (int j = num2; j < m + num2; j++) {
							sum += arr[i][j];
						}
					}
					if (sum > max)
						max = sum;
				}
			}
			System.out.println("#" + tc + " " + max);
		}
	}
}
