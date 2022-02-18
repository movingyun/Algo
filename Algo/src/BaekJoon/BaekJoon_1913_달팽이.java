package BaekJoon;

import java.util.Scanner;

public class BaekJoon_1913_달팽이 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[][] arr = new int[a][a];
		int num = a * a;
		int i = 0;
		int j = 0;
		int x = 0;
		int y = 0;
		out: for (;;) {
			// 아래
			for (;;) {
				arr[i][j] = num;
				if (num == 1)
					break out;
				if (i == a - 1 || arr[i + 1][j] != 0)
					break;
				i++;
				num--;
				if (num == b) {
					x = i + 1;
					y = j + 1;
				}
			}
			// 우측
			for (;;) {
				j++;
				num--;
				if (num == b) {
					x = i + 1;
					y = j + 1;
				}
				arr[i][j] = num;
				if (num == 1)
					break out;
				if (j == a - 1 || arr[i][j + 1] != 0)
					break;
			}
			// 위로
			for (;;) {
				i--;
				num--;
				if (num == b) {
					x = i + 1;
					y = j + 1;
				}
				arr[i][j] = num;
				if (num == 1)
					break out;
				if (i == 0 || arr[i - 1][j] != 0)
					break;
			}
			// 왼쪽
			for (;;) {
				j--;
				num--;
				if (num == b) {
					x = i + 1;
					y = j + 1;
				}
				arr[i][j] = num;
				if (num == 1)
					break out;
				if (j == 0 || arr[i][j - 1] != 0)
					break;
			}

		}
		for (int q = 0; q < a; q++) {
			for (int k = 0; k < a; k++) {
				System.out.print(arr[q][k] + " ");
			}
			System.out.println();
		}
		System.out.printf("%d %d", x, y);
	}
}
