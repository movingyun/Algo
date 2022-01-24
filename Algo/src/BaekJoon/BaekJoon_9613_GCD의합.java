package BaekJoon;

import java.util.Scanner;

public class BaekJoon_9613_GCD의합 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int t = sc.nextInt();
			int[] arr = new int[t];

			for (int j = 0; j < t; j++) {
				arr[j] = sc.nextInt();
			}

			long sum = 0;
			long min;
			long max;
			for (int k = 0; k < t - 1; k++) {
				for (int q = 0; q < t - k - 1; q++) {
					int a = arr[k];
					int b = arr[k + q + 1];
					max = Math.max(a, b);
					min = Math.min(a, b);

					for (;;) {
						if (max % min == 0)
							break;
						long temp = max % min;
						max = min;
						min = temp;
					}
					sum += min;
				}
			}
			System.out.println(sum);
		}
	}
}
