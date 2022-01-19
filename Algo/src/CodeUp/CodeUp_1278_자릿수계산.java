package CodeUp;

import java.util.Scanner;

public class CodeUp_1278_자릿수계산 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int result = 1;

		for (;;) {
			if ((n / 10) != 0) {
				n = n / 10;
				result++;
			} else {
				System.out.println(result);
				break;
			}
		}
	}
}
