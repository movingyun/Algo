package BaekJoon;

import java.util.Scanner;

public class _BaekJoon_17213_과일서리 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int result = n * (n - 1) * (m - n - 1);

		if (n!=1 && n!=m)
			System.out.println(result);
		else
			System.out.println(1);

	}
}
