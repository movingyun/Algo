package SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_1215_회문1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; tc++) {
			int a = sc.nextInt();
			char[][] arr = new char[8][8];
			for (int i = 0; i < 8; i++) {
				String b = sc.next();
				arr[i] = b.toCharArray();
			}
			int sum = 0;
//		System.out.println(Arrays.deepToString(arr)); //잘 들어갔는지 확인 OK
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8 - a + 1; j++) {
					int flag = 1;
					for (int q = 0; q < a / 2; q++) {
						if (arr[i][j + q] != arr[i][j + a - 1 - q]) {
							flag = 0;
							break;
						}
					}
					if (flag == 1)
						sum++;
				}
			}

			for (int j = 0; j < 8; j++) {
				for (int i = 0; i < 8 - a + 1; i++) {
					int flag = 1;
					for (int q = 0; q < a / 2; q++) {
						if (arr[i + q][j] != arr[i + a - 1 - q][j]) {
							flag = 0;
							break;
						}
					}
					if (flag == 1)
						sum++;
				}
			}
			System.out.printf("#%d %d", tc, sum);
			System.out.println();
		}
	}
}
