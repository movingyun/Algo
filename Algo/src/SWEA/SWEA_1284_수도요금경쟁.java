package SWEA;

import java.util.Scanner;

public class SWEA_1284_수도요금경쟁 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int result_a = 0;
			int result_b = 0;
			int p = sc.nextInt();
			int q = sc.nextInt();
			int r = sc.nextInt();
			int s = sc.nextInt();
			int w = sc.nextInt();

			result_a = p * w;
			if (w <= r)
				result_b = q;
			else
				result_b = q + (w - r) * s;
			System.out.println("#" + tc + " " + Math.min(result_a, result_b));
		}
	}
}
