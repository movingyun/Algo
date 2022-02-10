package SWEA;

import java.util.Scanner;

public class SWEA_1945_소인수분해 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int a = 0, b = 0, c = 0, d = 0, e = 0;
			if (N % 2 == 0)
				for (;;) {
					N = N / 2;
					a++;
					if (N % 2 != 0)
						break;
				}
			if (N % 3 == 0)
				for (;;) {
					N = N / 3;
					b++;
					if (N % 3 != 0)
						break;
				}
			if (N % 5 == 0)
				for (;;) {
					N = N / 5;
					c++;
					if (N % 5 != 0)
						break;
				}
			if (N % 7 == 0)
				for (;;) {
					N = N / 7;
					d++;
					if (N % 7 != 0)
						break;
				}
			if (N % 11 == 0)
				for (;;) {
					N = N / 11;
					e++;
					if (N % 11 != 0)
						break;
				}
			System.out.printf("#%d %d %d %d %d %d\n", tc, a, b, c, d, e);
		}
	}
}
