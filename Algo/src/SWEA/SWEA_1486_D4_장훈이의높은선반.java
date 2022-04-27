package SWEA;

import java.util.Scanner;

public class SWEA_1486_D4_장훈이의높은선반 {

	static int N;
	static int[] h;
	static int b;
	static int min;
	static int pick;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			min = 1000;
			N = sc.nextInt();
			b = sc.nextInt();
			h = new int[N];
			for (int i = 0; i < N; i++) {
				h[i] = sc.nextInt();
			}
			for (int i = 1; i <= N; i++) {
				pick = i;
				select(0, 0, 0);
			}
			System.out.printf("#%d %d\n", tc, min);
		}

	}// main

	public static void select(int dept, int start, int sum) {
		// 끝내
		if (dept == pick) {
			if (sum >= b) {
				int cha = sum - b;
				if (cha < min)
					min = cha;
			}
			return;
		}

		// 재귀(조합)
		for (int i = start; i < N; i++) {
			select(dept + 1, i + 1, sum + h[i]);
		}
	}
}
