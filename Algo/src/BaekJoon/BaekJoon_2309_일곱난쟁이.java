package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_2309_일곱난쟁이 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		for (int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int num1 = 0;
		int num2 = 0;
		out: for (;;) {
			for (int i = 0; i < 8; i++) {
				for (int j = i + 1; j < 9; j++) {
					int sum = 0;
					for (int q = 0; q < 9; q++) {
						if (q == i || q == j)
							continue;
						sum += arr[q];
					}
					if (sum == 100) {
						for (int o = 0; o < 9; o++) {
							if (o == i || o == j)
								continue;
							System.out.println(arr[o]);
						}
						break out;
					}
				}
			}
		}
	}
}
