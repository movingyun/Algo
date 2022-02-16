package SWEA;

import java.util.Scanner;

public class SWEA_5601_쥬스나누기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int a = sc.nextInt();

			System.out.print("#" + tc + " ");
			for (int i = 0; i < a; i++) {
				System.out.printf("1/%d ", a);
			}
			System.out.println();
		}
	}
}
