package SWEA;

import java.util.Scanner;

public class SWEA_1217_거듭제곱 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; tc++) {
			sc.next();
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.printf("#%d %d", tc, (int)Math.pow(a, b));
			System.out.println();
		}
	}
}
