package BaekJoon;

import java.util.Scanner;

public class BaekJoon_17427_약수의합2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextInt();
		long sum = 0;

		for (int i = 1; i <= n; i++) {
			sum += i * (n / i);
		}
		System.out.println(sum);

	}
}