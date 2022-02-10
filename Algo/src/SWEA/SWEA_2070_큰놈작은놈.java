package SWEA;

import java.util.Scanner;

public class SWEA_2070_큰놈작은놈 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			String result = null;
			if (a < b)
				result = "<";
			if (a > b)
				result = ">";
			if (a == b)
				result = "=";
			System.out.printf("#%d %s\n", tc, result);
		}
	}
}
