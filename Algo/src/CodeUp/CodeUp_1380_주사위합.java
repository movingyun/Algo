package CodeUp;

import java.util.Scanner;

public class CodeUp_1380_주사위합 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i < 7; i++) {
			if (n - i > 6)
				continue;
			if (n - i == 0)
				break;
			System.out.println(i + " " + (n - i));
		}
	}
}