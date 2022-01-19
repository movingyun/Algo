package CodeUp;

import java.util.Scanner;

public class CodeUp_1405_숫자로테이션 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		for (int j = 0; j < n; j++) {
			for (int i = j; i < arr.length; i++)
				System.out.print(arr[i] + " ");
			for (int k = 0; k < j; k++)
				System.out.print(arr[k] + " ");

			System.out.println("");
		}

	}
}
