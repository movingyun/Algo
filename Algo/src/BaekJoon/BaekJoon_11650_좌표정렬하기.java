package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_11650_좌표정렬하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[][] arr = new int[T][2];
		for (int i = 0; i < T; i++) {
			for (int j = 0; j < 2; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < T; i++) {
			int[] tmp = null;
			for (int j = 1; j < T - i; j++) {
				if (arr[i][0] > arr[i + j][0]) {
					tmp = arr[i];
					arr[i] = arr[i + j];
					arr[i + j] = tmp;
				}
				else if (arr[i][0] == arr[i + j][0] && arr[i][1] > arr[i + j][1]) {
					tmp = arr[i];
					arr[i] = arr[i + j];
					arr[i + j] = tmp;
				}
			}
		}

		for(int i=0; i<T; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
