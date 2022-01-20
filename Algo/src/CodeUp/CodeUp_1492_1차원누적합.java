package CodeUp;

import java.util.Scanner;

public class CodeUp_1492_1차원누적합 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int a = 0;
		for (int i = 0; i < n; i++) {
			a = a + arr[i];
			System.out.println(a);
		}

	}
}
