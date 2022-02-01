package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_10989_수정렬 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[10000001];
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			arr[a]++;
		}
		for (int i = 0; i <= 10000000; i++) {
			if (arr[i] != 0)
				for (int j = 0; j < arr[i]; j++)
					System.out.println(i);
		}

	}
}
