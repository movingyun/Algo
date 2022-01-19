package BaekJoon;

import java.util.Scanner;

public class BaekJoon_1789_수들의합 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		long num = 1;
		long sum = 0;
		long cnt = 0;

		for (;;) {
			sum += num;
			if (sum > n)
				break;
			num++;
			cnt++;
		}
		System.out.println(cnt);
	}
}
