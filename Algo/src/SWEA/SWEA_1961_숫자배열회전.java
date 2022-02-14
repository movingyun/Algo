package SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_1961_숫자배열회전 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int a = sc.nextInt();
			int[] arr = new int[a * a];
			for (int i = 0; i < a * a; i++) {
				arr[i] = sc.nextInt();
			}

			int num = 0;
			int[][] arr_90 = new int[a][a];
			for (int j = a - 1; j >= 0; j--) {
				for (int i = 0; i < a; i++) {
					arr_90[i][j] = arr[num];
					num++;
				}
			}

			num = 0;
			int[][] arr_180 = new int[a][a];
			for (int i = a - 1; i >= 0; i--) {
				for (int j = a - 1; j >= 0; j--) {
					arr_180[i][j] = arr[num];
					num++;
				}
			}

			num = 0;
			int[][] arr_270 = new int[a][a];
			for (int j = 0; j < a; j++) {
				for (int i = a - 1; i >= 0; i--) {
					arr_270[i][j] = arr[num];
					num++;
				}
			}

			System.out.println("#" + tc + " ");
			for (int i = 0; i < a; i++) {
				for (int j = 0; j < a; j++) {
					System.out.print(arr_90[i][j]);
				}
				System.out.print(" ");
				for (int q = 0; q < a; q++) {
					System.out.print(arr_180[i][q]);
				}
				System.out.print(" ");
				for (int k = 0; k < a; k++) {
					System.out.print(arr_270[i][k]);
				}
				System.out.println();
			}
		}

	}
}
