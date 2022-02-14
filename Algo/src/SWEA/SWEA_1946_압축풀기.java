package SWEA;

import java.util.Scanner;

public class SWEA_1946_압축풀기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int a = sc.nextInt();
			int cnt = 0;
			System.out.println("#" + tc);
			for (int i = 0; i < a; i++) {
				String al = sc.next();
				int num = sc.nextInt();
				for (int j = 0; j < num; j++) {
					System.out.print(al);
					cnt++;
					if (cnt % 10 == 0)
						System.out.println();
				}
			}
			System.out.println();
		}

	}
}
