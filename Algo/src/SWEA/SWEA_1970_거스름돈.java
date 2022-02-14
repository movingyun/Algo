package SWEA;

import java.util.Scanner;

public class SWEA_1970_거스름돈 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int[] arr = new int[8];
			int[] arr_2 = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
			int N = sc.nextInt();
			for (int i = 0; i < 8; i++) {
				arr[i] = N / arr_2[i];
				N = N % arr_2[i];
			}
			System.out.println("#" + tc);
			for (int i = 0; i < 8; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	}
}
