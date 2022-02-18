package BaekJoon;

import java.util.Scanner;

public class BaekJoon_3985_롤케이크 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr = new int[a + 1];
		int T = sc.nextInt();
		int result_1 = 0;
		int result_2 = 0;
		int max = 0;
		int max_exp = 0;
		for (int tc = 1; tc <= T; tc++) {
			int cnt = 0;
			int num_s = sc.nextInt();
			int num_e = sc.nextInt();
			int exp = num_e - num_s + 1;

			if (max_exp < exp) {
				max_exp = exp;
				result_1 = tc;
			}

			for (int i = num_s; i <= num_e; i++) {
				if (arr[i] == 0) {
					cnt++;
					arr[i]++;
				}

			}

			if (cnt > max) {
				max = cnt;
				result_2 = tc;
			}

		}
		System.out.println(result_1);
		System.out.println(result_2);
	}
}
