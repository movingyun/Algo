package SWEA;

import java.util.Arrays;
import java.util.Scanner;

//22.02.20

public class SWEA_3499_퍼펙트셔플 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int a = sc.nextInt();
			String[] arr = new String[a];
			for (int i = 0; i < a; i++) {
				arr[i] = sc.next();
			}
			//배열 2개로 나누기
			String[] arr_1 = Arrays.copyOfRange(arr, 0, (a + 1) / 2);
			String[] arr_2 = Arrays.copyOfRange(arr, (a + 1) / 2, a);

			System.out.print("#" + tc + " ");
			for (int i = 0; i < arr_2.length; i++) {
				System.out.print(arr_1[i] + " ");
				System.out.print(arr_2[i] + " ");
			}
			if (arr_1.length != arr_2.length)
				System.out.print(arr_1[arr_1.length - 1]);
			System.out.println();
		}
	}
}
