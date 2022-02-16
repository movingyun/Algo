package SWEA;

import java.util.Scanner;

public class SWEA_10505_소득불균형 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int cnt = 0;
			int sum = 0;
			int a = sc.nextInt();
			int[] arr = new int[a];
			for (int i = 0; i < a; i++) {
				arr[i] = sc.nextInt();
				sum += arr[i];
			}
			double avg = (double) sum / a;
			for (int i = 0; i < a; i++) {
				if (arr[i] <= avg)
					cnt++;
			}
			System.out.printf("#%d %d\n", tc, cnt);
		}

	}
}
