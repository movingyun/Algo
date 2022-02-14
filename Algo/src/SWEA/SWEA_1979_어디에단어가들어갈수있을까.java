package SWEA;

import java.util.Scanner;

public class SWEA_1979_어디에단어가들어갈수있을까 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = sc.nextInt();
			int num = sc.nextInt();
			int[][] arr = new int[n + 1][n + 1];
			int result = 0;

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					arr[i][j] = sc.nextInt();
				}
			}

			for (int i = 0; i < n; i++) {
				int sum = 0;
				for (int j = 0; j < n; j++) {
					sum += arr[i][j];
					if (sum == num && arr[i][j + 1] == 0) {
						result += 1;
						sum = 0;
					}
					if (arr[i][j] == 0)
						sum = 0;
				}
			}
			for (int j = 0; j < n; j++) {
				int sum = 0;
				for (int i = 0; i < n; i++) {
					sum += arr[i][j];
					if (sum == num && arr[i+1][j] == 0) {
						result += 1;
						sum = 0;
					}
					if (arr[i][j] == 0)
						sum = 0;
				}
			}
			System.out.println("#" + tc + " " + result);
		}
	}
}
