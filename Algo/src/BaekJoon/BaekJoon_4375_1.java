package BaekJoon;

import java.util.Scanner;

public class BaekJoon_4375_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = 1;
		long cnt = 10;
		long result = 0;

		for (;;) {
			int n = sc.nextInt();

			for (;;) {
				if (a % n == 0) {
					result = a;
					break;
				} else {
					a += cnt;
					cnt *= 10;
				}
			}
			System.out.println(result);
		}
	}
}
