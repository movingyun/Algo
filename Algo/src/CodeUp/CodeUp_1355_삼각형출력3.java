package CodeUp;

import java.util.Scanner;

public class CodeUp_1355_삼각형출력3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = n; i != 0; i--) {

			for (int j = i; j != n; j++) {
				System.out.print(" ");
			}

			for (int k = i; k > 0; k--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}