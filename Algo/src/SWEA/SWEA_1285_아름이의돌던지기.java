package SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_1285_아름이의돌던지기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int a = sc.nextInt();
			int[] arr = new int[a];
			for (int i = 0; i < a; i++) {
				int num = sc.nextInt();
				arr[i] = Math.abs(num);
			}
			Arrays.sort(arr);
			int sum = 0;
			for (int i = 0; i < a; i++) {
				if (arr[i] == arr[0])
					sum++;
			}
			System.out.println("#" + tc + " " + arr[0] + " " + sum);
		}
	}
}
