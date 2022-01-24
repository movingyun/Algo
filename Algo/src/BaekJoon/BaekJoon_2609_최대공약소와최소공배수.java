package BaekJoon;

import java.util.Scanner;

public class BaekJoon_2609_최대공약소와최소공배수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextInt();
		long b = sc.nextInt();

		long temp = 0;
		long min = Math.min(a, b);
		long max = Math.max(a, b);
		;

		for (;;) {
			if (max % min == 0)
				break;

			else {
				temp = max % min;
				max = min;
				min = temp;

			}

		}
		System.out.println(min);
		System.out.println(a * b / min);
	}
}
