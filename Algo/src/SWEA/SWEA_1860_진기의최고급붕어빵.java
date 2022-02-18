package SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_1860_진기의최고급붕어빵 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int K = sc.nextInt();
			String result = "Possible";
			int[] arr = new int[N];
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			for (int i = 0; i < N; i++) {
				if ((arr[i] / M) * K - i < 1)
					result = "Impossible";
			}
			System.out.println("#" + tc + " " + result);
		}

	}
}
