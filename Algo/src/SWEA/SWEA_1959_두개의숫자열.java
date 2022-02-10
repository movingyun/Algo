package SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_1959_두개의숫자열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int result = 0;
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[] arrM = new int[M];
			int[] arrN = new int[N];
			int[] arrResult = new int[Math.abs(M - N) + 1];

			for (int i = 0; i < N; i++) {
				arrN[i] = sc.nextInt();
			}

			for (int i = 0; i < M; i++) {
				arrM[i] = sc.nextInt();
			}

			if (arrN.length < arrM.length) {
				for (int j = 0; j < arrResult.length; j++) {
					int a = 0;
					for (int i = j; i < j + arrN.length; i++) {
						arrResult[j] += arrN[a] * arrM[i];
						a++;
					}
				}
			} else {
				for (int j = 0; j < arrResult.length; j++) {
					int a = 0;
					for (int i = j; i < j + arrM.length; i++) {
						arrResult[j] += arrN[i] * arrM[a];
						a++;
					}
				}
			}
			Arrays.sort(arrResult);
			result = arrResult[arrResult.length - 1];
			System.out.printf("#%d %d\n", tc, result);
		}
	}
}
