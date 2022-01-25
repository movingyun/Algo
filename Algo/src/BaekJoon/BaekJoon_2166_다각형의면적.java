package BaekJoon;

import java.util.Scanner;

public class BaekJoon_2166_다각형의면적 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long[][] arr = new long[n][2];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		long sum1 = 0;
		long sum2 = 0;

		for (int i = 0; i < n; i++) {
			if (i == n - 1)
				sum1 += arr[i][0] * arr[0][1];
			else if (i != n - 1)
				sum1 += arr[i][0] * arr[i + 1][1];
		}

		for (int i = 0; i < n; i++) {
			if (i == n - 1)
				sum2 += arr[0][0] * arr[i][1];
			else if (i != n - 1)
				sum2 += arr[i + 1][0] * arr[i][1];
		}

		double a = Math.abs(sum1 - sum2);
		System.out.printf("%.1f", a / 2);

	}
}