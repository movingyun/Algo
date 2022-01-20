package CodeUp;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp_1411_빠진카드 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n-1];
		int[] arr2 = new int[n];

		for (int i = 0; i < n-1; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			arr2[arr[i]-1]++;
		}

		for (int i = 1; i < arr2.length+1; i++) {
			if (arr2[i-1] == 0)
				System.out.println(i);
		}

	}
}
