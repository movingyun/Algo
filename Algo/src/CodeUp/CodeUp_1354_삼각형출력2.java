package CodeUp;

import java.util.Scanner;

public class CodeUp_1354_삼각형출력2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = n; i != 0; i--) {
			for (int k = i; k > 0; k--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}