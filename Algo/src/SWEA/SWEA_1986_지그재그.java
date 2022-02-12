package SWEA;

import java.util.Scanner;

public class SWEA_1986_지그재그 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int a = sc.nextInt();
			int result = 0;
			for (int i = 1; i <= a; i++) {
				if (i % 2 == 0)
					result -= i;
				else
					result += i;
			}
			System.out.println("#" + tc + " " + result);
		}
	}
}
