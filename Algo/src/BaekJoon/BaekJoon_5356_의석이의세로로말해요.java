package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_5356_의석이의세로로말해요 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int max = 0;
		for (int tc = 1; tc <= T; tc++) {
			char[][] arr = new char[5][];
			for (int i = 0; i < 5; i++) {
				arr[i] = sc.next().toCharArray();
				if (arr[i].length > max)
					max = arr[i].length;
			}
			System.out.print("#" + tc + " ");
			for (int j = 0; j < max; j++) {
				for (int i = 0; i < 5; i++) {
					if (arr[i].length - 1 < j)
						continue;
					System.out.print(arr[i][j]);
				}
			}
			System.out.println();
		}
	}
}
