package BaekJoon;

import java.util.Arrays;
import java.util.Comparator;
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

		Arrays.sort(arr, new Comparator<int[]>() {
			public int compare(int[] o1, int[] o2) {
				if (o1[0] == o2[0]) {
					return o1[1] - o2[1];
				} else {
					return o1[0] - o2[0];
				}
			}
		});

		for (int i = 0; i < T; i++) {
			System.out.print(arr[i][0] + " " + arr[i][1]+"\n");
		}
	}
}
