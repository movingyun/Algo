package CodeUp;

import java.util.Scanner;

public class CodeUp_1357_삼각형출력4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int k = i; k > 0; k--) {
				System.out.print("*");
			}
			System.out.println("");
		}

		for (int i = n - 1; i > 0; i--) {
			for (int k = i; k > 0; k--) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}
}