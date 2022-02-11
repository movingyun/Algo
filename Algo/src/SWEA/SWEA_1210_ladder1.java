package SWEA;

import java.util.Scanner;

public class SWEA_1210_ladder1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int tc = 1; tc <= 10; tc++) {
			sc.next();
			int[][] arr = new int[100][100];
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			int idx = -1;
			for (int i = 0; i < 100; i++) {
				if (arr[99][i] == 2)
					idx = i;
			}
			int result = -1;
			for (int i = 99; i >= 0; i--) {

				if (idx!=0&&arr[i][idx - 1] == 1) {
					while (idx!=0&&arr[i][idx - 1] == 1) {
						{
							idx -= 1;
						}
					}
				}
				else if (idx!=99&&arr[i][idx + 1] == 1) {
					while (idx!=99&&arr[i][idx + 1] == 1) {
						{
							idx += 1;
						}
					}
				}
				else if (i == 0)
					result = idx;
			}
			System.out.printf("#%d %d\n", tc, result);
		}
	}
}
