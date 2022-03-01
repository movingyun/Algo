package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

//22.02.28
//최대값을 구하는거니까 가장 큰 크기부터 보면서 값이 있으면 break!
public class BaekJoon_1051_숫자정사각형 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		char[][] arr = new char[r][c];

		for (int i = 0; i < r; i++) {
			arr[i] = sc.next().toCharArray();
		}
		int result = 1;
		out: for (int len = Math.min(r, c); len > 0; len--) {
			for (int i = 0; i < r - len + 1; i++) {
				for (int j = 0; j < c - len + 1; j++) {
					if (arr[i][j] == arr[i + len - 1][j + len - 1] && arr[i][j] == arr[i][j + len - 1]
							&& arr[i][j] == arr[i + len - 1][j]) {
						result = len * len;
						break out;
					}

				}
			}
		}
		System.out.println(result);
	}
}
