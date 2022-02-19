package BaekJoon;

import java.util.Scanner;

public class BaekJoon_14696_딱지놀이 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			String result = "D";
			int a = sc.nextInt();
			int[] arr_a = new int[5];
			for (int i = 0; i < a; i++) {
				arr_a[sc.nextInt()]++;
			}

			int b = sc.nextInt();
			int[] arr_b = new int[5];
			for (int i = 0; i < b; i++) {
				arr_b[sc.nextInt()]++;
			}
			for (int i = 4; i >= 1; i--) {
				if (arr_a[i] > arr_b[i]) {
					result = "A";
					break;
				} else if (arr_a[i] < arr_b[i]) {
					result = "B";
					break;
				}
			}
			System.out.println(result);
		}
	}
}
