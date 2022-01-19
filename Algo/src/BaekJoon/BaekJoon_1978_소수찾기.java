package BaekJoon;

import java.util.Scanner;

public class BaekJoon_1978_소수찾기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];
		
		int cnt = 0;

		for (int i = 0; i < n; i++) {
			int sum = 0;
			arr[i] = sc.nextInt();

			for (int k = 1; k <= arr[i]; k++) {
				if ((arr[i] % k) == 0)
					sum += k;
			}
			if (sum == (arr[i] + 1))
				cnt++;
		}
		System.out.println(cnt);
	}
}