package SWEA;

import java.util.Scanner;

public class SWEA_2056_연월일 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int a = sc.nextInt();
			int day = a % 100;
			a /= 100;
			int month = a % 100;
			int year = a / 100;

			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
				if (day > 0 && day < 32)
					{
					System.out.printf("#%d %04d/%02d/%02d\n", tc, year, month, day);
					continue;}

			if (month == 4 || month == 6 || month == 9 || month == 11)
				if (day > 0 && day < 31)
					{System.out.printf("#%d %04d/%02d/%02d\n", tc, year, month, day);
					continue;}

			if (month == 2)
				if (day > 0 && day < 29)
					{System.out.printf("#%d %04d/%02d/%02d\n", tc, year, month, day);
					continue;
					}
			System.out.printf("#%d -1\n",tc);

		}
	}
}
