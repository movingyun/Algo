package SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_1974_스도쿠검증 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] ans = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] arr_1 = new int[9];
		for (int tc = 1; tc <= T; tc++) {
			int[][] arr = new int[9][9];
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			int flag = 1;
			// 행 확인
			out: for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					arr_1[j] = arr[i][j];
				}
				Arrays.sort(arr_1);
				for (int q = 0; q < 9; q++) {
					if (arr_1[q] != ans[q]) {
						flag = 0;
						break out;
					}
				}
			}

			// 열 확인
			out: for (int j = 0; j < 9; j++) {
				for (int i = 0; i < 9; i++) {
					arr_1[i] = arr[i][j];
				}
				Arrays.sort(arr_1);
				for (int q = 0; q < 9; q++) {
					if (arr_1[q] != ans[q]) {
						flag = 0;
						break out;
					}
				}
			}

			// 정사각형 확인
            for (int i = 0; i < 9; i += 3) {
                for (int j = 0; j < 9; j += 3) {
                     
                    int[] cnt = new int[10];
                     
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                        	cnt[arr[k][l]]++;
                        }
                    }
                    for(int k = 1; k < 10; k++) {
                        if (cnt[k] == 0)
                            flag = 0;
                    }
                }
            }
			System.out.println("#" + tc + " " + flag);
		}
	}
}
