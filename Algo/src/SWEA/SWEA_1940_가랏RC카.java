package SWEA;

import java.util.Scanner;

public class SWEA_1940_가랏RC카 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int spd = 0;
			int dis = 0;
			int sec = sc.nextInt();
			for (int i = 0; i < sec; i++) {
				int sel = sc.nextInt();
				switch (sel) {
				case 0:
					dis += spd;
					break;
				case 1:
					int ch1 = sc.nextInt();
					spd += ch1;
					dis += spd;
					break;
				case 2:
					int ch2 = sc.nextInt();
					if (spd - ch2 < 0)
						spd = 0;
					else
						spd -= ch2;
					dis += spd;
					break;
				}
			}
			System.out.printf("#%d %d\n", tc, dis);


		}
	}
}
