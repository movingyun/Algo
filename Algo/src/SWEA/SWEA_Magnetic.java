package SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_Magnetic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; tc++) {
			int a = sc.nextInt();
			int[][] arr = new int[a][a];
			for (int i = 0; i < a; i++) {
				for (int j = 0; j < a; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			int cnt = 0;
			
			for (int j = 0; j < a; j++) {
				int flag = 0;
				for (int i = 0; i < a; i++) {
					if (arr[i][j] == 1)
						flag = 1;
					else if (arr[i][j] == 2 && flag == 1) {
						flag = 0;
						cnt++;
					}
				}
			}
			System.out.printf("#%d %d\n", tc, cnt);
		}

	}
}
