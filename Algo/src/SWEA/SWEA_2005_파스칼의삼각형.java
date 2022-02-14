package SWEA;

import java.util.Scanner;

public class SWEA_2005_파스칼의삼각형 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int a = sc.nextInt();
			int[] arr_old = null;
			System.out.println("#" + tc);
			for (int i = 0; i < a; i++) {
				int[] arr = new int[i + 3];
				if (i == 0)
					arr[1] = 1;
				else
					for (int q = 1; q < i + 2; q++) {
						arr[q] = arr_old[q - 1] + arr_old[q];
					}
				for (int j = 1; j <= i + 1; j++) {
					System.out.print(arr[j]+" ");
				}
				System.out.println();
				arr_old = arr.clone();
			}
		}
	}
}
