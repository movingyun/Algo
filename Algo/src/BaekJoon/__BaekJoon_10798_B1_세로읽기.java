package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;
//22.03.10
//사실 SWEA에서 푼거 배껴옴...
//열,행순으로 읽으면서 더이상 없으면 continue해준다.
public class __BaekJoon_10798_B1_세로읽기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		char[][] arr = new char[5][];
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.next().toCharArray();
			if (arr[i].length > max)
				max = arr[i].length;
		}
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
