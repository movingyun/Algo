package CodeUp;

import java.util.Scanner;

public class CodeUp_1403_배열두번출력 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();
		int[] arr = new int[k];

		for (int i = 0; i < k; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < k; i++) {
			System.out.println(arr[i]);
		}
		for (int i = 0; i < k; i++) {
			System.out.println(arr[i]);
		}

	}
}
