package SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_1948_날짜계산기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int[] day = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
			int m1 = sc.nextInt();
			int d1 = sc.nextInt();
			int m2 = sc.nextInt();
			int d2 = sc.nextInt();
			for (int i = 1; i < day.length; i++) {
				day[i] += day[i - 1];
			}
			int num1 = day[m1 - 1] + d1;
			int num2 = day[m2 - 1] + d2;
			int result = num2 - num1 + 1;
			System.out.println("#" + tc + " " + result);
		}

	}
}
